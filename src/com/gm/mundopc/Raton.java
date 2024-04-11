
package com.gm.mundopc;

public class Raton extends DispositivoEntrada {
    private static int contadorRatones;
    private final int idRaton;
    
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    public int getIdRaton() {
        return idRaton;
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", " + super.toString() + '}';
    }

    
}
