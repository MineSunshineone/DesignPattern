package c10.proxy;

public class CLocalPicShow implements IShowPic, Runnable {
    private String picname;
    private IShowPic pic;

    @Override
    public void showPic(String picname) {

        pic = new CRemoPic(picname);
        this.picname = picname;
        System.out.println("图片" + picname + "正在显示");

        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        pic.showPic(picname);
        System.out.println("图片" + picname + "已经显示");
    }
}
