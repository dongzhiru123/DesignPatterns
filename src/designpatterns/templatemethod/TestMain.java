package designpatterns.templatemethod;

import designpatterns.templatemethod.abstractexam.Exam;
import designpatterns.templatemethod.relazition.TMa;
import designpatterns.templatemethod.relazition.TZhang;

/**
 * 测试主方法。
 */
public class TestMain {
    public static void main(String[] args) {
        Exam exam;

        exam = new TZhang();
        exam.test();
        System.out.println();
        exam = new TMa();
        exam.test();
    }
}
