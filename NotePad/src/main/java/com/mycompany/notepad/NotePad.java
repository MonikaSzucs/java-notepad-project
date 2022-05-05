/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.notepad;
import java.io.*;
import.javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author mszuc
 */
public class NotePad extends JFrame implements ActionListener, WindowListener{

    JTextArea jta = new JTextArea();
    File fnameContainer;
    
    public NotePad()
    {
        Font fnt = new Font("Arial", Font.PLAIN,15);
        Container con - getContentPane();
        JMenuBar jab = new JMenuBar();
        JMenu jmfile = new JMenu("File");
        JMenu jmedit = new JMenu("Edit");
        JMenu jmhelp = new JMenu("Help");
        
        con.setLayout(new BorderLayout());
        JScrollPane sbrText = new JScrollPane(jta);
        sbrText.setVericalScrollBarPolicy(JScrollPane.VERTICAL_SCROLL_ALWAYS);
        sbrText.setVisible(true);
        
    }
}
