import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static Integer[][] backTracking(Integer[] array, Integer n){
        Integer[][] list = new Integer[1][n];
        Integer posicaoFinalList = 0;

        for(Integer x = 0; x < array.length; x++){

            if (n == 1){
                if(posicaoFinalList != 0){
                    list = extendArray(list,n);
                }
                list[posicaoFinalList] = new Integer[]{array[x]};
                posicaoFinalList++;
            } else if (n == 2) {
                for(Integer y = x + 1;y < array.length; y++){
                    if(posicaoFinalList != 0){
                        list = extendArray(list,n);
                    }
                    list[posicaoFinalList] = new Integer[]{array[x], array[y]};
                    posicaoFinalList++;
                }
            } else if (n == 3){
                for (Integer y = x + 1;y < array.length -1; y++){
                    for (Integer z = y + 1;z < array.length; z++){
                        if(posicaoFinalList != 0){
                            list = extendArray(list,n);
                        }
                        list[posicaoFinalList] = new Integer[]{array[x], array[y],array[z]};
                        posicaoFinalList++;
                    }
                }
            }


        }
        return list;
    }

    private static Integer[][] extendArray(Integer[][] list, Integer index2) {
        Integer[][] listClone = new Integer[list.length + 1 ][index2];

        for(Integer a = 0; a < list.length; a++){
            listClone[a] = list[a];
        }
        return listClone;
    }

    public static void main(String[] args) {
        //Ex01
        Integer[][] arraybidimensional = backTracking(new Integer[]{1,2,3,4,5,6,7,8},3);

        //imprimirArraybidimensional(arraybidimensional);


        String[][] xadrex = {
                            {"*","*","*","*","*","*","*","*"},
                            {"*","*","*","*","*","*","*","*"},
                            {"*","*","*","*","*","*","*","*"},
                            {"*","*","*","*","*","*","*","*"},
                            {"*","*","*","*","*","*","*","*"},
                            {"*","*","*","*","*","*","*","*"},
                            {"*","*","*","*","*","*","*","*"},
                            {"*","*","*","*","*","*","*","*"},
        };
        //Ex Desafio
       // imprimirArraybidimensional(movimentosCavalo(xadrex));


        //Ex02
        System.out.println(contadorDeMoeda(18,5,2,1));
    }

    private static Integer contadorDeMoeda(Integer moedasPaga, Integer ... moedasDisponivelParaTroco) {
        Integer moedaJaPaga = 0;
        Integer quantidadeDeMoedas = 0;
        Integer index = 0;
        while (true) {
            if (moedasPaga == moedaJaPaga || index >= moedasDisponivelParaTroco.length) {
                return quantidadeDeMoedas;
            }
            if (moedaJaPaga + moedasDisponivelParaTroco[index] <= moedasPaga) {
                moedaJaPaga+= moedasDisponivelParaTroco[index];
                quantidadeDeMoedas++;
            }else{
                index++;
        }
    }
    }

    private static String[][] movimentosCavalo(String[][] xadrex) {

        String[][] xadrexClone = new String[xadrex.length + 2][xadrex.length + 2];

        for(Integer n = 0; n < xadrexClone.length;n++){
            for (Integer m = 0;m < xadrexClone[n].length;m++){
                xadrexClone[n][m] = "*";
            }
        }


        for(Integer n = 2; n < xadrexClone.length - 2;n++){
            for (Integer m = 2;m < xadrexClone[n].length - 2;m++){
                if(
                        xadrexClone[n + 1][m + 2].equals("*") && xadrexClone[n - 1][m + 2].equals("*") &&
                        xadrexClone[n + 1][m - 2].equals("*") && xadrexClone[n - 1][m + 2].equals("*") &&
                        xadrexClone[n + 2][m + 1].equals("*") && xadrexClone[n - 2][m + 1].equals("*") &&
                        xadrexClone[n + 2][m - 1].equals("*") && xadrexClone[n - 2][m + 1].equals("*")
                ){
                    xadrexClone[n][m] = "x";
                    xadrex[n - 2][m - 2] = "x";
                }
            }
        }
        return xadrex;
    }

    public static void imprimirArraybidimensional(Object[][] array){
        for(Integer n = 0; n < array.length; n++){
            System.out.println(Arrays.toString(array[n]));
    }
}}