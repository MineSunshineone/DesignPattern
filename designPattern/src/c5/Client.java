package c5;

import c5.Config.XMLUtilPen;
import c5.Color.Color;
import c5.Pen.Pen;

public class Client {
    public static void main(String[] args) {
        Color color;
        Pen pen;

        color = (Color) XMLUtilPen.getBean("color");
        pen = (Pen) XMLUtilPen.getBean("pen");

        pen.setColor(color);
        pen.draw("鲜花");


    }
}
