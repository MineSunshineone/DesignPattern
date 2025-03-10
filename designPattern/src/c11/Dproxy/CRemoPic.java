package c11.Dproxy;

import c11.Dproxy.IShowPic;

public class CRemoPic implements IShowPic {
    private String picname;

    public CRemoPic() {
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
