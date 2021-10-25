package com.example.cglibtest;

import java.lang.reflect.Method;
import org.springframework.cglib.core.ReflectUtils;
import org.springframework.cglib.core.Signature;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Factory;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class UserDao$$EnhancerByCGLIB$$27cf2f3e implements UserDao, Factory {
    private boolean CGLIB$BOUND;
    public static Object CGLIB$FACTORY_DATA;
    private static  ThreadLocal CGLIB$THREAD_CALLBACKS;
    private static  Callback[] CGLIB$STATIC_CALLBACKS;
    private MethodInterceptor CGLIB$CALLBACK_0;
    private static Object CGLIB$CALLBACK_FILTER;
    private static  Method CGLIB$equals$0$Method;
    private static  MethodProxy CGLIB$equals$0$Proxy;
    private static  Object[] CGLIB$emptyArgs;
    private static  Method CGLIB$toString$1$Method;
    private static  MethodProxy CGLIB$toString$1$Proxy;
    private static  Method CGLIB$hashCode$2$Method;
    private static  MethodProxy CGLIB$hashCode$2$Proxy;
    private static  Method CGLIB$clone$3$Method;
    private static  MethodProxy CGLIB$clone$3$Proxy;
    private static  Method CGLIB$updateName$4$Method;
    private static  MethodProxy CGLIB$updateName$4$Proxy;

    static void CGLIB$STATICHOOK1() throws ClassNotFoundException {
        CGLIB$THREAD_CALLBACKS = new ThreadLocal();
        CGLIB$emptyArgs = new Object[0];
        Class var0 = Class.forName("com.example.cglibtest.UserDao$$EnhancerByCGLIB$$27cf2f3e");
        Class var1;
        Method[] var10000 = ReflectUtils.findMethods(new String[]{"equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "clone", "()Ljava/lang/Object;"}, (var1 = Class.forName("java.lang.Object")).getDeclaredMethods());
        CGLIB$equals$0$Method = var10000[0];
        CGLIB$equals$0$Proxy = MethodProxy.create(var1, var0, "(Ljava/lang/Object;)Z", "equals", "CGLIB$equals$0");
        CGLIB$toString$1$Method = var10000[1];
        CGLIB$toString$1$Proxy = MethodProxy.create(var1, var0, "()Ljava/lang/String;", "toString", "CGLIB$toString$1");
        CGLIB$hashCode$2$Method = var10000[2];
        CGLIB$hashCode$2$Proxy = MethodProxy.create(var1, var0, "()I", "hashCode", "CGLIB$hashCode$2");
        CGLIB$clone$3$Method = var10000[3];
        CGLIB$clone$3$Proxy = MethodProxy.create(var1, var0, "()Ljava/lang/Object;", "clone", "CGLIB$clone$3");
        CGLIB$updateName$4$Method = ReflectUtils.findMethods(new String[]{"updateName", "()V"}, (var1 = Class.forName("com.example.cglibtest.UserDao")).getDeclaredMethods())[0];
        CGLIB$updateName$4$Proxy = MethodProxy.create(var1, var0, "()V", "updateName", "CGLIB$updateName$4");
    }

    final boolean CGLIB$equals$0(Object var1) {
        return super.equals(var1);
    }

    public final boolean equals(Object var1) {
        MethodInterceptor var10000 = this.CGLIB$CALLBACK_0;
        if (var10000 == null) {
            CGLIB$BIND_CALLBACKS(this);
            var10000 = this.CGLIB$CALLBACK_0;
        }

        if (var10000 != null) {
            Object var2 = null;
            try {
                var2 = var10000.intercept(this, CGLIB$equals$0$Method, new Object[]{var1}, CGLIB$equals$0$Proxy);
            } catch (Throwable e) {
                e.printStackTrace();
            }
            return var2 == null ? false : (Boolean)var2;
        } else {
            return super.equals(var1);
        }
    }

    final String CGLIB$toString$1() {
        return super.toString();
    }

    final int CGLIB$hashCode$2() {
        return super.hashCode();
    }

    public final int hashCode() {
        MethodInterceptor var10000 = this.CGLIB$CALLBACK_0;
        if (var10000 == null) {
            CGLIB$BIND_CALLBACKS(this);
            var10000 = this.CGLIB$CALLBACK_0;
        }

        if (var10000 != null) {
            Object var1 = null;
            try {
                var1 = var10000.intercept(this, CGLIB$hashCode$2$Method, CGLIB$emptyArgs, CGLIB$hashCode$2$Proxy);
            } catch (Throwable e) {
                e.printStackTrace();
            }
            return var1 == null ? 0 : ((Number)var1).intValue();
        } else {
            return super.hashCode();
        }
    }

    final Object CGLIB$clone$3() throws CloneNotSupportedException {
        return super.clone();
    }


    public static MethodProxy CGLIB$findMethodProxy(Signature var0) {
        String var10000 = var0.toString();
        switch(var10000.hashCode()) {
            case -508378822:
                if (var10000.equals("clone()Ljava/lang/Object;")) {
                    return CGLIB$clone$3$Proxy;
                }
                break;
            case 225946625:
                if (var10000.equals("updateName()V")) {
                    return CGLIB$updateName$4$Proxy;
                }
                break;
            case 1826985398:
                if (var10000.equals("equals(Ljava/lang/Object;)Z")) {
                    return CGLIB$equals$0$Proxy;
                }
                break;
            case 1913648695:
                if (var10000.equals("toString()Ljava/lang/String;")) {
                    return CGLIB$toString$1$Proxy;
                }
                break;
            case 1984935277:
                if (var10000.equals("hashCode()I")) {
                    return CGLIB$hashCode$2$Proxy;
                }
        }

        return null;
    }

    public UserDao$$EnhancerByCGLIB$$27cf2f3e() {
        CGLIB$BIND_CALLBACKS(this);
    }

    public static void CGLIB$SET_THREAD_CALLBACKS(Callback[] var0) {
        CGLIB$THREAD_CALLBACKS.set(var0);
    }

    public static void CGLIB$SET_STATIC_CALLBACKS(Callback[] var0) {
        CGLIB$STATIC_CALLBACKS = var0;
    }

    private static final void CGLIB$BIND_CALLBACKS(Object var0) {
        UserDao$$EnhancerByCGLIB$$27cf2f3e var1 = (UserDao$$EnhancerByCGLIB$$27cf2f3e)var0;
        if (!var1.CGLIB$BOUND) {
            var1.CGLIB$BOUND = true;
            Object var10000 = CGLIB$THREAD_CALLBACKS.get();
            if (var10000 == null) {
                var10000 = CGLIB$STATIC_CALLBACKS;
                if (var10000 == null) {
                    return;
                }
            }

            var1.CGLIB$CALLBACK_0 = (MethodInterceptor)((Callback[])var10000)[0];
        }

    }

    public Object newInstance(Callback[] var1) {
        CGLIB$SET_THREAD_CALLBACKS(var1);
        UserDao$$EnhancerByCGLIB$$27cf2f3e var10000 = new UserDao$$EnhancerByCGLIB$$27cf2f3e();
        CGLIB$SET_THREAD_CALLBACKS((Callback[])null);
        return var10000;
    }

    public Object newInstance(Callback var1) {
        CGLIB$SET_THREAD_CALLBACKS(new Callback[]{var1});
        UserDao$$EnhancerByCGLIB$$27cf2f3e var10000 = new UserDao$$EnhancerByCGLIB$$27cf2f3e();
        CGLIB$SET_THREAD_CALLBACKS((Callback[])null);
        return var10000;
    }

    public Object newInstance(Class[] var1, Object[] var2, Callback[] var3) {
        CGLIB$SET_THREAD_CALLBACKS(var3);
        UserDao$$EnhancerByCGLIB$$27cf2f3e var10000 = new UserDao$$EnhancerByCGLIB$$27cf2f3e();
        switch(var1.length) {
            case 0:
//                var10000.<init>();
                CGLIB$SET_THREAD_CALLBACKS((Callback[])null);
                return var10000;
            default:
                throw new IllegalArgumentException("Constructor not found");
        }
    }

    public Callback getCallback(int var1) {
        CGLIB$BIND_CALLBACKS(this);
        MethodInterceptor var10000;
        switch(var1) {
            case 0:
                var10000 = this.CGLIB$CALLBACK_0;
                break;
            default:
                var10000 = null;
        }

        return var10000;
    }

    public void setCallback(int var1, Callback var2) {
        switch(var1) {
            case 0:
                this.CGLIB$CALLBACK_0 = (MethodInterceptor)var2;
            default:
        }
    }

    public Callback[] getCallbacks() {
        CGLIB$BIND_CALLBACKS(this);
        return new Callback[]{this.CGLIB$CALLBACK_0};
    }

    public void setCallbacks(Callback[] var1) {
        this.CGLIB$CALLBACK_0 = (MethodInterceptor)var1[0];
    }

    static {
        try {
            CGLIB$STATICHOOK1();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateName() throws Throwable {

    }
}
