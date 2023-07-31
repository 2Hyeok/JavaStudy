package swing.event;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 리스너를 상속받아 핸들러 직접 구현
 */

public class EventExample3 extends JFrame implements ActionListener {

    private JButton jButton = new JButton("버튼");

    public EventExample3() {
        setSize(500, 500);
        jButton.addActionListener(this);
        add(jButton);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("호출3");
    }

    public static void main(String[] args) {
        new EventExample3();
    }
}
