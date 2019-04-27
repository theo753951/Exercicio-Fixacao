public class TestaCasa {
    public static void main(String [] args){
        Casa c1=new Casa();
        c1.cor="Branca";
        c1.porta1=false;
        c1.porta2=false;
        c1.porta3=false;
        
c1.pinta("Amarela");        
c1.abre_porta1();
c1.abre_porta3();
c1.abre_porta2();
c1.facha_porta1();
c1.fecha_porta2();
c1.fecha_porta3();
c1.quantasPortasEstaoAbertas();
}
}