public class Demo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(20);
        r.setWidth(10);
        resize(r);
        printLengthAndWidth(r);


        // cannot use resize(s) for square
        Square s = new Square();
        s.setSide(10);
        printLengthAndWidth(s);

    }

    public static void resize(Rectangle r) {
        // resize if width is smaller than length
        while (r.getWidth() < r.getLength()) {
            r.setWidth(r.getWidth() + 1);
        }
    }

    public static void printLengthAndWidth(Quadrilateral quad) {
        System.out.println(quad.getLength());
        System.out.println(quad.getWidth());
    }
}
