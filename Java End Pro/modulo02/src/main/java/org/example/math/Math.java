package org.example.math;

import java.math.BigInteger;

public class Math {
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
}
