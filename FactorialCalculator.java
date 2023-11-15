import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.text.JTextComponent;

public class FactorialCalculator extends JFrame 
{

    private JButton calculateButton;
    private JLabel resultLabel;
    private JTextField inputField;
    private JTextComponent resultComponent;

    FactorialCalculator() 
    {

        super("Factorial Calculator");
        this.setSize(300, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        inputField = new JTextField(10);
        calculateButton = new JButton("calculate factorial");
        resultLabel = new JLabel("Result: ");
        resultComponent = new JTextField(15);
        
        
        this.add(new JLabel("Enter a number: "));
        this.add(inputField);
        this.add(calculateButton);
        this.add(resultLabel);
        this.add(resultComponent);
        
        calculateButton.addActionListener((ActionListener) new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {

                calculateFactorial();
            }
        });
        

    }
        private void calculateFactorial() 
     {
        try 
        {
            int number = Integer.parseInt(inputField.getText());
            long factorial =calculatorFactorialRecursive(number);
            resultComponent.setText("Result: " + factorial);

        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input. Please enter the valid Integer");
        }
    }

      private long calculatorFactorialRecursive(int n) 
     {
     if (n == 0 || n == 1) 
     {
        return 1;

        
    } 
     else 
    {
        return n * calculatorFactorialRecursive(n - 1);
    }
}

    public static void main(String[] args) {
       SwingUtilities.invokeLater(new Runnable(){

        public void run() 
        {
            new FactorialCalculator().setVisible(true);
        }
    });
 }


}

