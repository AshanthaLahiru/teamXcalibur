<%@page import="java.util.ArrayList"%>
<%@page import="org.sampath.filex.web.actions.Employee"%>
<%@ include file="Up.jsp" %>
<%@ include file="Sidebar.jsp" %>

<!-- START CONTENT -->

<%
            if (!Employee.getEmployee((String)session.getAttribute("eid")).getPosition().equals("Administrator"))
            {
                response.sendRedirect("Login.jsp");
            }
%>

<link href="css/stylesba.css" rel='stylesheet' type='text/css' />
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />

<%
    ArrayList<Employee> employee = Employee.getEmployee();
%>

<section id="main-content" class="">
    <section class="wrapper" style='margin-top:50px;display:inline-block;width:100%;padding:15px 0 0 15px;'>
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <div class="page-title">

                <div class="pull-left">
                    <h1 class="title">Users</h1>                            
                </div>
            </div>
        </div>
        <div class="clearfix"></div>
        <div class="col-lg-12">
            <section class="box ">
                <header class="panel_header">
                    <h2 class="title pull-left">Our Team</h2>
                </header>
                <div class="content-body">    
                    <div class="row">
                        <div class="col-md-12 col-sm-12 col-xs-12">
                            <div class="row">
                                <div class="col-md-2 col-sm-2 col-xs-2"></div>
                                
                                <div class="col-md-2 col-sm-2 col-xs-2"></div>
                            </div>
                            <br/>
                            <div class="row">


                                <%
                                    Employee emp;
                                    int i=0;
                                    for (int x = 0; x < employee.size(); x++) {
                                        emp = employee.get(x);
                                        i++;
                                %>
                                <div class="col-sm-4 col-md-3">
                                    <div class="team-member ">
                                        <div class="team-img">
                                            <img class="img-circle img-inline" width="200px" height="200px" src="../GetIconByID?id=<%out.print(emp.getEmployeeid());%>" alt="">
                                        </div>
                                        <div class="team-info">
                                            <h4><% out.print(emp.getEmployeename()); %></h4>
                                            <span style="color:black">User ID : </span><span><%out.print(emp.getEmployeeid());%></span><br/>
                                            <span><% out.print(emp.getPosition()); %></span><br/>
                                            <span><% out.print(emp.getEmail()); %></span><br/>    

                                        </div>
                                        <p><% out.print(emp.getDepartmentid()); %></p>
                                        <ul class="social-icons list-inline list-unstyled">
                                            <li><a href="Admin_edit_user.jsp?id=<%out.print(emp.getEmployeeid());%>&email=<%out.print(emp.getEmail());%>"><i class="fa fa-gear icon-bordered icon-primary icon-xs"></i></a></li>
                                            <li><a data-toggle="modal" href="#" data-target="#ultraModal<%out.print(i);%>" title="Delete User"><i class="fa fa-trash-o icon-bordered icon-primary icon-xs"></i></a></li>
                                        </ul>
                                        <!--Model starts-->
                                        <div class="modal fade" id="ultraModal<%out.print(i);%>" tabindex="-1" role="dialog" aria-labelledby="ultraModal-Label" aria-hidden="true" style="display: none;">
                                            <div class="modal-dialog animated fadeInUp"><br/><br/><br/><br/><br/><br/><br/><br/><br/>
                                                <div class="modal-content">
                                                    <div class="modal-header">
                                                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">�</button>
                                                        <h4 class="modal-title">Are you sure you want to delete?</h4>
                                                    </div>
                                                    <div class="modal-body">
                                                        Once a user is deleted, you will not be able to recover it.
                                                    </div>
                                                    <div class="modal-footer">
                                                        <button data-dismiss="modal" class="btn btn-default" type="button">Cancel</button>
                                                        <a  href="../DeleteEmp?id=<%out.print(emp.getEmployeeid());%>" class="btn btn-success">Delete</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <!--model End-->
                                    </div>       
                                </div>
                                <%
                                    }
                                %>


                            </div>


                        </div>
                    </div>
                </div>
            </section></div>
    </section></section>

<!-- END CONTENT -->



<%@ include file="Down.jsp" %>