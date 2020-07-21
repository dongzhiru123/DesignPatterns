package designpatterns.templatemethod.relazition;

import designpatterns.templatemethod.abstractexam.Exam;

/**
 * 马老师出题考试。
 */
public class TMa extends Exam {
    @Override
    public void settingOutQuestions() {
        System.out.println("马老师出题。");
    }

    @Override
    public void print() {
        System.out.println("马老师打印试卷。");
    }

    @Override
    public void exam() {
        System.out.println("小学生考试！");
    }
}
