public class TestaFuncionarioV4 {
    public static void main(String [] args){
        FuncionarioV4 f3=new FuncionarioV4();
        f3.nome ="Matheus";
        f3.salario= 1200;
        f3.departamento="Banco de Dados";
        f3.RG="163598745";
        f3.ativo=true;
        
        FuncionarioV4 f4=new FuncionarioV4();
        f4.nome="Matheus";
        f4.salario= 1200;
        f4.departamento="Banco de Dados";
        f4.RG="163598745";
        f4.ativo=true;
        
        Data d2=new Data();
        d2.ano=2008;
        d2.dia=15;
        d2.mes=03;
        
        Data d3=new Data();
        d3.ano=2008;
        d3.dia=15;
        d3.mes=03;
        
        f3.data=d2;
        f4.data=d3;
        
        f3.equals(f4);
    };
}
