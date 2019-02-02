##状态模式允许对象在内部状态改变时改变他的行为，对象看起来好像改变了它的类

**在状态模式（State Pattern）中，类的行为是基于它的状态改变的。这种类型的设计模式属于行为型模式。**  
**在状态模式中，我们创建表示各种状态的对象和一个行为随着状态对象改变而改变的 context 对象。**

### 简介
####意图：
    允许对象在内部状态发生改变时改变它的行为，对象看起来好像修改了它的类。
####主要解决：
    对象的行为依赖于它的状态（属性），并且可以根据它的状态改变而改变它的相关行为。
####何时使用：
    1、代码中包含大量与对象状态有关的条件语句。
####如何解决：
    将各种具体的状态类抽象出来。
####优点： 
    1、封装了转换规则。 
    2、枚举可能的状态，在枚举状态之前需要确定状态种类。 
    3、将所有与某个状态有关的行为放到一个类中，并且可以方便地增加新的状态，只需要改变对象状态即可改变对象的行为。 
    4、允许状态转换逻辑与状态对象合成一体，而不是某一个巨大的条件语句块。 
    5、可以让多个环境对象共享一个状态对象，从而减少系统中对象的个数。
####缺点： 
    1、状态模式的使用必然会增加系统类和对象的个数。 
    2、状态模式的结构与实现都较为复杂，如果使用不当将导致程序结构和代码的混乱。 
    3、状态模式对"开闭原则"的支持并不太好，对于可以切换状态的状态模式，增加新的状态类需要修改那些负责状态转换的源代码，否则无法切换到新增状态，而且修改某个状态类的行为也需修改对应类的源代码。
####使用场景： 
    1、行为随状态改变而改变的场景。 
    2、条件、分支语句的代替者。
### 示例中的关系图
![示例中关系图](状态模式.png)
###参考地址
http://www.runoob.com/design-pattern/state-pattern.html
####其他
    状态模式: 封装基于状态的行为，并将行为委托到当前状态
    策略模式: 将可以互换的行为封装起来，然后使用委托的方法，决定使用哪一个行为
    模板方法: 由子类决定如何实现算法中的某些步骤