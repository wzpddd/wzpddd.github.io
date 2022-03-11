package com.wzp.static_.StaticMethod;

public class StaticMethod {
    public static void main(String[] args) {
        Stu tom = new Stu("tom");
        tom.payFee(100);

        Stu mary = new Stu("mary");
        mary.payFee(200);

        //输出当前收到的总学费
        Stu.showFee();

        System.out.println(Mytools.calSum(10, 30));

    }
}

class Stu {
    private String name;//普通成员
    //定义一个静态变量，来累计学生的学费
    private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }

    //1、当方法使用了static修饰后，该方法就是静态方法
    //2、静态方法就可以访问静态属性/变量
    public static void payFee(double fee) {
        Stu.fee += fee;//累加
    }

    public static void showFee() {
        System.out.println("总学费有：" + Stu.fee);
    }
}


//开发自己的工具类，可以将方法做成静态的，方便调用
class Mytools {
    //求出两个数的和
    public static double calSum(double n1, double n2) {
        return n1 + n2;
    }
}