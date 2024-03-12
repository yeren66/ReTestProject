package shape;

import effect.Effect;

public class Rectangle extends Shape {

    public Rectangle(Effect effect) {
        super(effect);
    }

    @Override
    public void draw() {
        System.out.print("Rectangle: ");
        effect.apply();
    }
}
