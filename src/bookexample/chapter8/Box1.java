package bookexample.chapter8;

public class Box1 {
    private double width, height, depth;


    Box1(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box1() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box1(double len) {
        width = height = depth = len;
    }

    public Box1(BoxWeight1 ob) {

    }

    double volume() {
        return width * depth * height;
    }

}

class BoxWeight1 extends Box1 {
    double weight;

    BoxWeight1(BoxWeight1 ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight1(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight1() {
        super();
        weight = -1;
    }


    BoxWeight1(double len, double m) {
        super(len);
        weight = m;
    }
}
