<%@page import="org.sampath.filex.web.actions.Project"%>
<%@ include file="Up.jsp" %>
<%@ include file="Admin_Sidebar.jsp" %>

<!-- START CONTENT -->

<link href="css/stylesba.css" rel='stylesheet' type='text/css' />
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />

<section id="main-content" class="sidebar_shift">
    <section class="wrapper" style="margin-top:50px;display:inline-block;width:100%;padding:15px 0 0 15px;">
        <div class="login-form" style="">
            <h4>Add User</h4>
            <h5><strong></strong></h5>

            <form name="adduser" method="post" action="../SetIcon" enctype="multipart/form-data">

                <center><img src="images/user_add.png" id="output" width="130" height="130"></center>
                <label>User Id :</label>
                <input type="text" id="id" name="id" value="" placeholder="Enter user id here" required=""><br>
                <br/>
                <label>User Name :</label>
                <input type="text" id="name" name="name" value="" placeholder="Enter user name here" required=""><br>
                <br><div>
                <table align="center" width="70%">
                <tbody><tr>
                <td><label><input type="checkbox" value="">Manager SD</label></td>
                <td><label><input type="checkbox" value="">Project Manager</label><br></td>
                </tr>
                <tr>
                <td><label><input type="checkbox" value="">Business Analyst</label></td>
                <td><label><input type="checkbox" value="">Stakeholder</label></td>
                </tr>
                </tbody></table>
                </div>
                <label>Email :</label>
                <input type="text" id="email" name="email" value="" placeholder="Enter email here"><br>
                <br>
                <div class="clearfix"></div>
                <input style="background-color:#FF9D26; border:none;" class="btn btn-info btn-block" type="submit" value="Add User"><br>
                <input style="background-color:FFC682; border:none;" class="btn btn-info btn-block" type="reset" id="reset">
            </form>
        </div>
        <script>
            var loadFile = function (event) {
                var output = document.getElementById('output');
                output.src = URL.createObjectURL(event.target.files[0]);
            };
        </script>
    </section></section>

<!-- END CONTENT -->



<%@ include file="Down.jsp" %>