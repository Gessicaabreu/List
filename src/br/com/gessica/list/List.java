package br.com.gessica.list;


public class List {
    private Node firstnode;



    public void add(Object item) {
        Node newNode = new Node(item);
        if (firstnode == null) {
            firstnode = newNode;
        } else {
            Node lastnode = getlastnode();
            lastnode.next = newNode;
        }
    }

    public int size() {

        int i = firstnode != null ? 1 : 0;
        Node auxcont = firstnode;

        while ((auxcont != null ? auxcont.next : null) != null) {
            auxcont = auxcont.next;
            i++;
        }
        return i;
    }

    private Node getlastnode() {
        Node aux = firstnode;
        while (aux.next != null) {
            aux = aux.next;
        }
        return aux;
    }

    public Object get(int index) {

        return null;
    }

    private class Node {
        Node next;
        Object item;

        public Node(Object item) {
            this.item = item;
        }
    }
}
