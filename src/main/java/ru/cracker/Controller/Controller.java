package ru.cracker.Controller;

import ru.cracker.Model.Slave;

import java.util.List;

/**
 *
 */
public interface Controller {

    /**
     * Add slave in model
     *
     * @param slave Slave to add
     * @return
     */
    public void addSlave(Slave slave);

    /**
     * Add slave in model
     *
     * @param height slaves' height
     * @param weight slaves' weight
     * @param age    slaves' age
     * @param isMale slaves' masculinity
     * @return
     */
    public void addSlave(Double height, Double weight, int age, boolean isMale);

    /**
     * tells to model for remove the slave
     *
     * @param slave slave to remove
     * @return
     */
    public void removeSlave(Slave slave);

    /**
     * tells to model for remove the slave by id
     *
     * @param id slaves's id to remove the slave by it.
     * @return
     */
    public void removeSlave(int id);

    /**
     * tells to model for search  the slave by the query
     *
     * @param querry querry for search
     * @return list of founded slaves
     */
    public List<Slave> searchSlave(String querry);

}