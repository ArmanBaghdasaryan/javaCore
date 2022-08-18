package bookexample.chapter12;

public enum Apple {
    JONATHAN,
    GOLDEN_DEL,
    RED_DEL,
    WINESAP,
    CORTLAND;

    static class EnumDemo {
        public static void main(String[] args) {

            Apple ap;

            ap = RED_DEL;

            System.out.println("Знaчeниe ар: " + ap);
            System.out.println();

            ap = GOLDEN_DEL;

            if (ap == GOLDEN_DEL) {
                System.out.println("Переменная ap содержит GoldenDel.\n");
            }

            switch (ap) {
                case JONATHAN:
                    System.out.println("sort jonathan");
                case GOLDEN_DEL:
                    System.out.println("sort golden delicious");
                    break;
                case RED_DEL:
                    System.out.println("sort red delicious");
                    break;
                case CORTLAND:
                    System.out.println("sort cortland");
                    break;
                case WINESAP:
                    System.out.println("sort winesap");
                    break;
            }


        }

    }

    public static class EnumDemo2 {
        public static void main(String[] args) {
            Apple ap;
            System.out.println("Константы перечислимого типа Apple: ");
            Apple[] allApples = values();
            for (Apple a : allApples) {
                System.out.println(a);

            }
            System.out.println();

            ap = valueOf("WINESAP");
            System.out.println("Пepeмeннaя ар содержит " + ap);

        }
    }
}

