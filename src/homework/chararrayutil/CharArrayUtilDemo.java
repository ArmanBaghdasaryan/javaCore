package homework.chararrayutil;

public class CharArrayUtilDemo {
    public static void main(String[] args) {

         char[]chars = {'j','a','v','a','l','o','v','o','o'};
        CharArrayUtil o = new CharArrayUtil();
        System.out.println(o.quantityO(chars));

        char[]chars1 = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        CharArrayUtil a = new CharArrayUtil();
        a.printBarev(chars1);


        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        CharArrayUtil x = new CharArrayUtil();
        x.words(chars2);

        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        CharArrayUtil b = new CharArrayUtil();
        b.lastSecond(chars3);


        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'y'};
        CharArrayUtil bob = new CharArrayUtil();
        bob.bob(bobArray);



    }
}
