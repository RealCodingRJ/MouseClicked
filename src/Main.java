import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static ColorsSetter.Colors.getRandomColor;

static class Window extends JFrame {

    public Window(){

        super("Color Mouse Selector");

        JLabel labelR = new JLabel();
        JLabel labelG = new JLabel();
        JLabel labelB = new JLabel();

        getContentPane().setLayout(new FlowLayout());

        getContentPane().add(labelR);
        getContentPane().add(labelG);
        getContentPane().add(labelB);

        getContentPane().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                int colorsR = getRandomColor(1, 255);
                int colorsG = getRandomColor(5, 255);
                int colorsB = getRandomColor(9, 255);

                labelR.setText("R: " + colorsR);
                labelG.setText("G: " + colorsG);
                labelB.setText("B: " + colorsB);

                getContentPane().setBackground(new java.awt.Color(colorsR, colorsG, colorsB));
                super.mouseClicked(e);
                new ColorFacedFile(colorsR, colorsG, colorsB);
            }
        });

        setSize(300, 600);

    }
}

void main() {

    Window win = new Window();
    win.setVisible(true);

}