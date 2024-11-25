package ec.edu.espoch.clases;

public class Stack {

    private Nodo cima;//representa la cima de la pila
    private int tamaño;//almacena el tamaño de la pila

    public Stack() {
        this.cima = null;
        this.tamaño = 0;
    }

    //metodo para agregar un elemento a la pila(push)
    public void push(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;//la cima ahora es el nuevo nodo
        tamaño++;
    }

    //Metodo para remover el elemento de la cima de la pila(pop)
    public int pop() {
        int dato = cima.getDato();//Obtener el dato de la cima
        cima = cima.siguiente; //modifica el valor
        tamaño--;//disminuye el tamaño de la pila
        return dato;
    }
    //Para mostrar los elemento de la cima en el main
    public void mostrarElemento(){
        Nodo actual=cima;
        //Verificar si la pila esta vacia
        if(actual==null){
            System.out.println("La pila esta vacia:");
            return;
        }
        //Recorrer la pila hasta llegar al final(null)
        System.out.println("Elementos de la pila:");
        while (actual != null){
            System.out.println(actual.getDato());//Imprimir el dato
            actual=actual.siguiente;//moverse al siguiente nodo
        }
        
    }

}
