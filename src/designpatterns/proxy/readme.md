该示例为代理设计模式demo
    
    1.分别实现了静态代理和动态代理，下面主要解释动态代理。
    2.首先理解一下代理是做了什么，举个例子，你想从美国买一些男性的成人用品，
    如果自己去买的话，机票，找门店，然后购买，如果现在又想买一些女性的成人
    用品，我们就需要再跑一次，如果有代购的话，我们只需告诉代购即可，其他的
    我们不管。而且代购有经验，因此他购买的会比较好，这也是AOP实现的方法，
    增强方法功能。
    3.动态代理具体实现是这样子，首先要明白JDK实现动态代理需要满足的条件，
    就是该类必须实现接口。（当然Spring中还有ASM字节码实现代理，直接操作字
    节码）JDK中有Proxy这个代理类，他为我们的类实现代理以后会返回一个代理
    对象，该对象不同于我们之前的对象，但是它继承了Proxy类，并且实现了我们
    上面所提到的接口，因此代理对象可以用Proxy来接收，或者拿接口接收，当然
    对该对象代理的时候可以增强方法，比如说在执行该方法之前做什么，之后做什
    么等等。
    4.因此总结出来俩个关键点
            （1）实现InvocationHandler接口，重写invoke方法，作为代理类
             的回调方法。
            （2）利用JDK中的Proxy类中的newProxyInstance方法得到一个代
             理类，该方法三个参数，类加载器，接口，以及回调方法也就是上面
             重写的invoke方法。（invoke方法中是利用反射去调用我们传入想
             被代理的类的对应方法）。
    5.到此我们可以去测试了。