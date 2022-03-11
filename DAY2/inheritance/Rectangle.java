package DAY2.inheritance;

public class Rectangle {
    public static void main(String[] args) {
        xy first = new xy(2,4);
        xy second = new xy(3,6);

//        System.out.println(first.getFirst());
        Shape obj = new Shape();
        double length = obj.getLength(first, second);
        System.out.println(length);
    }
}

class xy{
    private int x, y;

    xy(int _x, int _y){
        x = _x;
        y = _y;
    }

    public int getFirst(){
        return x;
    }
    public int getSecond(){
        return y;
    }
}
