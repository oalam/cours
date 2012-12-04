package dp.observer;

import java.util.*;

/**
 * This class knows its observers and provides an interface for attaching and
 * detaching Observer objects.
 *
 * @version 1.0 @created 26-juin-2012 16:14:00
 */
public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();


    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
         for( Observer o : observers )
             o.update();
    }
}