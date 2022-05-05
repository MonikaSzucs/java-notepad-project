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
        JMenuBar jmb = new JMenuBar();
        JMenu jmfile = new JMenu("File");
        JMenu jmedit = new JMenu("Edit");
        JMenu jmhelp = new JMenu("Help");
        
        con.setLayout(new BorderLayout());
        JScrollPane sbrText = new JScrollPane(jta);
        sbrText.setVericalScrollBarPolicy(JScrollPane.VERTICAL_SCROLL_ALWAYS);
        sbrText.setVisible(true);
        
        jta.setFont(fnt);
        jta.setLineWrap(true);
        jta.setWrapStyleWord(true);
        
        con.add(sbrText);
        
        createMenuItem(jmfile,"New");
        createMenuItem(jmfile,"Open");
        createMenuItem(jmfile,"Save");
        jmfile.addSeparator();
        createMenuItem(jmfile,"Exit");
        
        createMenuItem(jmedit,"Cut");
        createMenuItem(jmedit,"Copy");
        createMenuItem(jmedit,"Paste");
        
        createMenuItem(jmhelp,"About Notepad");
        
        jmb.add(jmfile);
        jmb.add(jmedit);
        jmb.add(jmhelp);
        
        setJMenuBar(jmb);
        
        setIconImage(Toolkit.getDefaultToolkit().getImage("notepad.gif"));
        setSize(500,500);
        setTitle("Untitled.txt");
        setVisible(true);
        
        
    }
    
    public void createMenuItem(Jmenu jm, String text)
    {
        JMenuItem jmi = new JMenuItem(txt);
        jmi.addActionListener(this);
        jmi.add(jmi);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        JFileChooser jfc = new JFileChooser();
        if(e.getActionCommand().equals("New"))
        {
            this.setTitle("Untitled.txt-Notepad");
            jta.setText("");
            fnameContainer = null;
        } else if(e.getActionCommand().equals("Open"))
        {
            int ret = jfc.showDialog(null,"Open");
            if(ret==JFileChooser.APPROVE_OPTION)
            {
                try
                {
                    File fyl = jfc.getSelectedFile();
                    OpenFile(fyl.getAbsolutePath());
                    this.setTitle(fyl.getName() + " - Notepad ");
                    fnameContainer = fyl;
                } catch (IOException e)
                {
                  
                }
            }
        } else if(e.getActionCommand().equals("Save"))
        {
            if(fnameContainer != null)
            {
                jfc.setCurrentDirectory(fnameContainer);
                jfc.setSelectedFile(fnameContainer);
            }
        } else
        {
            jfc.setSelectedFile(new File("Untitled.txt"));
                    
        }
        
        int ret = jfc.showDialog(null);
        if(ret == JFileChooser.APPROVE_OPTION)
        {
            try 
            {
                File fyl = jfc.getSelectedFile();
                SaveFile(fyl.getAbsolutePath());
                this.setTitle(tyl.getName() + " - Notepad");
                fnameContainer = fyl
            }
        }
    }
}
