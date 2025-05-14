//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package br.com.fiap.winery;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(
        name = "WineWarningService",
        targetNamespace = "http://winery.fiap.com.br/"
)
@SOAPBinding(
        style = Style.RPC
)
public interface WineWarningService {
    @WebMethod
    @WebResult(
            partName = "return"
    )
    String sendWarn();
}
