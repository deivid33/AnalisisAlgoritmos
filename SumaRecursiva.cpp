#include <iostream>

using namespace std;

int sumar(int a,int b);

int main(){
	int a,b;
	cout<<"Introduzca el numero 1 a sumar"<<endl;
	cin>>a;
	cout<<"Introduzca el numero 2 a sumar"<<endl;
	cin>>b;
	cout<<"El resultado es: "<<sumar(a,b)<<endl;
return 0;
}

int sumar(int a,int b){
	if(b == 0) return a;
	else return sumar(a+1,b-1);
}
