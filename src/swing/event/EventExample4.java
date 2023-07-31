package swing.event;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Listener 구현부에서 바로 구현
 */
public class EventExample4 extends JFrame {

    private JButton jButton = new JButton("버튼");

    public EventExample4() {
        setSize(500, 500);

        // jButton.addActionListener(e -> System.out.println("호출!"));  // 람다식 으로도 표현 가능
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("호출4");
            }
        });
        add(jButton);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EventExample4();
    }
}
