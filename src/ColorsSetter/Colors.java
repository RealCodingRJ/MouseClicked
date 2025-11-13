package ColorsSetter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Colors {

    private static int colorR;
    private static int colorG;
    private static int colorB;

    public static int getRandomColor(int r, int b) {
        return new Random().nextInt(r, b);
    }

    public static List<String> getColor(int colorR, int colorG, int colorB) {
        Colors.colorR = colorR;
        Colors.colorG = colorG;
        Colors.colorB = colorB;

        List<String> color = new ArrayList<>();
        color.add(String.valueOf(colorR));
        color.add(String.valueOf(colorG));
        color.add(String.valueOf(colorB));


        return color;


    };

}
