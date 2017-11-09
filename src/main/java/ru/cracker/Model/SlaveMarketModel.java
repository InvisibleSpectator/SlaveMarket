package ru.cracker.Model;

import java.util.List;
import java.util.Observer;

/**
 *
 */
public class SlaveMarketModel implements Observable, Model {

    /**
     *
     */
    private List<Slave> slaves;
    /**
     *
     */
    private List<Observer> observers;

    /**
     * Default constructor
     */
    public SlaveMarketModel() {
    }

    /**
     * Add observer in collection or db
     *
     * @param observer
     * @return
     */
    public void addObserver(Observer observer) {
        // TODO implement here
    }

    /**
     * Triggers all available observers to do something
     *
     * @return
     */
    public void notifyAllObservers() {
        // TODO implement here
    }

    /**
     * Adding slave in database or something like that
     *
     * @param slave Slave to add
     * @return
     */
    public void addSlave(Slave slave) {
        // TODO implement here
    }

    /**
     * Do the same thing like
     *
     * @param height
     * @param weight
     * @param age
     * @param isMale
     * @return
     * @code{addSlave(Slave slave)}
     */
    public void addSlave(Double height, Double weight, int age, boolean isMale) {
        // TODO implement here
    }

    /**
     * removes slave out our collection
     *
     * @param slave
     * @return
     */
    public void removeSlave(Slave slave) {
        // TODO implement here
    }

    /**
     * removes slave out our collection using only unique id
     *
     * @param id
     * @return
     */
    public void removeSlave(int id) {
        // TODO implement here
    }

    /**
     * Search slave by the string  query
     * like "height>150 productivity>40 weight<90 age=22"
     *
     * @param querry
     * @return list of founed slaves
     */
    public List<Slave> searchSlave(String querry) {
        // TODO implement here
        return null;
    }

}