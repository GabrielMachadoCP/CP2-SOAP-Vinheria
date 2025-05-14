//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package br.com.fiap.winery;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(
        name = "WineStockServiceImplementationService",
        targetNamespace = "http://winery.fiap.com.br/",
        wsdlLocation = "http://localhost:8085/WineStockService?wsdl"
)
public class WineStockServiceImplementationService extends Service {
    private static final URL WINESTOCKSERVICEIMPLEMENTATIONSERVICE_WSDL_LOCATION;
    private static final Logger logger = Logger.getLogger(WineStockServiceImplementationService.class.getName());

    public WineStockServiceImplementationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WineStockServiceImplementationService() {
        super(WINESTOCKSERVICEIMPLEMENTATIONSERVICE_WSDL_LOCATION, new QName("http://winery.fiap.com.br/", "WineStockServiceImplementationService"));
    }

    @WebEndpoint(
            name = "WineStockServiceImplementationPort"
    )
    public WineStockService getWineStockServiceImplementationPort() {
        return (WineStockService)super.getPort(new QName("http://winery.fiap.com.br/", "WineStockServiceImplementationPort"), WineStockService.class);
    }

    @WebEndpoint(
            name = "WineStockServiceImplementationPort"
    )
    public WineStockService getWineStockServiceImplementationPort(WebServiceFeature... features) {
        return (WineStockService)super.getPort(new QName("http://winery.fiap.com.br/", "WineStockServiceImplementationPort"), WineStockService.class, features);
    }

    static {
        URL url = null;

        try {
            URL baseUrl = WineStockServiceImplementationService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8085/WineStockService?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8085/WineStockService?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }

        WINESTOCKSERVICEIMPLEMENTATIONSERVICE_WSDL_LOCATION = url;
    }
}
