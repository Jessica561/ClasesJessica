package ec.edu.espoch.clases;

public class Nodo {

    int dato;//variable para alcenar un dato entero
    Nodo siguiente;//Referencia al siguiente nodo

    //Constructor que recibe un dato entero
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public int getDato() {
        return dato;
    }

}
