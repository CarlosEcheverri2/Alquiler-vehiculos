
package modelo;

abstract class Vehiculo {
    
    private String matricula;
    private String modelo;
    private String tipo;

    public Vehiculo(String matricula, String modelo, String tipo) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.tipo = tipo;
    }
    
    abstract double calcularCosto(int dias);

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
