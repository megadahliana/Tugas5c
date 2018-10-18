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
import java.awt.event.*; 

public class SimCetakContoh extends JFrame
{
JLabel lblnama=new JLabel("Nama Pendaftar :");    
 JTextField txnama=new JTextField(20);    
 JLabel lblalamat=new JLabel("Alamat :");    
 JTextField txalamat=new JTextField(7);    
 JLabel lblkelamin=new JLabel("Jenis Kelamin");    
 JRadioButton perempuan=new JRadioButton("Perempuan");    
 JRadioButton laki=new JRadioButton("Laki - Laki"); 
 ButtonGroup kelompok=new ButtonGroup();  
 JLabel lblsim=new JLabel("SIM :");    
 JCheckBox sima=new JCheckBox("SIM A");    
 JCheckBox simb=new JCheckBox("SIM B");    
 JCheckBox simc=new JCheckBox("SIM C");
 JButton cetak=new JButton("Cetak");    
 JTextArea hasil=new JTextArea();
 
 SimCetakContoh()
 {
 setTitle("Pendaftran Sim ");       
 setLocation(300,100);       
 setSize(330,450);       
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 }
 void KompenenVisual()
 {
   getContentPane().setLayout(null);       
   getContentPane().add(lblnama);       
   lblnama.setBounds(10,10,175,20);       
   getContentPane().add(txnama);       
   txnama.setBounds(110,10,175,20);      
   getContentPane().add(lblalamat);       
   lblalamat.setBounds(10,33,80,20);       
   getContentPane().add(txalamat);       
   txalamat.setBounds(110,33,175,20);       
   getContentPane().add(lblkelamin);       
   lblkelamin.setBounds(10,56,80,20);       
   kelompok.add(perempuan);       
   kelompok.add(laki);       
   getContentPane().add(perempuan);       
   perempuan.setBounds(105,56,100,20);       
   getContentPane().add(laki);       
   laki.setBounds(205,56,100,20); 
   getContentPane().add(lblsim);       
   lblsim.setBounds(10,80,70,20);       
   getContentPane().add(sima);       
   sima.setBounds(105,80,100,20);       
   getContentPane().add(simb);       
   simb.setBounds(105,103,100,20);       
   getContentPane().add(simc);       
   simc.setBounds(105,126,100,20); 
   getContentPane().add(cetak);       
   cetak.setBounds(10,150,270,20);       
   getContentPane().add(hasil);       
   hasil.setBounds(10,180,270,150);       
   setVisible(true);
 }
 void AksiReaksi()
 {
  cetak.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e)
   {
    hasil.append(txnama.getText()+"\n");
    hasil.append(txalamat.getText()+"\n");
    if(perempuan.isSelected()==true)
    {
     hasil.append(perempuan.getText()+"\n");
    }
    else
    {
     hasil.append(laki.getText()+"\n");        
    }
    if(sima.isSelected()==true)
    {
     hasil.append(sima.getText()+"\n"); 
    }
     if(simb.isSelected()==true)
     {
     hasil.append(simb.getText()+"\n"); 
    }
     if(simc.isSelected()==true)
     {
     hasil.append(simc.getText()+"\n"); 
    }
     }
  });
 }
 public static void main(String[]args)
 {
  SimCetakContoh Sc=new SimCetakContoh();
  Sc.KompenenVisual();
  Sc.AksiReaksi();
}
}
    
