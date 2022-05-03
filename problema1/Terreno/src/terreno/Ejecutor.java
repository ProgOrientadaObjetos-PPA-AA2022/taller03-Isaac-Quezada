
package terreno;

public class Ejecutor {
    
    public static void main(String[] args) {
        
        Terreno t = new Terreno();
        double ancho = 5;
        double largo = 2;
        double valor_Metro_cuadrado = 5;
        
        t.establecerancho(ancho);
        t.establecerlargo(largo);
        t.establecervalor_Metro_cuadrado(valor_Metro_cuadrado);
        t.calculararea();
        t.calcularcosto_terreno();
        
        
        System.out.printf("Ancho: %s\nLargo: %s\n" + 
            "Valor Metro cuadrado: %s\narea: %.2f\n"
            + "Costo del terreno: %.2f\n", t.obtenerancho(),t.obtenerlargo(),
            t.obtenervalor_Metro_cuadrado(),t.obtenerarea(),t.obtenercosto_terreno());
                
    }
}
