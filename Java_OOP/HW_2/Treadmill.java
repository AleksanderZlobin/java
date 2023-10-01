package Java_OOP.HW_2;

public class Treadmill implements Obstacles {

    private final int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public void cross(Participants participant) {
        participant.run(length);
    }
}
