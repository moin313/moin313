package DAY2.Interface;

public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW(2, "red");
        Audi audi = new Audi(3, "black");
        System.out.println("Audi gear shifted to : "+audi.shiftGear());
        System.out.println("BMW gear shifted to : "+bmw.shiftGear());
        System.out.println("Audi's colour :" + audi.setColour("Green"));
    }
}
