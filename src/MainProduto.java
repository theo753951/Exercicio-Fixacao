public class MainProduto {
    public static void main(String[] args){
        Produto p1=new Produto();
        p1.nome="Arroz";
        p1.preço=11.50;
        
        Produto p2=new Produto();
        p2.nome="Feijão";
        p2.preço=8.70;
        
        p1.diminuir10();
        p1.aumentar25();
        p2.aumentar25();
        p2.diminuir10();
    }
}
