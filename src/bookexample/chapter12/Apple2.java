package bookexample.chapter12;

public enum Apple2 {
    JONATHAN(10),
    GOLDEN_DEL(9),
    RED_DEL(12),
    WINESAP(15),
    CORTLAND(8);

    private int price;

    Apple2(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}

class EnumDemo3 {
    public static void main(String[] args) {
        Apple2 ap;
        System.out.println("Яблoкo сорта Winesap стоит " + Apple2.WINESAP.getPrice() + "центов. \n");
        System.out.println("Цeны на все сорта яблок: ");
        for (Apple2 a : Apple2.values()) {
            System.out.println(a + " стоит " + a.getPrice() + " центов. ");

        }
    }
}

