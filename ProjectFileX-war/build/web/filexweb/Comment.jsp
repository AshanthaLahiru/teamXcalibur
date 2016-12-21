<%-- 
    Document   : Comment
    Created on : Oct 18, 2016, 12:02:45 PM
    Author     : Ashantha
--%>

<%@page import="org.sampath.filex.web.actions.Project"%>
<%@page import="org.sampath.filex.web.actions.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="logos/fav-icon.ico" type="image/x-icon"/>
        <link rel="stylesheet" href="css/bootstrap.css">
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <title>Comment</title>
        
        <%
            session=request.getSession(false);
            
            Employee e=Employee.getEmployee((String)session.getAttribute("eid"));
            Project p=Project.getProject((String)session.getAttribute("pid"));
        %>
    
    </head>
     <body>
        <div style ="margin: auto;width: 95%;border: 2px solid orange;position: absolute;top: 30%; left: 2%;  padding: 10px">
          <form name="commentform" method="post" action="../SetComment">
            <table>
                    <tr>
                        <td rowspan="2"><img src="user2.jpeg" alt="User"></td>
                        <td>Employe Name:</td>
                        
                        <td><% out.print(e.getEmployeename()); %></td>
                    </tr>
                    
                   <tr>
                        
                        <td>Project Name:</td>
                        
                        <td><% out.print(p.getProjectname()); %></td>
                   </tr>
                   <tr>
                        <td colspan="3"><textarea name="commentstr" cols="60" rows="4" placeholder="Enter your comment here..!"></textarea></td>
                        
                   </tr>
                   <tr>
                        <td><input type = "submit" name= "commentbtn" value = "Comment" ></td>
                                        
                   </tr>
                   
            </table>
          </form>
            
       </div>
          
    </body>
</html>
