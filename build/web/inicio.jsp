<%-- 
    Document   : inicio
    Created on : 25/05/2022, 01:55:00 AM
    Author     : aly
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Caly</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="./CSS/style.css">
    </head>
    <body>
        <div class="Encabezado">
            <table>
                <tr>
                    <td>
                        <img src="./img/logo.jpg" width="50px" height="60px">
                    </td>
                    <td>
                        <h3>Caly</h3>
                        <p>Asistente de cómputo, administración, 
                            logística y cuidado
                    </td>
                    <td>
                        
                    </td>
                </tr>
            </table>
        </div>
        <section class="paleta">
            <div class="Iniciarsesion">
                <h1>Iniciar Sesión</h1>
            </div>
            <form method="post" name="formulario1" class="tener" action="Sesion">
                <label>Identificador</label>
                
                <input class="tener" type="text" maxlength="20" name="identificador" required="true" id="id"
                       onkeypress="return(event.charCode >=48 && event.charCode <=57)">
                <br>
                <label>Contraseña</label>
                
                <input class="botella" type="password" maxlength="15" name="contra" required="true" id="contraseña"
                       onkeypress="return(event.charCode >=65 && event.charCode <=90 || event.charCode >=97 && event.charCode <=122 || event.charCode ==32 )||event.charCode >=48 && event.charCode <=57">
                
                <br>
                <input type="button" class="tapa" value="Regresar al Principal" onclick="location.href='./index.html'">
                
                <input type="submit" class="chicle" value="Iniciar Sesion">
                
                <input type="reset" class="chicle" value="Borrar Registro">
                </div>
            </form>
        </section>
        <footer>
            <div class="arriba">
                <table>
                    <tr>
                        <td>
                            <img src="./img/logo.jpg" width="50px" height="60px">
                        </td>
                        <td>
                            <h5>Caly</h5>
                            <p>Asistente de cómputo, administración, 
                            logística y cuidado
                        </td>
                    </tr>
                </table>
            </div>
            <div class="info">
                <table>
                    <tr>
                        <td>
                            <h3>Acerca de:</h3>
                            <br>
                            <p>Centro de Estudios Científicos y Tecnológicos "Juan de Dios Bátiz"
                            <p>Pensada para alumnos, docentes y administradores dentro del plantel 
                            en el área de programación
                        </td>
                        <td>
                            <p>Registro, Consulta, Reporte
                            <br>
                            <p>Nuestros diferentes clientes tendrán una función diferente dentro 
                               de la aplicación, para así facilitar su uso.
                        </td>
                    </tr>
                </table>
            </div>
        </footer>
    </body>
</html>
