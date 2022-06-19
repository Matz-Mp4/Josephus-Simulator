package Application.Events;

public class StatesButton{
    private boolean statePlaying = false;
    private int amountCircles;


    public StatesButton(){
    }

    public void setPlayingStatus(boolean status){
      this.statePlaying = status;
    }
    
    public void setAmountCircles(int amount){
      this.amountCircles = amount;
    }

    public boolean getPlayingStatus(){
        return this.statePlaying;
    }

    public boolean isPlaying(){
      return statePlaying;
    }


}