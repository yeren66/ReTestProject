package effect;

public class ColorFill implements Effect {

    private Effect effect;

    public ColorFill(Effect effect){
        this.effect = effect;
    }

    @Override
    public void apply() {
        effect.apply();
        System.out.print("add color fill effect. ");
    }
}
