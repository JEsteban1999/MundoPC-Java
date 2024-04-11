
package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Raton raton1 = new Raton("USB", "Asus");
        Teclado teclado1 = new Teclado("Bluetooth", "Logitech");
        Monitor monitor1 = new Monitor("Apple", 32.00);
        Computadora computadora1 = new Computadora("Gamer", monitor1, teclado1, raton1);
        
        Raton raton2 = new Raton("WIFI", "Gamer Tech");
        Teclado teclado2 = new Teclado("USB", "Acer");
        Monitor monitor2 = new Monitor("Asus", 40.00);
        Computadora computadora2 = new Computadora("Armado", monitor2, teclado2, raton2);
        
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.mostrarOrden();
        
        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadora1);
        orden2.agregarComputadora(computadora2);
        orden2.mostrarOrden();
    }
}
