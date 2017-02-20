package Lista;

public class Nodo {

    private Integer elemento;
    private Nodo siguiente;

    public Nodo() {
    }

    public Nodo(Integer elemento) {
        this.elemento = elemento;
        siguiente = null;
    }

    public Integer getElemento() {
        return elemento;
    }

    public void setElemento(Integer elemento) {
        this.elemento = elemento;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void PrinttheElementsofaLinkedList(Nodo head) {
        if (head == null) {
            return;
        }

        Nodo aux = head;
        while (true) {
            System.out.println(aux.getElemento());
            if (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            } else {
                break;
            }
        }
    }

    public Nodo InsertaNodeattheTailofaLinkedList(Nodo head, int data) {
        if (head == null) {
            head = new Nodo();
            head.setElemento(data);
        } else {
            Nodo nodo = head;
            while (nodo.getSiguiente() != null) {
                nodo = nodo.getSiguiente();
            }
            nodo.siguiente = new Nodo();
            nodo.getSiguiente().setElemento(data);
        }
        return head;
    }

    public Nodo Insertanodeattheheadofalinkedlist(Nodo head, int x) {
        Nodo nodo = new Nodo();
        nodo.setElemento(x);
        nodo.setSiguiente(head);
        return nodo;
    }

    public Nodo Insertanodeataspecificpositioninalinkedlist(Nodo head, int data, int position) {
        Nodo node = head;
        if (position == 0) {
            node = new Nodo();
            node.setElemento(data);
            node.setSiguiente(head);
            return node;
        } else {
            while (--position > 0) {
                node = node.getSiguiente();
            }
            Nodo i = node.getSiguiente();
            node.siguiente = new Nodo();
            node.getSiguiente().setElemento(data);
            node.getSiguiente().setSiguiente(i);
            return head;
        }
    }

    public Nodo DeleteaNode(Nodo head, int position) {
        Nodo aux = head;
        if (position == 0) {
            return aux.getSiguiente();
        }
        while (--position > 0) {
            aux = aux.getSiguiente();
        }
        aux.setSiguiente(aux.getSiguiente().getSiguiente());
        return head;
    }

    public void PrintinReverse(Nodo head) {
        if (head != null) {
            PrintinReverse(head.getSiguiente());
            System.out.println(head.getElemento());
        }
    }

    public Nodo ReverseaLinkedList(Nodo head) {
        if (head == null) {
            return null;
        }
        Nodo node = null;
        while (head != null) {
            Nodo i = node;
            node = new Nodo();
            node.setElemento(head.getElemento());
            node.setSiguiente(i);
            head = head.getSiguiente();
        }
        return node;
    }

}
