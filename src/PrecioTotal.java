
public class PrecioTotal {

    private double totalPrecios;
    private double totalVolqueta;
    private double totalCarroNascar;
    private Carro carro[];    

    public Carro[] getCarro() {
        return carro;
    }

    public void setCarro(Carro[] carro) {
        this.carro = carro;
    }

    // Constructores
    public PrecioTotal(Carro[] carro) {
        totalPrecios = 0.0;
        totalVolqueta = 0.0;
        totalCarroNascar = 0.0;       
        this.carro = carro;
    }

    public void calcularTotales() { 
    
        for(int i = 0; i<carro.length; i++){
            if(i==0 || i==1 || i==4)
                totalVolqueta += getCarro()[i].calcularPrecio();
            else
                totalCarroNascar += getCarro()[i].calcularPrecio();
        }
        
        totalPrecios = totalVolqueta + totalCarroNascar;
    }

    public void mostrarTotales() {
    
    calcularTotales();
    System.out.println("Total Carro " + totalPrecios);
    System.out.println("Total Volqueta " + totalVolqueta);
    System.out.println("Total Carro Nascar " + totalCarroNascar);
    }
}