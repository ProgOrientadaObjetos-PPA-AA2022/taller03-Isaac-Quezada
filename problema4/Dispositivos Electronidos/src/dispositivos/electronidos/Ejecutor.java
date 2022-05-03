/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispositivos.electronidos;

/**
 *
 * @author Matias Quezada
 */
public class Ejecutor {
    public static void main(String[] args){
        DispositivosElectronidos de = new DispositivosElectronidos();
        double Costo_Inicial = 1000 ;
        double iva_porcentaje = 1.12 ;
        
        
        de.establecerCosto_Inicial(Costo_Inicial);
        de.estableceriva_porcentaje(iva_porcentaje);
        de.calculariva_aux();
        de.calcularCosto_Final();
        
        System.out.printf("Costo Inicial: %s\niva_porcentaje: %s\nCosto final: %s\n",de.obtenerCosto_Inicial(),de.obteneriva_porcentaje(),de.obtenerCosto_Final());
    }
}
