import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class BibliotecaTest {
    private Biblioteca biblioteca;

    @Before
    public void inicializar() {
        biblioteca = new Biblioteca();
        biblioteca.agregarLibro("El principito", 3);
        biblioteca.agregarLibro("Don Quijote de la Mancha", 2);
        biblioteca.agregarLibro("El juego de Ender", 2);
        biblioteca.agregarLibro("Librito", 2);
        biblioteca.prestarLibro("Ale","Librito");
        biblioteca.agregarLibro("Yoga para dummies",4);
        biblioteca.agregarLibro("La trilogía de la fundación",1);
        biblioteca.prestarLibro("Yoni","La trilogía de la fundación");
        biblioteca.agregarLibro("Como comer jalapeños",4);


    }

    @Test
    public void test2(){
        biblioteca.prestarLibro("Luis","El juego de Ender");
        assertEquals(1, biblioteca.obtenerCopiasDisponibles("El juego de Ender"));
        assertEquals(Arrays.asList("El juego de Ender"), biblioteca.prestamosPorUsuario.get("Luis"));

    }
    @Test
    public void test(){
        biblioteca.prestarLibro("Alvaro","El principito");
        biblioteca.prestarLibro("Alvaro","Don Quijote de la Mancha");
        assertEquals(2, biblioteca.obtenerCopiasDisponibles("El principito"));
        assertEquals(1, biblioteca.obtenerCopiasDisponibles("Don Quijote de la Mancha"));
        assertEquals(Arrays.asList("El principito","Don Quijote de la Mancha"), biblioteca.prestamosPorUsuario.get("Alvaro"));

    }

    @Test
    public void testAgregar()throws Exception{
        biblioteca.agregarLibro("Las puertas de piedra",4);

    }

    @Test
    public void testPrestar()throws Exception{
        biblioteca.prestarLibro("Yolanda","Yoga para dummies");

    }

    @Test
    public void testDevolver()throws Exception{
        biblioteca.prestarLibro("Ronnie","Como comer jalapeños");
        biblioteca.devolverLibro("Ronnie","Como comer jalapeños");
        assertEquals(4, biblioteca.obtenerCopiasDisponibles("Como comer jalapeños"));
    }

    @Test
    public void testDevolver2(){
        assertThrows(IllegalArgumentException.class,()->{
            biblioteca.prestarLibro("Yoni","La trilogía de la fundación");
        });

    }

    @Test
    public void test3(){
        biblioteca.prestarLibro("Luis","El juego de Ender");
        biblioteca.devolverLibro("Luis","El juego de Ender");
        assertEquals(2, biblioteca.obtenerCopiasDisponibles("El juego de Ender"));
    }

    @Test
    public void testAgregar2()throws Exception{
        biblioteca.agregarLibro("Cositas",0);

    }


    @Test
    public void test4(){
        assertEquals(1, biblioteca.obtenerCopiasDisponibles("Librito"));
    }

    @Test
    public void test5(){
        assertEquals(3, biblioteca.obtenerCopiasDisponibles("El principito"));
}

    @Test
    public void testAgregar4()throws Exception{
        assertThrows(IllegalArgumentException.class,()-> {
            biblioteca.agregarLibro("Empanadas de ojos de serpiente", -1);
});
}


}
