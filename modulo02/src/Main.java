import java.math.BigInteger;

public class Main {
    public static BigInteger numberMultiplicado = new BigInteger("1");
    public static final BigInteger calcularFimonat(BigInteger number){
        if (number.equals(new BigInteger("0"))){
            return numberMultiplicado;
        }
        numberMultiplicado = numberMultiplicado.multiply(number);

        return calcularFimonat(number.subtract(new BigInteger("1")));
    }

    public static final Long fatorial(Long n){
        if(n.equals(0L) || n.equals(1L)){
            return 1L;
        }
        return n * fatorial(n-1);
    }

    public static void main(String[] args) {
        //Exercicio 01
        Long y = 100L;
        System.out.println("Fibonate de " + y + " e: " + fatorial(y));

        //Exercicio 02
        BigInteger n = new BigInteger("100");
        System.out.println("Fibonate de " + n + " e: " + calcularFimonat(n));
    }
}