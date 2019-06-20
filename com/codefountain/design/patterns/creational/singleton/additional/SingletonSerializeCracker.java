package com.codefountain.design.patterns.creational.singleton.additional;

import com.codefountain.design.patterns.creational.singleton.main.SerializedSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Somnath Musib on 7/05/2019
 * @project design-patterns
 */
public class SingletonSerializeCracker {

    public static void main(String... args) throws Exception{

        SerializedSingleton instance1 = SerializedSingleton.getInstance();
        SerializedSingleton instance2;

        try(ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("c:\\Dev\\singleton1.ser"))){
            outStream.writeObject(instance1);
        }


        try(ObjectInputStream inStream = new ObjectInputStream(new FileInputStream("c:\\Dev\\singleton1.ser"))){
            instance2= (SerializedSingleton) inStream.readObject();
        }

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

    }

}
