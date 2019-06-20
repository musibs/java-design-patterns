package com.codefountain.design.patterns.creational.singleton.additional;

import com.codefountain.design.patterns.creational.singleton.main.EagerInitializedSingleton;

import java.lang.reflect.Constructor;

/**
 * @author Somnath Musib on 7/05/2019
 * @project design-patterns
 */
public class SingletonReflectionCracker {

    public static void main(String... args){

        EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instance2 = null;

        try{
            Constructor<?>[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();

            for(Constructor constructor : constructors){
                constructor.setAccessible(true);
                instance2 = (EagerInitializedSingleton) constructor.newInstance();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());


    }

}
