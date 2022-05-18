package demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理的实现
 */
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private Rent rent;

    //set方法 重要 将通过调用程序处理角色来处理我们要调用的接口对象
    public void setRent(Rent rent) {
        this.rent = rent;
    }


    //生成得到代理类
    public Object getProxy(){
        //this	指代当前对象的引用
        //类名.this	内部(可以是匿名内部类)类调用外部类的对象时使用，
        // 即在内部类中使用时：外部类对象是外部类名.this，内部类对象则是this
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                rent.getClass().getInterfaces(),
                ProxyInvocationHandler.this);
    }

    //处理调用实例并返回结果 划重点 处理调用实例 这个类只是一个处理类 并不是Proxy类
    //在调用Proxy类之前实现处理调用实例返回结果 所以会先输出底下的seeHouse这些
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //动态代理的本质，就是使用反射机制
        //反射 method对象执行invoke 对象是rent 参数args 返回最后的结果

        seeHouse();

        fare();

        Object result = method.invoke(rent, args);


        return result;
    }


    public void seeHouse() {
        System.out.println("中介带看房子");
    }

    public void fare() {
        System.out.println("收中介费");
    }
}
