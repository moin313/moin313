package DAY2.inheritance;

public class Shape {
    private int x1, y1 , x2, y2;
//
//    Shape(int _x1, int _x2, int _y1, int _y2){
//        this.x1 = _x1;
//        this.x2 = _x2;
//        this.y1 = _y1;
//        this.y2 = _y2;
//    }

    public double getLength(xy first, xy second){
        double length = Math.sqrt(Math.pow((first.getFirst() - second.getFirst()) , 2) + Math.pow((first.getSecond() - second.getSecond()), 2));
        return length;
    }
}
