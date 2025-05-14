package br.com.fiap.winery;

import javax.xml.ws.Endpoint;

public class Loader {
    public static void main(String[] args) {
        // Serviço de pedidos
        Endpoint.publish("http://localhost:8085/WineStockService", new WineStockServiceImplementation());
        System.out.println("WineStockService publicado!");

        // Serviço de aviso
        Endpoint.publish("http://localhost:8086/WineWarningService", new WineWarningServiceImplementation());
        System.out.println("WineWarningService publicado!");
    }
}
