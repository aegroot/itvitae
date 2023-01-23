package itvitae.o1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator extends  JFrame {
    private JPanel TextPanel;
    private JPanel LogicPanel;
    private JButton a4Button;
    private JButton buttonMultiply;
    private JButton a5Button;
    private JButton a6Button;
    private JButton button5;
    private JButton submitButton;
    private JButton buttonPlus;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton buttonMinus;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton buttonDivide;
    private JPanel MainPanel;
    private JTextPane output;
    private JButton a0Button;
    private JButton clearButton;
    private JButton resetButton;

    public  calculator(){
        setContentPane(MainPanel);
        setTitle("calculator");
        setSize(400,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        rekenmachineFuncties functies=new rekenmachineFuncties();
        ActionListener a=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value=e.getActionCommand();
                if((value.charAt(0) >= '0' && value.charAt(0) <= '9')||(value.charAt(0) =='.')){
                    functies.addNumber((value));
                }
                else if(value.matches("[+/-]")||value.charAt(0)=='*')
                    functies.addSymbol(value);


                output.setText(functies.getOutputValue());
            }
        };

        a1Button.addActionListener(a);

        a2Button.addActionListener(a);

        a3Button.addActionListener(a);

        a4Button.addActionListener(a);

        a5Button.addActionListener(a);

        a6Button.addActionListener(a);

        a7Button.addActionListener(a);

        a8Button.addActionListener(a);

        a9Button.addActionListener(a);

        a0Button.addActionListener(a);

        button5.addActionListener(a);
        submitButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                output.setText(Double.toString(functies.calculate()));


            }
        });
        buttonMultiply.addActionListener(a);
        buttonMinus.addActionListener(a);
        buttonDivide.addActionListener(a);
        buttonPlus.addActionListener(a);
        clearButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                functies.clear();
                output.setText(functies.getOutputValue());


            }
        });
        resetButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                functies.Reset();
                output.setText(functies.getOutputValue());


            }
        });
    }

    public static void main(String[] args) {
        calculator calc=new calculator();

    }




}
