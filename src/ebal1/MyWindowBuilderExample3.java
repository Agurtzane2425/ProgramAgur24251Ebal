package ebal1;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class MyWindowBuilderExample3 {

    public static void main(String[] args) {
        // JFrame sortu
        JFrame frame = new JFrame("WindowBuilder Example 3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(new FlowLayout());

        // JTable
        String[][] data = {{"1", "John", "25"}, {"2", "Anna", "30"}, {"3", "Mike", "35"}};
        String[] columnNames = {"ID", "Name", "Age"};
        JTable table = new JTable(data, columnNames);
        JScrollPane tableScrollPane = new JScrollPane(table);

        // JTree
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        root.add(child1);
        root.add(child2);
        JTree tree = new JTree(root);
        JScrollPane treeScrollPane = new JScrollPane(tree);

        // JList
        String[] listData = {"Item 1", "Item 2", "Item 3"};
        JList<String> list = new JList<>(listData);
        JScrollPane listScrollPane = new JScrollPane(list);

        // JFileChooser
        JFileChooser fileChooser = new JFileChooser();

        // JColorChooser
        JColorChooser colorChooser = new JColorChooser();

        // JOptionPane
        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        JPanel panel = new JPanel();
        panel.add(radioButton1);
        panel.add(radioButton2);
        JOptionPane.showMessageDialog(frame, panel, "Select an Option", JOptionPane.PLAIN_MESSAGE);

        // Osagaiak gehitu
        frame.add(tableScrollPane);
        frame.add(treeScrollPane);
        frame.add(listScrollPane);
        frame.add(fileChooser);
        frame.add(colorChooser);

        // Bistaratu
        frame.setVisible(true);
    }
}
