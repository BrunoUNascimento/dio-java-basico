package smartv;
public class Smartv {
    private boolean ligada;
    private int canal;
    private int volume;
    
    
    
    public Smartv(){
        this.ligada = false;
        this.canal = +1;
        this.volume = 0;
        
    }
    
    public void setLigada(boolean ligada){
        this.ligada = ligada;
    }
    public void setCanal(int canal){
        this.canal = canal;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    
    public boolean getLigada(){
        return this.ligada;
    }
    public int getCanal(){
        return this.canal;
    }
    public int getVolume(){
        return this.volume;
    }
    
    public void aumentarVolume(){
        if(this.volume < 20){
          this.volume++;
        }
    }
    public void diminuirVolume(){
        if(this.volume > 1){
          this.volume--;  
        }else{
            System.out.println("Mudo");
        }
        
        
    }
    public void subirCanal(){
        if(this.canal<=10){
            this.canal++;
        }else{
            this.canal = 1;
        }
    }
    public void descerCanal(){
        if(this.canal>=1){
            this.canal--;
        }else{
            setCanal(10);
        }
    }
}
