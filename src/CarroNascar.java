public class CarroNascar extends Carro{

    private static final int TIEMPO = 2;

    public CarroNascar() {
        super();
    }

    public CarroNascar(double peso, double tamano){
        super(peso, tamano);
    }

    public CarroNascar(double precioBase){
        super(precioBase);
    }
    
    public double calcularPrecio(){

        double precioFinal;
        precioFinal = getPrecioBase() + (getPeso() * getTamano() * TIEMPO);
        
        return precioFinal;
    }     
}