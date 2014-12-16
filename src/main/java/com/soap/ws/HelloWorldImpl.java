package com.soap.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.soap.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    @Override
    public String getHelloWorldAsString(String name) {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                "<Emp id=\"1\"><name>Sergii</name><age>26</age>\n" +
                "<role>Developer</role><gen>Male</gen></Emp>";
    }
}
