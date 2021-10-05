package graficar;

import algoritmos.BurbujaOptimizado;
import algoritmos.BurbujaTradicional;
import inter.Interface;
import java.util.LinkedList;

public class Casos {
    
    // lista de algoritmos
    private LinkedList<Interface> algoritmos;
    private double[] tiempos;
    private double[] datos;
    private int numAlgoritmos,n;
    

    public Casos(int n) {
      //  this.numAlgoritmos = numAlgoritmos;
        this.tiempos = new double[numAlgoritmos];
        this.datos = new double[n];
        this.algoritmos = new LinkedList<>();
       this.n=n;
    }
    
    public void agregaAlgoritmo (Interface algoritmo){
    
        if (this.algoritmos != null){
          this.algoritmos.add(algoritmo);
        }
    
    }
    
    public void ejecutaPruebaAleatorio() throws InterruptedException{

        // datos creados previamente 
        this.datos = ElementosAleatorios.generaArregloAleatorio(this.n);
        // crar un ciclo para ejecutar los alogoritmos y medir sus tiempos
        for (int x=0; x < this.algoritmos.size();x++){
         // mandar los datos a cada uno de los algoritmos
         double[] aux = this.datos.clone();
         this.algoritmos.get(x).obtenerDatos(aux);
         Thread hiloAux = new Thread((Runnable)this.algoritmos.get(x));
         // ejecutar los alglritmos en hilos independientes 
         hiloAux.start();
         hiloAux.join();
         
        }    
    }
    
    public void ejecutaPruebaAscendente() throws InterruptedException{

        // datos creados previamente 
        this.datos = ElementosAleatorios.generaArregloAscendente(this.n);
        // crar un ciclo para ejecutar los alogoritmos y medir sus tiempos
        for (int x=0; x < this.algoritmos.size();x++){
         // mandar los datos a cada uno de los algoritmos
         double[] aux = this.datos.clone();
         this.algoritmos.get(x).obtenerDatos(aux);
         Thread hiloAux = new Thread((Runnable)this.algoritmos.get(x));
         // ejecutar los alglritmos en hilos independientes 
         hiloAux.start();
         hiloAux.join();
         
        }    
    }
    
    public void ejecutaPruebaDescendente() throws InterruptedException{

        // datos creados previamente 
        this.datos = ElementosAleatorios.generaArregloDescendente(this.n);
        // crar un ciclo para ejecutar los alogoritmos y medir sus tiempos
        for (int x=0; x < this.algoritmos.size();x++){
         // mandar los datos a cada uno de los algoritmos
         double[] aux = this.datos.clone();
         this.algoritmos.get(x).obtenerDatos(aux);
         Thread hiloAux = new Thread((Runnable)this.algoritmos.get(x));
         // ejecutar los alglritmos en hilos independientes 
         hiloAux.start();
         hiloAux.join();
         
        }    
    }
}
