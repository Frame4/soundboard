package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import control.*;

public class GUI {
    control ctrl = new control();
    JFrame frame;
    JPanel panel;
    JButton btn1, btn2, btn3, btn4, btn5, btn6;
    public void myFrame(){
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(700, 600);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn1 = new JButton("Audio 1");
        btn1.setBounds(150, 240, 100, 30);
        btn1.setBackground(Color.WHITE);
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                ctrl.audio1();
            }
        });
        panel.add(btn1);

        btn2 = new JButton("Audio 2");
        btn2.setBounds(300, 240, 100, 30);
        btn2.setBackground(Color.WHITE);
        btn2.setFocusPainted(false);
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                ctrl.audio2();
            }
        });
        panel.add(btn2);

        btn3 = new JButton("Audio 3");
        btn3.setBounds(450, 240, 100, 30);
        btn3.setBackground(Color.WHITE);
        btn3.setFocusPainted(false);
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                ctrl.audio3();
            }
        });
        panel.add(btn3);

        btn4 = new JButton("Audio 4");
        btn4.setBounds(150, 290, 100, 30);
        btn4.setBackground(Color.WHITE);
        btn4.setFocusPainted(false);
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                ctrl.audio4();
            }
        });
        panel.add(btn4);

        btn5 = new JButton("Audio 5");
        btn5.setBounds(300, 290, 100, 30);
        btn5.setBackground(Color.WHITE);
        btn5.setFocusPainted(false);
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                ctrl.audio5();
            }
        });
        panel.add(btn5);

        btn6 = new JButton("Audio 6");
        btn6.setBounds(450, 290, 100, 30);
        btn6.setBackground(Color.WHITE);
        btn6.setFocusPainted(false);
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                ctrl.audio6();
            }
        });
        panel.add(btn6);
    }

}
