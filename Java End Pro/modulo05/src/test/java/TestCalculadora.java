import org.example.domain.Calculadora;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCalculadora {
    Calculadora calculadora;
    @Before
    public void init(){
        calculadora = new Calculadora();
    }

    @Test
    public void testAdicionar_HappyPath(){
        int resultado = calculadora.adicionar(2,3);
        Assert.assertEquals(5, resultado);
    }
    @Test
    public void testSubtrair_HappyPath(){
        int resultado = calculadora.subtrair(3,2);
        Assert.assertEquals(1, resultado);
    }
    @Test
    public void testMultiplicar_HappyPath(){
        int resultado = calculadora.multiplicar(3,2);
        Assert.assertEquals(6, resultado);
    }
    @Test
    public void testDividir_HappyPath(){
        int resultado = calculadora.dividir(6,2);
        Assert.assertEquals(3, resultado);
    }
}
