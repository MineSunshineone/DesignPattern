package c10.proxy;

public class Client {
    public static void main(String[] args) {
        CLocalPicShow cLocalPicShow = new CLocalPicShow();
        cLocalPicShow.showPic("我的好图片");

        IShowPic cls = new CLocalPicShow();
        cls.showPic("我的好图片");

    }
}
