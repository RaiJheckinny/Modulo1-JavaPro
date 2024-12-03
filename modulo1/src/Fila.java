import java.util.Arrays;

public class Fila {
    private Integer[] lista = new Integer[10];
    private Integer posicaoUtimoElemento = -1;

    public void enqueue(Integer number){
        posicaoUtimoElemento++;
        lista[posicaoUtimoElemento] = number;
    }

    public Integer dequeue(){
        for(Integer n = 0; n <= posicaoUtimoElemento; n++){
            lista[n] = lista[n + 1];
        }
        return lista[0];
    }

    public String getList() {
        return "Fila{" +
                "lista=" + Arrays.toString(lista) +
                '}';
    }
}
