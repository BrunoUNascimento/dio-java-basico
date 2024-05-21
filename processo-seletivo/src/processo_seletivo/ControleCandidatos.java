package processo_seletivo;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;
import javax.swing.text.html.HTMLEditorKit;
public class ControleCandidatos {
    public static void main(String[] args) {
        verificarCandidato();
    }
    
    public static void verificarCandidato(){
        String candidatos[] = {"Bruno","Larissa","Camila","Lucas","Emily","Joao","Calos","Eveline","Raquel","Cintia","Maria","Amanda","Emicida","Ryan sp"};
        String candidatosSelecionados[][] = new String[candidatos.length][2];
        int quantidadeSelecionada = 0;
        
        for(int i = 0; i < candidatos.length; i++){
            String analiseCandidato = candidatos[i];
            double analiseSalario = valorPretendido();
            
            
            System.out.println("Nome: " + analiseCandidato + " Salario pretendido: " + analiseSalario);
            if(analiseSalario < 2000){
                System.out.println("Ligue para o candidato");
                candidatosSelecionados [i] [0] = analiseCandidato;
                candidatosSelecionados [i] [1] = Double.toString(analiseSalario);
                quantidadeSelecionada++;
                
            }else if(analiseSalario == 2000 && analiseSalario < 2100){
                System.out.println("Ligue com uma contraproposta");
            }else{
                System.out.println("Desclassificado");
                
            }
            System.out.println("----------------------------------------");
            if(quantidadeSelecionada >= 5){
                break;
            }
        }
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Candidatos selecionados");
        for(int o = 0; o < candidatosSelecionados.length; o++){
            if(candidatosSelecionados[o][0] == null){
                
            }else{
            System.out.println("Nome: " + candidatosSelecionados[o][0]);
            System.out.println("Salario pretendido: " + candidatosSelecionados[o][1]);
            System.out.println("---------------------------------");
            }
        }
        System.out.println("Candidatos: " + quantidadeSelecionada); 
        
        Random random = new Random();
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("-----------------------------------");
        
        
        
        String candidatosContatado[] = new String[quantidadeSelecionada];
        String candidatosNaoContatado[] = new String[quantidadeSelecionada];
        
        for(int i = 0; i < quantidadeSelecionada;i++){
            
            int tentativas = 0;
            boolean contato = false;
            do{
                int atender = random.nextInt(3);
                if(atender == 2){
                    contato = true;
                    candidatosContatado[i] = candidatosSelecionados[i][0];
                    
                }
                tentativas++;
                 if(tentativas == 3 && !contato){
                     candidatosNaoContatado[i] = candidatosSelecionados[i][0] ;
                 }
            }while(tentativas < 3 && !contato);
                 if(candidatosContatado[i] != null){
                    System.out.println("Conseguimos contato com " + candidatosContatado[i] + " apos " + tentativas + " tentativa(s)");
                }else if (candidatosNaoContatado[i] != null){
                    System.out.println("Nao conseguimos cotato com " + candidatosNaoContatado[i]);
                 }
        }
        
        
       
        
    }
    
    
    
    public static double valorPretendido(){
        double valor = Math.random() * (3000 - 1200) + 1200;
         BigDecimal valorFormatado = new BigDecimal(valor).setScale(2, RoundingMode.HALF_UP);
        return valorFormatado.doubleValue();
    }
}
