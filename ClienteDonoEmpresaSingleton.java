
/**
 * Escreva a descrição da classe ClienteSingleton aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class ClienteDonoEmpresaSingleton{
   public static void main(String[] args) {
    FabricaDeCarroSingleton fabrica = FabricaDeCarroSingleton.getInstancia();
    System.out.println(fabrica.criarCarroFiat());
    System.out.println(fabrica.criarCarroFord());
    System.out.println(fabrica.criarCarroVolks());
    System.out.println(fabrica.gerarRelatorio());
    
    //Dono da empresa da Volkswagen quer saber quantos carros da empresa foram fabricados
    System.out.println("\nRELATORIO DE QUANTOS CARROS VOLKSWAGEN FORAM CRIADOS");
    FabricaDeCarroSingleton  fabrica2 = FabricaDeCarroSingleton.getInstancia();
    
    System.out.println(fabrica2.criarCarroVolks());
    System.out.println(fabrica2.criarCarroVolks());
    System.out.println(fabrica2.criarCarroVolks());
   
    System.out.println(fabrica2.gerarRelatorio());
    
    FabricaDeCarroSingleton cliente3 = new FabricaDeCarroSingleton();
    System.out.println(cliente3.gerarRelatorio());
    
    
}
}
