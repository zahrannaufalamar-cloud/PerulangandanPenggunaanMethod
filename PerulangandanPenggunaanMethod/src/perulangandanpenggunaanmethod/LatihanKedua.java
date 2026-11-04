package perulangandanpenggunaanmethod;

import javax.swing.*;
import java.awt.*;

public class LatihanKedua extends JFrame {

    JTextArea area;
    JButton tombol;

    public LatihanKedua() {
        setTitle("Latihan 2 - Simulasi Stok");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        area = new JTextArea(10, 25);
        area.setEditable(false);

        tombol = new JButton("Mulai Simulasi");

        add(new JScrollPane(area));
        add(tombol);

        tombol.addActionListener(e -> {
            area.setText("");

            int stok = 5;

            while (stok > 0) {
                stok--;
                area.append("Sisa stok: " + stok + "\n");
            }

            area.append("\nStok habis");
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LatihanKedua();
    }
}
