import java.math.BigInteger;

public class Main {
    public static final BigInteger calcularFimonat(BigInteger number){
        if (number.equals(BigInteger.ZERO)){
            return BigInteger.ONE;
        }

        return number.multiply(calcularFimonat(number.subtract(BigInteger.ONE)));
    }

    public static final Long fatorial(Long n){
        if(n.equals(0L) || n.equals(1L)){
            return 1L;
        }
        return n * fatorial(n-1);
    }

    public static void main(String[] args) {
        //Exercicio 01
        Long y = 25L;
        System.out.println("Fibonate de " + y + " e: " + fatorial(y));

        //Exercicio 02
        BigInteger n = new BigInteger("1000");
        System.out.println("Fibonate de " + n + " e: " + calcularFimonat(n));
    }
}