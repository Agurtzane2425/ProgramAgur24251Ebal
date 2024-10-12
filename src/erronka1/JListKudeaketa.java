package erronka1;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JListKudeaketa extends JFrame {

	private static final long serialVersionUID = 1L;
	//Osagaien oinarrizko panela definituko dogu
	private JPanel panela;
	 // Beharrezko osagaiak definituko ditugu, datuak Jlist-en betetzeko, textField eta DEfaultListModel
    private DefaultListModel<String> listModel;
    private JList<String> jList;
    private JTextField textField;
	/**
	 * Launch the application.
	 */
    /**
	 * JListKudeaketaren konstruktorea sortuko dut.
	 */
	public JListKudeaketa() {
      // Leihoaren propietateak definitzen dira hemen
        setTitle("Kudeaketa lehioa");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

      // JPanel nagusia sortu
        panela = new JPanel();
        panela.setLayout(new BorderLayout());

      // DefaultListModel bat sortuko dugu String erako elementuak dituena eta zerrendako elementuak gehitu
        listModel = new DefaultListModel<String>();
        listModel.addElement("Elementu 1");
        listModel.addElement("Elementu 2");
        listModel.addElement("Elementu 3");

      // JList bat sortu DefaultListModel erabilita
        jList = new JList<String>(listModel);
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

      // JScrollPane gehitu JList-i
        JScrollPane scrollPane = new JScrollPane(jList);
        panela.add(scrollPane, BorderLayout.CENTER);

      // TextField bat sortu (elementuak gehitu/editatzeko)
        textField = new JTextField();
        panela.add(textField, BorderLayout.NORTH);

      // Botoiak sortu (Sortu berria, Editatu eta Ezabatu)
        JPanel botoiPanela = new JPanel();
        botoiPanela.setLayout(new GridLayout(1, 3, 5, 5));

        JButton sortuBerriaBotoia = new JButton("Sortu berria");
        
        JButton editatuBotoia = new JButton("Editatu");
        JButton ezabatuBotoia = new JButton("Ezabatu");

        botoiPanela.add(sortuBerriaBotoia);
        botoiPanela.add(editatuBotoia);
        botoiPanela.add(ezabatuBotoia);

        panela.add(botoiPanela, BorderLayout.SOUTH);

      // Panela gehitu JFrame-ra
        getContentPane().add(panela);
        
      // Sortu berria botoiaren funtzionalitatea
        sortuBerriaBotoia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String testua = textField.getText();
                if (!testua.isEmpty()) {
                    listModel.addElement(testua);  // Elementu berria gehitu zerrendara
                    textField.setText("");  // Testu-eremua garbitu
                }
            }
        });
      // Editatu botoiaren funtzionalitatea
        editatuBotoia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int hautatutakoIndex = jList.getSelectedIndex();
                String testua = textField.getText();
                
                // Egiaztatu hautapen bat dagoela eta testua hutsik ez dagoela
                if (hautatutakoIndex != -1 && !testua.isEmpty()) {
                    // Hautatutako elementua editatu
                    listModel.set(hautatutakoIndex, testua);
                    textField.setText("");  // Testu-eremua garbitu
                } else {
                    // Ohartarazpen bat agertu, hautapenik ez badago edo testua hutsik badago
                    JOptionPane.showMessageDialog(null, "Aukeratu editatu nahi duzun elementua eta sartu testua.");
                }
            }
        });

      // Ezabatu botoiaren funtzionalitatea
        ezabatuBotoia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int hautatutakoIndex = jList.getSelectedIndex();
                if (hautatutakoIndex != -1) {
                    listModel.remove(hautatutakoIndex);  // Hautatutako elementua ezabatu
                }
            }
        });
     // Leihoa bistaratu
        setVisible(true);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JListKudeaketa frame = new JListKudeaketa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	

}
