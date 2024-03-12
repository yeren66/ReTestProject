package shape;

import effect.Effect;

public abstract class Shape {
    protected Effect effect;

    public Shape(Effect effect) {
        this.effect = effect;
    }

    public abstract void draw();
}
