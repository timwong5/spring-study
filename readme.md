# Spring5 学习 - 教程来自Qin Jiang

## 注解开发
@Autowired与@Resource异同：

1、@Autowired与@Resource都可以用来装配bean。都可以写在字段上，或写在setter方法上。

2、@Autowired默认按类型装配（属于spring规范），默认情况下必须要求依赖对象必须存在，如果要允许null 值，可以设置它的required属性为false，如：@Autowired(required=false) ，如果我们想使用名称装配可以结合@Qualifier注解进行使用

3、@Resource（属于J2EE复返），默认按照名称进行装配，名称可以通过name属性进行指定。如果没有指定name属性，当注解写在字段上时，默认取字段名进行按照名称查找，如果注解写在setter方法上默认取属性名进行装配。当找不到与名称匹配的bean时才按照类型进行装配。但是需要注意的是，如果name属性一旦指定，就只会按照名称进行装配。

它们的作用相同都是用注解方式注入对象，但执行顺序不同。@Autowired先byType，@Resource先byName。

4、@Component 组件，放在类上，说明这个类被Spring管理了,就是bean



## 衍生注解

@Component三个衍生注解 为了更好的进行分层，Spring可以使用其它三个注解，功能一样，目前使用哪一个功能都一样。

1、@Controller：web层

2、@Service：service层

3、@Repository：dao层

写上这些注解，就相当于将这个类交给Spring管理装配了！



## 静态代理

好处：

可以使得我们的真实角色更加纯粹 . 不再去关注一些公共的事情 .

公共的业务由代理来完成 . 实现了业务的分工 ,

公共业务发生扩展时变得更加集中和方便 .

缺点 :

类多了 , 多了代理类 , 工作量变大了 . 开发效率降低 .

我们想要静态代理的好处，又不想要静态代理的缺点，所以 , 就有了动态代理 !


## 动态代理

动态代理的角色和静态代理的一样 动态代理的代理类是动态生成的 静态代理的代理类是我们提前写好的

动态代理分为两类 : 一类是基于接口动态代理 , 一类是基于类的动态代理

基于接口的动态代理----JDK动态代理

基于类的动态代理--cglib

现在用的比较多的是 javasist 来生成动态代理 . 百度一下javasist

我们这里使用JDK的原生代码来实现，其余的道理都是一样的！、

JDK的动态代理需要了解两个类

核心 : InvocationHandler 和 Proxy ，打开JDK帮助文档看看 【InvocationHandler：调用处理程序】


## 动态代理的好处

静态代理有的它都有，静态代理没有的，它也有！

可以使得我们的真实角色更加纯粹 . 不再去关注一些公共的事情 .

公共的业务由代理来完成 . 实现了业务的分工 ,

公共业务发生扩展时变得更加集中和方便 .

一个动态代理 , 一般代理某一类业务

一个动态代理可以代理多个类 , 只要是实现的同一个接口，即代理的是接口！