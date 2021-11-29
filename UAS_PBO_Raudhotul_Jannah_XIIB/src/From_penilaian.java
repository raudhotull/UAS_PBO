/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
 import java.awt.Frame;
 import javax.swing.JOptionPane;
 import javax.swing.table.DefaultTableModel;
 import javax.swing.table.JTableHeader;
/**
 *
 * @author user
 */

public class From_penilaian extends javax.swing.JFrame {
    DefaultTableModel model;
    /**
     * Creates new form From_penilaian
     */
    public From_penilaian() {
        initComponents();
        setTable();
    }

    private void setTable(){
        Object[] field = {"NISN","Nama","Kelas","Mapel","Kehadiran","Tugas","PTS","PAS","Nilai akhir","Nilai huruf"};
        model = new DefaultTableModel(field, 0);
        TABLE_NILAI.setModel(model);
        JTableHeader th = TABLE_NILAI.getTableHeader();
        th.setReorderingAllowed(false);
        TABLE_NILAI.setRowHeight(30);
    }
    
    private String calculate(String... utm){
        for (int i = 0; i < utm.length; i++){
            if(utm[i].isEmpty()){
                utm[i] = "0";
            }
        }
        double t1=0, t2=0, t3=0, t4=0;
        for (int i = 0; i < utm.length; i++){
            double cv = Double.valueOf(utm[i]);
            switch (i) {
                case 0:
                    t1 = cv * 0.1;
                    break;
                case 1:
                    t2 = cv * 0.3;
                    break;
                case 2:
                    t3 = cv * 0.2;
                    break;
                case 3:
                    t4 = cv * 0.4;
                    break;
                default:
                    break;
            }
        }
        double jumlah = t1+t2+t3+t4;
        double as = Math.round(jumlah);
        String cvJumlah = indexOF(as);
        return cvJumlah;
    }
    
    public String indexOF(double b){
        String hsl;
        if(b %1 == 0){
            hsl = String.valueOf(b).substring(0,String.valueOf(b).lastIndexOf("."));
        }else{
            hsl = String.valueOf(b);
        }
        return hsl;
    }
    
