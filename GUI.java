import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI {
	
    public GUI() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel output = new JLabel("ok");
        
        JButton number1 = new JButton("1");
        JButton number2 = new JButton("2");
        JButton number3 = new JButton("3");
        JButton number4 = new JButton("4");
        JButton number5 = new JButton("5");
        JButton number6 = new JButton("6");
        JButton number7 = new JButton("7");
        JButton number8 = new JButton("8");
        JButton number9 = new JButton("9");
        JButton number0 = new JButton("0");
        JButton addition = new JButton("+");
        
        JButton subtraction = new JButton("-");
        JButton multiplication = new JButton("x");
        JButton division = new JButton("/");
        JButton equal = new JButton("=");
        JButton square_root = new JButton("\u221A");
        JButton comma = new JButton(",");
        JButton percentage = new JButton("%");
        JButton clear = new JButton("CE");
        JButton power = new JButton("^");
        
        
        
        
        panel.setLayout(null);
        
        output.setBounds(15,5,100,50);
        number1.setBounds(15,   155, 50, 50);
        number2.setBounds(70,   155, 50, 50);
        number3.setBounds(125,  155, 50, 50);
        addition.setBounds(180, 155, 50, 50);
        
        number4.setBounds(    15,  210, 50, 50);
        number5.setBounds(    70,  210, 50, 50);
        number6.setBounds(    125, 210, 50, 50);
        subtraction.setBounds(180, 210, 50, 50);
        
        number7.setBounds(       15,  265, 50, 50);
        number8.setBounds(       70,  265, 50, 50);
        number9.setBounds(       125, 265, 50, 50);
        multiplication.setBounds(180, 265, 50, 50);
        
        division.setBounds(			180, 100,  50, 50);
        square_root.setBounds(		70,  100,  50, 50);
        percentage.setBounds(		15,	 100,  50, 50);
        power.setBounds(			125, 100,  50, 50);
        
        equal.setBounds(			180, 320, 50, 50);
        comma.setBounds(			125, 320, 50, 50);
        clear.setBounds(			15,  320, 50, 50);
        number0.setBounds(			70,  320, 50, 50);
        
   
        frame.add(panel);
        panel.add(output);
        panel.add(number1);
        panel.add(number2);
        panel.add(number3);
        panel.add(number4);
        panel.add(number5);
        panel.add(number6);
        panel.add(number7);
        panel.add(number8);
        panel.add(number9);
        panel.add(number0);
        
        panel.add(addition);
        panel.add(subtraction);
        panel.add(multiplication);
        panel.add(division);
        
        panel.add(equal);
        panel.add(comma);
        panel.add(square_root);
        panel.add(percentage);
        panel.add(clear);
        panel.add(power);
        
   
        
        
        panel.setBackground(Color.LIGHT_GRAY);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(265, 430);
        frame.setTitle("Calculator");
        frame.setVisible(true);
        frame.setResizable(false);
    }


}
