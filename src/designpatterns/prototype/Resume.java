package designpatterns.prototype;

/**
 * 简历对象
 */
public class Resume {
    private String name;
    private int age;
    private String addr;
    private String company;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Resume object = new Resume();
        object.setName(this.name);
        object.setAge(this.age);
        object.setAddr(this.addr);
        object.setCompany(this.company);
        return object;
    }
}
