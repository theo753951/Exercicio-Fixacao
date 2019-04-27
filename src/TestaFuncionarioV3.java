public class TestaFuncionarioV3 {
    public static void main(String [] args){

    FuncionarioV3 f2 = new FuncionarioV3 ();
        f2.nome="Allan";
        f2.salario= 1200;
        f2.departamento="Banco de Dados";
        f2.RG="163598745";
        f2.ativo=true;
        
    Data d1=new Data();
        d1.dia=20;
        d1.mes=10;
        d1.ano=2005;
        
f2.data=d1;
f2.bonifica(15);
f2.demite();
f2.mostrar();
};
}