package designpatterns.prototype;

/**
 * 测试主函数
 */
public class TestMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume resume = new Resume();
        resume.setName("张三");
        resume.setAge(19);
        resume.setAddr("内蒙古");
        resume.setCompany("家里蹲");

        Resume resume1 = (Resume) resume.clone();
        resume1.setName("李四");
        Resume resume2 = (Resume) resume.clone();
        resume2.setName("王五");

        System.out.println("resume 名字为" + resume.getName());
        System.out.println("resume1 名字为" + resume1.getName());
        System.out.println("resume2 名字为" + resume2.getName());
    }
}
