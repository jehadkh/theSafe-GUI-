/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package javaapplication3;

import com.fazecast.jSerialComm.SerialPort;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

/**
 *
 * @author Jehad kh
 */
public class Pc_comm implements ActionListener{

     Timer t=new Timer(50,this);
     NewJFrame frame;
     public Pc_comm() throws IOException{
        System.out.println("h1");
        frame=new NewJFrame();
        frame.setVisible(true);
         t.start();
     }
    public static void main(String[] args) throws IOException {
       
       new Pc_comm();
       
       // System.out.println("h2");
      
       

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       // System.out.println("hello");
         try {
             frame.StatusRead();
             frame.readData();
             frame.StatusRead();
             
         } catch (IOException ex) {
             System.out.println("err");
             Logger.getLogger(Pc_comm.class.getName()).log(Level.SEVERE, null, ex);
             
         }
        
    }
}
