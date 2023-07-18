
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI {

    private JPanel jCalculator;
    private JTextField textField1;
    private JButton buttonMultiply;
    private JButton buttonSeven;
    private JButton buttonEight;
    private JButton buttonFour;
    private JButton buttonOne;
    private JButton buttonZero;
    private JButton buttonNine;
    private JButton buttonFive;
    private JButton buttonTwo;
    private JButton buttonPoint;
    private JButton buttonClearEntry;
    private JButton buttonSix;
    private JButton buttonThree;
    private JButton buttonEquals;
    private JButton buttonAns;
    private JButton buttonDivide;
    private JButton buttonSubtract;
    private JButton buttonPlus;


    public CalculatorGUI() {
        ActionListener listenerOne = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textField1.getText() + buttonOne.getText();
                textField1.setText(btnOneText);
            }
        };

        ActionListener listenerTwo = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = textField1.getText() + buttonTwo.getText();
                textField1.setText(btnTwoText);
            }
        };

        ActionListener listenerThree = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = textField1.getText() + buttonThree.getText();
                textField1.setText(btnThreeText);
            }
        };

        ActionListener listenerFour = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = textField1.getText() + buttonFour.getText();
                textField1.setText(btnFourText);
            }
        };

        ActionListener listenerFive = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = textField1.getText() + buttonFive.getText();
                textField1.setText(btnFiveText);
            }
        };

        ActionListener listenerSix = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = textField1.getText() + buttonSix.getText();
                textField1.setText(btnSixText);
            }
        };

        ActionListener listenerSeven = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = textField1.getText() + buttonSeven.getText();
                textField1.setText(btnSevenText);
            }
        };

        ActionListener listenerEight = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = textField1.getText() + buttonEight.getText();
                textField1.setText(btnEightText);
            }
        };

        ActionListener listenerNine = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = textField1.getText() + buttonNine.getText();
                textField1.setText(btnNineText);
            }
        };

        ActionListener listenerZero = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = textField1.getText() + buttonZero.getText();
                textField1.setText(btnZeroText);
            }
        };

        ActionListener listenerPoint = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnPointText = textField1.getText() + buttonPoint.getText();
                textField1.setText(btnPointText);
            }
        };

        ActionListener listenerPlus = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnPlusText = textField1.getText() + buttonPlus.getText();
                textField1.setText(btnPlusText);
            }
        };

        ActionListener listenerSubtract = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSubtractText = textField1.getText() + buttonSubtract.getText();
                textField1.setText(btnSubtractText);
            }
        };

        ActionListener listenerMultiply = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnMultiplyText = textField1.getText() + buttonMultiply.getText();
                textField1.setText(btnMultiplyText);
            }
        };

        ActionListener listenerDivide = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnDivideText = textField1.getText() + buttonDivide.getText();
                textField1.setText(btnDivideText);
            }
        };

        ActionListener listenerClearEntry = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnClearEntryText = "";
                textField1.setText(btnClearEntryText);
            }
        };

        ActionListener listenerEquals = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnClearEntryText = "";
                textField1.setText(btnClearEntryText);
            }
        };

        buttonClearEntry.addActionListener(listenerClearEntry);
        buttonSeven.addActionListener(listenerSeven);
        buttonEight.addActionListener(listenerEight);
        buttonFour.addActionListener(listenerFour);
        buttonOne.addActionListener(listenerOne);
        buttonZero.addActionListener(listenerZero);
        buttonNine.addActionListener(listenerNine);
        buttonFive.addActionListener(listenerFive);
        buttonTwo.addActionListener(listenerTwo);
        buttonPoint.addActionListener(listenerPoint);
        buttonSix.addActionListener(listenerSix);
        buttonThree.addActionListener(listenerThree);
        buttonPlus.addActionListener(listenerPlus);
        buttonMultiply.addActionListener(listenerMultiply);
        buttonSubtract.addActionListener(listenerSubtract);
        buttonDivide.addActionListener(listenerDivide);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Interface");
        frame.setContentPane(new CalculatorGUI().jCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
