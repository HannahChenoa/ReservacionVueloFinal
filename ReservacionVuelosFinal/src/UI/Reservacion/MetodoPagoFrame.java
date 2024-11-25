package UI.Reservacion;


import javax.swing.*;
import java.awt.*;

public class MetodoPagoFrame extends JFrame {

  
	private static final long serialVersionUID = 1L;

	public MetodoPagoFrame() {
        setTitle("Método de Pago");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel principal
        JPanel mainPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        add(mainPanel);

        mainPanel.add(new JLabel("Número de Tarjeta:"));
        JTextField txtNumeroTarjeta = new JTextField();
        mainPanel.add(txtNumeroTarjeta);

        mainPanel.add(new JLabel("Fecha de Expiración:"));
        JTextField txtFechaExpiracion = new JTextField();
        mainPanel.add(txtFechaExpiracion);

        mainPanel.add(new JLabel("CVV:"));
        JTextField txtCVV = new JTextField();
        mainPanel.add(txtCVV);

        JButton btnPagar = new JButton("Pagar");
        btnPagar.setFont(new Font("Arial", Font.BOLD, 16));
        btnPagar.addActionListener(e -> JOptionPane.showMessageDialog(this, "Pago realizado con éxito."));
        add(btnPagar, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}

