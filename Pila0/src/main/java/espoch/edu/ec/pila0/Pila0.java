

package espoch.edu.ec.pila0;

import ec.edu.espoch.clases.Stack;

public class Pila0 {

    public static void main(String[] args) {
        Stack pila = new Stack();
        
        //Agregar los datos de la pila
        pila.push(10);
        pila.push(50);
        pila.push(100);
        
        pila.mostrarElemento();
    }
}
