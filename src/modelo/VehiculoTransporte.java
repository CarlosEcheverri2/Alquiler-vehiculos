/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Carlos
 */
public class VehiculoTransporte extends Vehiculo{
   
    public VehiculoTransporte(String matricula, String modelo, String tipo) {
        super(matricula,modelo,tipo);
    }
    
        @Override
    public double calcularCosto(int dias) {
        int costoBase = 50;
        double costoAdicional = 1.5;
        double result = 0;
        
        if(getTipo() == "coche"){
            result = ((dias*costoBase)+(dias*costoAdicional));
        }
        else{
            result = ((dias*costoBase)+(dias*costoAdicional)+2);
        }
        return result;           
    }
    
}
