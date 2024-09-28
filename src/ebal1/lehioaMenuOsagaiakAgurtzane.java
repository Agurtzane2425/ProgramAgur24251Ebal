package ebal1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lehioaMenuOsagaiakAgurtzane {

    public static void main(String[] args) {
        // JFrame sortu
        JFrame frame = new JFrame("lehioaMenuOsagaiakAgurtzane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(new FlowLayout());

        // JMenuBar
        JMenuBar menuBar = new JMenuBar();

        // JMenu
        JMenu menu = new JMenu("Menu");

        // JMenuItem
        JMenuItem menuItem = new JMenuItem("Menu Item");

        // JCheckBoxMenuItem
        JCheckBoxMenuItem checkBoxMenuItem = new JCheckBoxMenuItem("Check Box Menu Item");

        // JRadioButtonMenuItem
        JRadioButtonMenuItem radioButtonMenuItem = new JRadioButtonMenuItem("Radio Button Menu Item");

        // JPopupMenu
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem popupMenuItem = new JMenuItem("Popup Menu Item");
        popupMenu.add(popupMenuItem);

        // Menu osagaiak gehitu
        menu.add(menuItem);
        menu.add(checkBoxMenuItem);
        menu.add(radioButtonMenuItem);
        menuBar.add(menu);

        // JMenuBar gehitu
        frame.setJMenuBar(menuBar);

        // JPopupMenu gehitu
        frame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                if (evt.isPopupTrigger()) {
                    popupMenu.show(evt.getComponent(), evt.getX(), evt.getY());
                }
            }
        });

        // Bistaratu
        frame.setVisible(true);
    }
}