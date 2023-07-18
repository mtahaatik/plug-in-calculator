package sd;

import java.util.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.filechooser.*;
import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Interface{

    private JPanel jCalculator;
    private JTextField textField;
    private JButton buttonMultiply;
    private JButton buttonSeven;
    private JButton buttonEight;
    private JButton buttonFour;
    private JButton buttonOne;
    private JButton buttonZero;
    private JButton buttonNine;
    private JButton buttonFive;
    private JButton buttonTwo;
    private JButton buttonClearEntry;
    private JButton buttonSix;
    private JButton buttonThree;
    private JButton buttonEquals;
    private JButton buttonAns;
    private JButton buttonDivide;
    private JButton buttonSubtract;
    private JButton buttonPlus;
    private JButton buttonPlugin;
    private JButton buttonFactorial;
    private JButton buttonPower;
    private JButton buttonUndo;
    private JButton buttonRedo;
    private JButton buttonSqrRoot;
    private JButton buttonModulo;
    private JButton buttonDot;
    private JFileChooser fileChooser;
    SecondaryOperations object = new SecondaryOperations();

    private String oneOperandHandler(String input){
        int factorialInstances = 0;
        int factorialShift = 0;
        String copyString;
        for(int z = 0; z < input.length(); z++){
            if (input.charAt(z) == '!'| input.charAt(z) == '√') factorialInstances++;
        }
        char[] copyChar =  new char[input.length() + factorialInstances];
        for (int i = 0; i < input.length(); i++ ){
            if(input.charAt(i) == '!'){
                copyChar[i] = '!';
                copyChar[i + 1] = '0';
                factorialShift++;
            }
            else if (input.charAt(i) == '√'){
                copyChar[i] = '0';
                copyChar[i + 1] = '√';
                factorialShift++;
            }
            else {
                copyChar[i + factorialShift] = input.charAt(i);
            }
        }
        copyString = String.valueOf(copyChar);
        return copyString;
    }

    public Interface() {
        ActionListener listenerOne = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textField.getText() + buttonOne.getText();
                textField.setText(btnOneText);
            }
        };

        ActionListener listenerTwo = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = textField.getText() + buttonTwo.getText();
                textField.setText(btnTwoText);
            }
        };

        ActionListener listenerThree = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = textField.getText() + buttonThree.getText();
                textField.setText(btnThreeText);
            }
        };

        ActionListener listenerFour = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = textField.getText() + buttonFour.getText();
                textField.setText(btnFourText);

            }
        };

        ActionListener listenerFive = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = textField.getText() + buttonFive.getText();
                textField.setText(btnFiveText);
            }
        };

        ActionListener listenerSix = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = textField.getText() + buttonSix.getText();
                textField.setText(btnSixText);
            }
        };

        ActionListener listenerSeven = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = textField.getText() + buttonSeven.getText();
                textField.setText(btnSevenText);
            }
        };

        ActionListener listenerEight = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = textField.getText() + buttonEight.getText();
                textField.setText(btnEightText);
            }
        };

        ActionListener listenerNine = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = textField.getText() + buttonNine.getText();
                textField.setText(btnNineText);
            }
        };

        ActionListener listenerZero = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = textField.getText() + buttonZero.getText();
                textField.setText(btnZeroText);
            }
        };
        ActionListener listenerDot = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnDotText = textField.getText() + buttonDot.getText();
                textField.setText(btnDotText);
            }
        };

        ActionListener listenerAns = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnAnsText = textField.getText() + object.ans();
                textField.setText(btnAnsText);
            }
        };
        ActionListener listenerUndo = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnClearEntryText = "";
                textField.setText(btnClearEntryText);
                if ( object.undo() == 0){
                    textField.setText("ERROR");
                }
                else {
                    textField.setText("" + object.undo());
                }
            }
        };
        ActionListener listenerRedo = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnClearEntryText = "";
                textField.setText(btnClearEntryText);
                if ( object.redo() == 0){
                    textField.setText("ERROR");
                }
                else {
                    textField.setText("" + object.redo());
                }
            }
        };


        ActionListener listenerPlus = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnPlusText = textField.getText() + buttonPlus.getText();
                textField.setText(btnPlusText);
            }
        };

        ActionListener listenerSubtract = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSubtractText = textField.getText() + buttonSubtract.getText();
                textField.setText(btnSubtractText);
            }
        };

        ActionListener listenerMultiply = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnMultiplyText = textField.getText() + buttonMultiply.getText();
                textField.setText(btnMultiplyText);
            }
        };

        ActionListener listenerDivide = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnDivideText = textField.getText() + buttonDivide.getText();
                textField.setText(btnDivideText);
            }
        };

        ActionListener listenerFactorial = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFactorialText = textField.getText() + buttonFactorial.getText();
                textField.setText(btnFactorialText);
            }
        };

        ActionListener listenerPower = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnPowerText = textField.getText() + buttonPower.getText();
                textField.setText(btnPowerText);
            }
        };
        ActionListener listenerSqrtRoot = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSqrRootText = textField.getText() + buttonSqrRoot.getText();
                textField.setText(btnSqrRootText);
            }
        };

        ActionListener listenerModulo = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnModuloText = textField.getText() + buttonModulo.getText();
                textField.setText(btnModuloText);
            }
        };

        ActionListener listenerClearEntry = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnClearEntryText = "";
                textField.setText(btnClearEntryText);
            }
        };

        ActionListener listenerEquals = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnClearEntryText = "";
                String tempString = oneOperandHandler(textField.getText());
                textField.setText(btnClearEntryText);
                String[] tempArray = tempString.split("(?<=[-+*/!^%√])|(?=[-+*/!^%√])");
                System.out.println(Arrays.toString(tempArray));
                object.setValues(tempArray);
                textField.setText(object.RPN(object.rpn));
            }
        };

        ActionListener listenerPlugin = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("File Chooser Opened");
                fileChooser = new JFileChooser();
                //fileChooser.setCurrentDirectory(new java.io.File("."));
                FileNameExtensionFilter filter = new FileNameExtensionFilter(
                        "Text files", "txt");
                fileChooser.setFileFilter(filter);
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

                if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    try (FileReader fr = new FileReader(file))
                    {
                        int operation;
                        while ((operation = fr.read()) != -1) {
                            System.out.print((char) operation);

                            if((char) operation == '+'){
                                System.out.print("Found +\n");

                                String plusOperation = "+";
                                buttonPlus.setText(plusOperation);
                            }

                            if((char) operation == '-'){
                                System.out.print("Found -\n");

                                String subtractOperation = "-";
                                buttonSubtract.setText(subtractOperation);
                            }

                            if((char) operation == '*'){
                                System.out.print("Found *\n");

                                String multiplyOperation = "*";
                                buttonMultiply.setText(multiplyOperation);
                            }

                            if((char) operation == '/'){
                                System.out.print("Found /\n");

                                String divideOperation = "/";
                                buttonDivide.setText(divideOperation);
                            }

                            if((char) operation == '!'){
                                System.out.print("Found !\n");

                                String factorialOperation = "!";
                                buttonFactorial.setText(factorialOperation);
                            }

                            if((char) operation == '^'){
                                System.out.print("Found ^\n");

                                String powerOperation = "^";
                                buttonPower.setText(powerOperation);
                            }
                            if((char) operation == '√'){
                                System.out.print("Found √\n");

                                String sqrtRootOperation = "√";
                                buttonSqrRoot.setText(sqrtRootOperation);
                            }
                            if((char) operation == '%'){
                                System.out.print("Found %\n");

                                String moduloOperation = "%";
                                buttonModulo.setText(moduloOperation);
                            }

                        }
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                }
            }
        };

        buttonOne.addActionListener(listenerOne);
        buttonTwo.addActionListener(listenerTwo);
        buttonThree.addActionListener(listenerThree);
        buttonFour.addActionListener(listenerFour);
        buttonFive.addActionListener(listenerFive);
        buttonSix.addActionListener(listenerSix);
        buttonSeven.addActionListener(listenerSeven);
        buttonEight.addActionListener(listenerEight);
        buttonNine.addActionListener(listenerNine);
        buttonZero.addActionListener(listenerZero);
        buttonEquals.addActionListener(listenerEquals);
        buttonClearEntry.addActionListener(listenerClearEntry);
        buttonPlus.addActionListener(listenerPlus);
        buttonSubtract.addActionListener(listenerSubtract);
        buttonMultiply.addActionListener(listenerMultiply);
        buttonDivide.addActionListener(listenerDivide);
        buttonFactorial.addActionListener(listenerFactorial);
        buttonPower.addActionListener(listenerPower);
        buttonPlugin.addActionListener(listenerPlugin);
        buttonUndo.addActionListener(listenerUndo);
        buttonRedo.addActionListener(listenerRedo);
        buttonSqrRoot.addActionListener(listenerSqrtRoot);
        buttonModulo.addActionListener(listenerModulo);
        buttonAns.addActionListener(listenerAns);
        buttonDot.addActionListener(listenerDot);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Interface");
        frame.setContentPane(new Interface().jCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}

