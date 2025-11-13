import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static ColorsSetter.Colors.getRandomColor;

static class Window extends JFrame {

    public Window(){

        super("Color Mouse Selector");

        getContentPane().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                int colorsR = getRandomColor(1, 255);
                int colorsG = getRandomColor(5, 255);
                int colorsB = getRandomColor(9, 255);

                getContentPane().setBackground(new java.awt.Color(colorsR, colorsG, colorsB));
                super.mouseClicked(e);
            }
        });

        setSize(300, 600);

    }
}

void main() {

    Window win = new Window();
    win.setVisible(true);

}