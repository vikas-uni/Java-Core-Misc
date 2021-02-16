package coaching.basics;

class Book2 {

    String name;
    int code;

    void setdetail(String name, int code) {
        this.name = name;
        this.code = code;
    }

    void show() {
        System.out.println("Book name: " + name);
        System.out.println("Book code: " + code);
    }
}

class member {

    int id;
    Book2 b;       //ref variable to book object,value is null here

    void set(int id) {
        this.id = id;
    }

    void memissue(Book2 bk) {          //paramete as rev var to book
        if (b == null) {
            b = bk;
            System.out.println("Book issued successfully");
            return;
        }
        System.out.println("Member has already a book");
    }

    void memreturn() {
        if (b == null) {
            System.out.println("Member has no any book");
            return;
        }
        b = null;
        System.out.println("Book reurned successfully");
    }

    void showdetail() {
        System.out.println("Member ID: " + id);
        if (b == null) {
            System.out.println("Issue status:false");
        } else {
            System.out.println("Issue status:Issued");
            b.show();
        }
    }
}

class library {

    public static void main(String s[]) {
        Book2 b1, b2;
        b1 = new Book2();
        b2 = new Book2();
        b1.setdetail("java", 111);
        b2.setdetail("oracle", 222);
        member m = new member();
        m.set(123);
        m.showdetail();
        m.memissue(b1);
        m.memissue(b2);
        m.showdetail();
        m.memreturn();
        m.memreturn();
    }
}
