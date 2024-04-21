import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Currency_Convert {
public static void converter() {
JFrame f = new JFrame("CURRENCY CONVERTER");
try {
// Creating a new frame using JFrame

JPanel panel = new JPanel();
panel.setLayout(new FlowLayout(FlowLayout.CENTER));

//for inputting option
JTextField l1;

//for input and output amounts
JTextField t1, t2;

// Creating three buttons
JButton b1, b2;

JTextArea textArea = new JTextArea();
textArea.setText("Choose One Option in the Following:\n" + "1) Rupee to USD\n" + "2) USD to Rupee\n" +
"3) Euro to USD\n" + "4) USD to Euro\n" + "5) Saudi Riyal to Rupees");
textArea.setEditable(false);
panel.add(textArea);

l1 = new JTextField("Enter Option");
l1.addFocusListener(new FocusListener() {
@Override
public void focusGained(FocusEvent e) {
l1.setText("");
}

@Override
public void focusLost(FocusEvent e) {
if (l1.getText().equals(""))
l1.setText("Enter Option");
}
});
panel.add(l1);
// Initializing the text fields with
// 0 by default and setting the
// bounds for the text fields
t1 = new JTextField("Input Amount");
t1.addFocusListener(new FocusListener() {
@Override
public void focusGained(FocusEvent e) {
t1.setText("");
}

@Override
public void focusLost(FocusEvent e) {
if (t1.getText().equals(""))
t1.setText("Input Amount");
}
});
t2 = new JTextField("Output Amount");
t2.setEditable(false);
panel.add(t1);
panel.add(t2);

b1 = new JButton("convert");
b2 = new JButton("close");
panel.add(b1);
panel.add(b2);
// Adding action listener
b1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
switch (Integer.parseInt(l1.getText())) {
case 1: {
double rupee = Double.parseDouble(t1.getText());
if (rupee >= 0)
t2.setText(String.valueOf(rupee * 0.0125695));
else {
JOptionPane.showMessageDialog(f, "Please put in positive number of Rupee",
"Try Again!", JOptionPane.ERROR_MESSAGE);
}
break;
}

case 2: {
double usd = Double.parseDouble(t1.getText());
if (usd >= 0)
t2.setText(String.valueOf(usd * 76.69));
else
JOptionPane.showMessageDialog(f, "Please put in positive number of Dollar",
"Try Again!", JOptionPane.ERROR_MESSAGE);
break;
}

case 3: {
double euro = Double.parseDouble(t1.getText());
if (euro >= 0)
t2.setText(String.valueOf(euro * 1.00));
else
JOptionPane.showMessageDialog(f, "Please put in positive number of Euro",
"Try Again!", JOptionPane.ERROR_MESSAGE);
break;
}

case 4: {
double dollar = Double.parseDouble(t1.getText());
if (dollar >= 0)
t2.setText(String.valueOf(dollar * 1.00));
else
JOptionPane.showMessageDialog(f, "Please put in positive number of Dollar",
"Try Again!", JOptionPane.ERROR_MESSAGE);
break;
}

case 5: {
double saudi = Double.parseDouble(t1.getText());
if (saudi >= 0)
t2.setText(String.valueOf(saudi * 21.19));
else
JOptionPane.showMessageDialog(f, "Please put in positive number of Saudi Riyal",
"Try Again!", JOptionPane.ERROR_MESSAGE);
break;
}

default:
JOptionPane.showMessageDialog(f, "Invalid Option",
"Try Again!", JOptionPane.ERROR_MESSAGE);

}
}
});

// Action listener to close the form
b2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
f.dispose();
}
});

// Default method for closing the frame
f.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
System.exit(0);
}
});

// Adding the created objects
// Adding the created objects
// to the form
f.add(panel);
f.setSize(700, 200);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVisible(true);
} catch (Exception e) {
JOptionPane.showMessageDialog(f, "Error Occurred",
"Try Again!", JOptionPane.ERROR_MESSAGE);
}
}

// Driver code
public static void main(String args[]) {
converter();
}
}
