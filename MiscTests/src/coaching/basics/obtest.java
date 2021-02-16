package coaching.basics;

//prog to demo object class
class student {

    int roll, marks;

    void set(int i, int r) {
        roll = i;
        marks = r;
    }

    /*public String toString(){
     return(roll+" "+marks);
     }*/
}

class obtest {

    public static void main(String s[]) {
        student st = new student();
        System.out.println(st.toString());  //this will return address of student object
        st.set(1, 50);
        System.out.println("st is " + st); //this will also return address of student object
    }
}