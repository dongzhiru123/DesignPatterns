package designpatterns.decorate.decorator;

public class ConcreteDecorator {
    //TShirts 装饰
    public class TShirts extends Decorator {
        @Override
        public void show() {
            System.out.print("TShirts ");
            super.show();
        }
    }

    //牛仔裤
    public class Jeans extends Decorator {
        @Override
        public void show() {
            System.out.print("牛仔裤 ");
            super.show();
        }
    }

    //小背心
    public class Vest extends Decorator {
        @Override
        public void show() {
            System.out.print("小背心 ");
            super.show();
        }
    }
}
