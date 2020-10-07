package cse360assignment02;

/**
 * The AddingMachine class acts as a calculator which when called upon can add, subtract, and print all of the operations
 * done to the total integer variable.
 */
public class AddingMachine {

    /**
     * A blank main method to avoid compilation error. The actual program is utilized with a drivers program.
     */
    public static void main(String[] args)
    {

    }

    // total will be used as a number to perform operations.
    private int total;

    // The string variable operations will contain all of the operations done to the total variable. Will be used by the toString method.
    private String operations = "0 ";

    /**
     * This is an AddingMachine method used for creating new AddingMachine objects in a driver's program.
     */
    public AddingMachine () {
        total = 0;  // not needed - included for clarity
    }

    /**
     * This method will return the value of total.
     * @return the value of total
     */
    public int getTotal () {
        return total;
    }

    /**
     * An inputted number will be added onto the total variable.
     * @param value the value being added to total
     */
    public void add (int value) {
        total += value;
        operations += ("+ " + value + " ");
    }

    /**
     * An inputted number will be subtracted from the value of total.
     * @param value the value being subtracted from total
     */
    public void subtract (int value) {
        total -= value;
        operations += ("- " + value + " ");
    }

    /**
     * A basic toString method which will print all of the operations done to the total integer.
     * @return the string operations which contains the operations done to total
     */
    public String toString () {
        return operations;
    }

    /**
     * Clears all of the operations and the values are reset.
     */
    public void clear() {
        total = 0;
        System.out.println("Total has been reset to 0.");
        operations = "0 ";
    }
}