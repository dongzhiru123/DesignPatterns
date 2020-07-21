package designpatterns.templatemethod.abstractexam;

/**
 * 完成考试抽象类。
 */
public abstract class Exam {
    public abstract void settingOutQuestions();
    public abstract void print();
    public abstract void exam();

    public void test() {
        settingOutQuestions();
        print();
        exam();
    }
}
