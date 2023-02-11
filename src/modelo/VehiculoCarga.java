/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

public class VehiculoCarga extends Vehiculo{
    
    private int pma ;
    
    
    public VehiculoCarga(String matricula, String modelo, String tipo,int pma) {
        super(matricula,modelo,tipo);
        this.pma = pma;
    } 

    public int getPma() {
        return pma;
    }

    public void setPma(int pma) {
        this.pma = pma;
    }
    
        @Override
    public double calcularCosto(int dias) {
         int costoBase = 50;
        int costoAdicional = 20;
        double result = 0;
        
        if(getTipo() == "furgoneta"){
            result = ((dias*costoBase)+(pma*costoAdicional));
        }
        else{
            result = ((dias*costoBase)+(pma*costoAdicional)+40);
        }
            
        return result;          
    }
    
    
}
