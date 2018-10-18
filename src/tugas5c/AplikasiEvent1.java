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

public class AplikasiEvent1 extends JFrame
{
 JTextField data1=new JTextField(6);    
JTextField data2=new JTextField(6);    
JButton operasi=new JButton("+");    
JTextField hasil=new JTextField(6);    
JButton exit=new JButton("EXIT"); 
 
AplikasiEvent1()
{   
 setTitle("Event Sederhana");       
 setLocation(200,100);       
 setSize(300,100);       
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
}
void KomponenVisual()
{
 getContentPane().setLayout(null);       
 getContentPane().add(data1);       
 data1.setBounds(10,10,50,20);       
 getContentPane().add(data2);       
 data2.setBounds(70,10,50,20);       
 getContentPane().add(operasi);       
 operasi.setBounds(130,10,50,20);       
 getContentPane().add(hasil);       
 hasil.setBounds(190,10,90,20); 
 getContentPane().add(exit);       
 exit.setBounds(190,35,90,20);       
 setVisible(true);  
}
void AksiReaksi()
{
  data1.addKeyListener(new KeyAdapter()
  {
    public void keyPressed(KeyEvent e)
    {
      if(e.getKeyCode()==e.VK_ENTER)
      {
       data2.requestFocus();
      }
    }
  });
  data2.addKeyListener(new KeyAdapter()
  {
   public void KeyPressed(KeyEvent e)
   {
    if(e.getKeyCode()==e.VK_ENTER)
    {
     operasi.requestFocus();
    }
   }
  });
  operasi.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e)
   {
   int x=Integer.parseInt(data1.getText());             
   int y=Integer.parseInt(data2.getText());             
   String z=String.valueOf(x+y);             
   hasil.setText(z); 
  }
  });
  exit.addActionListener(new ActionListener() 
  {
   public void actionPerformed(ActionEvent e) 
   {
    System.exit(0);
  }
});
}
public static void main(String args[]) 
{
   AplikasiEvent1 e1=new AplikasiEvent1();       
   e1.KomponenVisual();       
   e1.AksiReaksi();    
}        
}
