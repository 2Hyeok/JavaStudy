package swing;

import javax.swing.*;
import java.awt.*;

public class AbsoluteLayoutExample extends JFrame {

    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();

    public AbsoluteLayoutExample() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // 창을 닫았을때의 행동

        this.setSize(400, 400); // 창의 최초의 크기

        this.setLayout(null); // 레이아웃 세팅, null을 처리하는 이유는 default 배치 레이아웃을 없애주기 위함

        setComponents(); // 코드의 가독성을 위해 메소드 분리
        this.setVisible(true); // 창이 띄워지는 코드
    }

    private void setComponents() { // 메소드 생성
        button1.setText("버튼1");
        button1.setBounds(10,10,100,50); // 크기도 설정 해주어야함
//        button1.setSize(100, 50); // 이 두개를 합친것과 같음
//        button1.setLocation(10,10);
        this.add(button1);

        button2.setText("버튼2");
        button2.setBounds(30,30,100,50);
        this.add(button2);

        button3.setText("버튼3");
        button3.setBounds(100,100,100,50);
        this.add(button3);

        button4.setText("버튼4");
        button4.setBounds(210,200,100,50);
        this.add(button4);

        button5.setText("버튼5");
        button5.setBounds(10,210,100,50);
        this.add(button5);
    }

    public static void main(String[] args) {
        new AbsoluteLayoutExample();
    }
}
