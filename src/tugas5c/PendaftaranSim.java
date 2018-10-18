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

public class PendaftaranSim extends JFrame
{
 JLabel lblnama=new JLabel("Nama :");
JTextField txnama=new JTextField(20);
JLabel lblalamat=new JLabel("Alamat :");
JTextField txalamat=new JTextField(20);
JLabel lbljenkel=new JLabel("Jenis Kelamin :");
JRadioButton perempuan=new JRadioButton("Perempuan");
JRadioButton laki=new JRadioButton("Laki-Laki");
ButtonGroup grupjenkel=new ButtonGroup();
JLabel lbldaerah=new JLabel("Daerah Tinggal :");
JTextField txdaerah=new JTextField (20);
JLabel lbltinggi=new JLabel("Tinggi badan :");
JTextField txtinggi=new JTextField (20);
JLabel lblpekerjaan=new JLabel("Pekerjaan :");
String[] jenispekerjaan={"--pilih--","Pelajar"," Mahasiswa","PNS","Swasta"};
JComboBox cbpekerjaan=new JComboBox(jenispekerjaan);
JLabel lblsim=new JLabel("Sim :");
JCheckBox cek1=new JCheckBox("SIM A");
JCheckBox cek2=new JCheckBox("SIM B");
JCheckBox cek3=new JCheckBox("SIM C");
JButton tblsimpan=new JButton("Simpan");
JButton tblhapus=new JButton("Hapus");
JButton tblkeluar=new JButton("Keluar");


PendaftaranSim()         
 {
  setTitle("Pendaftaran SIM");
  setLocation(200,100);
  setSize(350,350);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setVisible(true);
 }
 void komponenVisual()
 {
     getContentPane().setLayout(null);
     getContentPane().add(lblnama);
     lblnama.setBounds(10,10,70,20);
     getContentPane().add(txnama);
     txnama.setBounds(100,10,180,20);
     getContentPane().add(lblalamat);
     lblalamat.setBounds(10,35,70,20);
     getContentPane().add(txalamat);
     txalamat.setBounds(100,40,180,20);
     getContentPane().add(lbljenkel);
     lbljenkel.setBounds(10,60,100,20);
     getContentPane().add(perempuan);
     perempuan.setBounds(100,60,100,20);
     getContentPane().add(laki);
     laki.setBounds(100,80,100,20);
     getContentPane().add(lbldaerah);
     lbldaerah.setBounds(10,105,100,20);
     getContentPane().add(txdaerah);
     txdaerah.setBounds(105,105,180,20);
     getContentPane().add(lbltinggi);
     lbltinggi.setBounds(10,130,100,20);
     getContentPane().add(txtinggi);
     txtinggi.setBounds(105,130,180,20);
     getContentPane().add(lblpekerjaan);
     lblpekerjaan.setBounds(10,155,100,20);
     getContentPane().add(cbpekerjaan);
     cbpekerjaan.setBounds(105,155,180,20);
     getContentPane().add(lblsim);
     lblsim.setBounds(10,180,100,20);
     getContentPane().add(cek1);
     cek1.setBounds(100,180,150,20); 
     getContentPane().add(cek2);
     cek2.setBounds(160,180,150,20);
     getContentPane().add(cek3); 
     cek3.setBounds(220,180,150,20);
     getContentPane().add(tblsimpan);
     tblsimpan.setBounds(10,220,80,20);
     getContentPane().add(tblhapus);
     tblhapus.setBounds(115,220,80,20);
     getContentPane().add(tblkeluar);
     tblkeluar.setBounds(220,220,80,20);  
     setVisible(true);
 }

 
 public static void main(String args[])
 {
  PendaftaranSim ps=new PendaftaranSim();
  PendaftaranSim tf= new PendaftaranSim();
  
  ps.komponenVisual();
 }   
}
   