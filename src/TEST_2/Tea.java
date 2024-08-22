package TEST_2;

public class Tea extends Beverages {
    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    public void addExtras() {
        System.out.println("Adding honey");
    }
}
