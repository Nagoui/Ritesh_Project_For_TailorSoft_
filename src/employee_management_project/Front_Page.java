/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_management_project;

import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;

class Front_Page implements ActionListener {

    JFrame f;
    JLabel id;
    JButton b;

    Front_Page() {

        f = new JFrame("First Page");
        f.setBackground(Color.red);
        f.setLayout(null);

        b = new JButton("CLICK HERE TO CONTINUE");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);

        b.setBounds(500, 400, 300, 70);
        b.addActionListener(this);

        id = new JLabel();
        id.setBounds(0, 0, 1360, 750);
        id.setLayout(null);

        JLabel lid = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        lid.setBounds(80, 30, 1500, 100);
        lid.setFont(new Font("serif", Font.PLAIN, 70));
        lid.setForeground(Color.green);
        id.add(lid);

        id.add(b);
        f.add(id);

        f.getContentPane().setBackground(Color.GRAY);

        f.setVisible(true);
        f.setSize(1360, 550);
        f.setLocation(60, 80);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b) {
            f.setVisible(false);
            new login();
        }
    }

    public static void main(String[] arg) {
        Front_Page f = new Front_Page();
    }
}
