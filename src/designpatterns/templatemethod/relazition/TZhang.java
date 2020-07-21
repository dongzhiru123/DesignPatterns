package designpatterns.templatemethod.relazition;

import designpatterns.templatemethod.abstractexam.Exam;

/**
 * 张老师出题考试。
 */
public class TZhang extends Exam {
    @Override
    public void settingOutQuestions() {
        System.out.println("张老师出题。");
    }

    @Override
    public void print() {
        System.out.println("张老师打印试卷。");
    }

    @Override
    public void exam() {
        System.out.println("大一同学们考试！");
    }
}
