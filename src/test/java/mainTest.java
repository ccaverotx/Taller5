import org.junit.Test;

import static org.junit.Assert.*;

public class mainTest {
    //Prueba que el generador randomico no supere los limites especificados
    @Test
    public void primerPiso() {
        int a=main.gen_persona();
        assertEquals(1,a);

    }
    @Test
    public void segundoPiso() {
        int a=main.gen_persona();
        assertEquals(2,a);

    }
    @Test
    public void tercerPiso() {
        int a=main.gen_persona();
        assertEquals(3,a);

    }

}