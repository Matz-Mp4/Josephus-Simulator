package Gui.Events;

public class StatesButton{
    private boolean statePlaying;
    private int amountCircles;

    public void setPlayingStatus(boolean status){
      this.statePlaying = status;
    }
    
    public void setAmountCircles(int amount){
      this.amountCircles = amount;
    }

    public int getAmountCircles(){
      return this.amountCircles;
    }

    public boolean isPlaying(){
      return statePlaying;
    }
}
