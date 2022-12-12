
/**
 * Esta clase representa un circulo
 *
 * @author aaronprimoalmarche
 * @author<a href= "mailto:prologmacgmail.com">prologmacgmail.com</a>
 * @version 1.0
 */

public class Circulo {

    /**
     * Contructores del lenguaje
     */
    private double centroX;
    private double centroY;
    private double radio;

    /**
     * este metodo define variables
     *
     * @param cx coordenadas eje x
     * @param cy coordenadas eje y
     * @param r radio sin unidades
     */
    public Circulo(double cx, double cy, double r) {
        centroX = cx;
        centroY = cy;
        radio = r;
    }

    /**
     * Este metodo define el centro del circulo en eje X
     *
     * @return
     */
    public double getCentroX() {
        return centroX;
    }

    /**
     * Este metodo calcula el perimetro de la circunferencia
     *
     * @return
     */
    public double getCircunferencia() {
        return 2 * Math.PI * radio;
    }

    /**
     * Este metodo mueve el circulo dentro del espacio
     *
     * @param deltaX
     * @param deltaY
     */
    public void mueve(double deltaX, double deltaY) {
        centroX = centroX + deltaX;
        centroY = centroY + deltaY;
    }

    /**
     * Este metodo escala el numero
     *
     * @param s
     */
    public void escala(double s) {
        radio = radio * s;
    }
}
