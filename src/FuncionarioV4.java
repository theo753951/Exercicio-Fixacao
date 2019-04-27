public class FuncionarioV4 {
    String nome;
    String departamento;
    double salario;
    Data data;
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
    System.out.println("DATA: "+this.data.dia+"/"+data.mes+"/"+data.ano);
    System.out.println("RG: "+this.RG);
    System.out.println("ATIVO: "+this.ativo);
};    
void equals(FuncionarioV4 Funcionario){
    if((this.nome==Funcionario.nome)&&
       (this.departamento==Funcionario.departamento)&&
       (this.salario==Funcionario.salario)&&
       (this.data.dia+this.data.mes+this.data.ano==Funcionario.data.dia+Funcionario.data.mes+
        Funcionario.data.ano)&&
       (this.RG==Funcionario.RG)&&
       (this.ativo==Funcionario.ativo))
        System.out.println("São iguais");
    else
        System.out.println("Nao são iguais");

};    
    
}
