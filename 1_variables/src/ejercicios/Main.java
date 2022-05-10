package ejercicios;

public class Main {

	public static void main(String[] args) {
		//p1();
		//p2();
		//p3();
		//p4();
		//p5();
		//p6();
		//p7();
		//p8();
		//p9();
		//p10();
		//p11();
		//p12();
		//p13();
		//p14();
	}

	public static void p1() {
		Boolean x = true;
		Boolean y = false;
		System.out.println(x || y);
		System.out.println(x && y);
	}
	
	public static void p2() {
		int x = 7;
		System.out.println(x == 25);
	}

	public static void p3() {
		int x = 25;
		int y = 77;
		
		System.out.println(x!=y);
	}
	
	public static void p4() {
		int a=4, b=6, c=7, d=8, e=9, f=8;
		int p = ( a + b - c * ( d / e )) * f;
		System.out.println("Resultado final:  "+ p);
	}
	/*
	public static void p5() {
		float x = 23.5f;
		 int y = x;
		
		//Pérdida de precisión. No hay conversión implícita y el sistema indica perdida de precisión de pasar defloat a entero. 
	}
	*/
	public static void p6() {
		float x = 23.5f;
		int y = (int)x;
		
	}
	public static void p7() {
		int x = 23;
		float y = x;
		
		//No hay ningún problema. Existe conversión implícita de entero a float. 
	}
	public static void p8() {
		int x = 23;
		float y = (float)x;
		
		//No hay ningún problema. Existe conversión implícita de entero a float. 
	}
	public static void p9() {
		
	}
	public static void p10() {}
	public static void p11() {}
	public static void p12() {}
	public static void p13() {}
	public static void p14() {}
}
