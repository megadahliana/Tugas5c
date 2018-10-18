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

public class AplikasiMenu extends JFrame
{
JMenuBar mb=new JMenuBar();    
JMenu file=new JMenu("File");    
JMenu help=new JMenu("Help");    
JMenuItem open=new JMenuItem("Open");    
JMenuItem close=new JMenuItem("Close");    
JMenuItem quit=new JMenuItem("Quit");    
JMenuItem about=new JMenuItem("About"); 

AplikasiMenu()
{
setTitle("Menu Utama");
setSize(320,160); 
setLocation(300,200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
}
void KomponenVisual()
{
  setJMenuBar(mb);       
  mb.add(file);       
  mb.add(help);       
  file.add(open);       
  file.add(close);       
  close.setEnabled(false);       
  file.add(quit);       
  help.add(about);       
  setVisible(true);    
} 
 public static void main(String args[])
 {
 AplikasiMenu m1=new AplikasiMenu();
 m1.KomponenVisual();
}
}
   
