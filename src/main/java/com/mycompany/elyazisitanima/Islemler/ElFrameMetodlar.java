/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.elyazisitanima.Islemler;

import com.mycompany.elyazisitanima.Jframe.ElYazisiFrame;
import com.mycompany.elyazisitanima.Veriler.EnumDil;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.sourceforge.tess4j.Tesseract;

public class ElFrameMetodlar  {
 
    
    public HashMap HashMapDiller(HashMap<String,String> dhl){
        dhl.put("İngilizce", ""+EnumDil.eng);
        dhl.put("Türkçe",""+EnumDil.tur);
        dhl.put("Azerice",""+EnumDil.aze);
        dhl.put("Çince", ""+EnumDil.chi_sim);
        dhl.put("Fransızca",""+EnumDil.fra);
        dhl.put("İtalyanca", ""+EnumDil.ita);
        dhl.put("Japonca", ""+EnumDil.jpn); 
        
        return dhl;
    }
    public void comboDoldur(HashMap<String,String> ls, JComboBox jcb) {

        DefaultComboBoxModel cm = new DefaultComboBoxModel();
         Set <String> keys=ls.keySet();
        for (String key : keys) {
            cm.addElement(key);       
        }
        jcb.setModel(cm);
    }

    public String ImageCevir(Image img,String dil) {

        Tesseract tesseract = new Tesseract();
        System.out.println("-------"+dil);
        tesseract.setLanguage(dil);
        String result = null;
        try {

         result = tesseract.doOCR(toBufferedImage(img));
            
        } catch (Exception e) {
            System.out.println("hata var"+e);
        }
       return result;
    }
    
    public String ImageCevir(File file,String dil) {
        
        Tesseract tesseract = new Tesseract();
        System.out.println("-------"+dil);
        tesseract.setLanguage(dil);
        String result = null;
        try {
            result = tesseract.doOCR(file);
            
            
        } catch (Exception e) {
            System.out.println("hata var"+e);
        }
        return result;
    }
    
    public static BufferedImage toBufferedImage(Image img)
{
    if (img instanceof BufferedImage)
    {
        return (BufferedImage) img;
    }

    // Create a buffered image with transparency
    BufferedImage bimage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);

    // Draw the image on to the buffered image
    Graphics2D bGr = bimage.createGraphics();
    bGr.drawImage(img, 0, 0, null);
    bGr.dispose();

    // Return the buffered image
    return bimage;
}

}
