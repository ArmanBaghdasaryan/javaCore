package homework.bracechecker;

public class Stack {
    private int[] stack = new int[20];
    private int index;

    public Stack() {
        index =  -1;
    }

    public void push(int value) {
        if (index == stack.length - 1) {
//            System.out.println("Cтeк заполнен.");
        } else {
            stack[++index] = value;


        }

    }

    public int pop() {
        if (index < 0) {
//            System.out.println("Cтeк не загружен.");
            return 0;
        } else {
            return stack[index--];


        }


        }  public boolean isEmpty(){
        return index == -1;

    }

}
