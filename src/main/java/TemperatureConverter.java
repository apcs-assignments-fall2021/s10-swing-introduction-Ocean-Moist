import javax.swing.*;
import java.awt.*;

// Using FlowLayout and Label Output

public class TemperatureConverter {

    // Convert between Fahrenheit and Celsius
    // have 2 buttons, one to convert to Celsius and one to convert to Fahrenheit
    public TemperatureConverter() {

        // Create the window
        JFrame frame = new JFrame("Temperature Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Create the labels
        JLabel input = new JLabel("Enter the temperature in Fahrenheit:");
        JLabel  input2 = new JLabel("Enter the temperature in Celsius:");

        // Create the text field for farehneit
        JTextField outputField = new JTextField(10);

        // Create the text field for celsius
        JTextField outputField2 = new JTextField(10);

        // Create the buttons
        JButton convert = new JButton("Convert To C");
        JButton convert2 = new JButton("Convert To F");

            // Add the action listeners
            convert.addActionListener(e -> {
                double temp = Double.parseDouble(outputField.getText());
                double celsius = (temp - 32) * 5 / 9;
                outputField2.setText("" + celsius);
            });
            convert2.addActionListener(e -> {
                double temp = Double.parseDouble(outputField2.getText());
                double fahrenheit = (temp * 9 / 5) + 32;
                outputField.setText("" + fahrenheit);
            });
        // Add the components to the panel
        panel.add(input);
        panel.add(outputField);
        panel.add(convert);
        panel.add(input2);
        panel.add(outputField2);
        panel.add(convert2);


        // Add the panel to the frame
        frame.getContentPane().add(panel);

        // Display the frame
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args){
        // TemperatureConverter tc = new TemperatureConverter();
    }
}
