package UI.Reservacion;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ResumenFrame extends JFrame {

    private static final long serialVersionUID = 1L;

    public ResumenFrame(List<String> asientos, int costoTotal, int idVuelo) {
        setTitle("Resumen de Reservación");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel backgroundPanel = createBackgroundPanel();
        add(backgroundPanel, BorderLayout.CENTER);

        JLabel title = new JLabel("Resumen de Reservación", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setForeground(Color.WHITE);
        title.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        backgroundPanel.add(title, BorderLayout.NORTH);

        JPanel detailsPanel = new JPanel(new GridLayout(0, 1, 10, 10));
        detailsPanel.setOpaque(false);
        detailsPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel lblVueloId = new JLabel("Vuelo ID: " + idVuelo, SwingConstants.CENTER);
        lblVueloId.setFont(new Font("Arial", Font.PLAIN, 18));
        lblVueloId.setForeground(Color.WHITE);

        JLabel lblAsientos = new JLabel("Asientos seleccionados: " + String.join(", ", asientos), SwingConstants.CENTER);
        lblAsientos.setFont(new Font("Arial", Font.PLAIN, 18));
        lblAsientos.setForeground(Color.WHITE);

        JLabel lblCosto = new JLabel("Costo Total: $" + costoTotal, SwingConstants.CENTER);
        lblCosto.setFont(new Font("Arial", Font.PLAIN, 18));
        lblCosto.setForeground(Color.WHITE);

        detailsPanel.add(lblVueloId);
        detailsPanel.add(lblAsientos);
        detailsPanel.add(lblCosto);

        backgroundPanel.add(detailsPanel, BorderLayout.CENTER);

        JButton btnMetodoPago = new JButton("Método de Pago");
        btnMetodoPago.setFont(new Font("Arial", Font.BOLD, 18));
        btnMetodoPago.setBackground(new Color(74, 0, 224));
        btnMetodoPago.setForeground(Color.WHITE);
        btnMetodoPago.setFocusPainted(false);
        btnMetodoPago.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Método de pago aún no implementado.");
        });
        backgroundPanel.add(btnMetodoPago, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JPanel createBackgroundPanel() {
        return new JPanel(new BorderLayout()) {
            private static final long serialVersionUID = 1L;

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setPaint(new GradientPaint(0, 0, new Color(74, 0, 224), 0, getHeight(), new Color(142, 45, 226)));
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
    }
}
