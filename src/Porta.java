public class Porta {
    boolean aberta;
    String cor;
    double dimensaoY;
    double dimensaoX;
    double dimensaoZ;

void abre(){
        aberta=true;
};
void fecha(){
        aberta=false; 
};
void pinta(String s){
    cor=s;
    System.out.println("NOVA COR: "+this.cor);  // SE DEIXAR AQUI TODA VEZ QUE MUDAR A COR VAI FICAR IMPRIMINDO
};
boolean estaAberta(){
    if(aberta==true)
        System.out.println("A PORTA ESTÁ ABERTA");
    else
        System.out.println("A PORTA ESTÁ FECHADA");
    
    return aberta;
};
}
