//LightDimCommand class
package TEST_1;

public class LightDimCommand implements Command {
    private final Light light;
    private int previousLevel;
    private final int newLevel;

    public LightDimCommand(Light light, int level) {
        this.light = light;
        this.newLevel = level;
    }

    @Override
    public void execute() {
        previousLevel = light.getBrightness();
        light.dim(newLevel);
    }

    @Override
    public void undo() {
        light.dim(previousLevel);
    }
}
