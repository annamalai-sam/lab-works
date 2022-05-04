class A {
    public void adminUserRequest() {
        System.out.println("In A");
    }
}
class B extends A {
    @Override
    public void adminUserRequest() {
        System.out.println("In B");
    }
}
public class annotation {
    public static void main(String[] args) {
        B b = new B();
        b.adminUserRequest();
    }
}