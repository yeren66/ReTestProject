package effect;

public class TextureFill implements Effect {

    private Effect effect;

    public TextureFill(Effect effect){
        this.effect = effect;
    }

    @Override
    public void apply() {
        effect.apply();
        System.out.println("add texture fill effect. ");
    }
}
