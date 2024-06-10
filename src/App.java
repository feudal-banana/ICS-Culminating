import javax.swing.JOptionPane;

public class AverageCalculator {

    public static void main(String[] args) {
        // Calculate the average
        String firstValueStr = JOptionPane.showInputDialog(null, "Enter the first value:");
        double firstValue = Double.parseDouble(firstValueStr);

        String secondValueStr = JOptionPane.showInputDialog(null, "Enter the second value:");
        double secondValue = Double.parseDouble(secondValueStr);

        String thirdValueStr = JOptionPane.showInputDialog(null, "Enter the third value:");
        double thirdValue = Double.parseDouble(thirdValueStr);

        double average = (firstValue + secondValue + thirdValue) / 3;

        // Display the average
        JOptionPane.showMessageDialog(null, "The average of the three numbers is: " + average);
    }
}
