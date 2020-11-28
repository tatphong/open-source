/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cnpm;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tiennguyen
 */
public class quanlitaikhoannhanvien extends javax.swing.JFrame {

    /**
     * Creates new form quanlitaikhoannhanvien
     */
    public quanlitaikhoannhanvien() {
        initComponents();  
        loadTable();
    }
    public static void loadTable()
    {
        try {
                String dbURL = "jdbc:sqlserver://localhost;databaseName=QL_NHA_HANG;user=sa;password=sa";
                Connection conn = DriverManager.getConnection(dbURL);
                Statement statement = conn.createStatement();
                
                Object[] columm ={"Tên tài Khoản","Cấp","Nhân viên sở hữu","Lịch sử thay đổi mật khẩu"};
                DefaultTableModel model =new DefaultTableModel();
                //model = (DefaultTableModel) bangdanhsachtk.getModel();
                model.setColumnIdentifiers(columm);
                bangdanhsachtk.setModel(model);
                if (conn != null) {
                    System.out.println("Connected");
                    DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
                    String sql1 = "select * from ACCOUNT";
                    ResultSet rs;
                    rs = statement.executeQuery(sql1);
                    Object[] rows=new Object[4];
                    while (rs.next()) {
                        rows[0] = rs.getString("username");
//                        System.out.println(rows[0]);
                        rows[2]= rs.getString("owner");
//                        System.out.println(rows[2]);
                        rows[1] =String.valueOf(rs.getInt("permission_level"));
//                        System.out.println(rows[1]);
                        rows[3] =rs.getString("pwd_history");
                        model.addRow(rows);
                    }
                }
                conn.close();
            } catch (SQLException ex) {
                System.err.println("Cannot connect database, " + ex);
            }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        bangdanhsachtk = new javax.swing.JTable();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        labelqlytk = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setSize(new java.awt.Dimension(700, 500));

        jScrollPane1.setForeground(new java.awt.Color(0, 27, 72));

        bangdanhsachtk.setForeground(new java.awt.Color(0, 27, 72));
        bangdanhsachtk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên tài khoản", "Cấp", "ID Nhân viên sở hữu", "Lịch sử thay đổi mật khẩu"
            }
        ));
        bangdanhsachtk.setSelectionBackground(new java.awt.Color(204, 204, 255));
        bangdanhsachtk.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(bangdanhsachtk);
        if (bangdanhsachtk.getColumnModel().getColumnCount() > 0) {
            bangdanhsachtk.getColumnModel().getColumn(1).setMinWidth(50);
            bangdanhsachtk.getColumnModel().getColumn(1).setPreferredWidth(20);
            bangdanhsachtk.getColumnModel().getColumn(1).setMaxWidth(50);
        }

        btnthem.setForeground(new java.awt.Color(0, 27, 72));
        btnthem.setText("Thêm tài khoản");
        btnthem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 27, 72)));
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnsua.setForeground(new java.awt.Color(0, 27, 72));
        btnsua.setText("Sửa tài khoản");
        btnsua.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 27, 72)));
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setForeground(new java.awt.Color(0, 27, 72));
        btnxoa.setText("Xóa tài khoản");
        btnxoa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 27, 72)));
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        labelqlytk.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelqlytk.setForeground(new java.awt.Color(0, 27, 72));
        labelqlytk.setText("QUẢN LÝ TÀI KHOẢN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelqlytk)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnthem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnsua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labelqlytk)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnthem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        int i;
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) bangdanhsachtk.getModel(); 
        i=bangdanhsachtk.getSelectedRow();
        //System.out.println(i+" ");
        if(i>=0)
        {
           try {
                String dbURL = "jdbc:sqlserver://localhost;databaseName=QL_NHA_HANG;user=sa;password=sa";
                Connection conn = DriverManager.getConnection(dbURL);
                Statement statement = conn.createStatement();
                if (conn != null) {
                    System.out.println("Connected");
                    DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
                    
                    String tamm = (String) model.getValueAt(i, 0);
                    System.out.println(tamm);
                    
                    String sql1 = "delete from ACCOUNT where username = '" + model.getValueAt(i, 0) +"'";
                    
                    boolean rs;
                    rs = statement.execute(sql1);
                    if(rs==false)
                    {
                        JOptionPane.showMessageDialog(this, "Xóa thành công ");
                    }else JOptionPane.showMessageDialog(this, "Xóa thất bại !!! ");
                }
                model.removeRow(i);
                conn.close();
            } catch (SQLException ex) {
                System.err.println("Cannot connect database, " + ex);
            }
        }else
        {
            JOptionPane.showMessageDialog(this, "Vui lòng chon tai khoan can xoa !!!");
        }
        
    }//GEN-LAST:event_btnxoaActionPerformed

    
        
    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
        //System.out.println("sdafsfasdfas");
        themtaikhoannhanvien z = new themtaikhoannhanvien();
        z.setTitle("Bảng thêm nhân viên");
        //z.setTextButton("Thêm");
        //z.setTextJlabel5("Thêm tài khoản");
        z.setLocationRelativeTo(null);
        z.setVisible(true);
        z.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        loadTable();
        
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
        int i;
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) bangdanhsachtk.getModel(); 
        i=bangdanhsachtk.getSelectedRow();
        //System.out.println("giá trị rów"+i+" ");
        if(i>=0)
        {
            themtaikhoannhanvien z = new themtaikhoannhanvien();
            z.setTitle("Bảng cập nhật nhân viên");
            z.setTextButton("Cập nhật");
            z.setTextJlabel5("Cập nhật tài khoản");
            z.setTextJlabel2("Mật khẩu mới ");
            z.setLocationRelativeTo(null);
            z.setVisible(true);
            z.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
            z.setTextname((String) model.getValueAt(i, 0));
            // nhan vien level = 0
            // quan li level = 1
            // thu ngan = 2
            String abc= (String) model.getValueAt(i, 1);
            int j=Integer.parseInt(abc);
            z.setlevel(j);
            z.setTextJTextfiel1((String) model.getValueAt(i, 2));
            // conect sql check nv
//            try {
//                String dbURL = "jdbc:sqlserver://localhost;databaseName=QL_NHA_HANG;user=sa;password=sa";
//                Connection conn = DriverManager.getConnection(dbURL);
//                Statement statement = conn.createStatement();
//                if (conn != null) {
//                    System.out.println("Connected");
//                    DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
//                    String sql1 = "select * from NHANVIEN where idNV=" + model.getValueAt(i, 2);
//                    ResultSet rs;
//                    rs = statement.executeQuery(sql1);
//                    String ten = "";
//                    while (rs.next()) {
//                        ten = rs.getString("tenNV");
//                    }
//                    z.setTextJTextfiel1(ten);
//                }
//            } catch (SQLException ex) {
//                System.err.println("Cannot connect database, " + ex);
//            }
            // 
            //model.removeRow(i);
            z.sethidejtxt();
            loadTable();
        }else
        {
            JOptionPane.showMessageDialog(this, "Vui lòng chon tai khoan can sua !!!");
        }
    }//GEN-LAST:event_btnsuaActionPerformed

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
            java.util.logging.Logger.getLogger(quanlitaikhoannhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quanlitaikhoannhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quanlitaikhoannhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quanlitaikhoannhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            quanlitaikhoannhanvien qltknv = new quanlitaikhoannhanvien();
            qltknv.setLocationRelativeTo(null);
            qltknv.setVisible(true);
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTable bangdanhsachtk;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelqlytk;
    // End of variables declaration//GEN-END:variables
}