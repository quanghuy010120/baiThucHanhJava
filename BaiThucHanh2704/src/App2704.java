import Shape.Point;
import Shape.Quadrilateral;
import Shape.Triangle;
import Shape.Quadrilateral;
public class App2704 {
    public static void main(String[] args) throws Exception {
        Point p = new Point();
        Triangle t = new Triangle();
        Quadrilateral q = new Quadrilateral();
        p.nhapDiem();
        p.inDiem();
        t.nhapDiem();
        t.kiemTraTamGiac();
        q.nhapDiem();
        q.kiemTraTuGiac();
    }
}
