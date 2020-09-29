public class TestaDoubleLinkedList {


    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        System.out.println("Imprime a lista vazia: " + doubleLinkedList);

        doubleLinkedList.add("João");
        doubleLinkedList.add("Augusto");
        doubleLinkedList.add("Alvarino");

        System.out.println("Imprime a lista com três nomes: " + doubleLinkedList);

        int posicao = 2;
        Node pega = doubleLinkedList.get(posicao);
        System.out.println("Confirma o anterior e o pŕoximo na posição " + posicao + "=" + pega + ", Anterior:" + pega.getPrevious() + " Próximo: " + pega.getNext());


        doubleLinkedList.add("Joselito");
        System.out.println("Adiciona Joselito na lista" + doubleLinkedList);

        doubleLinkedList.remove(2);
        System.out.println("Remove a célula na posição 2: " + doubleLinkedList);

        doubleLinkedList.add("Godofredo", 2);
        System.out.println("Adiciona Godofredo na posição 2: " + doubleLinkedList);

        doubleLinkedList.add("William", 0);
        System.out.println("Adiciona William na posição 0: " + doubleLinkedList);



    }

}
