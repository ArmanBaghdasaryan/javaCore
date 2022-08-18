package homework.chararrayutil;

public class CharArrayUtil {

    int quantityO(char[] chars) {
        char c = 'o';
        int amount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'o') {
                amount++;

            }


        }


        return amount;
    }

    void printBarev(char[] chars1) {
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != ' ') {
                System.out.print(chars1[i]);

            }

        }
        System.out.println();
    }

    void words(char[] chars2) {
        char second = chars2[chars2.length - 2];
        char last = chars2[chars2.length - 1];
        if (second == 'l' && last == 'y') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    void lastSecond(char[] chars3) {
        char marks = (char) (chars3.length / 2);
        char marks1 = (char) (marks - 1);

        System.out.print(chars3[marks] + "" + chars3[marks1]);


        System.out.println();
    }


    void bob(char[] bobArray) {
        boolean bobThere = false;
        for (int i = 0; i < bobArray.length - 2; i++) {
            if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                bobThere = true;
                break;

            }
        }
        System.out.println(bobThere);
    }
}


