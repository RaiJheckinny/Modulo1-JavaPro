import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        //Exercicio 01
        Pilha pilha = new Pilha();
        pilha.push(1);
        pilha.push(3);
        pilha.push(4);
        System.out.println(pilha.getLista());
        pilha.pop();
        pilha.pop();
        pilha.pop();
        System.out.println(pilha.getLista());

        //Exercicio 02

        Fila fila = new Fila();
        fila.enqueue(1);
        fila.enqueue(4);
        fila.enqueue(5);
        System.out.println(fila.getList());
        fila.dequeue();
        System.out.println(fila.getList());
        fila.dequeue();
        System.out.println(fila.getList());

        //Exercicio 03

        NodeList node = new NodeList();
        node.push(new Node(10));
        node.push(new Node(20));
        node.push(new Node(30));

        node.printList();

        node.pop();

        node.printList();




    }
}