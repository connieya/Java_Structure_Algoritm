package com.company.study.structure05_method_;


import com.company.study.structure04_2_class_object.MyRectangle;

public class MyRectangle2 {

    public MyPoint2 lu;
    public int width;
    public int height;

    public MyRectangle2(int x, int y, int width, int height) {
        this.lu = new MyPoint2(x,y);
        this.width = width;
        this.height = height;
    }

    public MyRectangle2(MyPoint2 lu, int width, int height) {
        this.lu = lu;
        this.width = width;
        this.height = height;
    }

    public  int calcArea(){

        return width * height;
    }

    @Override
    public String toString() {
        return  "lu=(" + lu.x +" ,"+ lu.y  +") width = " + width+
                ", height=" + height;
    }
}
