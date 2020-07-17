该实例为装饰模式的demo ：
    
    1、具体是为一个人进行修饰，主要是为其穿衣
    2. 首先来理清楚什么是装饰者，装饰者就是比如说我们有一个人，要为其进行外观修饰，
    如果按照一般设计的方法可能是依次将需要装饰的东西注入给人，比如说注入属性领带，
    七分裤，豆豆鞋等
    3. 显然上面的设计违反了面向对象设计原则，首先我们扩展是极其不便的，比如说再加入
    一个T恤，我们就需要新set一遍属性，如果俩件T恤呢？？？
    4. 因此装饰模式就来了，它做了什么呢？
        （1） 比如说我们给一个人戴领带，我们只需把该人对象传入装饰类，然后装饰类
         仅仅关注自己装饰的内容，装饰完以后调用该对象原本操作即可。
        （2） 这样设计如果我们需要戴俩条领带，我们仅仅需要再将上一次返回的对象放
         入该装饰类即可。
    5. 具体是实现是这样，因为现在我们是为一个人装饰，因此我们可以抽象出来一个Person
    类（包含属性 ：名字，还有一个方法就是展示装扮show）作为所有的类的父类（包括
    装饰者），装饰类作为所有服饰类的父类，自己重写show这个方法（因为这个show是Person
    的方法），因此这种包装就类似于一层一层的包装，从外向内调用show方法时，每次都
    先把自己装饰的内容装饰好，以后去调用传入对象的装饰方法，然后传入对象的装饰方
    法里面又调用了其他的类的装饰方法，因为当前这个类对之前传入该类的对象进行了包装。
    