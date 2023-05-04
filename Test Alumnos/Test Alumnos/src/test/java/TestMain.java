import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMain {

	@Test
	public void testMain()
	{
		String[] args = {"2","4"};
		assertThrows(IndexOutOfBoundsException.class, ()-> {Main.main(args);});
		
	}
	@Test
	public void testMain2() throws Exception {
		String[] args = {"2","4","+"};
		Main.main(args);
	}
	@Test
	public void testMain3() throws Exception {
		String[] args = {"2","2","/"};
		Main.main(args);
	}
	@Test
	public void testMain4() throws Exception {
		String[] args = {"2","0","x"};
		Main.main(args);
	}

	@Test
	public void testMain5() throws Exception {
		String[] args = {"2","0","-"};
		Main.main(args);
	}


	@Test
	public void testSuma(){
		int solucion=Main.suma(2,3);
		assertEquals(5,solucion);
	}

	@Test
	public void testSuma2(){
		int solucion=Main.suma(2,-3);
		assertEquals(-1,solucion);
	}

	@Test
	public void testResta(){
		int solucion=Main.resta(2,3);
		assertEquals(-1,solucion);
	}

	@Test
	public void testResta2(){
		int solucion=Main.resta(2,-3);
		assertEquals(5,solucion);
	}

	@Test
	public void testMulti(){
		int solucion=Main.multiplica(2,3);
		assertEquals(6,solucion);
	}

	@Test
	public void testMulti2(){
		int solucion=Main.multiplica(2,-3);
		assertEquals(-6,solucion);
	}

	@Test
	public void testMulti3(){
		int solucion=Main.multiplica(15,0);
		assertEquals(0,solucion);
	}

	@Test
	public void testDivi(){
		int solucion=Main.divide(2,2);
		assertEquals(1,solucion,0.001);
	}

	@Test
	public void testDivi2() {
		int solucion = Main.divide(2, -2);
		assertEquals(-1, solucion, 0.001);

	}

	@Test
	public void testDivi3() {
		assertThrows(ArithmeticException.class, ()-> {Main.divide(2,0);});
	}

	@Test
	public void testDivi4(){
		int solucion=Main.divide(0,10);
		assertEquals(0, solucion);
	}

	@Test
	public void testDivi5(){
		int solucion=Main.divide(0,10);
		assertEquals(0, solucion);
	}






}
