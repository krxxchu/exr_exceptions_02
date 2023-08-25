import LiczbaUjemnaException.ExceptionDiv;
import LiczbaUjemnaException.Matma;

public class Main {
    public static void main(String[] args) {

        Matma.liczObwodKola(-2);

        try {
            System.out.println("wynik = " + dividing(5,0));

        } catch (ExceptionDiv e) {
            System.out.println(e.getMessage());
        }
    }

    public static double dividing(double a, double b) throws ExceptionDiv {
        if (b == 0) {
            throw new ExceptionDiv();
        } else {
            return a/b;
        }
    }
}