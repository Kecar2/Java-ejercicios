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
		p10i();
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
	public static void p10a() {
		int a;
		int b;
		a = 10;
		b = 15;
		a = b+3+5*b;
		b = a-b*2;
		a = a+b;
		System.out.println(a);
		System.out.println(b);
	}
	public static void p10b() {
		int a;
		int b;
		a = 10;
		b = 11;
		a = b/4%3;
		b = 2+a*3/2+1;
		System.out.println(a);
		System.out.println(b);
		
	}
	public static void p10c() {
		int a;
		int b;
		int c;
		a = 5;
		b = 6;
		a = 2+b-a*2/4;
		b = a+2*b+1;
		c = a%b + b%a + a/b + b/a;
		System.out.println(c);
	}
	public static void p10d() {
		double a;
		double b;
		a = 30.0;
		b = 10.5;
		a = a + 10.0/3 + (b-1/2.0);
		b  = -b;
		System.out.println(a);
		System.out.println(b);
	}
	public static void p10f() {
		int e,f;
		e = -1 + 2*3/4%5;
		f = -(1 + (2*(3/(4%5))));
		System.out.println("Resultado: " +e);
		System.out.println("Resultado: " +f);
	}
	
	public static void p10g() {
		boolean m, n;
		m = true && false || true && !false;
		n = m && true && (false || true) && !(true || false);
		m = !n || !m && (m && !n);
		n = true || m && !(false && n);
		System.out.println("Resultado: " +m);
		System.out.println("Resultado: " +n);
	}
	
	public static void p10i() {
	        boolean m, n; int a, b;
	        a = 12 + 7/3;
	        b = 13 -7 % 3;
	        m = a-b < b-a;
	        n = a+2 > b-2;
	        m = a+b != 25+4%3;
	        n = (a<4 || b<19) && !m;
	        System.out.println(m);
	        System.out.println(n);
	}
	
	public static void p10j() {
        char c = 'a';
        int a = 12;
        boolean res;
        res = c != 'c' && 'b' >= c; //res = 'a'!='c'  &&  'b'>='a'
        													//false				true      =  false
        res = res == !true || a%5 >= a%4;
        //res=false==false|| 2>0         = true
        System.out.println(res);
	}
	
    public static void p10k() {
        char car1, car2, car3;
        boolean bu;
        car1 = 'b';
        car2 = '3';
        car3 = 'F';
        bu = (car1 > car2) && (car3 != car1);
        // bu = 'bu'>'3' && 'F' !='b' = true
        bu = bu && !(car3 <= car2);// bu = true && true
        System.out.println(bu);
    }
	
	public static void p11() {}
	public static void p12() {}
	public static void p13() {}
	public static void p14() {}
}
