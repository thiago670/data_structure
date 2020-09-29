public class DoubleLinkedList {

    private Node first;
    private Node last;
    private Node previous;

    private int nodeAmount = 0;

    public void add(Object obj) {
        Node node = new Node(obj);

        this.first = node;

        if (nodeAmount == 0) {
            this.last = node;
            this.previous = node;
        } else if (nodeAmount == 1) {
            this.last.setNext(node); // penultima<-ultimau
            node.setPrevious(this.last); // penultima->ultima.
        } else {
            this.previous.setNext(node); // próxima <- anterior
            node.setPrevious(this.previous); // próxima -> anterior
        }

        this.previous = node;

        nodeAmount++;

    }

    public void addFirst(Object obj) {
        Node first = this.first;

        // cenário atual
        // f

        // criar nova celula
        // Nf
        this.first= new Node(obj);

        // Apontar o primeiro para o segundo
        // N>f
        this.first.setPrevious(first);

        //Apontar o segundo para o primeiro
        // N<f
        first.setNext(this.first);

        //incrementar o número de celulas.
        nodeAmount++;
    }

    public void add(Object obj, int posicao) {

        if (posicao == 0) {
            addFirst(obj);
        } else {
            Node current = get(posicao);
//        Node previous = current.getPrevious();
            Node next = current.getNext() != null ? current.getNext() : null;

            // cenário atual
            // nx<>c

            // criar célula
            // nx<Nc
            Node newNode = new Node(obj);

            // apontar o novo node para o current
            // nxN>c
            newNode.setPrevious(current);

            // apontar o current para o novo node
            // nxN<>c
            current.setNext(newNode);

            // apontar o anterior para o novo node
            //nx>N<>c
            if (next != null) {
                next.setPrevious(newNode);
            }

            // apontar o novo node para o próximo
            //nx<>N<>c

            nodeAmount++;
        }

    }

    public Node get(int posicao) {

        if (posicao == 0) {
            return this.first;
        }

        Node current = this.first;

        for (int i = 0; i <= nodeAmount - 1; i++) {
            if (i == posicao - 1) {
                return current.getPrevious();
            } else {
                current = current.getPrevious();
            }
        }

        return current;
    }

    public void remove(int posicao) {

        if (!isValidPosition(posicao)) {
            throw new IllegalArgumentException("This position is invalid!");
        }

        Node node = get(posicao);
        Node before = node.getPrevious();
        Node next = node.getNext();

        before.setNext(next);
        next.setPrevious(before);

        nodeAmount--;

    }

    private Boolean isValidPosition(int position) {
        return position <= (nodeAmount - 1);
    }


    @Override
    public String toString() {

        if (nodeAmount == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("[");

        Node current = this.first;

        while (current.getPrevious() != null) {
            builder.append(current.getObjeto()).append(", ");
            current = current.getPrevious();
        }
        builder.append(this.last);
        builder.append("]");
        return builder.toString();
    }


}
