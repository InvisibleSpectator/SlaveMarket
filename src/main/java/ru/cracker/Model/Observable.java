package ru.cracker.Model;

import java.util.Observer;

/**
 *
 */
public interface Observable {

    /**
     * Add observer in collection or db
     *
     * @param observer
     * @return
     */
    public void addObserver(Observer observer);

    /**
     * Triggers all available observers to do something
     *
     * @return
     */
    public void notifyAllObservers();

}