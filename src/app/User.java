package app;

/**
 * User
 */
public class User {

    private String name;
    private int creditCard;

    public User(String name, int creditCard) {
        setName(name); setCreditCard(creditCard);
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param creditCard the creditCard to set
     */
    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the creditCard
     */
    public int getCreditCard() {
        return creditCard;
    }

    @Override
    public String toString() {
        return "Nombre: " + name;
    }
}