package c11.Dproxy;


public class Client {
    public static void main(String[] args) {
//        CLocalPicShow cLocalPicShow = new CLocalPicShow();
//        cLocalPicShow.showPic("我的好图片");
//
//        IShowPic cls = new CLocalPicShow();
//        cls.showPic("我的好图片");

        IShowPic isp = new CRemoPic();
        CLocalPicShow cps = new CLocalPicShow(isp);
        IShowPic localPic = (IShowPic) cps.getProxyInstance();

        localPic.showPic("我的好图片");


    }
}
