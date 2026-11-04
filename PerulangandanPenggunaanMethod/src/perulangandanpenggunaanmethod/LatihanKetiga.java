package perulangandanpenggunaanmethod;

import javax.swing.*;
import java.awt.*;

public class LatihanKetiga extends JFrame {

    JTextField txtUang, txtHarga;
    JTextArea area;
    JButton tombol;

    public LatihanKetiga() {
        setTitle("Latihan 3 - Hitung Kembalian");
        setSize(350, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Uang Bayar:"));
        txtUang = new JTextField(15);
        add(txtUang);

        add(new JLabel("Total Harga:"));
        txtHarga = new JTextField(15);
        add(txtHarga);

        tombol = new JButton("Bayar");
        add(tombol);

        area = new JTextArea(8, 25);
        area.setEditable(false);
        add(new JScrollPane(area));

        tombol.addActionListener(e -> {
            try {
                int uangBayar =
                    Integer.parseInt(txtUang.getText());

                int totalHarga =
                    Integer.parseInt(txtHarga.getText());

                area.setText("");

                if (uangBayar >= totalHarga) {

                    int kembalian =
                        hitungKembalian(uangBayar, totalHarga);

                    area.append("Pembayaran berhasil!\n");
                    area.append("Total harga: " + totalHarga + "\n");
                    area.append("Uang bayar: " + uangBayar + "\n");
                    area.append("Kembalian: " + kembalian);

                } else {
                    area.append("Uang pembayaran kurang!");
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(
                    this, "Masukkan angka yang benar!"
                );
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Method untuk menghitung kembalian
    public int hitungKembalian(int uangBayar, int totalHarga) {
        return uangBayar - totalHarga;
    }

    public static void main(String[] args) {
        new LatihanKetiga();
    }
}
