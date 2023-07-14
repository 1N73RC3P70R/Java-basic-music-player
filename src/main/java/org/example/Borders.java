package org.example;

import org.w3c.dom.Text;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Borders {
    Border programBorder = BorderFactory.createLineBorder(Color.RED, 7, true);
    JFrame frame = new JFrame();
    ImageIcon thumbnail;
    ImageIcon theEye;

    public void Frame() {
        frame.setTitle("Pulvinus");

        startButton();

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Icon();
        Internals();
        Backgroud();
        frame.setIconImage(thumbnail.getImage());
        frame.pack();
        frame.setVisible(true);
    }

    public void Icon() {
        thumbnail = new ImageIcon(getClass().getResource("/AI Cross.jpg"));
        theEye = new ImageIcon(getClass().getResource("/The Eye.png"));
    }

    public void Backgroud() {
        frame.getContentPane().setBackground(new Color(55, 255, 255));
    }

    public void Internals() {
        JLabel label = new JLabel();
        label.setText("What would you like to do today?");
        label.setIcon(theEye);
        label.setHorizontalTextPosition(SwingConstants.CENTER);
        label.setVerticalTextPosition(SwingConstants.BOTTOM);
        label.setForeground(new Color(0xFF0000));
        label.setFont(new Font("Wide Latin", Font.BOLD, 20));
        label.setIconTextGap(15);
        label.setBorder(programBorder);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setHorizontalAlignment(SwingConstants.CENTER);


        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(label, BorderLayout.CENTER);
    }

    public void startButton(){
        JButton button = new JButton("Launch");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        frame.getContentPane().add(button, BorderLayout.NORTH);

    }
}

