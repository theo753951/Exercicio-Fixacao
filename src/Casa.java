public class Casa {
    String cor;
    boolean porta1;
    boolean porta2;
    boolean porta3;
    int total;

void pinta(String s){
    cor=s;
    System.out.println("NOVA COR DA CASA: "+this.cor);
};
void abre_porta1(){
    porta1=true;  
}
void abre_porta2(){
    porta2=true;  
}
void abre_porta3(){
    porta3=true;  
}
void facha_porta1(){
    porta1=false;  
}
void fecha_porta2(){
    porta2=false;  
}
void fecha_porta3(){
    porta3=false;  
}
int quantasPortasEstaoAbertas(){
    if(porta1==true){
        int p1 = 1;
        total=p1; 
    }
    if(porta2==true){
        int p2 = 1;
        total=total+p2; 
    }
    if(porta3==true){
        int p3 = 1;
        total=total+p3; 
    }
    System.out.println("A QUANTIDADE DE PORTAS ABERTAS É: "+total);
    return total;
};   
    
}
