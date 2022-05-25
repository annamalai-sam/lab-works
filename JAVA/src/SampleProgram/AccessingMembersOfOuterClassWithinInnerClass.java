package SampleProgram;

class OutClass {
    String name ;
    int roll ;
    public void setter(int roll,String name){
        this.name= name;
        this.roll=roll;
    }
    private int getRoll(){
        return this.roll;
    }
    private String getName(){
        return this.name;
    }
    class InnerClass {
        int roll = OutClass.this.getRoll();
        String name = OutClass.this.getName();
        void show (){
            System.out.println("Student Roll : "+ roll);
            System.out.println("Student Name : "+name);
        }
    }
}
public class AccessingMembersOfOuterClassWithinInnerClass{
public static void main(String[] args) {
        OutClass objOut = new OutClass();
        objOut.setter(01,"Annmalai");
        OutClass.InnerClass objIn = objOut.new InnerClass();
        objIn.show();
        OutClass objOut1 = new OutClass();
        objOut1.setter(02,"Aswath");
       OutClass.InnerClass objIn1 = objOut1.new InnerClass();
        objIn1.show();
        OutClass objOut2 = new OutClass();
        objOut2.setter(03,"Haiden");
        OutClass.InnerClass objIn2 = objOut2.new InnerClass();
       objIn2.show();
        }
}