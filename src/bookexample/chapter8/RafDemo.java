package bookexample.chapter8;

public class RafDemo {
    public static void main(String[] args) {
        BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);
        Box plainBox = new Box();
        double vol;


        vol = weightBox.volume();
        System.out.println("Oбъeм weightBox равен " + vol + weightBox.weight);
        System.out.println();

        plainBox = weightBox;
        vol = plainBox.volume();

        System.out.println("Oбъeм plainBox равен " + vol);


    }
}
