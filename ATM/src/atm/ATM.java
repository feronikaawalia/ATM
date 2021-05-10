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
        this.saldo =saldo;
    }
    
    private void initComponents() {
        jLabel4 = new javax.swing.JLabel();
        btnCekSaldo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnTransfer = new javax.swing.JButton();
        btnAmbil = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jtxtTampilan2 = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.black);
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TUBES ATM KELOMPOK 9");

        btnCekSaldo.setText("Cek Saldo");
        btnCekSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekSaldoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("menu");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnTransfer.setText("Transfer");
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferActionPerformed(evt);
            }
        });

        btnAmbil.setText("Ambil");
        btnAmbil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmbilActionPerformed(evt);
            }
        });

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        jLabel1.setText("Saldo anda saat ini adalah :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(109, 109, 109)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btnAmbil, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btnCekSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(70, 70, 70)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jtxtTampilan2)
                                                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))))))
                                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnCekSaldo)
                                        .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnSimpan)
                                        .addComponent(jtxtTampilan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnTransfer)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnAmbil))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(btnClear)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnKeluar)
                                .addContainerGap(133, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnCekSaldoActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(rootPane, "Saldo Anda Saat Ini adalah :"+ saldo);
        hasil = saldo;
        saldo=hasil;
        answer = String.format(" %,.2f ",saldo);
        jtxtTampilan2.setText(answer);
    }

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {
        masukan = Integer.parseInt(JOptionPane.showInputDialog("Masukan angka : "));
        JOptionPane.showMessageDialog(rootPane,"Saldo Anda Saat Ini adalah :"+ (saldo + masukan));
        hasil = saldo + masukan;
        saldo=hasil;
        answer = String.format(" %,.2f ",saldo);
        jtxtTampilan2.setText(answer);
    }

    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {
        String nama3=JOptionPane.showInputDialog("Silahkan Masukan Nama ");

        masukan = Integer.parseInt(JOptionPane.showInputDialog("Masukan angka : "));
        if (saldo <= masukan) {
            JOptionPane.showMessageDialog(rootPane,"Maaf Saldo anda kurang !!!!!");
            JOptionPane.showConfirmDialog(null, " Apakah ingin lanjut");
            JOptionPane.showMessageDialog(rootPane,"Tambahkan Saldo Rekening Anda Terlebih Dahulu");
            System.exit(0);
        } else if (saldo >= masukan) {

        }
        hasil = saldo - masukan;
        saldo=hasil;
        answer = String.format(" %,.2f ", hasil);
        jtxtTampilan2.setText(answer);
        JOptionPane.showMessageDialog(rootPane,"Saldo Anda Saat Ini adalah :"+ saldo+ "\n"+ "Berhasil transfer kepada "+nama3+"sebesar :"+ masukan);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATM().setVisible(true);
            }
        });
    }
    
    private javax.swing.JButton btnAmbil;
    private javax.swing.JButton btnCekSaldo;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTransfer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jtxtTampilan2;
    
}
