
package equivalentehora;

public class Ejecutor {
    
   public static void main(String[] args) {
       
       EquivalenteHora  h = new EquivalenteHora();
       int hora = 48; 
       
       h.establecerhora(hora);
       h.calcularminutos();
       h.calcularsegundos();
       h.calculardias();
       
       System.out.printf("Horas: %s\nMinutos: %s\nSegundos: %s\nDias: %s\n", h.obtenerhora(),h.obtenerminutos(),h.obtenersegundos(),h.obtenerdias());
   }
   
}
