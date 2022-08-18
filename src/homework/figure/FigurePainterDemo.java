package homework.figure;

public class FigurePainterDemo {
    public static void main(String[] args) {
        FigurePainter fp = new FigurePainter();
        fp.c = '*';
        fp.figureOne(10);
        System.out.println();
        fp.figureTwo(10);
        System.out.println();
        fp.figureFive(10);
        System.out.println();
        fp.figureThree(10);
        System.out.println();
        fp.figureFour(10);
    }
}
