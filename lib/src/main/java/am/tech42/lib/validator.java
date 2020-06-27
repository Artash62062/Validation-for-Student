package am.tech42.lib;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class validator {
    public static List<String> validate(Object object) throws Exception{
        List<String> inValideFields = new ArrayList<>();
        Class stopWhenClass = Object.class;
        List<Class<?>> classes = new ArrayList<>();
        List<Field> fields = new ArrayList<>();
        Class clazz = object.getClass();
        do {
            classes.add(clazz);
            clazz = clazz.getSuperclass();
        } while (!clazz.equals(stopWhenClass));
        

        for (int i = classes.size() - 1; i >= 0; i--) {
            fields.addAll(Arrays.asList(classes.get(i).getDeclaredFields()));
            
        }
     
        
            for (int i = 0; i < fields.size(); i++) {
                Field field = fields.get(i);
                field.setAccessible(true); 
                if (field.getType().equals(int.class)) {
                    if((int)field.get(object)<0) {
                        inValideFields.add("Integer Field is Invalid");
                    }
                }
                else if (field.getType().equals(String.class)) {
                    if(((String)field.get(object)).equals("")|| field.get(object)==null) {
                        inValideFields.add("String isn't valid");
                    }
                }

                else if (field.getType().equals(char[].class)) {
                    if(((char[])field.get(object))==null || isCharArrValid((char[])field.get(object))){
                        inValideFields.add("Char[] isn't Vallid");
                    }
                }
                else {
                    inValideFields.add("valid Instance");
                }

            } 
         

        
        return inValideFields;
    }

    public static boolean isCharArrValid(char[]arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==' '){
                return true ;
            }
        }
        return false;
    }

}