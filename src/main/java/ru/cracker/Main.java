package ru.cracker;

import ru.cracker.Controller.Controller;
import ru.cracker.Controller.SlaveController;
import ru.cracker.Model.Model;
import ru.cracker.Model.SlaveMarketModel;


/**
 *
 */
public class Main {

    public static void main(String[] args) {
        Model model = new SlaveMarketModel();
        Controller controller = new SlaveController(model);
    }

}