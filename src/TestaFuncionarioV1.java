public class TestaFuncionarioV1 {
    public static void main(String [] args){
        FuncionarioV1 f1 = new FuncionarioV1 ();
        f1.nome="Hader";
        f1.salario= 2150;
        f1.departamento="Gsup";
        f1.data="Abril";
        f1.RG="147985963";
        f1.ativo=true;
   
    
    f1.bonifica(10);
    System.out.println("NOVO SALARIO DE HADER: R$ "+f1.salario);
    
    f1.demite();
    };
}
