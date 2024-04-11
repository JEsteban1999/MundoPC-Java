
package com.gm.mundopc;

public class Orden {
    private static final int MAX_COMPUTADORAS = 10;
    private static int contadorOrdenes;
    private int idOrden;
    private int contadorComputadoras;
    private Computadora computadoras[];
    
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora) {
        if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            this.computadoras[this.contadorComputadoras++] = computadora;
        }
        else {
            System.out.println("Se ha superado el limite de computadoras: " + Orden.MAX_COMPUTADORAS);
        }
    }
    
    public void mostrarOrden() {
        System.out.println("Id orden: " + this.idOrden);
        System.out.println("Productos de la orden: ");
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(this.computadoras[i].toString());
        }
    }
    
}
