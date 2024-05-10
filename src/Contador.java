/**
 * Contador class performs counting operations based on user input.
 */
public class Contador {
    /**
     * Main method to execute the counting program.
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        while (true) {
            try {
                DisplayChoicePanel displayChoice = new DisplayChoicePanel();

                int numberOne = displayChoice.displayChoiceNumberOne();
                int numberTwo = displayChoice.displayChoiceNumberTwo();

                countNumber(numberOne, numberTwo);
                break;
            } catch (CountException e) {
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * Counts the difference between two numbers and prints the result.
     * @param numberOne The first number.
     * @param numberTwo The second number.
     * @throws CountException       If the second parameter is not greater than the first.
     * @throws IllegalArgumentException If invalid input is provided.
     */
    static void countNumber(int numberOne, int numberTwo) throws CountException {
        if (numberOne > numberTwo) {
            throw new CountException("O segundo parâmetro não pode ser menor que o primeiro!");
        }

        for (int i = numberOne; i <= numberTwo; i++) {
            System.out.println(String.format("Imprimindo o número %d", i));
        }
    }

}
