
/**
 * Escreva a descrição da classe FabricaDeCarroSingleton aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class FabricaDeCarroSingleton{
   
    
    protected int totalCarrosFiat;
    protected int totalCarrosFord;
    protected int totalCarrosVolks;
    
    
    
    public static FabricaDeCarroSingleton instancia;
 
    private FabricaDeCarroSingleton() {
        
        
    }
 
     public String criarCarroVolks() {
        return new String("Carro Volks #" + totalCarrosVolks++ + " criado.");
    }
 
    public String criarCarroFord() {
        return new String("Carro Ford #" + totalCarrosFord++ + " criado.");
    }
 
    public String criarCarroFiat() {
        return new String("Carro Fiat #" + totalCarrosFiat++ + " criado.");
    }
 
    public String gerarRelatorio() {
        return new String("Total de carros Fiat vendidos: " + totalCarrosFiat
                + "\nTotal de carros Ford vendidos: " + totalCarrosFord
                + "\nTotal de carros Volks vendidos: " + totalCarrosVolks);
    }
 
    
    
    public static FabricaDeCarroSingleton getInstancia() {
        if (instancia == null)
            instancia = new FabricaDeCarroSingleton();
        return instancia;
    }
}

