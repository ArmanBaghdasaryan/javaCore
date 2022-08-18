package bookexample.chapter3;

public class Light {
    public static void main(String[] args) {
       int lightspeed = 186000;
       long days = 1000;
       long seconds = days * 24 * 60 * 60;
       long distance = lightspeed * seconds;
        System.out.print(days);
        System.out.print(" օրից լույսը կանցնի սուրջ ");
        System.out.println(distance + " միլ");
    }
}
