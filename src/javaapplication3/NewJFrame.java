/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication3;

import com.fazecast.jSerialComm.SerialPort;
import com.fazecast.jSerialComm.SerialPortDataListener;
import com.fazecast.jSerialComm.SerialPortEvent;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jehad kh
 */
public class NewJFrame extends javax.swing.JFrame {
    /**
     * Creates new form NewJFrame
     */
    static SerialPort serialPort = null;
    OutputStream outputStream;
    InputStream input=null;
    String dataBuffer=" ";
    public NewJFrame() throws IOException {
        
        initComponents();
        
        setPassButton.setEnabled(false);
        
        SerialPort [] AvailablePorts = SerialPort.getCommPorts();
       // use the for loop to print the available serial ports
         
        SerialPort.getCommPorts();
        SerialPort []portList=SerialPort.getCommPorts();
        for(SerialPort port : portList){
            PortsComboBox.addItem(port.getSystemPortName());
        }
        
       
    
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PortsComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        threeButton1 = new javax.swing.JButton();
        oneButton = new javax.swing.JButton();
        twoButton = new javax.swing.JButton();
        sixButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        fourButton = new javax.swing.JButton();
        nineButton = new javax.swing.JButton();
        eightButton = new javax.swing.JButton();
        sevenButton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        changePassButton = new javax.swing.JButton();
        EnterPassButton1 = new javax.swing.JButton();
        setPassButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PortsComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                PortsComboBoxPopupMenuWillBecomeVisible(evt);
            }
        });
        PortsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PortsComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Connection Ports");

        threeButton1.setText("3");
        threeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeButton1ActionPerformed(evt);
            }
        });

        oneButton.setText("1");
        oneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneButtonActionPerformed(evt);
            }
        });

        twoButton.setText("2");
        twoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoButtonActionPerformed(evt);
            }
        });

        sixButton.setText("6");
        sixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixButtonActionPerformed(evt);
            }
        });

        fiveButton.setText("5");
        fiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveButtonActionPerformed(evt);
            }
        });

        fourButton.setText("4");
        fourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourButtonActionPerformed(evt);
            }
        });

        nineButton.setText("9");
        nineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineButtonActionPerformed(evt);
            }
        });

        eightButton.setText("8");
        eightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightButtonActionPerformed(evt);
            }
        });

        sevenButton.setText("7");
        sevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenButtonActionPerformed(evt);
            }
        });

        zeroButton.setText("0");
        zeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroButtonActionPerformed(evt);
            }
        });

        changePassButton.setText("Change Password");
        changePassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePassButtonActionPerformed(evt);
            }
        });

        EnterPassButton1.setText("Enter Password");
        EnterPassButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterPassButton1ActionPerformed(evt);
            }
        });

        setPassButton.setText("Set Password");
        setPassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPassButtonActionPerformed(evt);
            }
        });

        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane1.setViewportView(TextArea);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setText("The Safe");

        jLabel3.setText("Operation:");

        jLabel4.setText("Keypad:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Status:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PortsComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2)))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField1))
                        .addComponent(changePassButton)
                        .addComponent(jLabel3))
                    .addComponent(EnterPassButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setPassButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fourButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fiveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sixButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(oneButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(twoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(threeButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(zeroButton)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sevenButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(eightButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nineButton)))
                .addGap(182, 182, 182))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PortsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(changePassButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EnterPassButton1)
                                .addGap(11, 11, 11)
                                .addComponent(setPassButton)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(threeButton1)
                                    .addComponent(twoButton)
                                    .addComponent(oneButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sixButton)
                                    .addComponent(fiveButton)
                                    .addComponent(fourButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nineButton)
                                    .addComponent(eightButton)
                                    .addComponent(sevenButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(zeroButton)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setPassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPassButtonActionPerformed
        outputStream=serialPort.getOutputStream();
        try{
            outputStream.write(48);
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_setPassButtonActionPerformed

    private void EnterPassButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterPassButton1ActionPerformed
        outputStream=serialPort.getOutputStream();
        try{
            outputStream.write(49);
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_EnterPassButton1ActionPerformed

    private void changePassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePassButtonActionPerformed
        outputStream=serialPort.getOutputStream();
        try{
            outputStream.write(50);
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_changePassButtonActionPerformed

    private void zeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroButtonActionPerformed
        outputStream=serialPort.getOutputStream();
        try{
            outputStream.write(48);
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_zeroButtonActionPerformed

    private void sevenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenButtonActionPerformed
        outputStream=serialPort.getOutputStream();
        try{
            outputStream.write(55);
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_sevenButtonActionPerformed

    private void eightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightButtonActionPerformed
        outputStream=serialPort.getOutputStream();
        try{
            outputStream.write(56);
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_eightButtonActionPerformed

    private void nineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineButtonActionPerformed
        outputStream=serialPort.getOutputStream();
        try{
            outputStream.write(57);
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_nineButtonActionPerformed

    private void fourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourButtonActionPerformed
        outputStream=serialPort.getOutputStream();
        try{
            outputStream.write(52);
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_fourButtonActionPerformed

    private void fiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveButtonActionPerformed
        outputStream=serialPort.getOutputStream();
        try{
            outputStream.write(53);
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_fiveButtonActionPerformed

    private void sixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixButtonActionPerformed
        outputStream=serialPort.getOutputStream();
        try{
            outputStream.write(54);
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_sixButtonActionPerformed

    private void twoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoButtonActionPerformed
        outputStream=serialPort.getOutputStream();
        try{
            outputStream.write(50);
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_twoButtonActionPerformed

    private void oneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneButtonActionPerformed
        outputStream=serialPort.getOutputStream();
        try{
            outputStream.write(49);
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_oneButtonActionPerformed

    private void threeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeButton1ActionPerformed
        outputStream=serialPort.getOutputStream();
        try{
            outputStream.write(51);
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_threeButton1ActionPerformed

    private void PortsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PortsComboBoxActionPerformed
        //*********************
        SerialPort [] AvailablePorts = SerialPort.getCommPorts();
        serialPort=AvailablePorts[PortsComboBox.getSelectedIndex()];
        serialPort.setBaudRate(9600);
        serialPort.setNumDataBits(8);
        serialPort.setNumStopBits(1);
        serialPort.setParity(0);
        serialPort.openPort();
        if(serialPort.isOpen()){
            JOptionPane.showMessageDialog(this,"note  "+serialPort.getDescriptivePortName());
        }
        else{
            JOptionPane.showMessageDialog(this,"note not not NOT  "+serialPort.getDescriptivePortName());
        }
    }//GEN-LAST:event_PortsComboBoxActionPerformed

    private void PortsComboBoxPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_PortsComboBoxPopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_PortsComboBoxPopupMenuWillBecomeVisible

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    
    

    
    
    public void readData() throws IOException {
	// Get the port input stream.
	InputStream inStream = serialPort.getInputStream();

	int availableBytes = inStream.available();
	if (availableBytes > 0) {
		byte[] readBuffer = new byte[availableBytes];
	
		// Read the serial port.
		int numBytes = inStream.read(readBuffer, 0, availableBytes);
	
		if (numBytes > 0)
			System.out.println("Read: " + new String(readBuffer, 0, availableBytes));
                        //recieveTempTextField.setText(new String(readBuffer, 0, availableBytes));
                        if(new String(readBuffer, 0, availableBytes).contains("/")){
                            TextArea.setText(" ");
                        }
                        else {
                       // statusTextField.setText(new String(readBuffer, 0, availableBytes));
                        TextArea.append(new String(readBuffer, 0, availableBytes));
                        }
                        
	}
}
    
    void StatusRead() throws IOException {
        if(TextArea.getText().equals(" Safe Opened"))
        {
            jTextField1.setBackground(Color.GREEN);
            jTextField1.setText("Safe Opened");}
        else
           { jTextField1.setBackground(Color.RED);
             jTextField1.setText(" Safe Closed");}
    }
	
private void readData2() throws IOException {
// Get the port input stream.
	InputStream inStream = serialPort.getInputStream();

	int availableBytes = inStream.available();
	if (availableBytes > 0) {
		byte[] readBuffer = new byte[availableBytes];
	
		// Read the serial port.
		int numBytes = inStream.read(readBuffer, 0, availableBytes);
	
		if (numBytes > 0)
                    for (int i = 0; i < readBuffer.length; i++)
                        readBuffer[i] += 48;
                    
			System.out.println("Read: " + new String(readBuffer, 0, availableBytes));
         //               dataTextField2.setText(new String(readBuffer, 0, availableBytes));
	}
        

}
    /**
     * 
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NewJFrame().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EnterPassButton1;
    private javax.swing.JComboBox<String> PortsComboBox;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JButton changePassButton;
    private javax.swing.JButton eightButton;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton fourButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton nineButton;
    private javax.swing.JButton oneButton;
    private javax.swing.JButton setPassButton;
    private javax.swing.JButton sevenButton;
    private javax.swing.JButton sixButton;
    private javax.swing.JButton threeButton1;
    private javax.swing.JButton twoButton;
    private javax.swing.JButton zeroButton;
    // End of variables declaration//GEN-END:variables
}
