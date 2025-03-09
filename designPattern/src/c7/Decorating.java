package c7;

public class Decorating implements IBrithdayCake {
    private IBrithdayCake brithdayCake;

    public Decorating(IBrithdayCake brithdayCake) {
        this.brithdayCake = brithdayCake;
    }

    public void show() {
        brithdayCake.show();
    }

}
