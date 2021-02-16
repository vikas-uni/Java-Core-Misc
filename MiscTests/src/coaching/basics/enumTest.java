package coaching.basics;

enum Book {

    java, oracle, Dotnet
}
/* Above code is equivalent to
 class Book{
 final static Book java=new Book("java");
 final static Book oracle=new Book("oracle");
 final static Book Dotnet=new Book("Dotnet");
 */

class enumTest {

    public static void main(String[] s) {
        Book b;
        b = Book.java;
        System.out.println("book name is " + b);
    }
}