import java.util.Scanner;

/**
 * The DisplayChoicePanel class provides methods for interacting with the user
 * to input parameters.
 */
public class DisplayChoicePanel {

    private Scanner input;

    /**
     * Constructs a new DisplayChoicePanel object with a Scanner object
     * initialized to read from standard input.
     */
    public DisplayChoicePanel() {
        this.input = new Scanner(System.in);
    }

    /**
     * Prompts the user to enter a parameter.
     * @param paramName The name of the parameter being prompted.
     * @return The parameter entered by the user.
     * @throws IllegalArgumentException If the value entered is not provided or not an integer.
     */
    private int promptParameter(String paramName) {
        System.out.println("Digite o " + paramName + ": ");

        if (!this.input.hasNext()) {
            throw new IllegalArgumentException("Valor não fornecido para " + paramName + ".");
        }

        if (!this.input.hasNextInt()) {
            throw new IllegalArgumentException("Valor fornecido para " + paramName + " não é um número.");
        }

        int parameterValue = this.input.nextInt();
        this.input.nextLine(); // Consuming the newline character
        return parameterValue;
    }

    /**
     * Prompts the user to enter the first parameter.
     * @return The first parameter entered by the user.
     */
    public int displayChoiceNumberOne() {
        return promptParameter("primeiro parâmetro");
    }

    /**
     * Prompts the user to enter the second parameter.
     * @return The second parameter entered by the user.
     */
    public int displayChoiceNumberTwo() {
        return promptParameter("segundo parâmetro");
    }
}
