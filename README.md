# sharing-design-pattern

**项目简介**

该项目使用Java语言描述了24种设计模式的示例以及各个设计模式在JDK中的应用实例。示例简单易懂，注释比较详细，结合这份文档: [设计模式相关知识整理文档](./Doc/DesignPatternSharingDoc.md)
，相信你会对设计模式有一个深刻的认识。

**约定说明**

在描述某个设计模式的各个角色时， 使用前缀 `I` 表示该角色一般设计为接口，`A `表示该角色一般设计为抽象类，`IA `表示该角色一般设计为接口或抽象类，`IAC`
则表示该角色可以设计为接口、抽象类或者普通类；不带前缀表示该角色一般设计为普通类。如下表所示：

| 前缀 | 示例       | 含义                                     |
| :--- | ---------- | ---------------------------------------- |
| 缺省 | Product    | 产品角色一般设计为普通类                 |
| I    | IProduct   | 产品角色一般设计为接口                   |
| A    | AProduct   | 产品角色一般设计为抽象类                 |
| IA   | IAProduct  | 产品角色一般设计为接口或者抽象类         |
| IAC  | IACProduct | 产品角色可以设计为接口、抽象类或者普通类 |

**INTRODUCTION**

This project shows some examples of the 24 design patterns with Java, and the instances of design patterns in JDK. Those
examples are very easy to understand and you can also refer to [the document](./Doc/DesignPatternSharingDoc.md).

**CONVENTION**

I use those prefixes --- `I, A, IA, IAC` to indicate what kind of class the roles of a pattern should be designed as.
The details are shown in the table below.

| PREFIX | EXAMPLE    | IMLICATION                                                   |
| :----- | ---------- | ------------------------------------------------------------ |
| NON    | Product    | The role `Product` is generally designed as `class`.         |
| I      | IProduct   | The role `Product` is generally designed as `interface`.     |
| A      | AProduct   | The role `Product` is generally designed as `abstract class`. |
| IA     | IAProduct  | The role `Product` is generally designed as `interface` or `abstract class`. |
| IAC    | IACProduct | The role `Product` can be designed as `interface` 、 `abstract class` or `class`. |
