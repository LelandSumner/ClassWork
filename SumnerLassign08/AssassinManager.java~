/*
  Name: Leland Sumner
  Course: CIS 203 - Computer Science II
  Assignment: 8
  Due: 5/10/18
*/
import java.util.*;

public class AssassinManager{
    
    AssassinNode killRing; // list of people in killRing
    AssassinNode graveyard; // list of people killed

    // makes killRing out of list of names
    public  AssassinManager(List<String> names){
	if (names == null)
		throw new IllegalArgumentException();
        for(int i = names.size()-1; i >= 0; i--){
            AssassinNode assassin = new AssassinNode(names.get(i));
            if (killRing != null)
                assassin.next = killRing;
            killRing = assassin;
        }
    }
    
    //goes through killRing and prints who is stalking who
    public void printKillRing(){
        AssassinNode current = killRing;
        while (current.next != null){
            System.out.println("    " + current.name + " is stalking " + current.next.name);
            current = current.next;
        }
        System.out.println("    " + current.name + " is stalking " + killRing.name);
    }
    
    //goes through the graveyard and prints who was killed by who
    public void printGraveyard(){
        AssassinNode current = graveyard;
        while (current != null){
            System.out.println("    " + current.name + " was killed buy " + current.killer);
            current = current.next;
        }
    }
    
    // returns true if the killRing contains the name (not case intensive)
    public boolean killRingContains(String name){
        return contains(killRing, name);
    }
    
    //returns true if the graveyard contains the name (not case intensive)
    public boolean graveyardContains(String name){
        return contains(graveyard, name);
    }
    
    // returns true if there is only one person in the killRing
    public boolean gameOver(){
        return killRing.next == null;
    }
    
    // returns the name of the last person in the killRing if the game is over 
    public String winner(){
        //if game is not over, returns null 
        if(!gameOver())
            return null;
        return killRing.name;
    }
    
    //moves given person from killRing to graveyard and adds the name of the killer to the AssassinNode
    public void kill(String name){
        if (gameOver())
            throw new IllegalStateException();
        if(!killRingContains(name))
            throw new IllegalArgumentException();
        //if victim is first on killRing
        if (killRing.name.toLowerCase().equals(name.toLowerCase())){
            AssassinNode victim = killRing;
            AssassinNode killer = killRing.next;
            //makes killer last person 
            while (killer.next != null)
                killer = killer.next;
            //stores killer's name in victim node
            victim.killer = killer.name;
            //takes victim out of killRing
            killRing = killRing.next;
            // puts victim in graveyard
            victim.next = graveyard;
            graveyard = victim;
        }else{
            
            AssassinNode killer = killRing;
            AssassinNode victim = killRing.next;
            //finds victim and killer
            while (!victim.name.toLowerCase().equals(name.toLowerCase())){
                killer = killer.next;
                victim = victim.next;
            }
            
            //stores killer's name in victim node
            victim.killer = killer.name;
            //takes victim out of killRing
            killer.next = victim.next;
            // puts victim in graveyard
            victim.next = graveyard;
            graveyard = victim;
        }
    }
    // checks nodelist for name (used for killRingContains and graveyardContains)
    private boolean contains(AssassinNode current, String name){
        //goes through list
        while(current != null){
            //if it finds the name ,return true
            if (current.name.toLowerCase().equals(name.toLowerCase()))
                return true;
            current = current.next;
        }
        //if it doesn't find the name returns false
        return false;
    }
}
