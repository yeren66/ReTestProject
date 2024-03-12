package shape;

import effect.Effect;

public class Circle extends Shape {

    public Circle(Effect effect) {
        super(effect);
    }

    @Override
    public void draw() {
        System.out.print("Circle: ");
        effect.apply();
    }
}
