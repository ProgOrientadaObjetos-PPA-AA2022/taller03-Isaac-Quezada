/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equivalentehora;

/**
 *
 * @author Matias Quezada
 */
public class EquivalenteHora {

    //public static void main(String[] args) {
        private int hora;
        private int minutos;
        private int segundos;
        private int dias;
        
        public void establecerhora(int h){
        hora = h;
            }
        public void calcularminutos(){
        minutos = hora * 60 ; 
            }
        public void calcularsegundos(){
        segundos = hora * 3600;
            }
        public void calculardias(){
        dias = hora / 24;
            }
        public int obtenerhora(){
        return hora;    
            }
        public int obtenerminutos(){
        return minutos;    
            }
        public int obtenersegundos(){
        return segundos;    
            }
        public int obtenerdias(){
        return dias;    
            }
    }

