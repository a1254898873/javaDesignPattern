装饰者模式（Decorator Pattern）是指在不改变原有对象的基础之上，将功能附加到对象上，提供了比继承更有弹性的替代方案来扩展原有对象的功能，装饰者模式属于结构型模式。



#### 装饰者模式适用场景

1. 装饰者模式能将代理对象与真实被调用的目标对象分离，降低了系统的耦合度，所以扩展性比较好。
2. 动态的给一个对象添加功能时非常方便，而且还支持随时撤销这些添加的功能。

#### 装饰器模式优点

1. 装饰者比继承更加灵活，可以在不改变原有对象的情况下动态地给一个对象扩展功能，即插即用。
2. 通过使用不同装饰类以及这些装饰类的排列组合，可以实现不同效果。
3. 新增装饰者模式时，只需要新增对应的装饰者类，无需修改源码，符合开闭原则。

#### 装饰器模式缺点

1. 当装饰者非常多的时候，会引起类膨胀，使得系统更加复杂难以维护。