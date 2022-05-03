/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucioneseducativas;

/**
 *
 * @author Matias Quezada
 */
public class InstitucionesEducativas {

    //public static void main(String[] args) {
        private String nombre;
        private String institucion;
        private int numero_Docentes;
        private int Cantidad_Alumnos;
        private int gastos_Estudiante;
        private int presupuesto;

        public void establecerCantidad_Alumnos (int ca){
        Cantidad_Alumnos = ca ;
            }
        public void establecergastos_Estudiante (int ge){
        gastos_Estudiante = ge ;
            }
        public void calcularpresupuesto (){
        presupuesto = Cantidad_Alumnos * gastos_Estudiante;
            }
        public int obtenerCantidad_Alumnos(){
        return Cantidad_Alumnos ;
            }
        public int obtenergastos_Estudiante(){
        return gastos_Estudiante ;
            }
        public int obtenerpresupuesto(){
        return presupuesto ;
            }      
    }
    

