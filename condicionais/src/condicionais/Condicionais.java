package condicionais;
public class Condicionais {
    public static void main(String[] args) {
         int tempo = 0;
         String carro = "vectra";
         String cor = "azul";
         
         while(tempo < 10 ){
             System.out.println(tempo);
             if(tempo == 6){
                 tempo++;
                 break;
                 
             }
             tempo++;
         }
    }
    
}
