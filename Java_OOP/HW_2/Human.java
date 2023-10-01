package Java_OOP.HW_2;

public class Human implements Participants {
    private final int maxLength;
    private final int maxHeight;
    boolean isActive;

    public Human(int maxLength, int maxHeight) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
        this.isActive = true;
    }

    @Override
    public void run(int length) {
        if (isActive) {
            System.out.printf("Человек %s пробежал дорожку длиною %d\n", maxLength < length ? "не" : "", length);
        }
        if (maxLength < length)
            isActive = false;
    }

    @Override
    public void jump(int height) {
        if (isActive) {
            System.out.printf("Человек %s перепрыгнул стену высотой %d\n", maxHeight < height ? "не" : "", height);
        }
        if (maxHeight < height)
            isActive = false;
    }
}
