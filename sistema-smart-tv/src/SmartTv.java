public class SmartTv {
    boolean ligada= false;
    int canal= 1;
    int volume= 25;

    public void mudarCanal(int novoCanal){
    
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;

    }

    public void diminuirVolume(){
        //volume = volume + 1;
        volume--;
        System.out.print("Diminuindo o volume para: " +volume);

    }
    

    public void ligar(){
        ligada=true;
        
    }
}

