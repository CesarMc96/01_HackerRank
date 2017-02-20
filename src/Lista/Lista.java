package Lista;

public class Lista {

    private Nodo inicio;

    public Lista() {
        inicio = null;
    }

    public void insertarFinal(Integer elemento) {
        Nodo nuevo = new Nodo(elemento);

        if (ListaVacia()) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;

            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }

    }

    private boolean ListaVacia() {
        return inicio == null;
    }

    public void insertarPrincipio(Integer elemento) {
        Nodo nuevo = new Nodo(elemento);

        if (ListaVacia()) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }

    public void recorrerLista() {
        Nodo aux = inicio;
        while (aux != null) {
            System.out.println(aux.getElemento());
            aux = aux.getSiguiente();
        }
    }

    public void insertarOrdenado(Integer elemento) {
        Nodo nuevo = new Nodo(elemento);

        if (ListaVacia()) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;
            Nodo anterior = null;

            while (aux != null && aux.getElemento() < elemento) {
                anterior = aux;
                aux = aux.getSiguiente();
            }

            if (anterior == null) {
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
            } else {
                anterior.setSiguiente(nuevo);
                nuevo.setSiguiente(aux);
            }
        }
    }

    public void ordenarBurbuja() {
        Nodo aux2 = inicio;
        Nodo aux1 = inicio;

        while (aux2 != null) {
            aux1 = aux2.getSiguiente();
            while (aux1 != null) {
                if (aux1.getElemento().compareTo(aux2.getElemento()) < 0) {
                    int temporal = aux2.getElemento();
                    aux2.setElemento(aux1.getElemento());
                    aux1.setElemento(temporal);
                }
                aux1 = aux1.getSiguiente();
            }
            aux2 = aux2.getSiguiente();
        }
    }
    
}
