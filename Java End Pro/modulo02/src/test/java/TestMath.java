import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;
import java.util.Optional;

import static org.example.math.Math.calcularFimonat;
import static org.example.math.Math.fatorial;

public class TestMath {
    @Test
    public void testCalcularFimonat_HappyPath(){
        BigInteger resultado = calcularFimonat(new BigInteger("3"));
        Assert.assertEquals(new BigInteger("6"), resultado);
    }
    @Test
    public void testFatorial_HappyPath(){
        Long resultado = fatorial(5L);
        Assert.assertEquals((Long)120L, resultado);
    }
}
