import edu.princeton.cs.introcs.Picture;
import java.awt.*;

public class ImageEditor1 {

    public static double luminance(Color color) {

        return (0.299 * color.getRed()) + (0.587 * color.getGreen()) + (0.114 * color.getBlue());

    }

    public static Color toGrey(Color color) {

        int intLum = (int) luminance(color);

        return new Color(intLum,intLum,intLum);

    }

    public static Picture makeGreyscale(Picture pic) {

        for (int i = 0; i < pic.width(); i++){
            for (int j = 0; j < pic.height(); j++){
                pic.set(i,j,toGrey(pic.get(i, j)));
            }
        }
        return pic;

    }

    public static void main(String[] args){
        Picture p = new Picture("doncheadle.jpg"); // or use any other colour image
        Picture greyscale = makeGreyscale(p);
        greyscale.show();
    }

}
