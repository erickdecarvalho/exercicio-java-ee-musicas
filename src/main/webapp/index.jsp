<%@ page import="java.util.ArrayList"%>


<c:forEach items="${musicas}" var="musica">
    <p><c:out value="${musica.nome}"/></p>
    <p><c:out value="${musica.estiloMusical}"/></p>
</c:forEach>


<html>
    <body>
        <%@ include file="header.jsp"  %>
        <h2>Hello World! <%= musicas.get(1)%></h2>
        <ul>
            <%
                for(String musica : musicas){
                    out.println("<li>"+musica+"</li>");
                }
            %>
        </ul>
    </body>
</html>
