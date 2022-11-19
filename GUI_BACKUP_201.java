import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI {
<<<<<<< HEAD
	
	public GUI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
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
		JLabel label = new JLabel("Numbers of clicks");
		
		panel.setSize(500,500);
		frame.add(panel);
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
		panel.add(label);
		panel.add(addition);
		panel.add(subtraction);
		panel.add(multiplication);
		panel.add(division);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);
		frame.setTitle("Calculator");
		frame.setVisible(true);
	}
=======

    public GUI() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
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
        JLabel label = new JLabel("Numbers of clicks");

        number1.setLocation(2, 2);
        panel.setLayout(null);
        number1.setBounds(25, 50, 50, 50);
        number2.setBounds(100, 50, 50, 50);
        number3.setBounds(185, 50, 50, 50);
        number4.setBounds(260, 50, 50, 50);
   
        frame.add(panel);
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
        panel.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setTitle("Calculator");
        frame.setVisible(true);
    }
>>>>>>> 47e25cb541bb7138b31122a7ba1e69a5a2809046

}
