package directorioPeliculas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.MatteBorder;

public class Peliculas {

    private JFrame frame;
    private JTextField textField;
    private JComboBox<String> comboBox; // Variable de instancia

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Peliculas window = new Peliculas();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
   // -------------------------- CLASE INICIALIZADA
    public Peliculas() {
        initialize();
    }
    // --------------------------- VENTANA DE EL FORMULARIO
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(0, 0, 0));
        frame.setBounds(100, 100, 996, 692);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // --------------------------------------------------------------------
        JLabel lblNewLabel = new JLabel("Escribe el titulo de la perlicula");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
        lblNewLabel.setBounds(53, 393, 297, 48);
        frame.getContentPane().add(lblNewLabel);

        // -------------------------------------------------------------------
        textField = new JTextField();
        textField.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
        textField.setBackground(new Color(255, 128, 128));
        textField.setBounds(42, 451, 261, 48);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        // ---------------------------------------------------------------------
        JLabel lblPeliculas = new JLabel("Peliculas");
        lblPeliculas.setForeground(new Color(255, 255, 255));
        lblPeliculas.setFont(new Font("Arial", Font.BOLD, 16));
        lblPeliculas.setBounds(499, 400, 101, 35);
        frame.getContentPane().add(lblPeliculas);

        // ---------------------------------------------------------------------
        JButton btnNewButton = new JButton("Añadir ");
        btnNewButton.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
        btnNewButton.setIcon(new ImageIcon("C:\\Users\\Administrador\\Downloads\\pelicula.png"));
        btnNewButton.setFont(new Font("Arial", Font.BOLD, 13));
        btnNewButton.addActionListener(new ActionListener() {
        	
        	
            public void actionPerformed(ActionEvent e) {
                String nuevaPelicula = textField.getText().trim();
                if (!nuevaPelicula.isEmpty()) {
                    comboBox.addItem(nuevaPelicula);
                    textField.setText(""); // Limpiar el campo de texto después de añadir la película
                }
            }
        });
        btnNewButton.setBounds(79, 530, 172, 41);
        frame.getContentPane().add(btnNewButton);

        // Uso de la variable de instancia comboBox
        comboBox = new JComboBox<>();
        comboBox.setBackground(new Color(255, 128, 128));
        comboBox.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
        comboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Houses of Dragon", "Bad Boys for Life", "Annabelle" }));
        comboBox.setBounds(406, 450, 255, 48);
        frame.getContentPane().add(comboBox);

        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon(Peliculas.class.getResource("/img/Gráfica Historia del Cine Moderno Negro.png")));
        lblNewLabel_2.setBounds(0, 0, 1021, 686);
        frame.getContentPane().add(lblNewLabel_2);
    }
}

