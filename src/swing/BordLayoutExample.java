package swing;

import javax.swing.*;
import java.awt.*;

public class BordLayoutExample extends JFrame {

    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();

    public BordLayoutExample() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // 창을 닫았을때의 행동

        this.setSize(400, 400); // 창의 최초의 크기

        this.setLayout(new BorderLayout()); // 레이아웃 세팅

        setComponents(); // 코드의 가독성을 위해 메소드 분리
        this.setVisible(true); // 창이 띄워지는 코드
    }

    public void setComponents() {
        button1.setText("버튼1");
        this.add(button1, BorderLayout.WEST);

        button2.setText("버튼2");
        this.add(button2, BorderLayout.CENTER);

        button3.setText("버튼3");
        this.add(button3, BorderLayout.EAST);

        button4.setText("버튼4");
        this.add(button4, BorderLayout.NORTH);

        button5.setText("버튼5");
        this.add(button5, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new BordLayoutExample();
    }
}
