class A{
    static{
        System.out.println("Static block A");
    }
}

class B{
    static{
        System.out.println("Static block b");
    }
}

class testy{
    public static void main(String[] args) {
        B b = new B();
    }
}
public class test{
    public static void main(String[] args) {
        A a = new A();
            // B b = new B();
    }
}