package ru.cracker.Controller;

import ru.cracker.Model.Model;
import ru.cracker.Model.Slave;
import ru.cracker.View.View;

import java.util.List;

/**
 *
 */
public class SlaveController implements Controller {

    /**
     *
     */
    private Model model;
    /**
     *
     */
    private View view;

    /**
     * Default constructor
     */
    public SlaveController() {
    }

    /**
     * Initial constructor with model
     *
     * @param model model to manage.
     */
    public void SlaveController(Model model) {
        // TODO implement here
    }

    /**
     * Add slave in model
     *
     * @param slave Slave to add
     * @return
     */
    public void addSlave(Slave slave) {
        // TODO implement here
    }

    /**
     * Add slave in model
     *
     * @param height slaves' height
     * @param weight slaves' weight
     * @param age    slaves' age
     * @param isMale slaves' masculinity
     * @return
     */
    public void addSlave(Double height, Double weight, int age, boolean isMale) {
        // TODO implement here
    }

    /**
     * tells to model for remove the slave
     *
     * @param slave slave to remove
     * @return
     */
    public void removeSlave(Slave slave) {
        // TODO implement here
    }

    /**
     * tells to model for remove the slave by id
     *
     * @param id slaves's id to remove the slave by it.
     * @return
     */
    public void removeSlave(int id) {
        // TODO implement here
    }

    /**
     * tells to model for search  the slave by the query
     *
     * @param querry querry for search
     * @return list of founded slaves
     */
    public List<Slave> searchSlave(String querry) {
        // TODO implement here
        return null;
    }

}