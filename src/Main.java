
public class Main {
    public static void main(String[] args) {
        //Composition
        SegmentCompo sc = new SegmentCompo(0,0,5,5);

        //Aggrégation
        Point p1 = new Point(1,1);
        Point p2 = new Point(6,6);


        SegmentAggre sa = new SegmentAggre(p1, p2);

        System.out.println(p1.toString());
    }
}