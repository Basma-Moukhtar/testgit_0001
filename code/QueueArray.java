//new comment in queue array
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author safi
 */
public class QueueArray {
    String[] people    = new String [100];
   int 	 numPeople = 0;

   public void addPerson (String newPerson) {
       people [numPeople] = newPerson;
       numPeople++;
   }

   public String removePerson () {
       if (numPeople == 0)			// If Q is empty return null
       	  return null;
       else {					// Else remove 1st man in Q & shift the rest
       	  String movingPerson = people [numPeople];
          for (int i = 0; i < numPeople; i ++)
          	  people [i] = people [i+1];
          numPeople--;			// Reduce the count of people in Q by 1
          return movingPerson;
       }
   }

   public String toString () {
       String listPeople = "Q: ";
       for (int i = 0; i < numPeople; i++) 		// Add names separated by spaces
       	  listPeople = listPeople + "  " + people [i];
       return listPeople;
   }



}
