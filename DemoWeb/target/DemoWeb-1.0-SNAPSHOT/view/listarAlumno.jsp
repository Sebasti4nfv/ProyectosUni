<%-- 
    Document   : listarAlumno
    Created on : 3 oct. 2022, 21:29:07
    Author     : Sebastian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="beans.Alumno"%>
<%@page import="controller.alumnoController"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <div class = "container">
        
            <h3> Buscar <input class="form-control" type= "text" id="myInput" placeholder="ingrese el nombre"></h3>
        
            <%
                alumnoController aluController = new alumnoController();
                List <Alumno> lst = aluController.getLstAlumnoController();
                
            %>
            <table class="table">
                
                <tr> 
                
                    <td> Codigo</td>
                    <td> ApellidoP</td>
                    <td> ApellidoM</td>
                    <td> Nombre</td>
                    
                </tr>
                
                <tbody id="myTable"> 
                    <% 
                    for(Alumno x : lst)
                    {
                    %>
                    <tr>
                        <td> <%=x.getCodigo()%></td>
                        <td> <%=x.getPaterno()%></td>
                        <td> <%=x.getMaterno()%></td>
                        <td> <%=x.getNombre()%></td>
                    </tr>
                    <%
                    }
                    %>
                   
                </tbody>
            </table>
        </div>
        <h1> juan gei</h1>
    </body>
</html>
<script>
    $(document).ready(function () {
        $("#myInput").on("keyup", function () {
            var value = $(this).val().toLowerCase();
            $("#myTable tr").filter(function () {
                $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
            });
        });
    });
</script>
