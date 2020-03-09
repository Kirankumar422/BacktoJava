public class MyClass {

    int x = 5;
    int y;

    public static void main(String[] args) {

        MyClass myObj = new MyClass();
        MyClass myObj1 = new MyClass();
        System.out.println(myObj.x);
//        myObj.y = 20;
        myObj.x = 10;
        System.out.println(myObj.x);
        System.out.println(myObj1.x);
    }
}
