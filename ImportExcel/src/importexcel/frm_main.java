/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package importexcel;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.io.File;
import java.io.FileInputStream;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author phuocnguyen
 */
public class frm_main extends javax.swing.JFrame {

    /**
     * Creates new form frm_main
     */
    public frm_main() {
        initComponents();
    }
    
    public Connection conn = null;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_connect = new javax.swing.JButton();
        btn_choosefile = new javax.swing.JButton();
        btn_import = new javax.swing.JButton();
        btn_showttsv = new javax.swing.JButton();
        btn_showbd = new javax.swing.JButton();
        lb_connect = new javax.swing.JLabel();
        lb_choosefile = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_thongtinsv = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_bangdiem = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("IMPORT DATA FROM  EXCEL TO MYSQL");

        btn_connect.setText("Connect to DB");
        btn_connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_connectActionPerformed(evt);
            }
        });

        btn_choosefile.setText("Choose File");
        btn_choosefile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_choosefileActionPerformed(evt);
            }
        });

        btn_import.setText("Import Data");
        btn_import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_importActionPerformed(evt);
            }
        });

        btn_showttsv.setText("Show Data tbl_thongtinsv");
        btn_showttsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showttsvActionPerformed(evt);
            }
        });

        btn_showbd.setText("Show Data tbl_bangdiem");
        btn_showbd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showbdActionPerformed(evt);
            }
        });

        lb_connect.setText("Not Connect to mySQL. Please connect!");

        lb_choosefile.setText("File is not choosen. Please choose file!");

        tb_thongtinsv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tb_thongtinsv);

        tb_bangdiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tb_bangdiem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_connect, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_choosefile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_import, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_showttsv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_showbd))
                    .addComponent(lb_connect)
                    .addComponent(lb_choosefile))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_connect)
                    .addComponent(lb_connect))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_choosefile)
                    .addComponent(lb_choosefile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_import)
                    .addComponent(btn_showttsv)
                    .addComponent(btn_showbd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_connectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_connectActionPerformed
        // TODO add your handling code here:
        try {
            String dbURL = "jdbc:mysql://localhost/db_sinhvien";
            String username = "root";
            String password = "";
            conn = (Connection) DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                lb_connect.setText("Connect successfully!");
            }
            else {
                lb_connect.setText("Error while connecting to db...");
            }
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_btn_connectActionPerformed

    private void btn_choosefileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_choosefileActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int returnValue = jfc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION){
            File selectedFile = jfc.getSelectedFile();
            lb_choosefile.setText(selectedFile.getAbsolutePath());
        }
    }//GEN-LAST:event_btn_choosefileActionPerformed

    private void btn_importActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_importActionPerformed
        // TODO add your handling code here:
        try {
            Statement st = (Statement) conn.createStatement(); 
            int id = 0;
            String hoten = "";
            String mssv = "";
            String diachi = "";
            String sdt = "";
            
            int toan = 0;
            int ly = 0;
            int hoa = 0;
            
            FileInputStream file = new FileInputStream(new File(lb_choosefile.getText()));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            for (int j = 0; j < workbook.getNumberOfSheets(); j++){
                Sheet sheet = workbook.getSheetAt(j);
                if (j == 0){
                    Row row;
                    for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                        row = (Row) sheet.getRow(i);
                        id = (int) row.getCell(0).getNumericCellValue();
                        hoten = row.getCell(1).getStringCellValue();
                        mssv = row.getCell(2).getStringCellValue();
                        diachi = row.getCell(3).getStringCellValue();
                        sdt = row.getCell(4).getStringCellValue();

                        String sqlcmd = "INSERT INTO tbl_thongtinsv(id,hoten,mssv,diachi,sdt) VALUES ('" +id+ "','" +hoten+ "','" +mssv+ "','" +diachi+ "','" +sdt+ "')";
                        st.executeUpdate(sqlcmd);
                    }
                }
                if (j == 1)
                {
                    Row row;
                    for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                        row = (Row) sheet.getRow(i);
                        id = (int) row.getCell(0).getNumericCellValue();
                        mssv = row.getCell(1).getStringCellValue();
                        toan = (int) row.getCell(2).getNumericCellValue();
                        ly = (int) row.getCell(3).getNumericCellValue();
                        hoa = (int) row.getCell(4).getNumericCellValue();

                        String sqlcmd = "INSERT INTO tbl_bangdiem(id,mssv,toan,ly,hoa) VALUES ('" +id+ "','" +mssv+ "','" +toan+ "','" +ly+ "','" +hoa+ "')";
                        st.executeUpdate(sqlcmd);
                    }
                }
            }
            JOptionPane.showMessageDialog(this, "Import t??? file excel th??nh c??ng!");
            file.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Import t??? file excel th???t b???i. Vui l??ng th??? l???i!");
        }
    }//GEN-LAST:event_btn_importActionPerformed

    private void btn_showttsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showttsvActionPerformed
        // TODO add your handling code here:
        String header[] = {"ID", "H??? v?? t??n", "MSSV", "?????a ch???","S??? ??i???n tho???i"};
        DefaultTableModel tblModel = new DefaultTableModel(header, 0);

        try {
            String sql = "select * from tbl_thongtinsv";
            Statement st = (Statement) conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            Vector data = null;
            tblModel.setRowCount(0);
            if (rs.isBeforeFirst() == false) {
                JOptionPane.showMessageDialog(this, "Ch??a c?? th??ng tin sinh vi??n!");
                return;
            }
            while (rs.next()) {
                data = new Vector();
                data.add(rs.getInt("id"));
                data.add(rs.getString("hoten"));
                data.add(rs.getString("mssv"));
                data.add(rs.getString("diachi"));
                data.add(rs.getString("sdt"));
                tblModel.addRow(data);
            }
            tb_thongtinsv.setModel(tblModel);
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_showttsvActionPerformed

    private void btn_showbdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showbdActionPerformed
        // TODO add your handling code here:
        String header[] = {"ID", "MSSV", "To??n", "L??","Ho??"};
        DefaultTableModel tblModel = new DefaultTableModel(header, 0);

        try {
            String sql = "select * from tbl_bangdiem";
            Statement st = (Statement) conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            Vector data = null;
            tblModel.setRowCount(0);
            if (rs.isBeforeFirst() == false) {
                JOptionPane.showMessageDialog(this, "Ch??a c?? th??ng tin ??i???m s???!");
                return;
            }
            while (rs.next()) {
                data = new Vector();
                data.add(rs.getInt("id"));
                data.add(rs.getString("mssv"));
                data.add(rs.getInt("toan"));
                data.add(rs.getInt("ly"));
                data.add(rs.getInt("hoa"));
                tblModel.addRow(data);
            }
            tb_bangdiem.setModel(tblModel);
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_showbdActionPerformed

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
            java.util.logging.Logger.getLogger(frm_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_choosefile;
    private javax.swing.JButton btn_connect;
    private javax.swing.JButton btn_import;
    private javax.swing.JButton btn_showbd;
    private javax.swing.JButton btn_showttsv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_choosefile;
    private javax.swing.JLabel lb_connect;
    private javax.swing.JTable tb_bangdiem;
    private javax.swing.JTable tb_thongtinsv;
    // End of variables declaration//GEN-END:variables
}
