package sample.ut;

import java.util.Scanner;

/**
 * @description:该类的功能是根据体重和身高判断所属健康分类
 * @Author :user
 * @date :2019/12/2 8:40
 */
public class BMI {
    // 定义属性
    private double weight;//体重
    private double height;//身高

    // Getter和Setter
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // 一次性设置体重和身高
    public void setParams(double w, double h){
        this.weight = w;
        this.height = h;
    }

    // 定义构造
    public BMI(double w, double h){
        this.weight = w;
        this.height = h;
    }

    public BMI(){
        this.weight = 0.0;
        this.height = 0.0;
    }

    // 定义功能方法：计算BMI，并判断所属分类
    public String getBMIType(){
        //1.初始化
        String result = "";
        double bmi = 0.0;
        // 如果体重和身高有效，则继续
        if(weight>0 && height>0){
            //2.计算BMI
            bmi = weight / (height*height);

            //3.判断所属分类
            if(bmi<18.5){
                result = "偏瘦";
            }else if(bmi<24){
                result = "正常";
            }else if(bmi<28){
                result = "偏胖";
            }else{
                result = "肥胖";
            }
        }else{
            result = "体重和身高数据错误";
        }

        //4.返回分类
        return result;
    }
//
//    public static void main(String[] args){
//        // 方案2：通过main函数，由脚本自行设置体重和身高
//        // 创建被测对象，调用被测方法，并自行校验结果，判断测试结果，缺陷输出到屏幕
//        //1.创建被测对象，设置体重和身高
//        BMI test = new BMI(45.0, 1.6);
//
//        //2.调用被测方法
//        String result = test.getBMIType();
//
//        //3.校验结果，判断测试结果
//        String expect = "偏瘦";
//        String output = "";
//        if(expect==result){
//            output += "PASS.";
//        }else{
//            output += "FAIL. 体重：45.0，身高：1.6，预期：" + expect
//            + "，实际返回：" + result;
//        }
//
//        //4.如有缺陷，输出到屏幕
//        System.out.println(output);
//        test = null;
//
//        // 测试用例2:55.0,1.6
//        test = new BMI(55.0, 1.6);
//        result = test.getBMIType();
//        expect = "正常";
//        output = "";
//        if(expect == result){
//            output += "PASS.";
//        }else{
//            output += "FAIL. 体重：55.0，身高：1.6，预期：" + expect
//                    + "，实际返回：" + result;
//        }
//        System.out.println(output);
//        test = null;
//
//        // 测试用例3：68.0, 1.6
//        test = new BMI(68.0, 1.6);
//        result = test.getBMIType();
//        expect = "偏胖";
//        output = "";
//        if(expect == result){
//            output += "PASS.";
//        }else{
//            output += "FAIL. 体重：55.0，身高：1.6，预期：" + expect
//                    + "，实际返回：" + result;
//        }
//        System.out.println(output);
//        test = null;
//
//        // 测试用例4：80.0,1.6
//        test = new BMI(80.0, 1.6);
//        result = test.getBMIType();
//        expect = "肥胖";
//        output = "";
//        if(expect == result){
//            output += "PASS.";
//        }else{
//            output += "FAIL. 体重：55.0，身高：1.6，预期：" + expect
//                    + "，实际返回：" + result;
//        }
//        System.out.println(output);
//        test = null;
//
//
//
//
////        // 方案1：通过main函数，从外部输入体重和身高，创建被测对象，调用被测方法，结果输出到屏幕
////        //1.输入体重和身高
////        Scanner sc = new Scanner(System.in);
////        double w = 0.0;
////        double h = 0.0;
////        System.out.println("请输入体重和身高，以等号结束：");
////        while (sc.hasNextDouble()){
////            w = sc.nextDouble();
////            h = sc.nextDouble();
////        }
////
////        //2.创建被测对象
////        BMI test = new BMI(w, h);
////
////        //3.调用被测方法
////        String result = test.getBMIType();
////
////        //4.结果输出到屏幕
////        System.out.println(result);
//    }


}

