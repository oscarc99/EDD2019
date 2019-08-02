public class Nodo {
    
    public int x;
    public int y;
    Nodo siguiente;
    
    public  Nodo(int x, int y){
        this.x= x;
        this.y=y;       
    }
    
    public Nodo getSiguiente(){
        return this.siguiente;               
    }
    
    public void setSiguiente (Nodo sig){
        this.siguiente= sig;
    }
}



Nodo inicio = null;
    Nodo ultimo=null;
    Nodo fin = null;

    public Lista() {

    }

    public void inserter(int x, int y) {

        Nodo nuevo = new Nodo(x, y);
        if (inicio == null) {
            nuevo.setSiguiente(null);
            
            inicio = nuevo;
            
            ultimo= nuevo;
            
            fin=nuevo;
        }else{
            nuevo.setSiguiente(ultimo);
            ultimo = nuevo;
        }
    }

    public boolean vacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public int cantidad() {
        Nodo temp = inicio;
        int cont = 0;
        while (temp != fin) {
            cont++;
        }
        return cont;
    }
}
