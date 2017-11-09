package ru.cracker.Model;

import java.util.List;

/**
 * Provides interface to manage slaves
 */
public interface Model {


    /**
     * Adding slave in database or something like that
     *
     * @param slave Slave to add
     * @return
     */
    public void addSlave(Slave slave);

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
    public void addSlave(Double height, Double weight, int age, boolean isMale);

    /**
     * removes slave out our collection
     *
     * @param slave
     * @return
     */
    public void removeSlave(Slave slave);

    /**
     * removes slave out our collection using only unique id
     *
     * @param id
     * @return
     */
    public void removeSlave(int id);

    /**
     * Search slave by the string  query
     * like "height>150 productivity>40 weight<90 age=22"
     *
     * @param querry
     * @return list of founed slaves
     */
    public List<Slave> searchSlave(String querry);

}