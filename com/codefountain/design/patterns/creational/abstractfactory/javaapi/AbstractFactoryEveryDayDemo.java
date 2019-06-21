package com.codefountain.design.patterns.creational.abstractfactory.javaapi;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;

public class AbstractFactoryEveryDayDemo {

    public static void main(String[] args)  throws Exception {
        String xml = "<document><body><stock>GOGL</stock></body></document>";
        ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(bais);

        document.getDocumentElement().normalize();

        System.out.println("Root element: "+document.getDocumentElement().getNodeName());
        System.out.println("Abstract factory class: "+documentBuilderFactory.getClass());
        System.out.println("Factory class: "+documentBuilder.getClass());

    }
}
