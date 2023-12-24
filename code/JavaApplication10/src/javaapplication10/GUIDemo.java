/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author maithili
 */
public class GUIDemo extends JFrame {
    JPanel panel1;
    JButton eLang;
    JButton fLang;
    JTextField tName;
    JLabel nLabel;
    
    public GUIDemo(){
    
      final int WINDOW_WIDTH=400,WINDOW_HEIGHT=300;
      setTitle("GUI Demo");

      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Build the panel and add it to the frame.
      buildPanel();

      // Add the panel to the frame's content pane.
      add(panel1);

      // Display the window.
      setVisible(true);
    
    
    
    
    }
    
    public void buildPanel(){
        eLang= new JButton("English");
        fLang=new JButton("French");
       
        
        fLang.setBackground(Color.pink);
        tName=new JTextField (20);
        nLabel=new JLabel("Please enter your name");
        panel1=new JPanel();
        panel1.setLayout(new GridLayout(2,2));
        eLang.addActionListener(new aButtonListener() );
        fLang.addActionListener(new aButtonListener() );
        panel1.add(nLabel);
        panel1.add(tName);
        panel1.add(eLang);
        panel1.add(fLang);
    }
    private class aButtonListener implements ActionListener{
     @Override
     public void actionPerformed(ActionEvent e){
         String name;
         name=tName.getText();
        
         //JOptionPane.showMessageDialog(null,"Hello "+name);
         if (e.getSource()==eLang)
         {
          JOptionPane.showMessageDialog(null,"Hello "+name);
         }
         if (e.getSource()==fLang)
         {
          JOptionPane.showMessageDialog(null,"Bonjour "+name);
         }
     
     }
    
    }
  
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GUIDemo D1=new GUIDemo();
    }
    
}
