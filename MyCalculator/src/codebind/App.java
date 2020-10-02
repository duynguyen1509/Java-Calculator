package codebind;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.util.Objects.requireNonNull;

public class App  {
    private double answer, inputNum;
    int calculation;
    private  JPanel MyCalculator;
    private JTextField textField1;
    private JButton a7Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton multiplication;
    private JButton division;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a0Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton cButton;
    private JButton ACButton;
    private JButton a5Button;
    private JButton a6Button;
    private JButton plus;
    private JButton minus;
    private JButton PointButton;
    private JButton power;
    private JButton equal;
    private JLabel label1;
    private JButton ansButton;

    void arithmetic_operation()
    {
        switch (calculation)
        {
            case 1:
                answer = inputNum + Double.parseDouble(textField1.getText());
                textField1.setText(Double.toString(answer));
                break;
            case 2:
                answer = inputNum - Double.parseDouble(textField1.getText());
                textField1.setText(Double.toString(answer));
                break;
            case 3:
                answer = inputNum * Double.parseDouble(textField1.getText());
                textField1.setText(Double.toString(answer));
                break;
            case 4:
                if (Double.parseDouble(textField1.getText())==0)
                {
                    textField1.setText("Math Error");
                }
                else {
                    answer = inputNum / Double.parseDouble(textField1.getText());
                    textField1.setText(Double.toString(answer));
                }
                break;
            case 5:
                answer = Math.pow(inputNum,Double.parseDouble(textField1.getText()));
                textField1.setText(Double.toString(answer));
                break;
        }
    }


    public App()
    {
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a0ButtonText =  textField1.getText() +a0Button.getText();
                textField1.setText(a0ButtonText);
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a1ButtonText =  textField1.getText() +a1Button.getText();
                textField1.setText(a1ButtonText);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a2ButtonText =  textField1.getText() +a2Button.getText();
                textField1.setText(a2ButtonText);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a3ButtonText =  textField1.getText() +a3Button.getText();
                textField1.setText(a3ButtonText);
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a4ButtonText =  textField1.getText() +a4Button.getText();
                textField1.setText(a4ButtonText);
            }
        });

        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a5ButtonText =  textField1.getText() +a5Button.getText();
                textField1.setText(a5ButtonText);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a6ButtonText =  textField1.getText() +a6Button.getText();
                textField1.setText(a6ButtonText);
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a7ButtonText =  textField1.getText() +a7Button.getText();
                textField1.setText(a7ButtonText);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a8ButtonText =  textField1.getText() +a8Button.getText();
                textField1.setText(a8ButtonText);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a9ButtonText =  textField1.getText() +a9Button.getText();
                textField1.setText(a9ButtonText);
            }
        });

        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder cancel = new StringBuilder(textField1.getText());
                cancel.deleteCharAt(cancel.length()-1);
                textField1.setText(cancel.toString());

            }
        });
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
            }
        });
        PointButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textField1.getText().contains("."))
                    PointButton.setEnabled(false);
                else if (textField1.getText().equals(""))
                    textField1.setText("0.");
                else{
                    String PointButtonText =  textField1.getText() +PointButton.getText();
                    textField1.setText(PointButtonText);
                    PointButton.setEnabled(true);
                }
                PointButton.setEnabled(true);
            }
        });

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputNum = Double.parseDouble(textField1.getText());
                calculation = 1;
                textField1.setText("");
                label1.setText(inputNum+"+");

            }
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputNum = Double.parseDouble(textField1.getText());
                calculation = 2;
                textField1.setText("");
                label1.setText(inputNum+"-");
            }
        });
        multiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputNum = Double.parseDouble(textField1.getText());
                calculation = 3;
                textField1.setText("");
                label1.setText(inputNum+"*");
            }
        });

        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputNum = Double.parseDouble(textField1.getText());
                calculation = 4;
                textField1.setText("");
                label1.setText(inputNum+"/");
            }
        });
        power.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputNum = Double.parseDouble(textField1.getText());
                calculation = 5;
                textField1.setText("");
                label1.setText(inputNum+"^");
            }
        });
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                arithmetic_operation();
                label1.setText("");
            }
        });

        ansButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + answer);
            }
        });
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("MyCalculator");
        frame.setContentPane(new App().MyCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }


}
