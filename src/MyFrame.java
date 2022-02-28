import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {
    JLabel label;
    ImageIcon smile;
    ImageIcon nervous;
    ImageIcon pain;
    ImageIcon dizzy;

    MyFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
        label = new JLabel();
        smile = new ImageIcon();
        nervous = new ImageIcon();
        pain = new ImageIcon();
        dizzy = new ImageIcon();

        label.setIcon(smile);
        label.addMouseListener(this);

        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("mouse clicked yellow");
        label.setBackground(Color.yellow);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("mouse pressed red");
        label.setBackground(Color.red);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("mouse released blue");
        label.setBackground(Color.blue);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("mouse Entered black");
        label.setBackground(Color.black);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("mouse Exited orange");
        label.setBackground(Color.orange);
    }
}
