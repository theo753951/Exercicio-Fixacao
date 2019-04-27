public class TestaPessoa {
    public static void main(String[] args){
        Pessoa p1=new Pessoa();
        p1.nome="Rodrigo";
        p1.idade=37;
        
        p1.fazAniversario();
        p1.fazAniversario();
        p1.fazAniversario();

        System.out.println("NOME: "+p1.nome);
        System.out.println("NOVA IDADE: "+p1.idade);
};
}