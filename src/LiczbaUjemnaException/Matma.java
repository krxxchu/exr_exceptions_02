package LiczbaUjemnaException;

public class Matma {

    public static final double PI = Math.PI;

    public static double liczPoleKola (double promien) {
        double poleKola = PI * Math.pow (promien, 2);
        return  poleKola;
    }

    public static double liczObwodKola (double promien) {
        if(promien < 0) {
            throw new LiczbaUjemnaException();
        }
        double obwodKola = 2 * PI * promien;
        return obwodKola;
    }

    public static double liczPoleProstokata (double bokA, double bokB) {
        double poleProstokata = bokA * bokB;
        return poleProstokata;
    }

    public static double liczObwodProstokata (double a, double b) {
        double obwodProstokata = 2 * a + 2 * b;
        return obwodProstokata;
    }
}
