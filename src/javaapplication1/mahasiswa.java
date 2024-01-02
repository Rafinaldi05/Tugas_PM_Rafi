

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;

public class mahasiswa extends JFrame{
    private JTextArea textAreaNama;
    private JTextArea textAreaTL;
    private JTextArea textAreaAlamat;
    private JTextArea textAreaUsia;
    private JComboBox tgl;
    private JComboBox bln;
    private JComboBox thn;
    private JTextField tfnama;
    private JButton bproses;
    private JTextField tfalamat;
    private JLabel nama;
    private JPanel jScrollPane1;

    public mahasiswa() {
        this.setContentPane(jScrollPane1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();

        bproses.addActionListener(new ActionListener() {
                        public void bprosesActionPerformed(java.awt.event.ActionEvent evt) {
                String nama = tfnama.getText();
                int tltgl = Integer.parseInt((String) tgl.getSelectedItem());
                int tlbln = bln.getSelectedIndex() + 1;
                int tlthn = Integer.parseInt ((String) thn.getSelectedItem());
                String alamat = tfalamat.getText();

                textAreaNama.setText("Nama          :" + " " + nama);
                textAreaTL.setText("Tanggal Lahir           :" + " " + tltgl + " " + bln.getSelectedItem() + " " + tlthn);
                textAreaAlamat.setText("Alamat          :" + " " + alamat);

                LocalDate birthdate = LocalDate.of(tlthn, tlbln, tltgl);
                LocalDate currentDate = LocalDate.now();
                Period period = Period.between(birthdate, currentDate);

                int years = period.getYears();
                int months = period.getMonths();
                int days = period.getDays();

                textAreaUsia.setText("Usia          :" + " " + years + " tahun, " + months + " bulan, " + days + " hari");
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    public static void main(String[] args) {
        mahasiswaform mahasiswaform = new mahasiswaform();
        mahasiswaform.setVisible(true);
    }
}