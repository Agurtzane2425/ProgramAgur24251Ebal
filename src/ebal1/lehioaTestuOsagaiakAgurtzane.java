package ebal1;
import javax.swing.*;
import java.awt.*;

public class lehioaTestuOsagaiakAgurtzane extends JFrame {

    public static void main(String[] args) {
        // JFrame sortu
        JFrame frame = new JFrame("lehioaTestuOsagaiakAgurtzane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(new FlowLayout());

        // JTextField
        JTextField textField = new JTextField(20);

        // JFormattedTextField
        JFormattedTextField formattedTextField = new JFormattedTextField();
        formattedTextField.setColumns(20);

        // JPasswordField
        JPasswordField passwordField = new JPasswordField(20);

        // JTextArea
        JTextArea textArea = new JTextArea(5, 20);

        // JEditorPane
        JEditorPane editorPane = new JEditorPane();
        editorPane.setPreferredSize(new Dimension(200, 100));

        // JTextPane
        JTextPane textPane = new JTextPane();
        textPane.setPreferredSize(new Dimension(200, 100));

        // Osagaiak gehitu
        frame.add(new JLabel("JTextField:"));
        frame.add(textField);
        frame.add(new JLabel("JFormattedTextField:"));
        frame.add(formattedTextField);
        frame.add(new JLabel("JPasswordField:"));
        frame.add(passwordField);
        frame.add(new JLabel("JTextArea:"));
        frame.add(new JScrollPane(textArea));
        frame.add(new JLabel("JEditorPane:"));
        frame.add(new JScrollPane(editorPane));
        frame.add(new JLabel("JTextPane:"));
        frame.add(new JScrollPane(textPane));

        // Bistaratu
        frame.setVisible(true);
    }
}
