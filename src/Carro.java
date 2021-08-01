
public class Carro {
    private static final double PESO = 10.0;
    private static final double TAMANO = 4.5;
    private static final double PRECIO_BASE = 1000.0;

    private double peso;
    private double tamano;
    private double precioBase;       

    public Carro(double precioBase) {
        peso = PESO;
        tamano = TAMANO;        
        this.precioBase = precioBase;
    }

    public Carro(double peso, double tamano) {
        this.peso = peso;
        this.tamano = tamano;
        precioBase = PRECIO_BASE;
    }

    public Carro() {
        peso = PESO;
        tamano = TAMANO;
        precioBase = PRECIO_BASE;        
    }    

    public double getPeso() {
        return peso;
    }

    public double getTamano() {
        return tamano;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double calcularPrecio(){        
        return getPeso() * getTamano();
    }
}
