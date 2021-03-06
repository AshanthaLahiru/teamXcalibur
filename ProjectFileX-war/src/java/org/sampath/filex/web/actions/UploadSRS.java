/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sampath.filex.web.actions;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@MultipartConfig(maxFileSize = 16177215)
public class UploadSRS extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);
        Date dte = new Date();
        String pno = (String) session.getAttribute("pno");
        String srsversion = request.getParameter("srsversion");
        String changes = request.getParameter("changes");
        String srsid = (String) session.getAttribute("srsid");

        int row;
        String notifino = null;
        String srsno = null;

        Connection con = DatabaseConnection.createConnection();

        try {

            InputStream inputStream = null; // input stream of the upload file

            // obtains the upload file part in this multipart request
            Part filePart = request.getPart("srs");
            if (filePart != null) {
                // prints out some information for debugging
                System.out.println(filePart.getName());
                System.out.println(filePart.getSize());
                System.out.println(filePart.getContentType());

                // obtains input stream of the upload file
                inputStream = filePart.getInputStream();

                PreparedStatement statement;

                if (srsversion == null || srsversion.equals("")) {
                    srsversion = "1";
                    changes = "Initial SRS";
                    statement = con.prepareStatement("INSERT INTO srs(createddatentime,pno) values (?,?)");

                    statement.setString(1, DateString.getDate(dte.toString()));
                    statement.setString(2, pno);

                    row = statement.executeUpdate();
                    if (row > 0) {
                        System.out.println("SRS table entry is inserted");
                    }

                    //NOTIFICATION
                    statement = con.prepareStatement("insert into notification(srsno) values (SRS_SEQ.currval)");
                    statement.executeQuery();

                    statement = con.prepareStatement("SELECT notification_seq.currval as NOTIFINO FROM DUAL");
                    ResultSet rs = statement.executeQuery();
                    if (rs.next()) {
                        notifino = rs.getString("NOTIFINO");
                    }

                    System.out.println("Insert Done " + notifino + " ProjectNO" + pno);

                    Notification.setNotificationBySRS(notifino, pno);
                    //NOTIFICATION
                }
                //version history table update
                statement = con.prepareStatement("INSERT INTO versionhistory(docno,srsversion,pdffile,changes,modifieddate) values ( (SELECT docno FROM srs WHERE pno = '" + pno + "'),'" + srsversion + "',?,?,?)");
                if (inputStream != null) {
                    // fetches input stream of the upload file for the blob column
                    statement.setBinaryStream(1, inputStream, inputStream.available());
                }
                statement.setString(2, changes);
                statement.setString(3, DateString.getDate(dte.toString()));

                statement.executeUpdate();
                System.out.println("VERSIONHISTORY table entry is inserted");

                //add stakeholders to SRSAPPROVEDBY new version
                if (!srsversion.equals("1")) {
                    Stakeholder.setStakeholders(pno, srsversion);

                    //Changes will show as a comment on the wall
                    String comment = "SRS Version " + srsversion + " Uploaded. \n" + changes;
                    String editedString = comment.replace("'", "''");
                    String datentime = DateString.getDate(dte.toString());
                    PreparedStatement ps = con.prepareStatement("insert into comments values(emp_sequence.nextval,'" + editedString + "','" + datentime + "','" + session.getAttribute("eid") + "','" + srsid + "')");
                    ps.executeQuery();
                    //End Comment
                }

                con.close();
                response.sendRedirect("filexweb/BA_Dashboard.jsp?scs=pass");

            } else {
                System.out.println("No file found");
            }

        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection " + ex);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
