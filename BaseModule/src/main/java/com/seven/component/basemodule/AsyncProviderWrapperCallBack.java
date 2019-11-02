package com.seven.component.basemodule;

/**
 * Time:2019/10/29
 * <p>
 * Author:wangzhou
 * <p>
 * Description:
 */
public class AsyncProviderWrapperCallBack {

    public AsyncProviderCallBack asyncProviderCallBack;



    public AsyncProviderWrapperCallBack(AsyncProviderCallBack callback) {
        this.asyncProviderCallBack = callback;
    }

    public static AsyncProviderWrapperCallBack newInstance(AsyncProviderCallBack callback) {
        if (callback != null) {
            callback.onStart();
        }
        AsyncProviderWrapperCallBack wrapper = new AsyncProviderWrapperCallBack(callback);
        return wrapper;
    }

    public void onSuccess() {
        asyncProviderCallBack.onSuccess();
        asyncProviderCallBack.onFinish();
    }

    public void onFailed() {
        asyncProviderCallBack.onFailed();
        asyncProviderCallBack.onFinish();
    }

}
