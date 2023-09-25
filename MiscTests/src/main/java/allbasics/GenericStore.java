package allbasics;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN Difference Between Bounded Wildcards and Bounded Type
 *         Parameters? You may have noticed the sections for bounded wildcards
 *         and bounded type parameters are separated but more or less have the
 *         same definition, and on the surface level look like they're
 *         interchangeable:
 * 
 *         <E extends Number> <? extends Number> So, what's the difference
 *         between these two approaches? There are several differences, in fact:
 * 
 *         Bounded type parameters accept multiple extends using the & keyword
 *         while bounded wildcards only accept one single type to extend.
 *         Bounded type parameters are only limited to upper-bounds. This means
 *         that you cannot use the super keyword on bounded type parameters.
 *         Bounded wildcards can only be used during instantiation. They can not
 *         be used for declaration (e.g. class declarations and constructor
 *         calls. A few examples of invalid use of wildcards are: 
 *         class Example<? extends Object> {...} 
 *         GenericObj<?> = new GenericObj<?>()
 *         GenericObj<? extends Object> = new GenericObj<? extends Object>()
 *         Bounded wildcards should not be used as return types. This will not
 *         trigger any errors or exceptions but it forces unnecessary handling
 *         and typecasting which is completely against the type safety that
 *         generics achieves. The operator ? can not be used as an actual
 *         parameter and can only be used as a generic parameter. For example:
 *         public <?> void printDisplay(? var) {} will fail during compilation,
 *         while public <E> void printDisplay(E var) compiles and runs
 *         successfully.
 *         
 *         https://howtodoinjava.com/java/generics/complete-java-generics-tutorial/
 */
public class GenericStore<T> {
	private T ob;

	public void setObject(T object) {
		this.ob = object;
	}

	public T getObject() {
		return ob;
	}

}

//  class Example<? extends Object> {} //invalid declaration
//	class Example<T extends Object> {} //valid declaration
