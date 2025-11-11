package org.example;

import org.example.api.HelloService;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.example.impl.HelloServiceImpl;

public class Server {
    public static void main(String[] args) {
        String address = "http://localhost:8081/services/hello";
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        factory.setServiceClass(HelloService.class);
        factory.setAddress(address);
        factory.setServiceClass(HelloServiceImpl.class);
        factory.create();
        System.out.println("WSDL: " + address + "?wsdl");
    }
}
