package agenda;

import java.time.LocalDate;
import java.util.*;

/**
 * Description : An agenda that stores events
 */
    public class Agenda {
    private ArrayList <Event> e ; 

    public Agenda () {
    this.e = new ArrayList <Event> (); 
}
    /**
     * Adds an event to this agenda
     *
     * @param e the event to add
     */
    public void addEvent(Event event) {
        e.add(event) ; 
    }

    /**
     * Computes the events that occur on a given day
     *
     * @param day the day toi test
     * @return a list of events that occur on that day
     */
    public ArrayList <Event>  eventsInDay(LocalDate day) {
        ArrayList <Event> roudoudou = new ArrayList <Event> () ;
        for (Event event : e){
       if(event.isInDay(day)) {
       roudoudou.add(event) ;
       }
        }
        return roudoudou  ; 
    }






}

