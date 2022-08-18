package homework.bracechecker;

public class BraceChecker {
    private String text;
    private Stack stack = new Stack();
    private Stack stackForIndex = new Stack();

    public BraceChecker(String text) {


        this.text = text;
    }

    public void check() {


        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            char value;

            switch (c) {

                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    stackForIndex.push(i);
                    break;
                case ')':
                    value = (char) stack.pop();
                    stackForIndex.pop();
                    if (value == 0) {
                        System.err.println("Error: closed " + c + " but not opened at " + i);
                    } else if (value != '(') {
                        System.err.println("error: closed " + c + " but opened " + value + "at " + i);


                    }
                    break;
                case '}':
                    value = (char) stack.pop();
                    stackForIndex.pop();
                    if (value == 0) {
                        System.err.println("Error: closed " + c + " but not opened at " + i);
                    } else if (value != '{') {
                        System.err.println("error: closed " + c + " but opened " + value + " at " + i);


                    }
                    break;
                case ']':
                    value = (char) stack.pop();
                    stackForIndex.pop();
                    if (value == 0) {
                        System.err.println("Error: closed " + c + " but not opened at " + i);
                    } else if (value != '[') {
                        System.err.println("error: closed " + c + " but opened " + value + " at " + i);


                    }
                    break;
            }
        }
        while (!stack.isEmpty()) {
            System.err.println("Error: open " + (char) stack.pop() + " but not closed at " + stackForIndex.pop());
        }
    }
}









