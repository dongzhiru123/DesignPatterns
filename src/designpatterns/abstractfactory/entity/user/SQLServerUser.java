package designpatterns.abstractfactory.entity.user;

public class SQLServerUser implements User {
    @Override
    public void insertUser() {
        System.out.println("利用 SQLServer 实现插入 user");
    }

    @Override
    public void searchUser() {
        System.out.println("利用 SQLServer 实现查询 user");
    }
}
