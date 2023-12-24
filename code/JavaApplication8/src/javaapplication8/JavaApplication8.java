/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author wadea
 */
public class JavaApplication8 {

    public static void main(String args[]) {

        //Creating the Frame
        JFrame frame = new JFrame("Login page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FILE");
        JMenu m2 = new JMenu("Help");
        JMenu m3 = new JMenu("Main menu");
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        m1.add(m11);
        m1.add(m22);
        JMenuItem m13 = new JMenuItem("What is it ?");
        m2.add(m13);

        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Username :");
        label.setBounds(10, 20, 80, 25);
        panel.add(label);
        JTextField tf = new JTextField(10); // accepts upto 10 characters
        JLabel label1 = new JLabel("Password :");
        JTextField tf1 = new JTextField(10); // accepts upto 10 characters
        JButton send = new JButton("Apply");
        JButton reset = new JButton("Do not reset");
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel.add(label1); // Components Added using Flow Layout
        panel.add(tf1);
        panel.add(send);
        panel.add(reset);

        // Text Area at the Center
        JTextArea ta = new JTextArea();

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
}