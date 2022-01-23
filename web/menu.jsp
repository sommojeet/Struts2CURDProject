<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="./CSS/menucss.css">
<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu</title>
    </head>
    <body style="background-color:cadetblue">
        <div class="dropdown">
            <button class="dropbtn"><i class="fa fa-bars"></i> Menu</button>
            <div class="dropdown-content">
                <a href="register.jsp">Register User</button></a>
                <a href="report">Show Users</button></a>
                <a href="product.jsp">Register Product</button></a>
                <a href="productreport">Show Products</button></a>
            </div>
        </div>
    </body>
</html>
