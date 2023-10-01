package Java_OOP.HW_2;

public class Main {
    public static void main(String[] args) {
        Participants[] participants = {
                new Human(1500, 330),
                new Cat(800, 150),
                new Robot(2300, 80),
        };

        Obstacles[] obstacles = {
                new Wall(70),
                new Treadmill(1200),
                new Wall(150),
                new Treadmill(1400)
        };

        for (Participants participant : participants) {
            for (Obstacles obstacle : obstacles) {
                obstacle.cross(participant);
            }
        }
    }
}
