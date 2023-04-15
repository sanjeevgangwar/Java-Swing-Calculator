package java_projects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class myclass extends JFrame implements ActionListener {
    private Container c;
    private JLabel label1, label2;
    private JTextField t1, t2;
    private JButton add, sub, mul, div;
    private JLabel result;

    myclass() {
        setTitle("Simple Calculator Java Project");
        setSize(400, 350);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        c = getContentPane();
        c.setLayout(null);
        // Lable First
        label1 = new JLabel("First Number: ");
        label1.setBounds(10, 20, 100, 20);
        c.add(label1);

        t1 = new JTextField();
        t1.setBounds(130, 20, 100, 20);
        c.add(t1);

        // Lable Second
        label2 = new JLabel("Second Number: ");
        label2.setBounds(10, 50, 170, 20);
        c.add(label2);

        t2 = new JTextField();
        t2.setBounds(130, 50, 100, 20);
        c.add(t2);

        // Operarations buttons
        add = new JButton("+");
        add.setBounds(10, 80, 70, 30);
        c.add(add);

        sub = new JButton("-");
        sub.setBounds(90, 80, 70, 30);
        c.add(sub);

        mul = new JButton("x");
        mul.setBounds(170, 80, 70, 30);
        c.add(mul);

        div = new JButton("/");
        div.setBounds(250, 80, 70, 30);
        c.add(div);

        /// Resull Feild
        result = new JLabel("Result: ");
        result.setBounds(10, 120, 250, 20);
        c.add(result);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        try {
            if (e.getSource() == add) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a + b;
                result.setText("Result: " + c);
            }

            if (e.getSource() == sub) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a - b;
                result.setText("Result: " + c);
            }
            if (e.getSource() == mul) {
                Double a = Double.parseDouble(t1.getText());
                Double b = Double.parseDouble(t2.getText());
                Double c = a * b;
                result.setText("Result: " + c);
            }
            if (e.getSource() == div) {
                Double a = Double.parseDouble(t1.getText());
                Double b = Double.parseDouble(t2.getText());
                Double c = a / b;
                result.setText("Result: " + c);
            }
        } catch (NumberFormatException e1) {
            result.setText("Input Only Integer Number:");
        } catch (ArithmeticException e3) {
            result.setText("Can't Divide By Zero (0)");
        }

    }
}

class minor_project_calculator {
    public static void main(String[] args) {
        new myclass();
    }
}