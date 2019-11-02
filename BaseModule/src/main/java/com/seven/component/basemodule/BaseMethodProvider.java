package com.seven.component.basemodule;

import android.content.Context;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * Time:2019/10/29
 * <p>
 * Author:wangzhou
 * <p>
 * Description:
 */

public abstract class BaseMethodProvider implements IProvider {

    private Context mContext;

    @Override
    public void init(Context context) {
        this.mContext = context;
    }

    public Context getContext() {
        return mContext;
    }

    public abstract void method();

    public abstract void asyncMethod(AsyncProviderCallBack asyncProviderCallBack);


}
