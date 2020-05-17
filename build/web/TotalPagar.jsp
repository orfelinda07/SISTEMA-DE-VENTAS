<%
Integer respuesta = (Integer) request.getAttribute("respuesta") ; 
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>USTED DEBE CANCELAR EL MONTO DE: </h1>
        <%=respuesta
        
        %>
    </body>
</html>
