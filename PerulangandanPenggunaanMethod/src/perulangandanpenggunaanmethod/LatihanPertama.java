package perulangandanpenggunaanmethod;

import javax.swing.*;
import java.awt.*;

public class LatihanPertama extends JFrame {

    JTextArea area;
    JButton tombol;

    public LatihanPertama() {
        setTitle("Latihan 1 - Nomor Urut Barang");
        setSize(350, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        area = new JTextArea(15, 25);
        area.setEditable(false);

        tombol = new JButton("Tampilkan Nomor Barang");

        add(new JScrollPane(area));
        add(tombol);

        tombol.addActionListener(e -> {
            area.setText("");

            area.append("Nomor Barang 1-10\n");

            for (int i = 1; i <= 10; i++) {
                area.append("Barang ke-" + i + "\n");
            }

            area.append("\nNomor Barang 10-1\n");

            for (int i = 10; i >= 1; i--) {
                area.append("Barang ke-" + i + "\n");
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LatihanPertama();
    }
}
