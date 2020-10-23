/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.resemble.gui;

import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

/**
 *
 * @author darek
 */
public class ImageWindow extends javax.swing.JFrame {

    /**
     * Creates new form ImageWindow.
     */
    public ImageWindow() {
        initComponents();
    }

    public static void show(BufferedImage image, String title, String message) {
        SwingUtilities.invokeLater(() -> {
            ImageWindow frame = new ImageWindow();
            frame.labelImg.setIcon(new ImageIcon(image));
            frame.textArea.setText(message);
            frame.setTitle(title);
            frame.pack();
            frame.setVisible(true);
        });
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        labelImg = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(20, 20));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jScrollPane2.setMinimumSize(new java.awt.Dimension(700, 400));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(700, 400));

        labelImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        labelImg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelImg.setMaximumSize(new java.awt.Dimension(10000, 10000));
        labelImg.setMinimumSize(new java.awt.Dimension(640, 360));
        labelImg.setPreferredSize(new java.awt.Dimension(640, 360));
        jScrollPane2.setViewportView(labelImg);

        getContentPane().add(jScrollPane2);

        jScrollPane1.setMinimumSize(new java.awt.Dimension(640, 400));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(640, 400));

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setLineWrap(true);
        textArea.setRows(5);
        textArea.setMinimumSize(new java.awt.Dimension(340, 390));
        textArea.setPreferredSize(new java.awt.Dimension(340, 390));
        jScrollPane1.setViewportView(textArea);

        getContentPane().add(jScrollPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelImg;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}