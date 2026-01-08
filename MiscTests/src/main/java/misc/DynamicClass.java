package misc;


import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javassist.*;

public class DynamicClass {
    
    public static Map argumentList;

	public static void main (String[] args) throws Exception {
          argumentList = new HashMap();
          argumentList.put("int", "id");
          argumentList.put("String", "user_id");
          argumentList.put("String", "password");
          argumentList.put("String", "name");
          argumentList.put("String", "age");
            
           
		ClassPool pool = ClassPool.getDefault();

		// the class name is 'Eval'
		CtClass evalClass = pool.makeClass("Eval");
        Object classCreator = classCreator(argumentList, evalClass);
        
        
        Class[] formalintParams = new Class[] { String.class };
		Method meth1 = classCreator.getClass().getDeclaredMethod("setAge", formalintParams);
                
                Object[] actualintParams = new Object[] { new String("27") };
		 meth1.invoke(classCreator, actualintParams);
        
        
        Class[] formalintgetParams = new Class[] { String.class };
		Method meth2 = classCreator.getClass().getDeclaredMethod("getAge", null);
                
//                Object[] actualintgetParams = new Object[] { new String() };
//		int result2 = ((Integer) meth2.invoke(classCreator, null)).intValue();
		System.out.println(meth2.invoke(classCreator, null));
        
        //                CtClass arrListClazz = ClassPool.getDefault().get("java.util.ArrayList");
//            CtField f = CtField.make("private int myVar;", evalClass);//new CtField(CtClass.intType, "myVar", evalClass);
//            evalClass.addField(f,"0");
//
        // and a method that evaluates a formula for a given parameter
//		evalClass.addMethod(
//			CtNewMethod.make("public double eval (double x) { return ("+2.345+") ; }", evalClass));
//                evalClass.addMethod(
//			CtNewMethod.make("public int getMyVar() { return myVar ; }", evalClass));
//                
//                evalClass.addMethod(
//        CtNewMethod.make("public void setMyVar(int x) { this.myVar = x; }", evalClass));
//
//                
//		// get a java.lang.Class object from Javassist's CtClass object
//		Class clazz = evalClass.toClass();
//
//		// instantiate it
//		Object obj = clazz.newInstance();
//
//                // get a handle to the method we added earlier------------
//		Class[] formalintParams = new Class[] { int.class };
//		Method meth1 = clazz.getDeclaredMethod("setMyVar", formalintParams);
//                
//                Object[] actualintParams = new Object[] { new Integer(27) };
//		 meth1.invoke(obj, actualintParams);
//
//
//
//                
//                Class[] formalintgetParams = new Class[] { int.class };
//		Method meth2 = clazz.getDeclaredMethod("getMyVar", null);
//                
//                Object[] actualintgetParams = new Object[] { new Integer(27) };
//		int result2 = ((Integer) meth2.invoke(obj, null)).intValue();
//		System.out.println(result2);
        //------------------------------------
        // get a handle to the method we added earlier
//		Class[] formalParams = new Class[] { double.class };
//		Method meth = clazz.getDeclaredMethod("eval", formalParams);
//
//		// and finally call the method with the fixed parameter 17
//		Object[] actualParams = new Object[] { new Double(17) };
//		double result = ((Double) meth.invoke(obj, actualParams)).doubleValue();
//		System.out.println(result);
//
//		// now we can use the Method object to call the method multiple times
//		actualParams = new Object[] { new Double(-43) };
//		result = ((Double) meth.invoke(obj, actualParams)).doubleValue();
//		System.out.println(result);
//                System.out.println(obj.getClass());
//                System.out.println(obj.getClass().getDeclaredFields()[0]);
                
                
                
	}

    private static Object classCreator(Map argumentList, CtClass evalClass) {
        try {
            Iterator iterator = argumentList.entrySet().iterator();
            while(iterator.hasNext()){
                try {
                    Map.Entry pair = (Map.Entry)iterator.next();
                    String methType = (String)pair.getKey();
                    String methName = (String) pair.getValue();
                    CtField f;
                    if (methType.equalsIgnoreCase("int")) {
                        
                        f = CtField.make("private int "+ methName+";", evalClass); //new CtField(CtClass.intType, "myVar", evalClass);
                        evalClass.addField(f,"0");
                        
                        String temp = methName.replace(methName.charAt(0), (char)(methName.charAt(0)-32));
                        
                        evalClass.addMethod(
                                CtNewMethod.make("public int get"+temp+"() { return "+methName+" ; }", evalClass));
                        
                        evalClass.addMethod(
                                CtNewMethod.make("public void set"+temp+"(int x) { this."+methName+" = x; }", evalClass));
                    }
                    else{
                        f = CtField.make("private String "+ methName+";", evalClass); //new CtField(CtClass.intType, "myVar", evalClass);
                        evalClass.addField(f,"null");
                        
                        
                        String temp = methName.replace(methName.charAt(0), (char)(methName.charAt(0)-32));
                        
                        evalClass.addMethod(
                                CtNewMethod.make("public String get"+temp+"() { return "+methName+" ; }", evalClass));
                        
                        evalClass.addMethod(
                                CtNewMethod.make("public void set"+temp+"(String x) { this."+methName+" = x; }", evalClass));
                        
                    }
                } catch (CannotCompileException ex) {
                    Logger.getLogger(DynamicClass.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
            // get a java.lang.Class object from Javassist's CtClass object
            Class clazz = evalClass.toClass();
//
//		// instantiate it
            Object obj = clazz.newInstance();
            return obj;
//                
        } catch (CannotCompileException ex) {
            Logger.getLogger(DynamicClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DynamicClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DynamicClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}

