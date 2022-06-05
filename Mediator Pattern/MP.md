中介者模式（Mediator Pattern）又称为调节者模式或者调停者模式，是用来降低多个对象和类之间的通信复杂性。中介者模式中用一个中介对象封装一系列的对象交互，从而使各个对象不需要显示的相互作用，达到松耦合的目的。这样如果某些对象之间的作用发生改变时，不会立刻影响其它的一些对象之间的作用，保证了对象之间的相互作用可以独立的变化。

中介者模式属于行为型模式，其核心思想是通过中介者对象解耦各层次对象的直接耦合，层次对象的对外依赖通信全部交由中介者转发。



#### 中介者模式适用场景

中介者模式在我们日常生活中非常常见，比如租房中介、买房中介等，还有像我们的群聊、聊天室等等都有中介者的身影。中介者模式主要适用于以下场景：

1. 系统中的对象存在非常复杂的引用关系，而且相互依赖，导致依赖关系非常复杂时。
2. 当我们想要使用多个类之间的行为时，为了避免过多的使用继承，可以考虑使用中介者来实现。

#### 中介者模式优点

1. 减少了类之间的相互依赖性，将多对多依赖转化成为了一对多依赖，降低了类间的耦合。
2. 使用了中介者模式之后，各个类都各司其职，符合了迪米特法则。

#### 中介者模式缺点

中介者模式各个对象之间也称之为同事对象，而当我们的同事角色非常多的时候，中介者对象需要维护非常多的同事角色对象，会使得中介者变得非常庞大，导致难以维护。