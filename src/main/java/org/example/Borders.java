package org.example;

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
        this.frame.setTitle("Pulvinus");

        this.startButton();

        this.frame.pack();
        this.frame.setVisible(true);
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.Icon();
        this.Internals();
        this.Backgroud();
        this.frame.setIconImage(this.thumbnail.getImage());
        this.frame.pack();
        this.frame.setVisible(true);
    }

    public void Icon() {
        this.thumbnail = new ImageIcon(this.getClass().getResource("/AI Cross.jpg"));
        this.theEye = new ImageIcon(this.getClass().getResource("/The Eye.png"));
    }

    public void Backgroud() {
        this.frame.getContentPane().setBackground(new Color(55, 255, 255));
    }

    public void Internals() {
        final JLabel label = new JLabel();
        label.setText("What would you like to do today?");
        label.setIcon(this.theEye);
        label.setHorizontalTextPosition(SwingConstants.CENTER);
        label.setVerticalTextPosition(SwingConstants.BOTTOM);
        label.setForeground(new Color(0xFF0000));
        label.setFont(new Font("Wide Latin", Font.BOLD, 20));
        label.setIconTextGap(15);
        label.setBorder(this.programBorder);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setHorizontalAlignment(SwingConstants.CENTER);


        this.frame.getContentPane().setLayout(new BorderLayout());
        this.frame.getContentPane().add(label, BorderLayout.NORTH);
    }

    public void startButton() {
        final JButton button = new JButton("Launch");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
            }
        });
        this.frame.getContentPane().add(button, BorderLayout.CENTER);

    }
}

