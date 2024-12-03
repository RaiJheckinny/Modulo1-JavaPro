import java.util.Arrays;

public class Pilha {
    private Integer[] lista = new Integer[10];
    private Integer posicaoAtual = -1;

    public void push(Integer number){
        posicaoAtual++;
        lista[posicaoAtual] = number;
    }

    public void pop(){
        lista[posicaoAtual] = null;
        posicaoAtual--;
    }

    public String getLista() {
        return "Pilha{" +
                "lista=" + Arrays.toString(lista) +
                '}';
    }

    public Integer top(){
        return lista[posicaoAtual];
    }
    public boolean isEmpty(){
        if (lista[posicaoAtual].equals(null)){
            return true;
        }
        return false;
    }
    public Integer size(){
        return posicaoAtual + 1;
    }

}
