package ebal1;

import javax.swing.*;
import java.awt.*;

public class MyWindowBuilderExample {

    public static void main(String[] args) {
        // JFrame sortu
        JFrame frame = new JFrame("WindowBuilder Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());

        // JLabel
        JLabel label = new JLabel("Testu Etiketa");

        // JButton
        JButton button = new JButton("Sakatu");

        // JCheckBox
        JCheckBox checkBox = new JCheckBox("Aukera 1");

        // JRadioButton
        JRadioButton radioButton = new JRadioButton("Aukera 2");

        // JToggleButton
        JToggleButton toggleButton = new JToggleButton("Egoera Bikoitza");

        // JComboBox
        String[] items = {"Aukera A", "Aukera B", "Aukera C"};
        JComboBox<String> comboBox = new JComboBox<>(items);

        // JScrollBar
        JScrollBar scrollBar = new JScrollBar();

        // JSeparator
        JSeparator separator = new JSeparator();

        // JSlider
        JSlider slider = new JSlider(0, 100);

        // JSpinner
        JSpinner spinner = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));

        // JProgressBar
        JProgressBar progressBar = new JProgressBar();
        JTextField cajaDeTexto = new JTextField();
        cajaDeTexto.setText("Agurtzane");
        cajaDeTexto.setBounds(90, 60, 90, 23);

        // Osagaiak gehitu
        frame.add(label);
        frame.add(button);
        frame.add(checkBox);
        frame.add(radioButton);
        frame.add(toggleButton);
        frame.add(comboBox);
        frame.add(scrollBar);
        frame.add(separator);
        frame.add(slider);
        frame.add(spinner);
        frame.add(progressBar);
        frame.add(cajaDeTexto);

        // Bistaratu
        frame.setVisible(true);
    }
}
