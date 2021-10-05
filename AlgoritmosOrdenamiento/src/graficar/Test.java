package graficar;

import java.util.ArrayList;
import algoritmos.BurbujaTradicional;
import algoritmos.BurbujaOptimizado;
import algoritmos.InsertSort;
import inter.Interface;

public class Test {
    
    public static void main(String[] args) throws InterruptedException {

        // generar un numero definido de carreras 
        int numCarreras = 750;
        ArrayList<Double[]> tiempos = new ArrayList<>();
        tiempos.add(new Double[numCarreras]);
        tiempos.add(new Double[numCarreras]);
        
        for (int x= 0; x < numCarreras; x++){
            
            ArrayList<Interface> algoritmos = new ArrayList<>();

            //Aqui se agrega los metodos de orenamiento al arrayList de algoritmo
            //algoritmos.add(new BurbujaTradicional());
            algoritmos.add(new BurbujaOptimizado());
            algoritmos.add(new InsertSort());
        
            Casos carreraActual = new Casos(9*x);
            // agregamos los algoritmos 
            for (Interface a: algoritmos){
                carreraActual.agregaAlgoritmo(a);
            }
            
            //en este metodo de ejecutarPrueba se generan los datos con los tres arreglos
            //carreraActual.ejecutaPruebaAleatorio();
            //carreraActual.ejecutaPruebaAscendente();
            carreraActual.ejecutaPruebaDescendente();
            
            // agregamos los tiempos
            for (int y = 0; y < algoritmos.size();y++ ){
                tiempos.get(y)[x]= algoritmos.get(y).getTiempo_e();
            }
        }
        
        // la grafica, con los datos que presentara
        Grafica g1 = new Grafica("Grafica", "Tiempo en ms", "Longitud del arreglo");

        //se agregan las series con los algoritmos que se van a trabajar
        //g1.agregarSerie(ElementosAleatorios.convertirArreglo(tiempos.get(0)), BurbujaTradicional.class.getSimpleName());
        g1.agregarSerie(ElementosAleatorios.convertirArreglo(tiempos.get(0)), BurbujaOptimizado.class.getSimpleName());
        g1.agregarSerie(ElementosAleatorios.convertirArreglo(tiempos.get(1)), InsertSort.class.getSimpleName());
        
        //se crea y se muestra la grafica
        g1.creaYmuestraGrafica();
            
    }
}
