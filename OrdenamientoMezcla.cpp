#include <bits/stdc++.h>

using namespace std;

void mostrar(int *arr,int n);
void ordenar(int *arr, int izq, int der);
void mezclar(int *arr, int izq, int mitad, int der);

int main(){
    int arr[101];
    int n=0,i;

        cout<<"Ingrese el tamaño del arreglo:"<<endl;
        cin>>n;

        cout<<"Ingrese los elementos del arreglo:"<<endl;
        for(i=0; i< n; i++)
           cin>>arr[i];

        ordenar(arr, 0, n-1);

        mostrar(arr,n);

return 0;
}

void mostrar(int arr[],int n){
	cout<<"Arreglo ordenado:"<<endl;
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" "<<endl;
    }
}
void mezclar(int *arr, int izq, int mitad, int der){
        int l = mitad-izq+1, r = der-mitad, i;
        int L[l+1], R[r+1];
        for(i=0; i< l; i++){
            L[i] = arr[izq+i];
        }

        for (i=0; i< r; i++){
            R[i] = arr[mitad+i+1];
        }
        L[l] = 32767;
        R[r] = 32767;
        l = 0;
        r = 0;

        for(i=0; i< der-izq+1; i++){
            if(L[l] < R[r]){
                arr[izq+i] = L[l];
                l ++;
            }
            else{
                arr[izq+i] = R[r];
                r ++;
            }
        }
}
void ordenar(int *arr, int izq, int der){
        if(izq < der){
            int mitad = (izq + der) / 2;
            ordenar(arr, izq, mitad);
            ordenar(arr, mitad+1, der);
            mezclar(arr, izq, mitad, der);
        }
}
