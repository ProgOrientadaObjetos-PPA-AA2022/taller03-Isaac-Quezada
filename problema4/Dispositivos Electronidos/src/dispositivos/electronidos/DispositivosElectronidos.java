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
public class DispositivosElectronidos {

    //public static void main(String[] args) {
        private double sistema_operativo;
        private double tamaño_pantalla;
        private double iva_porcentaje;
        private double Costo_Inicial;
        private double Costo_Final;
        private double direccion_mac;
        private double informacion_IMEI;
        private double iva_aux;
        
        public void establecerCosto_Inicial (double ci){
        Costo_Inicial = ci ;
            }
        public void estableceriva_porcentaje (double ip){
        iva_porcentaje = ip ;
            }
        public void calculariva_aux (){
        iva_aux = (iva_porcentaje * Costo_Inicial) / 100  ;
            }
        public void calcularCosto_Final (){
        Costo_Final = Costo_Inicial + iva_aux  ;
            }
        public double obtenerCosto_Inicial (){
        return Costo_Inicial ;   
        }
        public double obteneriva_porcentaje (){
        return iva_porcentaje ;   
        }
        public double obteneriva_aux (){
        return iva_aux ;   
        }
        public double obtenerCosto_Final (){
        return Costo_Final ;   
        }
}
