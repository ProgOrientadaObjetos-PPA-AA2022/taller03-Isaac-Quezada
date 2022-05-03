/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terreno;

/**
 *
 * @author Matias Quezada
 */
public class Terreno {
        //public static void main(String[] args) {
        private double ancho;
        private double largo;
        private double valor_Metro_cuadrado;
        private double area;
        private double costo_terreno;
        
        public void establecerancho(double a){
        ancho = a;
            }
        public void establecerlargo(double l){
        largo = l;
            }
        public void establecervalor_Metro_cuadrado(double mc){
        valor_Metro_cuadrado = mc;
            }
        public void calculararea(){
        area = ancho * largo ;
            }
        public void calcularcosto_terreno(){
        costo_terreno = valor_Metro_cuadrado * area ;
            }
        public double obtenerancho(){
        return ancho;
            }
        public double obtenerlargo(){
        return largo;
            }
        public double obtenervalor_Metro_cuadrado(){
        return valor_Metro_cuadrado;
            }
        public double obtenerarea(){
        return area;
            }
        public double obtenercosto_terreno(){
        return costo_terreno;
            }
    }    

