/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author Administrator
 */
public class TestReflect {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException{
        Field[] declaredFields = VT_OWNER_DO.class.getDeclaredFields();
        VT_OWNER_DO vt_owner_do = new VT_OWNER_DO();
        for (Field field : declaredFields) {
            String name = field.getName();
            Class<?> type = field.getType();
            String temp = name.replaceFirst(""+name.charAt(0), (""+name.charAt(0)).toUpperCase());
//            temp = "set"+temp;
            System.out.println("name: "+name+" , type: "+type+ ", setter: "+temp);
            
            
            
        }
        
         Method m = VT_OWNER_DO.class.getMethod("setRegn_no", String.class);
        System.out.println(m.invoke(vt_owner_do, "qwerty"));
        
        
        Method m1 = VT_OWNER_DO.class.getMethod("getRegn_no", null);
        System.out.println(m1.invoke(vt_owner_do, null));
        
//        for (Method method : declaredMethods) {
//            method.invoke(TestReflect.class, 0);
//        }
    }
}
