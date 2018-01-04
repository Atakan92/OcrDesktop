/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.elyazisitanima.Jframe;

import com.mycompany.elyazisitanima.Islemler.ElFrameMetodlar;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.Tesseract1;
import net.sourceforge.tess4j.TesseractException;

/**
 *
 * @author Java_sabah
 */
public class ElYazisiFrame extends javax.swing.JFrame {
Runnable rn,rn2;
 static boolean durum = false;
    HashMap<String, String> diller = new HashMap<>();
    HashMap<String, String> tur = new HashMap<>();
    ElFrameMetodlar efm = new ElFrameMetodlar();
    private String dil = "tur";
    private File file = null;
    private Image res;
    private String fileSonuc;
    private String imgSonuc;


    public ElYazisiFrame() {
        initComponents();

        setLocationRelativeTo(null);
        setResizable(false);
        jLabelGif.setVisible(false);
        jTextArea1.setVisible(false);
        efm.comboDoldur(efm.HashMapDiller(diller), jComboBoxDil);
          rn = () -> {
             while (true) {
                      
               if (durum==false) {
                
                jLabelGif.setVisible(true);
                break;
                 }  
             }            
        };
                rn2 = () -> {
             while (true) {
                 if(durum==true){
                 System.out.println(durum + "burdayım");
                 jLabelGif.setVisible(false);  
                 break;
                 }         
                
             }            
        };
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonDosyaSec = new javax.swing.JButton();
        jComboBoxDil = new javax.swing.JComboBox<>();
        jButtonCevir = new javax.swing.JButton();
        jButtonKaydet = new javax.swing.JButton();
        jLabelF = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabelGif = new javax.swing.JLabel();
        jCheckBoxDocx = new javax.swing.JCheckBox();
        jCheckBoxXlsx = new javax.swing.JCheckBox();
        jCheckBoxTxt = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("  OCR Uygulama");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("OCR"));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jButtonDosyaSec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/dosyaResim.png"))); // NOI18N
        jButtonDosyaSec.setText("Dosya Seç");
        jButtonDosyaSec.setToolTipText("");
        jButtonDosyaSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDosyaSecActionPerformed(evt);
            }
        });

        jComboBoxDil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxDil.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxDilİtemStateChanged(evt);
            }
        });

        jButtonCevir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/resimcevirme.png"))); // NOI18N
        jButtonCevir.setText("Çevir");
        jButtonCevir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonCevirMousePressed(evt);
            }
        });
        jButtonCevir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCevirActionPerformed(evt);
            }
        });

        jButtonKaydet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/kaydetresim.png"))); // NOI18N
        jButtonKaydet.setText("Kaydet");
        jButtonKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKaydetActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/ajax-loader.gif"))); // NOI18N

        jCheckBoxDocx.setText("DOCX");

        jCheckBoxXlsx.setText("XLSX");

        jCheckBoxTxt.setText("TXT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonDosyaSec, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxDil, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCevir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBoxDocx, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxXlsx, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabelF, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelGif)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDosyaSec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCevir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxDil)
                    .addComponent(jButtonKaydet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBoxXlsx)
                    .addComponent(jCheckBoxDocx)
                    .addComponent(jCheckBoxTxt))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelGif)
                        .addGap(232, 232, 232))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDosyaSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDosyaSecActionPerformed

        fileChooser = new JFileChooser();
        fileChooser.setFileFilter(filter);
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal = fileChooser.showOpenDialog(ElYazisiFrame.this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {

            file = fileChooser.getSelectedFile();
            try {
                BufferedImage img = ImageIO.read(file);

                res = img.getScaledInstance(jLabelF.getWidth(), jLabelF.getHeight(), Image.SCALE_SMOOTH);
                jLabelF.setIcon(new ImageIcon(res));
            } catch (IOException ex) {
                System.out.println("resim hatası");
            }

        }

    }//GEN-LAST:event_jButtonDosyaSecActionPerformed

    private void jComboBoxDilİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxDilİtemStateChanged

        String s = "" + jComboBoxDil.getSelectedItem();
        dil = diller.get(s);
    }//GEN-LAST:event_jComboBoxDilİtemStateChanged

    private void jButtonCevirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCevirActionPerformed
        
        
        
        if (file == null) {
            JOptionPane.showMessageDialog(this, "Lütfen Dosya Seçin");
        } else {

            fileSonuc = efm.ImageCevir(file, dil);
            jTextArea1.setText(fileSonuc);
            jTextArea1.setVisible(true);
            durum=true;
            new Thread(rn2).start();
        }
         
    }//GEN-LAST:event_jButtonCevirActionPerformed

    private void jButtonKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKaydetActionPerformed
        DateFormat df = new SimpleDateFormat("ddmmyyhhmmss");
        Date dateobj = new Date();
        String sonuc = df.format(dateobj);
        System.out.println(sonuc);
        if (file == null) {
            JOptionPane.showMessageDialog(this, "İmage Dosyası Seç");
        } else {
            String path = javax.swing.filechooser.FileSystemView.getFileSystemView().getHomeDirectory() + "";
            System.out.println(path);
            try {
                if (jCheckBoxDocx.isSelected()) {
                    System.out.println("txtgirdi");
                    FileWriter fileWriter = new FileWriter(path + "\\ocr" + sonuc + ".txt");
                    fileWriter.append(jTextArea1.getText());
                    fileWriter.close();
                }
                if (jCheckBoxDocx.isSelected()) {
                    System.out.println("docx girdi");
                    FileWriter fileWriter = new FileWriter(path + "\\ocr" + sonuc + ".docx");
                    fileWriter.append(jTextArea1.getText());
                    fileWriter.close();
                }
                if (jCheckBoxXlsx.isSelected()) {
                    System.out.println("xlsx girdi");
                    FileWriter fileWriter = new FileWriter(path + "\\ocr" + sonuc + ".xlsx");
                    fileWriter.append(jTextArea1.getText());
                    fileWriter.close();
                }
                if (!(jCheckBoxXlsx.isSelected() || jCheckBoxDocx.isSelected() || jCheckBoxDocx.isSelected())) {
                    JOptionPane.showMessageDialog(this, "En az bir uzantı seçin.");
                }
                else{
                     JOptionPane.showMessageDialog(this,"Kayıt Gerçekleşti");
                }
               

            } catch (IOException ex) {
                System.out.println("hata");
            }

        }


    }//GEN-LAST:event_jButtonKaydetActionPerformed

    private void jButtonCevirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCevirMousePressed
      new Thread(rn).start();
    }//GEN-LAST:event_jButtonCevirMousePressed

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
            java.util.logging.Logger.getLogger(ElYazisiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElYazisiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElYazisiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElYazisiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ElYazisiFrame().setVisible(true);
            }
        });

    }

    ElFrameMetodlar elFrameMetodlar = new ElFrameMetodlar();
    private FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG,JPEG,PNG", "jpg", "jpeg", "png");
    private JFileChooser fileChooser;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCevir;
    private javax.swing.JButton jButtonDosyaSec;
    private javax.swing.JButton jButtonKaydet;
    private javax.swing.JCheckBox jCheckBoxDocx;
    private javax.swing.JCheckBox jCheckBoxTxt;
    private javax.swing.JCheckBox jCheckBoxXlsx;
    private javax.swing.JComboBox<String> jComboBoxDil;
    private javax.swing.JLabel jLabelF;
    private static javax.swing.JLabel jLabelGif;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}
