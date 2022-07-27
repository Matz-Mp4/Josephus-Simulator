package Gui.Panel;

/**Class that works with status of the buttons of menu, like 'START' and 'STOP'. 
 * @author: Luis Felipe A. B. Matos
 * @version: 1.0
 */
public class StatesButton{
    private boolean statePlaying = false;

    /**
     * Sets the status of the simulation. Ie, if it's simulating or not
     * @param status boolean
     */
    public void setPlayingStatus(boolean status){
      this.statePlaying = status;
    }

    /**
     * Gets the status of simulations. Ie, if it's playing or not
     * @return boolean
     */
    public boolean getPlayingStatus(){
        return this.statePlaying;
    }

}