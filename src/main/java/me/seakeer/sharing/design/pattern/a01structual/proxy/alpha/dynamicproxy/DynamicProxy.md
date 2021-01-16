代理模式

- 通过代理对象来间接访问无法直接访问或直接访问有困难的对象
- CGLIB

```txt
- 底层基于ASM(字节码处理框架)，直接操作字节码，效率比JDK(反射)高
- 原理：动态生成被代理类(真实主题类RealSubject)的子类，重写其所有非final方法，拦截父类方法，织入横切逻辑，从而实现代理；因此，不可以代理final类和final方法
```

- JDK Proxy --- 关联，可代理final类和方法；反射，效率较低；只能代理实现接口ISubject的实现类RealSubject
- CGLIB Proxy --- 继承，不可代理final类和方法；ASM字节码，效率较高；可以不需要IASubject