package com.soz.hook.proxy;

import com.soz.log.Logger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by zhushaolong on 9/1/16.
 */
public class AMSHookHandler implements InvocationHandler {
    Logger mLogger = new Logger("AMSHookHandler");
    private Object mBase;

    public AMSHookHandler(Object base) {
        this.mBase = base;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        mLogger.i("[AMS]you are hooked");
        mLogger.i("method: " + method.getName() + " called with args " + Arrays.toString(args));
        return method.invoke(this.mBase, args);
    }
}
