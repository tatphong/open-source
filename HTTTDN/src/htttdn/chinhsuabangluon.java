/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htttdn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author tiennguyen
 */
public class chinhsuabangluon extends javax.swing.JFrame {

    /**
     * Creates new form chinhsuabangluon
     */
    public chinhsuabangluon() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idnv = new javax.swing.JLabel();
        tonggio = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tnv = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnluu = new javax.swing.JButton();
        btndong = new javax.swing.JButton();
        textidnv = new javax.swing.JTextField();
        texttennv = new javax.swing.JTextField();
        texttonggiocong = new javax.swing.JTextField();
        textungluong = new javax.swing.JTextField();
        texttongluong = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textghichu = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idnv.setText("ID NV");

        tonggio.setText("Tổng giờ công");

        jLabel4.setText("Ứng lương");

        tnv.setText("Tên nhân viên");

        jLabel5.setText("Tổng lương ");

        jLabel6.setText("Ghi chú");

        btnluu.setText("Lưu");
        btnluu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnluuActionPerformed(evt);
            }
        });

        btndong.setText("Đóng");
        btndong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndongActionPerformed(evt);
            }
        });

        texttonggiocong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texttonggiocongActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Chỉnh sửa bảng lương");

        textghichu.setColumns(20);
        textghichu.setRows(5);
        jScrollPane1.setViewportView(textghichu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idnv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textidnv, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tnv)
                            .addComponent(tonggio)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texttennv)
                            .addComponent(textungluong)
                            .addComponent(texttongluong)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(texttonggiocong, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btndong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnluu)
                        .addGap(8, 8, 8)))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(idnv)
                    .addComponent(textidnv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tnv)
                    .addComponent(texttennv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tonggio)
                    .addComponent(texttonggiocong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textungluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(texttongluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnluu)
                    .addComponent(btndong))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void texttonggiocongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texttonggiocongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texttonggiocongActionPerformed

    private void btndongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndongActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btndongActionPerformed

    private void btnluuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnluuActionPerformed
        // TODO add your handling code here:
        try {
            String dbURL = "jdbc:sqlserver://localhost;databaseName=QL_NHA_HANG;user=sa;password=sa";
            Connection conn = DriverManager.getConnection(dbURL);
            Statement statement = conn.createStatement();

            if (conn != null) {
                String updatesql = "update LUONG " 
					+ "set tamung = '" + textungluong.getText() + "'"
					+ ",ghichu = N'" + textghichu.getText() + "'"
					+ "where idNV = '" + Integer.parseInt(textidnv.getText()) + "'";
                boolean kiemtra;
                kiemtra=statement.execute(updatesql);
                if(kiemtra==false)
                {
                    JOptionPane.showMessageDialog(this, "Cập nhật thành công ");
                    bangluongnhavienparttime.loadTable();
                    bangluongnhanvienfulltime.loadTable();
                    this.dispose();
                }else 
                {
                    JOptionPane.showMessageDialog(this, "Cập nhật thất bại !!!");
                }
            }
            conn.close();
        } catch (SQLException ex) {
            System.err.println("Cannot connect database, " + ex);
        }
    }//GEN-LAST:event_btnluuActionPerformed

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
            java.util.logging.Logger.getLogger(chinhsuabangluon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chinhsuabangluon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chinhsuabangluon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chinhsuabangluon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chinhsuabangluon().setVisible(true);
            }
        });
    }
    public void setid(int str)
    {
        textidnv.setText(String.valueOf(str));
    }
    public void settennv(String str)
    {
        texttennv.setText(str);
    }
    public void settonggiocon(int str)
    {
        texttonggiocong.setText(String.valueOf(str));
    }
    public void setungluong(int str)
    {
        textungluong.setText(String.valueOf(str));
    }
    public void settongluong(int str)
    {
        texttongluong.setText(String.valueOf(str));
    }
    public void setghichu(String str)
    {
        textghichu.setText(str);
    }

    public void hideid()
    {
        textidnv.setEditable(false);
        textidnv.setEnabled(false);
    }
    public void hideten()
    {
        texttennv.setEditable(false);
        texttennv.setEnabled(false);
    }
    public void hidetonggio()
    {
        texttonggiocong.setEditable(false);
        texttonggiocong.setEnabled(false);
    }
    public void hidetongluong()
    {
        texttongluong.setEditable(false);
        texttongluong.setEnabled(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndong;
    private javax.swing.JButton btnluu;
    private javax.swing.JLabel idnv;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textghichu;
    private javax.swing.JTextField textidnv;
    private javax.swing.JTextField texttennv;
    private javax.swing.JTextField texttonggiocong;
    private javax.swing.JTextField texttongluong;
    private javax.swing.JTextField textungluong;
    private javax.swing.JLabel tnv;
    private javax.swing.JLabel tonggio;
    // End of variables declaration//GEN-END:variables
}
