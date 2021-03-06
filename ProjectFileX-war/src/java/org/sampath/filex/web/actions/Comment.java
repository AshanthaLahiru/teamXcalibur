/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sampath.filex.web.actions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Comment {

    private String commentno;
    private String description;
    private String createddatentime;
    private String employeeid;
    private String srsno;
    private String employeename;

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getCommentno() {
        return commentno;
    }

    public String getDescription() {
        return description;
    }

    public String getCreateddatentime() {
        return createddatentime;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public String getSrsno() {
        return srsno;
    }

    public static void setComment() {

    }

    public Comment(String commentno, String description, String createddatentime, String employeeid, String srsno, String employeename) {
        this.commentno = commentno;
        this.description = description;
        this.createddatentime = createddatentime;
        this.employeeid = employeeid;
        this.srsno = srsno;
        this.employeename = employeename;
    }

    public static ArrayList<Comment> getComment(String srsid) {
        ArrayList<Comment> projectcomment = new ArrayList<Comment>();

        Connection con = DatabaseConnection.createConnection();
        try {
            System.out.println("Execution strt");
            PreparedStatement ps = con.prepareStatement("select * from employee e,comments c where e.EMPID=c.EMPID and c.SRSNO='" + srsid + "' order by comno desc");
            ResultSet rs = ps.executeQuery();
            System.out.println("Execution done");
            Comment cm;

            while (rs.next()) {
                cm = getCommentFromRS(rs);
                projectcomment.add(cm);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection " + ex);
        }
        return projectcomment;
    }

    public static Comment getCommentFromRS(ResultSet rs) throws SQLException {
        return new Comment(
                rs.getString("COMNO"),
                rs.getString("DESCRIPTION"),
                rs.getString("CREATEDDATENTIME"),
                rs.getString("EMPID"),
                rs.getString("SRSNO"),
                rs.getString("EMPNAME"));

    }

}
