//LivingRoomLight class

package TEST_1;

public class LivingRoomLight implements Light {
    private int brightness = 0;

    @Override
    public void on() {
        brightness = 100;
        System.out.println("Living Room Light is ON at full brightness.");
    }

    @Override
    public void off() {
        brightness = 0;
        System.out.println("Living Room Light is OFF.");
    }

    @Override
    public void dim(int level) {
        brightness = level;
        System.out.println("Living Room Light  dimmed to " + brightness + "%.");
    }

    public int getBrightness() {
        return brightness;
    }
}
