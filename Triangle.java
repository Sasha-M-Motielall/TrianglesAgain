public class Triangle {
  private Point v1, v2, v3;
  public Triangle(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }
  public Triangle (double x1, double y1, double x2, double y2, double x3, double y3) {
    Point a = new Point(x1,y1);
    Point b = new Point(x2,y2);
    Point c = new Point(x3,y3);
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public double getPerimeter() {
   return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
 }

 public double getArea() {
   double d1 = v1.distanceTo(v2);
   double d2 = v2.distanceTo(v3);
   double d3 = v3.distanceTo(v1);
   double sideLen = getPerimeter()/2;
   return Math.sqrt(sideLen*(sideLen-d1) * (sideLen-d2) * (sideLen-d3));
 }

 public String classify() {
    String shape = "";
    double d1 = Math.round(v1.distanceTo(v2) *10000.0) /10000.0;
    double d2 = Math.round(v2.distanceTo(v3) *10000.0) /10000.0;
    double d3 = Math.round(v3.distanceTo(v1) *10000.0) /10000.0;
    if (d1 == d2 && d2 == d3) {
      shape = "equilateral";
    }else if (d1 == d2 || d2 == d3 || d3 == d1) {
      shape = "isosceles";
    }else {
      shape = "scalene";
    }return shape;
  }

  public String toString() {
    return "v1" + v1 + "v2" + v2 + "v3" + v3;
  }
}
