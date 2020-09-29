public class Node {

    private Object objeto;
    private Node previous;
    private Node next;

    public Node(Object objeto){
        this.objeto=objeto;
        this.previous =null;
        this.next =null;
    }

    public Node(Object object, Node next, Node previous) {
        this.objeto = object;
        this.next = next;
        this.previous = previous;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getObjeto() {
        return objeto;
    }

    @Override
    public String toString() {
        return this.objeto.toString();
    }

    public boolean equals(Node node) {
        return this.objeto.toString().equals(node.objeto.toString());
    }

}
