package Java_OOP.HW_2;

public class Wall implements Obstacles {

    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void cross(Participants participant) {
        participant.jump(height);
    }
}
