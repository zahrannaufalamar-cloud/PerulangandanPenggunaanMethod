package perulangandanpenggunaanmethod;

import javax.swing.*;
import java.awt.*;

public class LatihanKeempat extends JFrame {

    JTextField txtNama, txtJumlah;
    JTextArea area;
    JButton tombol;

    public LatihanKeempat() {
        setTitle("Latihan 4 - Daftar Barang");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Nama Barang:"));
        txtNama = new JTextField(15);
        add(txtNama);

        add(new JLabel("Jumlah Beli:"));
        txtJumlah = new JTextField(15);
        add(txtJumlah);

        tombol = new JButton("Proses Pembelian");
        add(tombol);

        area = new JTextArea(12, 30);
        area.setEditable(false);
        add(new JScrollPane(area));

        tombol.addActionListener(e -> {
            try {
                String namaBarang = txtNama.getText();

                int jumlahBeli =
                    Integer.parseInt(txtJumlah.getText());

                area.setText("");

                if (namaBarang.trim().isEmpty() || jumlahBeli <= 0) {
                    area.append("Data pembelian tidak valid!");
                } else {
                    area.append("Pembelian berhasil!\n\n");

                    tampilkanDaftarBarang(
                        namaBarang, jumlahBeli
                    );
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(
                    this, "Jumlah beli harus berupa angka!"
                );
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Method untuk menampilkan daftar barang
    public void tampilkanDaftarBarang(
        String namaBarang, int jumlahBeli
    ) {
        for (int i = 1; i <= jumlahBeli; i++) {
            area.append(
                "Barang ke-" + i + ": " + namaBarang + "\n"
            );
        }
    }

    public static void main(String[] args) {
        new LatihanKeempat();
    }
}
