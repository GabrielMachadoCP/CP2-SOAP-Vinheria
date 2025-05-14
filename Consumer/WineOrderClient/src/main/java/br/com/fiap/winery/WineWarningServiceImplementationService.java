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
        name = "WineWarningServiceImplementationService",
        targetNamespace = "http://winery.fiap.com.br/",
        wsdlLocation = "http://localhost:8086/WineWarningService?wsdl"
)
public class WineWarningServiceImplementationService extends Service {
    private static final URL WINEWARNINGSERVICEIMPLEMENTATIONSERVICE_WSDL_LOCATION;
    private static final Logger logger = Logger.getLogger(WineWarningServiceImplementationService.class.getName());

    public WineWarningServiceImplementationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WineWarningServiceImplementationService() {
        super(WINEWARNINGSERVICEIMPLEMENTATIONSERVICE_WSDL_LOCATION, new QName("http://winery.fiap.com.br/", "WineWarningServiceImplementationService"));
    }

    @WebEndpoint(
            name = "WineWarningServiceImplementationPort"
    )
    public WineWarningService getWineWarningServiceImplementationPort() {
        return (WineWarningService)super.getPort(new QName("http://winery.fiap.com.br/", "WineWarningServiceImplementationPort"), WineWarningService.class);
    }

    @WebEndpoint(
            name = "WineWarningServiceImplementationPort"
    )
    public WineWarningService getWineWarningServiceImplementationPort(WebServiceFeature... features) {
        return (WineWarningService)super.getPort(new QName("http://winery.fiap.com.br/", "WineWarningServiceImplementationPort"), WineWarningService.class, features);
    }

    static {
        URL url = null;

        try {
            URL baseUrl = WineWarningServiceImplementationService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8086/WineWarningService?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8086/WineWarningService?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }

        WINEWARNINGSERVICEIMPLEMENTATIONSERVICE_WSDL_LOCATION = url;
    }
}
