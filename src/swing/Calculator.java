package swing;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {

    private JPanel topPanel = new JPanel();
    private JPanel botttomPanel = new JPanel();

    // top Panel Components
    JTextArea textAreaPreNumbers = new JTextArea();
    JTextArea textAreaNumbers = new JTextArea();


    // Bottom Panel Components
    JButton buttonNum0 = new JButton();
    JButton buttonNum1 = new JButton();
    JButton buttonNum2 = new JButton();
    JButton buttonNum3 = new JButton();
    JButton buttonNum4 = new JButton();
    JButton buttonNum5 = new JButton();
    JButton buttonNum6 = new JButton();
    JButton buttonNum7 = new JButton();
    JButton buttonNum8 = new JButton();
    JButton buttonNum9 = new JButton();

    JButton buttonPlusMinus = new JButton();
    JButton buttonDot = new JButton();
    JButton buttonMultiple = new JButton();
    JButton buttonMinus = new JButton();
    JButton buttonPlus = new JButton();
    JButton buttonEqual = new JButton();

    JButton buttonDevide = new JButton();
    JButton buttonRemainder = new JButton();
    JButton buttonClear = new JButton();
    JButton buttonDelete = new JButton();

    // Calculate Variables
    double savedNum;
    double num;
    String operator = "";

    public Calculator() {
        setSize(350, 570);

        setComponents();
        setPanels();
        setEvents(); // 이벤트 처리

        setLayout(new GridLayout(2, 1));

        add(topPanel);
        add(botttomPanel);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void setPanels() {
        // Top Panel Settings
        topPanel.setLayout(new GridLayout(2,1));
        topPanel.add(textAreaPreNumbers);
        topPanel.add(textAreaNumbers);

        // Bottom Panel Setting
        botttomPanel.setLayout(new GridLayout(5,4));
        botttomPanel.add(buttonRemainder);
        botttomPanel.add(buttonDevide);
        botttomPanel.add(buttonClear);
        botttomPanel.add(buttonDelete);

        botttomPanel.add(buttonNum7);
        botttomPanel.add(buttonNum8);
        botttomPanel.add(buttonNum9);
        botttomPanel.add(buttonMultiple);

        botttomPanel.add(buttonNum4);
        botttomPanel.add(buttonNum5);
        botttomPanel.add(buttonNum6);
        botttomPanel.add(buttonMinus);

        botttomPanel.add(buttonNum1);
        botttomPanel.add(buttonNum2);
        botttomPanel.add(buttonNum3);
        botttomPanel.add(buttonPlus);

        botttomPanel.add(buttonPlusMinus);
        botttomPanel.add(buttonNum0);
        botttomPanel.add(buttonDot);
        botttomPanel.add(buttonEqual);
    }

    private void updateNumber(int num){
        textAreaNumbers.append(Integer.toString(num));
    }

    private void calculate(String operator) {
        if (operator.equalsIgnoreCase("+")) {
            savedNum = Double.parseDouble(textAreaNumbers.getText());
            this.operator = "+";
            textAreaPreNumbers.setText(" + " + savedNum);
            textAreaNumbers.setText("");

        } else if (operator.equalsIgnoreCase("-")) {
            savedNum = Double.parseDouble(textAreaNumbers.getText());
            this.operator = "-";
            textAreaPreNumbers.setText(" - " + savedNum);
            textAreaNumbers.setText("");

        } else if (operator.equalsIgnoreCase("x")) {
            savedNum = Double.parseDouble(textAreaNumbers.getText());
            this.operator = "*";
            textAreaPreNumbers.setText(" X " + savedNum);
            textAreaNumbers.setText("");

        } else if (operator.equalsIgnoreCase("/")) {
            savedNum = Double.parseDouble(textAreaNumbers.getText());
            this.operator = "/";
            textAreaPreNumbers.setText(" / " + savedNum);
            textAreaNumbers.setText("");

        } else if (operator.equalsIgnoreCase("%")) {
            savedNum = Double.parseDouble(textAreaNumbers.getText());
            this.operator = "%";
            textAreaPreNumbers.setText(" % " + savedNum);
            textAreaNumbers.setText("");

        } else if (operator.equalsIgnoreCase("=")) {
            if (savedNum == 0) {
                return;
            }
            double result = 0;
            num = Double.parseDouble(textAreaNumbers.getText());

            System.out.println(operator);
            if (this.operator.equalsIgnoreCase("+")) {
                result = savedNum + num;
            } else if (this.operator.equalsIgnoreCase("-")) {
                result = savedNum - num;
            } else if (this.operator.equalsIgnoreCase("*")) {
                result = savedNum * num;
            } else if (this.operator.equalsIgnoreCase("/")) {
                result = savedNum / num;
            } else if (this.operator.equalsIgnoreCase("%")) {
                result = savedNum % num;
            }

            savedNum = result;
            textAreaNumbers.setText(Double.toString(result));

        }
    }

    private void setComponents() {
        textAreaNumbers.setText("0");
        textAreaNumbers.setFont(new Font("돋음", Font.BOLD, 33));
        textAreaNumbers.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        textAreaPreNumbers.setFont(new Font("돋음", Font.BOLD, 33));
        textAreaPreNumbers.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        buttonNum0.setText("0");
        buttonNum1.setText("1");
        buttonNum2.setText("2");
        buttonNum3.setText("3");
        buttonNum4.setText("4");
        buttonNum5.setText("5");
        buttonNum6.setText("6");
        buttonNum7.setText("7");
        buttonNum8.setText("8");
        buttonNum9.setText("9");

        buttonClear.setText("C");
        buttonRemainder.setText("%");
        buttonDelete.setText("<del");

        buttonMultiple.setText("X");
        buttonDevide.setText("÷");
        buttonMinus.setText("-");
        buttonPlus.setText("+");
        buttonPlusMinus.setText("+/-");
        buttonEqual.setText("=");
        buttonDot.setText(".");
    }

    private void setEvents() {
        buttonNum0.addActionListener(e -> {
            if(textAreaNumbers.getText().equalsIgnoreCase("0")) {
                textAreaNumbers.setText("");
            }
            updateNumber(0);
        });
        buttonNum1.addActionListener(e -> {
            if(textAreaNumbers.getText().equalsIgnoreCase("0")) {
                textAreaNumbers.setText("");
            }
            updateNumber(1);
        });
        buttonNum2.addActionListener(e -> {
            if(textAreaNumbers.getText().equalsIgnoreCase("0")) {
                textAreaNumbers.setText("");
            }
            updateNumber(2);
        });
        buttonNum3.addActionListener(e -> {
            if(textAreaNumbers.getText().equalsIgnoreCase("0")) {
                textAreaNumbers.setText("");
            }
            updateNumber(3);
        });
        buttonNum4.addActionListener(e -> {
            if(textAreaNumbers.getText().equalsIgnoreCase("0")) {
                textAreaNumbers.setText("");
            }
            updateNumber(4);
        });
        buttonNum5.addActionListener(e -> {
            if(textAreaNumbers.getText().equalsIgnoreCase("0")) {
                textAreaNumbers.setText("");
            }
            updateNumber(5);
        });
        buttonNum6.addActionListener(e -> {
            if(textAreaNumbers.getText().equalsIgnoreCase("0")) {
                textAreaNumbers.setText("");
            }
            updateNumber(6);
        });
        buttonNum7.addActionListener(e -> {
            if(textAreaNumbers.getText().equalsIgnoreCase("0")) {
                textAreaNumbers.setText("");
            }
            updateNumber(7);
        });
        buttonNum8.addActionListener(e -> {
            if(textAreaNumbers.getText().equalsIgnoreCase("0")) {
                textAreaNumbers.setText("");
            }
            updateNumber(8);
        });
        buttonNum9.addActionListener(e -> {
            if(textAreaNumbers.getText().equalsIgnoreCase("0")) {
                textAreaNumbers.setText("");
            }
            updateNumber(9);
        });
        buttonClear.addActionListener(e -> {
            textAreaNumbers.setText("");
            textAreaPreNumbers.setText("");
             num = 0;
             savedNum = 0;
             operator = "";
        });
        buttonDevide.addActionListener(e -> {
            calculate("/");
        });
        buttonPlus.addActionListener(e -> {
            calculate("+");
        });
        buttonMinus.addActionListener(e -> {
            calculate("-");
        });
        buttonMultiple.addActionListener(e -> {
            calculate("X");
        });
        buttonRemainder.addActionListener(e -> {
            calculate("%");
        });
        buttonEqual.addActionListener(e -> {
            calculate("=");
        });
        buttonDelete.addActionListener(e -> {
            String getNumber = textAreaNumbers.getText();
            if (getNumber.length() <= 0) {
                return;
            }
            String t = getNumber.substring(0, getNumber.length() - 1);
            textAreaNumbers.setText(t);
        });
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
