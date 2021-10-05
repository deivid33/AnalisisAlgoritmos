/*
fibonacci
0+1
1+1
2+1
2+3
5+3
8 factorial recursivo, fibonacci iterativo(ciclos) vs fivonacci recursivo, sumatoria de dos n entreros recursiva
*/
#include <iostream>

using namespace std;

int fib(int n);
int fibR(int n);

int main(){
    int n,m;
    cout << "Ingrese el numero: ";
    cin >> n;
    cout<<"Ingrese la opcion:"<<endl;
    cout<<"1.- Fibonacci Recursivo"<<endl;
    cout<<"2.- Fibonacci Iterativo"<<endl;
    cout<<"3.- Salir"<<endl;
    cin >> m;
    switch(m){
	case 1:
		cout << "f_" << n << " es " << fib(n) << endl;
		break;
	case 2:
		cout << "f_" << n << " es " << fibR(n) << endl;
		break;
	case 3:
		cout << "Hasta luego" <<endl;
		exit(0);
	default:
	cout<<"Ingrese un numero valido: 1, 2 o 3"<<endl;
    }

   return 0;
}

int fib(int n){
    //caso base
   if(n==0)return 0;
   else if(n==1) return 1;
   //definición recursiva
   return fib(n-1)+fib(n-2);
}
int fibR(int n){
	if(n==0)return 0;
	else if(n==1) return 1;
	int siguiente = 1, actual = 0, temporal = 0;
	for(int x = 1; x <= n; x++) {
        temporal = actual;
        actual = siguiente;
        siguiente = siguiente + temporal;
    }
    return actual;
}
