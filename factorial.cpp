#include <iostream>

//casos triviales: 0!=1, 1!=1

//n!=n * (n-1) * (n-2) *,...,0!

using namespace std;

int64_t fact(int n);

int main (){
    int64_t n;
    cout << "Ingresa n: " << endl;
    cin >> n;
    cout << fact(n) << endl;
   return 0;
}

//Implementacion
int64_t fact(int n){
//casos base
if(n==0||n==1) return 1;
//parte recursiva
return n*fact(n-1);
}
