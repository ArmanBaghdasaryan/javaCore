package bookexample.chapter8;

public class AbstractAreas {
    public static void main(String[] args) {
        Rectangle1 r = new Rectangle1(9, 5);
        Triangle1 t = new Triangle1(10, 8);
        Figure1 figref1;


        figref1 = r;
        System.out.println("Плoщaдь равна " + figref1.area());

        figref1 = t;
        System.out.println("Плoщaдь равна " + figref1.area());
    }
}
