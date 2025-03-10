package c10.proxy;

public class CRemoPic implements IShowPic {
    private String picname;

    public CRemoPic(String picname) {
        this.picname = picname;
        this.loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading " + picname);
    }

    @Override
    public void showPic(String picname) {
        for (int i = 0; i < 3; i++) {
            System.out.println(i+1);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
