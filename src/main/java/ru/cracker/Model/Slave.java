package ru.cracker.Model;

/**
 *
 */
public class Slave {

    /**
     * Human height or stature is the distance from the bottom of the feet to the top of the head in a human body, standing erect.
     */
    private Double height;
    /**
     * The term human body weight is used colloquially and in the biological and medical sciences to refer to a person's mass or weight.
     */
    private Double weight;
    /**
     * The mesuare to calculate human ageing.
     * Where the Ageing or aging (see spelling differences) is the process of becoming older.
     */
    private int age;
    /**
     * An identifier is a name that identifies (that is, labels the identity of) either a unique slave.
     */
    private int id;
    /**
     * Gender is the range of characteristics pertaining to, and differentiating between, masculinity and femininity. if isMale is true true  slave is a male, or else she's a female.
     */
    private boolean isMale;
    /**
     * Productivity describes various measures of the efficiency of production. A productivity measure is expressed as the ratio of output to inputs used in a production process.
     */
    private Double productivity;

    /**
     * Default constructor
     */
    public Slave() {
    }

    /**
     * Initial constructor for Slave.
     *
     * @param height       height of a new slave
     * @param weight       weight of a new slave
     * @param age          age of a new slave
     * @param isMale       Gender of a new slave. If true - his a male.
     * @param id           How effective he can work in percentage
     * @param productivity
     * @return void
     */
    public void Slave(Double height, Double weight, int age, boolean isMale, int id, Double productivity) {
        // TODO implement here
    }

    /**
     * Constructor of a new Slave with autoclaculate productivity.
     *
     * @param height height of a new slave
     * @param weight weight of a new slave
     * @param age    age of a new slave
     * @param isMale Gender of a new slave. If true - his a male.
     * @param id
     * @return void
     */
    public void Slave(Double height, Double weight, int age, boolean isMale, int id) {
        // TODO implement here
    }

    /**
     * @return slave's height
     */
    public Double getHeight() {
        // TODO implement here
        return null;
    }

    /**
     * @return slave's weight
     */
    public Double getWeight() {
        // TODO implement here
        return null;
    }

    /**
     * @param value slave's weight
     */
    public void setWeight(Double value) {
        // TODO implement here
    }

    /**
     * @return slave's age
     */
    public int getAge() {
        // TODO implement here
        return 0;
    }

    /**
     * @return slave's id
     */
    public int getId() {
        // TODO implement here
        return 0;
    }

    /**
     * @return slave's masculinity
     */
    public boolean getIsMale() {
        // TODO implement here
        return false;
    }

    /**
     * @return slave's productivity
     */
    public Double getProductivity() {
        // TODO implement here
        return null;
    }

    /**
     * @param value slave's productivity
     */
    public void setProductivity(Double value) {
        // TODO implement here
    }

    /**
     * Calculates productivity with
     *
     * @return slave's productivity
     */
    private void calculateProductivity() {
        // TODO implement here
    }

}