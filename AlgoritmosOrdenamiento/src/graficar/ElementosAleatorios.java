package graficar;

import java.util.Random;

public class ElementosAleatorios {
    
    public static double[] generaArregloAleatorio(int num){
    
        double arreglo[] = new double[num];
        Random ran = new Random();
        
        for (int x=0; x<num;x++){
         arreglo[x] = ran.nextInt(100);
        }
        return arreglo;
    }
    
    public static double[] generaArregloAscendente(int num){
        double arreglo[] = new double[num];
        
        for(int x=0; x<num; x++){
            arreglo[x] = x;
        }
        return arreglo;
    }
    
    public static double[] generaArregloDescendente(int num){
        double arreglo[] = new double[num];
        
        for(int x=num-1; x>=0; x--){
            arreglo[x] = x;
        }
        return arreglo;
    }

    public static double[] convertirArreglo(Double[] arreglo){
      double[] aux = new double[arreglo.length];
      for (int x=0; x < arreglo.length;x++){
          aux[x]=arreglo[x];
      }
          
      return aux;
          
    }
}
