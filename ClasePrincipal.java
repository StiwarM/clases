
package clases;

public class ClasePrincipal {
    public static void main (String args []){
        
         ProcesoUno hilo1=new ProcesoUno();
         ProcesoDos hilo2=new ProcesoDos();
         ProcesoTres hilo3=new ProcesoTres();
         hilo1.start();
         hilo2.start();
         hilo3.start();
         
    }
    
}
