/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

import com.fazecast.jSerialComm.SerialPort;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

/**
 *
 * @author Jehad kh
 */
public class test extends Thread {
       private void readData() throws IOException {
	// Get the port input stream.
	InputStream inStream = NewJFrame.serialPort.getInputStream();

	int availableBytes = inStream.available();
	if (availableBytes > 0) {
		byte[] readBuffer = new byte[availableBytes];
	
		// Read the serial port.
		int numBytes = inStream.read(readBuffer, 0, availableBytes);
	
		if (numBytes > 0)
			System.out.println("Read: " + new String(readBuffer, 0, availableBytes));
	}
}
           @Override
       public void run(){
        try {
            System.out.println("kk");
            for(int i=0;i<100;i++){
                
                try {
                    readData();
                } catch (IOException ex) {
                    Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
       public static void main(String[] args) {
        Thread t= new Thread(new test());
        
        t.start();
        
    }
         
}
