public class Produto {
    String nome;
    double preço;
    
void diminuir10(){
    this.preço-=(this.preço*10)/100;
    System.out.println(this.nome+" COM DESCONTO DE 10%: R$ "+this.preço);
}    
void aumentar25(){
    this.preço+=((this.preço*25)/100);
    System.out.println(this.nome+" COM AUMENTO DE 25%: R$ "+this.preço);

}
}
