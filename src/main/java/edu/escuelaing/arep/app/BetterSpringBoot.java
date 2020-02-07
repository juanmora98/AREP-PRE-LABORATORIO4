package main.java.edu.escuelaing.arep.app;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import main.java.anotations.*;

public class BetterSpringBoot{


    public static void main(String[] args) {
        String className = "edu.escuelaing.arep.app.ws.WebServiceCuadrado";
        try {
            Class c = Class.forName(className);
            Method[] methods = c.getMethods();
            for(Method m : methods){
                if(m.isAnnotationPresent(Web.class)){
                    System.out.println(m.getName());
                    System.out.println(c.getName());
                    try {
                        System.out.println(m.invoke(null));
                    } catch (IllegalAccessException e) {
                        //TODO: handle exception
                    }
                    catch (IllegalArgumentException e) {
                        //TODO: handle exception
                    }
                    catch (InvocationTargetException e) {
                        //TODO: handle exception
                    }
                }
            }


        } catch (Exception e) {
            Logger.getLogger(e.toString(), null);
        }
    }





}