/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan;
import java.sql.*; 
import javax.swing.JOptionPane; 
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent; 
import koneksi.koneksi;

/**
 *
 * @author Customer
 */
public class siswa extends javax.swing.JFrame {
    private Connection conn = new koneksi().connect(); 
    private DefaultTableModel tabmode;


    /**
     * Creates new form siswa
     */
    public siswa() {
        initComponents();
        this.setLocationRelativeTo(null);
        kosong();         
        aktif();         
        datatable();
    }
    
    protected void aktif(){ 
    txtnis.requestFocus();
    } 
    
    protected void kosong(){
    txtnis.setText("");      
    txtnama.setText("");          
    txtttl.setText("");          
    txtalamat.setText("");         
    txtcari.setText("");         
    buttonGroup1.clearSelection(); 
    cbmkelas.setSelectedItem(null); 
    cbmagama.setSelectedItem(null); 
    }
    
    protected void datatable(){     
    Object[] Baris ={"NIS","NAMA SISWA","KELAS","Jenis Kelamin","TTL","AGAMA","ALAMAT"};         
    tabmode = new DefaultTableModel(null, Baris);     
    String cariitem=txtcari.getText(); 
    try {               
    String sql = "SELECT * FROM datasiswa where nama like '%"+cariitem+"%' or kelas like '%"+cariitem+"%' order by nama asc";  
    Statement stat = conn.createStatement();              
    ResultSet hasil = stat.executeQuery(sql);           
    while (hasil.next()){                
    tabmode.addRow(new Object[]{       
    hasil.getString(1),  
    hasil.getString(2), 
    hasil.getString(3),      
    hasil.getString(4),      
    hasil.getString(5),
    hasil.getString(6),
    hasil.getString(7),
    
    });              
    }               
    tblsiswa.setModel(tabmode);        
    } 
    catch (Exception e) {   
        JOptionPane.showMessageDialog(null, "data gagal dipanggil"+e);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        bedit = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        bbatal = new javax.swing.JButton();
        bkeluar = new javax.swing.JButton();
        bsimpan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtcari = new javax.swing.JTextField();
        bcari = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblsiswa = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AGAMA = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnis = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        cbmkelas = new javax.swing.JComboBox();
        rlaki = new javax.swing.JRadioButton();
        rperempuan = new javax.swing.JRadioButton();
        txtttl = new javax.swing.JTextField();
        cbmagama = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtalamat = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(13, 83, 118));

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bedit.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        bedit.setForeground(new java.awt.Color(13, 83, 118));
        bedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-save-as-20.png"))); // NOI18N
        bedit.setText("SIMPAN");
        bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditActionPerformed(evt);
            }
        });

        bhapus.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        bhapus.setForeground(new java.awt.Color(13, 83, 118));
        bhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-erase-20.png"))); // NOI18N
        bhapus.setText("HAPUS");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        bbatal.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        bbatal.setForeground(new java.awt.Color(13, 83, 118));
        bbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-cancel-20.png"))); // NOI18N
        bbatal.setText("BATAL");
        bbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbatalActionPerformed(evt);
            }
        });

        bkeluar.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        bkeluar.setForeground(new java.awt.Color(13, 83, 118));
        bkeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-undo-20.png"))); // NOI18N
        bkeluar.setText("KELUAR");
        bkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkeluarActionPerformed(evt);
            }
        });

        bsimpan.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        bsimpan.setForeground(new java.awt.Color(13, 83, 118));
        bsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-add-new-20.png"))); // NOI18N
        bsimpan.setText("TAMBAH");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bsimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bedit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bhapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bbatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bkeluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bsimpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bedit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bhapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bbatal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bkeluar)
                .addGap(137, 137, 137))
        );

        jLabel1.setBackground(new java.awt.Color(102, 204, 255));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA SISWA");

        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcariKeyPressed(evt);
            }
        });

        bcari.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        bcari.setForeground(new java.awt.Color(13, 83, 118));
        bcari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-search-for-love-20.png"))); // NOI18N
        bcari.setText("CARI");
        bcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcariActionPerformed(evt);
            }
        });

        jScrollPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblsiswa.setModel(new javax.swing.table.DefaultTableModel(
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
        tblsiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsiswaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblsiswa);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(13, 83, 118));
        jLabel2.setText("NIS");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(13, 83, 118));
        jLabel3.setText("NAMA SISWA");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(13, 83, 118));
        jLabel4.setText("KELAS");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(13, 83, 118));
        jLabel5.setText("JENIS KELAMIN");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(13, 83, 118));
        jLabel6.setText("TTL");

        AGAMA.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        AGAMA.setForeground(new java.awt.Color(13, 83, 118));
        AGAMA.setText("AGAMA");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(13, 83, 118));
        jLabel8.setText("ALAMAT");

        cbmkelas.setBackground(new java.awt.Color(13, 83, 118));
        cbmkelas.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        cbmkelas.setForeground(new java.awt.Color(13, 83, 118));
        cbmkelas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih", "1", "2", "3", "4", "5", "6" }));

        buttonGroup1.add(rlaki);
        rlaki.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        rlaki.setForeground(new java.awt.Color(13, 83, 118));
        rlaki.setText("Laki-Laki");

        buttonGroup1.add(rperempuan);
        rperempuan.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        rperempuan.setForeground(new java.awt.Color(13, 83, 118));
        rperempuan.setText("Perempuan");

        cbmagama.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        cbmagama.setForeground(new java.awt.Color(13, 83, 118));
        cbmagama.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih", "Islam" }));

        txtalamat.setColumns(20);
        txtalamat.setRows(5);
        jScrollPane1.setViewportView(txtalamat);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(AGAMA)
                    .addComponent(jLabel8))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rlaki)
                        .addGap(28, 28, 28)
                        .addComponent(rperempuan))
                    .addComponent(txtnis)
                    .addComponent(txtnama)
                    .addComponent(cbmkelas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtttl)
                    .addComponent(cbmagama, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cbmkelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rlaki)
                        .addComponent(rperempuan)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtttl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AGAMA)
                    .addComponent(cbmagama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(13, 13, 13))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bcari, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
        // TODO add your handling code here:
        String jenis = null;         
        if(rlaki.isSelected()){ 
            jenis = "Laki-Laki";         
        }
        else if(rperempuan.isSelected()){    
            jenis = "Perempuan";        
        }        
        String sql = "insert into datasiswa values (?,?,?,?,?,?,?)";   
        
        try{            
            PreparedStatement stat = conn.prepareStatement(sql);   
            stat.setString(1, txtnis.getText());            
            stat.setString(2, txtnama.getText());           
            stat.setString(3, cbmkelas.getSelectedItem().toString());            
            stat.setString(4, jenis);   
            stat.setString(5, txtttl.getText());
            stat.setString(6, cbmagama.getSelectedItem().toString());
            stat.setString(7, txtalamat.getText());
            
            stat.executeUpdate();            
            JOptionPane.showMessageDialog(null, "data berhasil disimpan");  
            kosong();            
            txtnis.requestFocus();        
        }        
        catch (SQLException e){  
            JOptionPane.showMessageDialog(null, "data gagal disimpan"+e);     
        } 
        datatable();
    }//GEN-LAST:event_bsimpanActionPerformed

    private void beditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditActionPerformed
        // TODO add your handling code here:
        String jkelamin = null;
         if(rlaki.isSelected()){ 
             jkelamin = "Laki-Laki"; 
         } else if(rperempuan.isSelected()){     
             jkelamin = "Perempuan";         
         }        
         try{            
             String sql = "update datasiswa set nama=?,kelas=?,jkelamin=?,ttl=?,agama=?,alamat=? where nis='"+txtnis.getText()+"'";      
             PreparedStatement stat = conn.prepareStatement(sql);  
             stat.setString(1, txtnama.getText());       
             stat.setString(2, cbmkelas.getSelectedItem().toString());
             stat.setString(3, jkelamin);          
             stat.setString(4, txtttl.getText());
             stat.setString(5, cbmagama.getSelectedItem().toString());
             stat.setString(6, txtalamat.getText()); 
            stat.executeUpdate();         
            JOptionPane.showMessageDialog(null, "data berhasil diubah");           
            kosong();           
            txtnis.requestFocus();      
         }         
         catch (SQLException e){    
             JOptionPane.showMessageDialog(null, "data gagal diubah"+e);       
         }          
         datatable();
    }//GEN-LAST:event_beditActionPerformed

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
        // TODO add your handling code here:
        int ok = JOptionPane.showConfirmDialog(null,"hapus","konfirmasi dialog",JOptionPane.YES_NO_OPTION);   
        if (ok==0){            
            String sql = "delete from datasiswa where nis ='"+txtnis.getText()+"'";   
            try{                
                PreparedStatement stat = conn.prepareStatement(sql);      
                stat.executeUpdate();         
                JOptionPane.showMessageDialog(null, "data berhasil dihapus");               
                kosong();               
                txtnis.requestFocus(); 
            }             
            catch (SQLException e){       
                JOptionPane.showMessageDialog(null, "data gagal dihapus"+e);          
            }            
            datatable();      
        } 
    }//GEN-LAST:event_bhapusActionPerformed

    private void bbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbatalActionPerformed
        // TODO add your handling code here:
         kosong();         
         datatable();
    }//GEN-LAST:event_bbatalActionPerformed

    private void bkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bkeluarActionPerformed

    private void bcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariActionPerformed
        // TODO add your handling code here:
        datatable();
    }//GEN-LAST:event_bcariActionPerformed

    private void txtcariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {  
        datatable();
    }
    }//GEN-LAST:event_txtcariKeyPressed
    
    private void tblsiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsiswaMouseClicked
        // TODO add your handling code here:
         int bar = tblsiswa.getSelectedRow();  
            
         String a = tabmode.getValueAt(bar, 0).toString();  
         String b = tabmode.getValueAt(bar, 1).toString();   
         String c = tabmode.getValueAt(bar, 2).toString();   
         String d = tabmode.getValueAt(bar, 3).toString();   
         String e = tabmode.getValueAt(bar, 4).toString();
         String f = tabmode.getValueAt(bar, 5).toString();
         String g = tabmode.getValueAt(bar, 6).toString();
         
         txtnis.setText(a);        
         txtnama.setText(b); 
         cbmkelas.setSelectedItem(c);
         if ("Laki-Laki".equals(d)) {    
             rlaki.setSelected(true);     
         } else{               
             rperempuan.setSelected(true);            
         }        
         txtttl.setText(e);  
         cbmagama.setSelectedItem(f);
         txtalamat.setText(g);
    
    }//GEN-LAST:event_tblsiswaMouseClicked

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
            java.util.logging.Logger.getLogger(siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run() {
                new siswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AGAMA;
    private javax.swing.JButton bbatal;
    private javax.swing.JButton bcari;
    private javax.swing.JButton bedit;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bkeluar;
    private javax.swing.JButton bsimpan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbmagama;
    private javax.swing.JComboBox cbmkelas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rlaki;
    private javax.swing.JRadioButton rperempuan;
    private javax.swing.JTable tblsiswa;
    private javax.swing.JTextArea txtalamat;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnis;
    private javax.swing.JTextField txtttl;
    // End of variables declaration//GEN-END:variables
}
