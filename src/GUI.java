import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class GUI extends JFrame implements ActionListener {
    JFrame frame;
    JPanel panel;
    public double num, ans;
    public int calculation;

    JButton n1;
    JButton n2;
    JButton n3;
    JButton n4;
    JButton n5;
    JButton n6;
    JButton n7;
    JButton n8;
    JButton n9;
    JButton n0;
    JButton del;
    JButton divide;
    JButton multiply;
    JButton add;
    JButton minus;
    JButton dot;
    JButton equals;
    JTextArea outputfield;

    public void arithmetic_operation() {

        switch (calculation) {
            case 1: //Addition
                    ans = num + Double.parseDouble(outputfield.getText());
                    outputfield.setText(Double.toString(ans));
                    break;

            case 2: //Subtraction
                    ans = num - Double.parseDouble(outputfield.getText());
                    outputfield.setText(Double.toString(ans));
                    break;

            case 3: //Multiplication
                    ans = num * Double.parseDouble(outputfield.getText());
                    outputfield.setText(Double.toString(ans));
                    break;

            case 4: //Division
                    ans = num / Double.parseDouble(outputfield.getText());
                    outputfield.setText(Double.toString(ans));
                    break;
        }
    }


    public GUI() {


        n1 = new JButton("1");
        n2 = new JButton("2");
        n3 = new JButton("3");
        n4 = new JButton("4");
        n5 = new JButton("5");
        n6 = new JButton("6");
        n7 = new JButton("7");
        n8 = new JButton("8");
        n9 = new JButton("9");
        n0 = new JButton("0");
        del = new JButton("Del");
        divide = new JButton("÷");
        multiply = new JButton("X");
        add= new JButton("+");
        minus = new JButton("-");
        equals= new JButton("=");
        dot = new JButton(".");
        outputfield = new JTextArea();
        outputfield.setSize(300,200);


        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setSize(350,500);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Malculator");
        panel.setLayout(null);
        frame.requestFocus();
        frame.add(panel);


        outputfield.setBounds(20, 20, 290, 100);
        outputfield.setEditable(false);
        outputfield.setFont(new Font("Sans-serif", Font.BOLD, 30));
        panel.add(outputfield);

        n1.setBounds(20, 150, 40, 40);
        n1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputfield.setText(outputfield.getText() + "1");
            }
        });
        panel.add(n1);

        n2.setBounds(70, 150, 40, 40);
        n2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputfield.setText(outputfield.getText() + "2");
            }
        });
        panel.add(n2);

        n3.setBounds(120, 150, 40, 40);
        n3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputfield.setText(outputfield.getText() + "3");
            }
        });
        panel.add(n3);

        n4.setBounds(170, 150, 40, 40);
        n4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputfield.setText(outputfield.getText() + "4");
            }
        });
        panel.add(n4);

        n5.setBounds(220, 150, 40, 40);
        n5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputfield.setText(outputfield.getText() + "5");
            }
        });
        panel.add(n5);

        n6.setBounds(270, 150, 40, 40);
        n6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputfield.setText(outputfield.getText() + "6");
            }
        });
        panel.add(n6);

        n7.setBounds(20, 200, 40, 40);
        n7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputfield.setText(outputfield.getText() + "7");
            }
        });
        panel.add(n7);

        n8.setBounds(70, 200, 40, 40);
        n8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputfield.setText(outputfield.getText() + "8");
            }
        });
        panel.add(n8);

        n9.setBounds(120, 200, 40, 40);
        n9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputfield.setText(outputfield.getText() + "9");
            }
        });
        panel.add(n9);

        n0.setBounds(170, 200, 40, 40);
        n0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputfield.setText(outputfield.getText() + "0");
            }
        });
        panel.add(n0);




        del.setBounds(220, 200, 90, 40);
        del.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputfield.setText("");
            }
        });
        panel.add(del);

        divide.setBounds(20, 250, 50, 40);
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(outputfield.getText());
                calculation = 4;
                outputfield.setText("");
            }
        });
        panel.add(divide);

        multiply.setBounds(80, 250, 50, 40);
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(outputfield.getText());
                calculation = 3;
                outputfield.setText("");
            }
        });
        panel.add(multiply);

        add.setBounds(140, 250, 50, 40);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(outputfield.getText());
                calculation = 1;
                outputfield.setText("");
                //jlabel1.setText(num + "+");
            }
        });
        panel.add(add);

        minus.setBounds(200,250,50,40);
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(outputfield.getText());
                calculation = 2;
                outputfield.setText("");
            }
        });
        panel.add(minus);

        dot.setBounds(260,250,50,40);
        dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputfield.setText(outputfield.getText() + ".");
            }
        });
        panel.add(dot);

        equals.setBounds(20, 300, 50, 40);
        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                arithmetic_operation();
            }
        });
        panel.add(equals);
        panel.setBackground(Color.BLACK);









    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
