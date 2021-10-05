package algoritmos;

import java.util.Scanner;

public class Fibonacci {
    static double tI,tT,tF;
   public Fibonacci(){
        tI = 0;
        tT = 0;
        tF = 0;
    }   
static int fib(int n){
    //caso base
   tI = System.nanoTime();
   if(n==0)return 0;
   else if(n==1) return 1;
   //definición recursiva
   tF = System.nanoTime();
   tT = (tF - tI)/1000;
   return fib(n-1)+fib(n-2);
}
static int fibR(int n){
    tI = System.nanoTime();
	if(n==0)return 0;
	else if(n==1) return 1;
	int siguiente = 1, actual = 0, temporal = 0;
	for(int x = 1; x <= n; x++) {
        temporal = actual;
        actual = siguiente;
        siguiente = siguiente + temporal;
    }
    tF = System.nanoTime();
    tT = (tF - tI)/1000;
    return actual;
}
static double getTiempoT() {
        return tT;
}
    public static void main(String[] args) {
    int n,m;
    System.out.println("Ingrese el numero: ");
    Scanner scan = new Scanner(System.in);
    n = Integer.parseInt(scan.next());
    System.out.println("Ingrese la opcion:");
    System.out.println("1.- Fibonacci Recursivo");
    System.out.println("2.- Fibonacci Iterativo");
    System.out.println("3.- Salir");
    m = Integer.parseInt(scan.next());
    switch(m){
	case 1:
		System.out.println("f_" + n + " es " + fib(n));
                System.out.println("Tiempo total:  "+getTiempoT());
		break;
	case 2:
		System.out.println("f_" + n + " es " + fibR(n));
                System.out.println("Tiempo total:  "+getTiempoT());
		break;
	case 3:
		System.out.println("Hasta luego");
		System.exit(0);
	default:
	System.out.println("Ingrese un numero valido: 1, 2 o 3");
    }
    }
    
}
