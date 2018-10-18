/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5c;

/**
 *
 * @author Asus
 */

import javax.swing.*;
import java.awt.*;

public class FrameTextArea extends JFrame
{
 private JLabel label=new JLabel("Nama");
 private JTextArea area1=new JTextArea(3,20);
 JCheckBox cek1=new JCheckBox("Pilihan 1");
 JCheckBox cek2=new JCheckBox("Pilihan 2");
 JCheckBox cek3=new JCheckBox("Pilihan 3");
 String[] header={"Senin","Selasa","Rabu"};
 String[][] data=
    {{"100","300","150"},{"500","600","450"},{"290","690","360"}};
 
 JTable tabel1=new JTable(data,header);
 FrameTextArea()
 
 {
   setLocation(200,200);
   setSize(500,500);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 void KomponenVisual()
 { 
   getContentPane().add(label);
   getContentPane().add(area1);
   getContentPane().setLayout(new FlowLayout());
   show();
   getContentPane().add(cek1);
   getContentPane().add(cek2);
   getContentPane().add(cek3);
   getContentPane().setLayout(new FlowLayout());
   getContentPane().add(tabel1);
   JTable tabel1=new JTable(data,header);
   JScrollPane scrollPane =new JScrollPane(tabel1);
   getContentPane().add(scrollPane,BorderLayout.CENTER);
   setVisible(true);
 }
}
 class AplikasiTextArea
 
 {
   public static void main(String args[])
   {
    FrameTextArea tf=new FrameTextArea();
    FrameTextArea cb=new FrameTextArea();
    cb.KomponenVisual();
   }  
}


















