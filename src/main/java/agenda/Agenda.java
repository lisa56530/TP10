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


/**
* Trouver les événements de l'agenda en fonction de leur titre
     * @param title le titre à rechercher
     * @return les événements qui ont le même titre
     */
    public List<Event> findByTitle(String title) {
        ArrayList <Event> tagada = new ArrayList<Event> () ; 
        for (Event event : e)   {
            if (event.getTitle() == title ) {
                tagada.add(event) ; 
            }
        }
        return tagada ; 
    }

 /**
     * Déterminer s’il y a de la place dans l'agenda pour un événement
     * @param e L'événement à tester (on se limitera aux événements simples)
     * @return vrai s’il y a de la place dans l'agenda pour cet événement
     */
    public boolean isFreeFor() {
        if (taille>e.size()){
            return true; 
        }
         else return false ; 
    }
        


}





}

