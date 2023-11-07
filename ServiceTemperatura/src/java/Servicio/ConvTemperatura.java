package Servicio;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "ConvTemperatura")
public class ConvTemperatura {

    @WebMethod(operationName = "Far_Cent")
    public double ConvFahrACent(@WebParam(name = "gFahr") double gFahr) 
    {
    return (gFahr-32)*5/9;
    }
    @WebMethod(operationName = "Cent_Far")
    public double ConvCentAFahr(@WebParam(name = "gCent") double gCent) 
    {
    return (gCent*9/5)+32;
    }
}
