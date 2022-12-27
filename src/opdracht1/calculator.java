package opdracht1;

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


        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                functies.addNumber(1);
                output.setText(functies.getOutputValue());

            }
        });

        a2Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                functies.addNumber(2);
                output.setText(functies.getOutputValue());
            }
        });

        a3Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                functies.addNumber(3);
                output.setText(functies.getOutputValue());
            }
        });

        a4Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                functies.addNumber(4);
                output.setText(functies.getOutputValue());
            }
        });

        a5Button.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                functies.addNumber(5);
                output.setText(functies.getOutputValue());
            }
        });

        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                functies.addNumber(6);
                output.setText(functies.getOutputValue());
            }
        });

        a7Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                functies.addNumber(7);
                output.setText(functies.getOutputValue());
            }
        });

        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                functies.addNumber(8);
                output.setText(functies.getOutputValue());
            }
        });

        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                functies.addNumber(9);
                output.setText(functies.getOutputValue());
            }
        });

        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                functies.addNumber(0);
                output.setText(functies.getOutputValue());
            }
        });
        submitButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                output.setText(Float.toString(functies.calculate()));

            }
        });
        buttonMultiply.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                functies.addSymbol("*");
                output.setText(functies.getOutputValue());
            }
        });
        buttonMinus.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                functies.addSymbol("-");
                output.setText(functies.getOutputValue());
            }
        });
        buttonDivide.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                functies.addSymbol("/");
                output.setText(functies.getOutputValue());
            }
        });
        buttonPlus.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                functies.addSymbol("+");
                output.setText(functies.getOutputValue());
            }
        });
    }

    public static void main(String[] args) {
        calculator calc=new calculator();

    }


}
