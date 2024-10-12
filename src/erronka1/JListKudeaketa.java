package erronka1;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JListKudeaketa extends JFrame {

	private static final long serialVersionUID = 1L;
	//Osagaien oinarrizko panela definituko dogu
	private JPanel panela;// Beharrezko osagaiak definituko ditugu, datuak Jlist-en betetzeko, textField eta DEfaultListModel
 // orain jokalariak private DefaultListModel<String> listModel;
    private DefaultListModel<Jokalaria> listModel;
 // orain jokalariak private JList<String> jList;
    private JList<Jokalaria> jList;    
 // orain jokalariak sartzeko textField-ak gehituko ditugu   private JTextField textField;
    private JTextField izenaField, abizenaField, urteakField, taldeaField;
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
        listModel = new DefaultListModel<>();
 // orain jokalariak        listModel.addElement("Elementu 1");        
 // orain jokalariak		listModel.addElement("Elementu 2");
 // orain jokalariak 		listModel.addElement("Elementu 3");
        listModel.addElement(new Jokalaria("Sarasola", "Izarne", 22, "Real Sociedad"));
        listModel.addElement(new Jokalaria("Murua", "Garazi", 29, "Athletic Club"));

      // JList bat sortu DefaultListModel erabilita
        jList = new JList<>(listModel);
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

      // JScrollPane gehitu JList-i
        JScrollPane scrollPane = new JScrollPane(jList);
        panela.add(scrollPane, BorderLayout.CENTER);

//orain jokalariak gehitzean TExtField-ak sartzeko panela sortuko dut
        //textField = new JTextField();
        //panela.add(textField, BorderLayout.NORTH);      

        
        // TextField-ak jokalariaren datuak sartzeko
        JPanel inputPanela = new JPanel();
        inputPanela.setLayout(new GridLayout(4, 2));

        inputPanela.add(new JLabel("Izena:"));
        izenaField = new JTextField();
        inputPanela.add(izenaField);

        inputPanela.add(new JLabel("Abizena:"));
        abizenaField = new JTextField();
        inputPanela.add(abizenaField);

        inputPanela.add(new JLabel("Urteak:"));
        urteakField = new JTextField();
        inputPanela.add(urteakField);

        inputPanela.add(new JLabel("Taldea:"));
        taldeaField = new JTextField();
        inputPanela.add(taldeaField);

        panela.add(inputPanela, BorderLayout.NORTH);

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
//orain jokalariak gehitzean
                /*String testua = textField.getText();
                if (!testua.isEmpty()) {
                    listModel.addElement(testua);  // Elementu berria gehitu zerrendara
                    textField.setText("");  // Testu-eremua garbitu
                }*/
            	try {
                    String izena = izenaField.getText();
                    String abizena = abizenaField.getText();
                    int urteak = Integer.parseInt(urteakField.getText());
                    String taldea = taldeaField.getText();

                    if (!izena.isEmpty() && !abizena.isEmpty() && !taldea.isEmpty()) {
                        listModel.addElement(new Jokalaria(izena, abizena, urteak, taldea));
                        garbituTextFieldak();
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Mesedez, urteak zenbaki bat izan behar du.");
                }
            }
        });
    
      // Editatu botoiaren funtzionalitatea
        editatuBotoia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int hautatutakoIndex = jList.getSelectedIndex();
//orain jokalariak gehitzean
                //String testua = textField.getText();
                try {
                    String izena = izenaField.getText();
                    String abizena = abizenaField.getText();
                    int urteak = Integer.parseInt(urteakField.getText());
                    String taldea = taldeaField.getText();
                // Egiaztatu hautapen bat dagoela eta testua hutsik ez dagoela
//orain jokalariak gehitzean
                    //if (hautatutakoIndex != -1 && !testua.isEmpty()) {
	                    // Hautatutako elementua editatu
                    if (hautatutakoIndex != -1 && !izena.isEmpty() && !abizena.isEmpty() && !taldea.isEmpty()) {
                        Jokalaria jokalaria = listModel.get(hautatutakoIndex);
                        jokalaria.setIzena(izena);
                        jokalaria.setAbizena(abizena);
                        jokalaria.setUrteak(urteak);
                        jokalaria.setTaldea(taldea);
                        jList.repaint(); // Listaren bistaratzea eguneratzeko
//orain jokalariak gehitzean
                        garbituTextFieldak();
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Mesedez, urteak zenbaki bat izan behar du.");
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
//orain jokalariak gehitzean                    
                    garbituTextFieldak();
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
	// Testu-eremuak garbitzeko metodoa
    private void garbituTextFieldak() {
        izenaField.setText("");
        abizenaField.setText("");
        urteakField.setText("");
        taldeaField.setText("");
    }
	

}
