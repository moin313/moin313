package DAY2.Interface;

public class BMW implements Vehicle {
    private int gear;
    private String colour;

    BMW(int _gear, String _colour){
        gear = _gear;
        colour = _colour;
    }

    @Override
    public int shiftGear() {
        if(gear > 0)
            return --gear;
        else
            return gear;
    }

    @Override
    public String setColour(String colour) {
        this.colour = colour;
        return colour;
    }
}
