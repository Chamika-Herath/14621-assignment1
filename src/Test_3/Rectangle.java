package Test_3;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        int width = 8;
        int height = 5;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
