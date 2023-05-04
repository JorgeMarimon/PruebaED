import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NominaTest {

    @Test
    public void testNomina() throws Exception {
        String[] args = {"5","1000"};
        Nomina.main(args);

    }

    @Test
    public void testNomina2()
    {
        String[] args = {"2"};
        assertThrows(IndexOutOfBoundsException.class, ()-> {Nomina.main(args);});

    }

    @Test
    public void testNomina3() throws Exception {
        String[] args = {"5","-1000"};
        Nomina.main(args);

    }

    @Test
    public void testNomina5() throws Exception {
        String[] args = {"-55","1111"};
        assertThrows(NegativeArraySizeException.class, ()-> {Nomina.main(args);});


    }

    @Test
    public void testNomina6() throws Exception {
        String[] args = {"158","12547"};
        Nomina.main(args);

    }

    @Test
    public void testNomina7() throws Exception {
        String[] args = {"23","-151515"};
        Nomina.main(args);

    }

    @Test
    public void testNomina8() throws Exception {
        String[] args = {"78","1000"};
        Nomina.main(args);

    }

    @Test
    public void testNomina9() throws Exception {
        String[] args = {"-50","1111"};
        assertThrows(NegativeArraySizeException.class, ()-> {Nomina.main(args);});


    }

    @Test
    public void testNomina10() throws Exception {
        String[] args = {"0","-1000"};
        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> {Nomina.main(args);});


    }

}
