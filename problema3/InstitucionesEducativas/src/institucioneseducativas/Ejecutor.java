
package institucioneseducativas;

public class Ejecutor {
    public static void main(String[] args) {
        
        InstitucionesEducativas ie = new InstitucionesEducativas();
        int Cantidad_Alumnos = 2000;
        int gastos_Estudiante = 120;
        
        ie.establecerCantidad_Alumnos(Cantidad_Alumnos);
        ie.establecergastos_Estudiante(gastos_Estudiante);
        ie.calcularpresupuesto();
        
        System.out.printf("Cantidad de alumnos: %s\nGastos de estudiantes: %s\nPresupuesto: %s\n",ie.obtenerCantidad_Alumnos(),ie.obtenergastos_Estudiante(),ie.obtenerpresupuesto());
    }
}
