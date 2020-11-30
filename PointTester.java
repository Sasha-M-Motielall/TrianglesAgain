public class PointTester {
  public static void main(String[] args) {
    Point p1 = new Point(4.2, 7.2);
    System.out.println(p1);
    System.out.println(p1.getX());
    System.out.println(p1.getY());
    Point p2 = new Point (0,0);
    System.out.println(p2);
    System.out.println(p2.getX());
    System.out.println(p2.getY());
    System.out.println(p2.distanceTo(p1));
    System.out.println(p2.equals(p1));
  }
}
