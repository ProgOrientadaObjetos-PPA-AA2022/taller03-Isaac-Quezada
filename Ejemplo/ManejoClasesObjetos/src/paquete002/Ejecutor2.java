/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete002;

import paqueteuno.FacturaTelefono;

/**
 *
 * @author Matias Quezada
 */
public class Ejecutor2 {
    public static void main(String[] args){
        FacturaTelefono telefono = new FacturaTelefono();
        
        telefono.calcularValorFactura();
        telefono.establecerNumeroTelefono("0987022435");
        telefono.establecerMinutosMes(200);
        telefono.establecerValorMinuto(0.20);
        
        System.out.printf("Factura de Teléfono\n\nNúmero de teléfono: %s\n\t"
        + "Minutos mensuales: %.2f\nValor por minuto: %.2f\n\t"
        + "Valor a cancelar: %.2f\n", telefono.obtenerNumeroTelefono(),
        telefono.obtenerMinutosMes(), telefono.obtenerValorMinuto(),
        telefono.obtenerValorFactura());        
    }
}
