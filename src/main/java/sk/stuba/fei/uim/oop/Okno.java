package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;

public class Okno extends JFrame {

    public Okno() throws HeadlessException {
        super("Okno");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);

        this.add(new MojPanel());

        this.setVisible(true);
    }
}
