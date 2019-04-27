public class TestaPorta {
    public static void main(String[] args){
        Porta p1=new Porta();
        p1.aberta=true;
        p1.cor="Marrom";
        p1.dimensaoX=0.90;
        p1.dimensaoY=2.05;
        p1.dimensaoZ=2.15;
        
        p1.abre();
        p1.fecha();
        p1.abre();
        p1.fecha();
        p1.pinta("Preta");
        p1.pinta("Branca");
        p1.pinta("Amarela");
        p1.estaAberta();
        
    };
    
}
