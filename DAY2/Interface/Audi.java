package DAY2.Interface;

public class Audi implements Vehicle {
    private int gear;
    private String colour;
    private String color;

    Audi(int _gear, String _colour){
        gear = _gear;
        colour = _colour;
    }
//    EVER INCREASE GEAR
    @Override
    public int shiftGear() {
        if(gear < 6)
        return ++gear;
        else
            return gear;
    }

    @Override
    public String setColour(String color) {
        this.color = color;
        return color;
    }
}
