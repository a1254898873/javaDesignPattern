适配器模式（Adapter Pattern）是指将一个类的接口转换成客户期望的另一个接口，使原本的接口不兼容的类可以一起工作，适配器模式属于结构型设计模式。



#### 适配器模式适用场景

1. 针对已经存在的类，它的方法和需求不匹配的情况可以通过适配器来进行转换兼容。
2. 适配器模式不是软件设计阶段考虑的设计模式，是随着软件维护，产生了许多功能类似而接口不相同情况下的一种解决方案。

#### 适配器模式优点

1. 能提高类的透明性和复用，现有的类复用且不需要改变。
2. 目标类和适配器类的解耦提高程序的扩展性。
3. 扩展功能时通过新建类来实现，不需改动源码，符合开闭原则。

#### 适配器模式缺点

1. 适配器过多时会降低代码阅读性，使得代码变得比较凌乱，难以阅读。
2. 适配器模式是通过继承来实现的，违背了合成复用原则。