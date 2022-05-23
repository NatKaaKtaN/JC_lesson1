package lesson1;

public class Animal implements Competitor{
    protected String type;
    protected String name;
    int maxSwimDistance;
    boolean onDistance;


    public Animal(String type, String name, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }
    public void swim(int dist) {
        if (dist <= maxSwimDistance) {
            System.out.println(type + " " + name + " успешно проплыл");
        } else {
            System.out.println(type + " " + name + " не проплыл");
            onDistance = false;
        }
    }
    public boolean isOnDistance() {
        return onDistance;
    }

    public void info() {
        System.out.println(type + " " + name + " " + onDistance);
    }



}

