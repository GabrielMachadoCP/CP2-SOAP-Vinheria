//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package br.com.fiap.winery;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(
        name = "WineStockService",
        targetNamespace = "http://winery.fiap.com.br/"
)
@SOAPBinding(
        style = Style.RPC
)
public interface WineStockService {
    @WebMethod
    @WebResult(
            partName = "return"
    )
    String getMenu();

    @WebMethod
    @WebResult(
            partName = "return"
    )
    String placeOrder(@WebParam(name = "arg0",partName = "arg0") String var1, @WebParam(name = "arg1",partName = "arg1") int var2);
}
