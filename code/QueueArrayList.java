
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author safi
 */
public class QueueArrayList {
    ArrayList <String> people    = new ArrayList <String> ();
   int 		numPeople = 0;

  /** This method adds a new person to the end of the queue
   *  @param  newPerson is a String with the eperson name to add to Q
   */

   public void addPerson (String newPerson) {
       people.add(newPerson);
   }

  /** This method removes a person from the queue
   *  @return null if Q is empty or a String with the person moved from Q
   */
   public String removePerson () {
       if (people.size() > 0)
       	  return people.remove(0);
       else
       	  return null;
   }

  /** This method lists all people in the Q
   *  @return a String representation of the Q
   */
   public String toString () {
       return people.toArray ().toString();
   }


}
