<%@page import="servicio.ConvTemperatura"%>
<%@page import="servicio.ConvTemperatura_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            String grados=request.getParameter("txtgrados");
            if(grados!=null && !grados.isEmpty())
            {
                double nGrados =0.0;
                ConvTemperatura_Service service;
                ConvTemperatura port;
                try{
                    service=new servicio.ConvTemperatura_Service();
                    port = service.getConvTemperaturaPort();
                    //obtener el valor de la caja de texto
                    nGrados=Double.parseDouble(grados);
                    //Realizar la conversion invocando el 
                    String convertir=request.getParameter("btnGrados");
                    if(convertir.compareTo("gCent")==0){
                        nGrados=port.centFar(nGrados);
                    }
                    if(convertir.compareTo("gFahr")==0){
                        nGrados=port.farCent(nGrados);
                    }
                    Double objGrados = new Double(nGrados);
                    session.setAttribute("result", objGrados);
                    }
                catch(NumberFormatException ex){
                    System.out.println("Datos de grados incorrectos\n");
                }
                catch(Exception ex){
                    System.out.println("No se puede acceder al servicio\n");
                }
            }
            %>
    </body>
    <form>
    <h1>Conversion de Temperatura</h1>
         <label >Grados:</label><br>
        <input type="text" name="txtgrados" value="${result}"><br>
       
        <label>Convertir de Centigrados a Fah </label> <input type="radio" name="btnGrados" value="aCent" /><br>
        <label>Convertir de F</label><input type="radio" name="btnGrados" value="aFahr" /><br>
        
         <input type="submit" name="accion" value="btnconvertir"><br>
            </form>
</html>

