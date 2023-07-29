public class Demo {
    public static void main(String[] args) {

        // create a rectangle object
        Rectangle r = new Rectangle();
        r.setLength(20);
        r.setWidth(10);

        resize(r);
        printLengthAndWidth(r);

        // create a square object
        Square s = new Square();
        s.setLength(20);

        resize(s);
        printLengthAndWidth(s);
        
    }

    public static void resize(Rectangle r) {

        // resize if width is smaller than length
        while (r.getWidth() < r.getLength()) {
            r.setWidth(r.getWidth() + 1);
        }
    }

    // print length and width
    public static void printLengthAndWidth(Rectangle r){
        System.out.println(r.getLength());
        System.out.println(r.getWidth());
    }
}
