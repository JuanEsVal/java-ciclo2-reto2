
public class Volqueta extends Carro {
    
    private static final double CAPACIDAD = 8.0;


    public Volqueta(){
        super();        
    }

    public Volqueta(double peso, double tamano){
        super(peso, tamano);
    }

    public Volqueta(double precio_base){
        super(precio_base);
    }

    public double calcularPrecio(){   

        double precioFinal;
        precioFinal = getPrecioBase() + (getPeso() * getTamano() * CAPACIDAD);        

        return precioFinal;
    }   
}