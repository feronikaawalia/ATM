/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atm;
import javax.swing.JOptionPane;

/**
 *
 * @author feronika
 */

public class ATM extends javax.swing.JFrame {

    double hasil;
    String answer;
    double saldo;
    int masukan;
    
    public ATM() {
        initComponents();
    }

    public ATM(int saldo) {
        this.saldo = saldo;
    }
    
    private void initComponents() {
        LabelNama = new javax.swing.JLabel();
        buttonCheck = new javax.swing.JButton();
        LabelMenu = new javax.swing.JLabel();
        buttonSave = new javax.swing.JButton();
        buttonTransfer = new javax.swing.JButton();
        buttonWithdraw = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        textTampilan = new javax.swing.JTextField();
        buttonClear = new javax.swing.JButton();
        LabelKeterangan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonExit.setText("Keluar");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        LabelKeterangan.setText("Saldo anda saat ini :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(109, 109, 109)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(LabelNama, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(LabelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(buttonTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(buttonWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(buttonCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(70, 70, 70)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(textTampilan)
                                                                        .addComponent(LabelKeterangan, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))))))
                                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(LabelNama)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelMenu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonCheck)
                                        .addComponent(LabelKeterangan))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonSave)
                                        .addComponent(textTampilan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonTransfer)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonWithdraw))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(buttonClear)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonExit)
                                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }

    private void buttonCheckActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(rootPane, "Saldo anda saat ini adalah "+ saldo);
        hasil = saldo;
        saldo=hasil;
        answer = String.format(" %,.2f ",saldo);
        textTampilan.setText(answer);
    }

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {
        masukan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nominal : "));
        JOptionPane.showMessageDialog(rootPane,"Saldo anda saat ini adalah "+ (saldo + masukan));
        hasil = saldo + masukan;
        saldo=hasil;
        answer = String.format(" %,.2f ",saldo);
        textTampilan.setText(answer);
    }

    private void buttonTransferActionPerformed(java.awt.event.ActionEvent evt) {
        String nama=JOptionPane.showInputDialog("Masukkan Nama : ");

        masukan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nominal : "));
        if (saldo <= masukan) {
            JOptionPane.showMessageDialog(rootPane,"Maaf Saldo Tidak Cukup !!!!!");
            JOptionPane.showConfirmDialog(null, " Apakah ingin lanjut");
            JOptionPane.showMessageDialog(rootPane,"Tambahkan Saldo Rekening Anda Terlebih Dahulu");
            System.exit(0);
        } else if (saldo >= masukan) {

        }
        hasil = saldo - masukan;
        saldo=hasil;
        answer = String.format(" %,.2f ", hasil);
        textTampilan.setText(answer);
        JOptionPane.showMessageDialog(rootPane,"Saldo anda saat ini adalah "+ saldo+ "\n"+ "Berhasil transfer kepada "+nama+" sebesar "+ masukan);
    }

    private void buttonWithdrawActionPerformed(java.awt.event.ActionEvent evt) {
        masukan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nominal : "));
        hasil = saldo - masukan;
        saldo=hasil;
        answer = String.format(" %,.2f ", hasil);
        textTampilan.setText(answer);
        JOptionPane.showMessageDialog(rootPane,"Saldo anda saat ini adalah "+ saldo+ "\n");
    }

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {
        textTampilan.setText("");
    }
    
    private javax.swing.JButton buttonWithdraw;
    private javax.swing.JButton buttonCheck;
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton buttonTransfer;
    private javax.swing.JLabel LabelNama;
    private javax.swing.JLabel LabelMenu;
    private javax.swing.JLabel LabelKeterangan;
    private javax.swing.JTextField textTampilan;
    
}
