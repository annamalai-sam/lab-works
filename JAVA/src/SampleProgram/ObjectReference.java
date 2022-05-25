package SampleProgram;

public class ObjectReference {
    int A;
    int B;
    public static void main(String[] args) {
        ObjectReference obj1 = new ObjectReference();
        obj1.A= 10;
        obj1.B =20;
        System.out.println("obj1.A : "+obj1.A);
        System.out.println("obj1.B : "+obj1.B);
        ObjectReference obj2 = obj1;
        System.out.println("obj2.A : "+obj2.A);
        System.out.println("obj2.B : "+obj2.B);
        ObjectReference.test();
    }
    static void test(){
//        System.out.println(obj2.A);
//        System.out.println(obj2.B);
    }
}
