package bookexample.chapter3;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("ինտ տիպի վերափոխումը բայթ տիպի․");
        b  = (byte) i;
        System.out.println("i և b "+i+(" ")+b);
        System.out.println("դաբլ տիպի վերափոխումը ինտ տիպի․");
        i = (int) d;
        System.out.println("d և a "+d+" "+i);
        System.out.println("դաբլ տիպի վերափոխումը բաըթ տիպի․");
        b = (byte) d;
        System.out.println("d և b " + d + " "+b);



    }
}
