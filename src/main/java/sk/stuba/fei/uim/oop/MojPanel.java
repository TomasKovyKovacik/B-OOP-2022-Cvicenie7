package sk.stuba.fei.uim.oop;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class MojPanel extends JPanel {

    private BufferedImage pic;

    public MojPanel() {
        try {
            pic = ImageIO.read(MojPanel.class.getResourceAsStream("/logo.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        JLabel picLabel = new JLabel(new ImageIcon(pic));
        this.add(picLabel);
        this.setBackground(Color.YELLOW);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
//        g.drawImage(pic, 0, 0, this);
    }
}
