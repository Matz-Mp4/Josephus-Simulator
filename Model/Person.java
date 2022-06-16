package Model;

public class Person {

  private boolean alive;
   
  public Person(){
    this.alive = true;
  }

/** Getter
*/
  public void setAlive(boolean alive){
    this.alive  = alive;
  }

/** Setter
 */
  public boolean getAlive(){
    return this.alive;
  }

  
}
