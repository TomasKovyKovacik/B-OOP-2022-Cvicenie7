package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class Okno extends UniversalAdapter implements ActionListener {

    public Okno() throws HeadlessException {
        super();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.addMouseListener(this);

        this.setLayout(new BorderLayout());

        JPanel menu = new JPanel();
        menu.setLayout(new GridLayout(1,2));
        menu.setBackground(Color.CYAN);
        JLabel label = new JLabel("Tu je text vlavo");
        JLabel label2 = new JLabel("Tu je text vpravo");
        menu.add(label);
        menu.add(label2);

        JPanel klavesnica = new JPanel();
        klavesnica.setLayout(new GridLayout(3,3));

        for (int i = 1; i < 10; i++) {
            JButton b = new JButton(String.valueOf(i));
            klavesnica.add(b);
            b.addActionListener(this);
        }

        this.add(menu, BorderLayout.PAGE_START);
        this.add(klavesnica, BorderLayout.CENTER);

        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(this.getComponentAt(e.getPoint()));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
