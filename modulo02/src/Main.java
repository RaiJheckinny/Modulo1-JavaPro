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

    public static void main(String[] args) {
        BigInteger n = new BigInteger("100");
        System.out.println("Fibonate de " + n + " e: " + calcularFimonat(n));
    }
}