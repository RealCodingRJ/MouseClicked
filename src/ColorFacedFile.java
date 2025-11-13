import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ColorFacedFile {

    public ColorFacedFile(int colorR, int colorG, int colorB) {

        try (FileWriter file = new FileWriter("color.col.saved")) {

            String color1 =String.valueOf(colorR);
            String color2 =String.valueOf(colorG);
            String color3 =String.valueOf(colorB);

            file.write(" R: " + color1);
            file.write(" G: " + color2);
            file.write(" B: " + color3);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
