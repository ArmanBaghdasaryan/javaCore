package bookexample.chapter8;

public class Box {
    double width, height, depth;


    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        ;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }

}

class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }

    public BoxWeight(Shipment ob) {

    }

    public BoxWeight() {

    }

    public BoxWeight(double len, double m) {

    }
}
class Shipment extends BoxWeight{
    double cost;

    Shipment(Shipment ob){
        super(ob);
        cost = ob.cost;
    }
    Shipment(double w,double h,double d, double m, double c){
        super(w,h,d,m);
        cost = c;
    }
    Shipment(){
        super();
        cost = -1;
    }

    Shipment(double len,double m, double c){
        super(len,m);
        cost = c;
    }



}
