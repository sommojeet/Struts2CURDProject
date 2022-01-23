<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>Update Product</title>
    </head>
    <body>
        <h2>Modify Product Details</h2>
        <jsp:include page="menu.jsp"></jsp:include>
        <form action=updateproductdetails method="post">
            
                <table>
                    <tr>
                        <td><b>Product Id:</b></td>
                        <td><input type="text" name="productId" value='<s:property value="productId"/>'></td>
                    </tr>
                    <tr>
                        <td><b>Product Name:</b></td>
                        <td><input type="text" name="productName" value='<s:property value="productName"/>'></td>
                    </tr>
                    <tr>
                        <td><b>Product make:</b></td>
                        <td><input type="text"  name="productMake" value='<s:property value="productMake"/>'>
                            <!--<input type="hidden" name="hdnuserName" value='<s:property value="userName"/>'>-->
                        </td>
                    </tr>
                    <tr>
                        <td><b>Product Price:</b></td>
                        <td><input type="text" name="price" value='<s:property value="price"/>'></td>
                    </tr>
                    <tr>
                        <td><b>Product Availability:</b></td>
                        <td><input type="text" name="availability" value='<s:property value="availability"/>'></td>
                    </tr>
                </table> 
                    
            <button name="submitType" value="update" type="submit">Update</button>

        </form>
        <s:if test="ctr>0">
            <span style="color: red;"><s:property value="msg" /></span>
        </s:if>
        <s:else>
            <span style="color: red;"><s:property value="msg" /></span>
        </s:else>
    </body>
</html>
