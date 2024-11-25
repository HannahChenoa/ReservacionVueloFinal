package UI.Reservacion;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ResumenFrame extends JFrame {

    
	private static final long serialVersionUID = 1L;

	public ResumenFrame(ArrayList<String> asientos, int costoTotal, int idVuelo) {
        setTitle("Resumen de Reservación");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel principal
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        add(mainPanel);

        // Título
        JLabel title = new JLabel("Resumen de Reservación", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        mainPanel.add(title, BorderLayout.NORTH);

        // Detalles de la reservación
        JPanel detailsPanel = new JPanel(new GridLayout(0, 1));
        detailsPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        detailsPanel.add(new JLabel("Vuelo ID: " + idVuelo));
        detailsPanel.add(new JLabel("Asientos seleccionados: " + String.join(", ", asientos)));
        detailsPanel.add(new JLabel("Costo Total: $" + costoTotal));
        mainPanel.add(detailsPanel, BorderLayout.CENTER);

        // Botón para ir al método de pago
        JButton btnMetodoPago = new JButton("Método de Pago");
        btnMetodoPago.setFont(new Font("Arial", Font.BOLD, 16));
        btnMetodoPago.addActionListener(e -> new MetodoPagoFrame());
        mainPanel.add(btnMetodoPago, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}

