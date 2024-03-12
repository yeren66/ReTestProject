import effect.BasicEffect;
import effect.Effect;
import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import effect.ColorFill;
import effect.TextureFill;

public class Main {
    public static void main(String[] args) {
        Effect colorfill = new ColorFill(new BasicEffect());
        Shape circleWithColor = new Circle(colorfill);
        circleWithColor.draw();

        System.out.println();
        Effect mixfill = new TextureFill(colorfill);
        Shape rectangleWithTexture = new Rectangle(mixfill);
        rectangleWithTexture.draw();
    }
}
