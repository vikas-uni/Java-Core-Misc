package coaching.basics;

class product {

    int price, qty, purchaseprice, salesprice, sn, pn;
    String name;

    void setdetail(String name, int price, int qty, int purchaseprice, int salesprice) {
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.purchaseprice = purchaseprice;
        this.salesprice = salesprice;
    }

    void purchase(int unit) {
        pn = unit;
        qty = pn + qty;
    }

    void sales(int unit) {
        sn = unit;
        qty = qty - sn;

    }

    void show() {
        System.out.println("Product name= " + name);
        System.out.println("Price = " + price);
        System.out.println("Quanity = " + (qty - pn + sn));
        System.out.println("Purchase price = " + purchaseprice);
        System.out.println("Sales price = " + salesprice);
        System.out.println("units purchsed = " + pn);
        System.out.println("units sold = " + sn);
        System.out.println("total quantity = " + qty);
    }
}

class productTest {

    public static void main(String s[]) {
        product p1 = new product();    //this can also be declared as product p1,p2;
        product p2 = new product();          //p1=new product();  p2=new product();
        p1.setdetail("abc", 500, 50, 400, 600);
        p2.setdetail("xyz", 1000, 150, 800, 1300);

        p1.purchase(400);
        p2.sales(20);
        p1.show();
        System.out.println(" ");
        p2.show();

    }
}