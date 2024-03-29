工厂方法模式：`Fatory Method Pattern`，主要用来解决简单工厂模式存在的问题。其是指定义一个创建对象的接口，然后创建不同的具体工厂来创建对应的产品。工厂方法让类的实例化推迟到工厂子类中进行，在工厂方法模式中用户只需要关心所需产品对应的工厂，无须关心创建细节。

工厂方法模式中假如需要新增产品，只需要再新建工厂实现类，无需修改源码，符合开闭原则。

#### 工厂方法模式的适用场景

工厂方法模式主要适用于以下场景：

- 创建对象需要大量重复的代码。
- 客户端（应用层）不依赖于产品类实例如何被创建、实现等细节。
- 一个类通过其子类来指定创建哪个对象。

#### 工厂方法模式的缺点

工厂方法模式的缺点也是很明显的，每新增一个产品就需要新增两个类，一旦产品数量上来了，类的个数也会过多，就会增加了系统的复杂度，也使得系统更加抽象难以理解。