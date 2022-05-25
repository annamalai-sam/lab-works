package SampleProgram;

public class TVSChamp {
   private int mileage ;
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    public int getMileage() {
        return mileage;
    }
    public static void main(String[] args) {
        TVSChamp mukil = new TVSChamp();
        TVSChamp madhan = new TVSChamp();
        mukil.mileage=45;
        madhan.mileage=50;
        System.out.println(mukil.mileage);
        System.out.println(madhan.mileage);
    }
}