    private String calAbjad(String jumlah){
        String nilai = "";
        double b = Double.valueOf(jumlah);
        if (b <= 100 && b >= 80) {
            nilai = "A";
        } else if(b <= 79 && b >= 60){
            nilai = "B";
        } else if(b <= 69 && b >= 40){
            nilai = "C";
        } else if(b <= 39){
            nilai = "D";
        }
        return nilai;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TXT_NISN = new javax.swing.JTextField();
        TXT_NAMA_SISWA = new javax.swing.JTextField();
        TXT_MATA_PELAJARAN = new javax.swing.JTextField();
        TXT_KELAS = new javax.swing.JTextField();
        TXT_KEHADIRAN = new javax.swing.JTextField();
        TXT_NILAI_TUGAS = new javax.swing.JTextField();
        TXT_NILAI_PTS = new javax.swing.JTextField();
        TXT_NILAI_PAS = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        BTN_SIMPAN = new javax.swing.JButton();
        BTN_KELUAR = new javax.swing.JButton();
        BTN_HAPUS = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLE_NILAI = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FROM PENILAIAN SISWA SMK INFORMATIKA UTAMA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 70));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setText("NISN");

        jLabel3.setText("Nama Siswa");

        jLabel4.setText("Mata Pelajaran");

        jLabel5.setText("Kelas");

        jLabel6.setText("Kehadiran");

        jLabel7.setText("Nilai Tugas");

        jLabel8.setText("Nilai PTS");

        jLabel9.setText("Nilai PAS");

        TXT_NISN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_NISNActionPerformed(evt);
            }
        });

        TXT_NAMA_SISWA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_NAMA_SISWAActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        BTN_SIMPAN.setText("Proses dan Simpan");
        BTN_SIMPAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SIMPANActionPerformed(evt);
            }
        });

        BTN_KELUAR.setText("Keluar Aplikasi");
        BTN_KELUAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_KELUARActionPerformed(evt);
            }
        });

        BTN_HAPUS.setText("Hapus Data");
        BTN_HAPUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_HAPUSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(BTN_SIMPAN)
                .addGap(62, 62, 62)
                .addComponent(BTN_HAPUS)
                .addGap(59, 59, 59)
                .addComponent(BTN_KELUAR)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_SIMPAN)
                    .addComponent(BTN_KELUAR)
                    .addComponent(BTN_HAPUS))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TABLE_NILAI.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NISN", "Nama", "Kelas", "Mapel", "Kehadiran", "Tugas", "PTS", "PAS", "Nilai akhir", "Nilai huruf"
            }
        ));
        jScrollPane1.setViewportView(TABLE_NILAI);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(TXT_NISN, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXT_NAMA_SISWA, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXT_MATA_PELAJARAN, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXT_KELAS, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TXT_NILAI_PTS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(TXT_NILAI_TUGAS, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXT_KEHADIRAN, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXT_NILAI_PAS)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(43, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(49, 49, 49))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(TXT_NISN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_KEHADIRAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(TXT_NAMA_SISWA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_NILAI_TUGAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(TXT_MATA_PELAJARAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_NILAI_PTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(TXT_KELAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_NILAI_PAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 710, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXT_NAMA_SISWAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_NAMA_SISWAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_NAMA_SISWAActionPerformed

    private void BTN_SIMPANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SIMPANActionPerformed
        // TODO add your handling code here:
        String NISN         = TXT_NISN.getText();
        String Nama         = TXT_NAMA_SISWA.getText();
        String Kelas        = TXT_KELAS.getText();
        String Mapel        = TXT_MATA_PELAJARAN.getText();
        String Kehadiran    = TXT_KEHADIRAN.getText();
        String Tugas        = TXT_NILAI_TUGAS.getText();
        String PTS          = TXT_NILAI_PTS.getText();
        String PAS          = TXT_NILAI_PAS.getText();
        
        if(NISN.isEmpty()){
            JOptionPane.showMessageDialog(this, "Masukan NISN Terlebih Dahulu");
            TXT_NISN.requestFocus();
        }else{
            String[] data = {Kehadiran, PTS, Tugas, PAS};
            
            String jml = calculate(data);
            Object[] data2 = {NISN, Nama, Kelas, Mapel, Kehadiran, Tugas, PTS, PAS, jml, calAbjad(jml)};
            model.addRow(data2);
        }     
    }//GEN-LAST:event_BTN_SIMPANActionPerformed

    private void BTN_HAPUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_HAPUSActionPerformed
        // TODO add your handling code here:
        TXT_NISN.setText("");
        TXT_NAMA_SISWA.setText("");
        TXT_MATA_PELAJARAN.setText("");
        TXT_KELAS.setText("");
        TXT_KEHADIRAN.setText("");
        TXT_NILAI_TUGAS.setText("");
        TXT_NILAI_PTS.setText("");
        TXT_NILAI_PAS.setText("");
    }//GEN-LAST:event_BTN_HAPUSActionPerformed

    private void BTN_KELUARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_KELUARActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BTN_KELUARActionPerformed

    private void TXT_NISNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_NISNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_NISNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(From_penilaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(From_penilaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(From_penilaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(From_penilaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new From_penilaian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_HAPUS;
    private javax.swing.JButton BTN_KELUAR;
    private javax.swing.JButton BTN_SIMPAN;
    private javax.swing.JTable TABLE_NILAI;
    private javax.swing.JTextField TXT_KEHADIRAN;
    private javax.swing.JTextField TXT_KELAS;
    private javax.swing.JTextField TXT_MATA_PELAJARAN;
    private javax.swing.JTextField TXT_NAMA_SISWA;
    private javax.swing.JTextField TXT_NILAI_PAS;
    private javax.swing.JTextField TXT_NILAI_PTS;
    private javax.swing.JTextField TXT_NILAI_TUGAS;
    private javax.swing.JTextField TXT_NISN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
