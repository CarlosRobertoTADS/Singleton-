
public class DonoDaEmpresa{
   public static void main(String[] args) {
    FabricaDeCarro fabrica = new FabricaDeCarro();
    System.out.println(fabrica.criarCarroFiat());
    System.out.println(fabrica.criarCarroFord());
    System.out.println(fabrica.criarCarroVolks());
    System.out.println(fabrica.criarCarroVolks());
    System.out.println(fabrica.criarCarroVolks());
    System.out.println(fabrica.criarCarroVolks());
 
    System.out.println(fabrica.gerarRelatorio());
    
    //Dono da empresa da Volkswagen quer saber quantos carros da empresa foram fabricados
    System.out.println("\nRELATORIO DE QUANTOS CARROS VOLKSWAGEN FORAM CRIADOS");
    FabricaDeCarro fabrica2 = new FabricaDeCarro();
   
    System.out.println(fabrica2.gerarRelatorio());
    
}
}
