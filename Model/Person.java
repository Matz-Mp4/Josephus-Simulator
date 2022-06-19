package Model;

public class Person {

  private boolean alive;
  private Object jpn;
   
  public Person(Object panel){
    this.alive = true;
    this.jpn = panel;
  }

/** Setter
*/
  public void setAlive(boolean alive){
    this.alive  = alive;
  }

  public void setObject(Object jpn){
    this.jpn = jpn;
  }

/** Getter
 */
  public boolean getAlive(){
    return this.alive;
  }

  public Object getObject(){
    return this.jpn;
  }

  
}
