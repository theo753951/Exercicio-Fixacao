public class FuncionarioV2 {
    String nome;
    String departamento;
    double salario;
    String data;
    String RG;
    boolean ativo;
    
void bonifica(double aumenta){
        
        salario+=(salario*aumenta)/100;
};
   void demite(){
       
       ativo=false;
};      
void mostrar(){
    System.out.println("NOME: "+this.nome);
    System.out.println("DEPARTAMENTO: "+this.departamento);
    System.out.println("SALARIO: R$ "+this.salario);
    System.out.println("DATA: "+this.data);
    System.out.println("RG: "+this.RG);
    System.out.println("ATIVO: "+this.ativo);
};     
}
