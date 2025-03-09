package c8;

public class Light {
    private String position;

    public Light(String position) {
        this.position = position;
    }

    public void on() {
        System.out.println("开灯");
    }

    public void off() {
        System.out.println("关灯");
    }
}
