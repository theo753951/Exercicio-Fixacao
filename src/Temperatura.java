public class Temperatura {
    
void converterParaCelsius(double t){
    double c = 5*(t - 32)/9;
    System.out.println(t+"°F EM CELSIUS É: "+c);
}
void converterParaFarenheit(double v){
    double f =((v*9)/5)+32;
    System.out.println(v+"°C EM FARENHEIT É: "+f);
}
    
}
