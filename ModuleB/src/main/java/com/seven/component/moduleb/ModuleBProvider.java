package com.seven.component.moduleb;

import android.content.Context;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.seven.component.basemodule.AsyncProviderCallBack;
import com.seven.component.basemodule.BaseMethodProvider;
import com.seven.component.basemodule.RouterConstant;

/**
 * Time:2019/10/29
 * <p>
 * Author:wangzhou
 * <p>
 * Description:
 */
@Route(path = RouterConstant.ModuleBConstant.MODULEB_METHOD_CALL)
public class ModuleBProvider extends BaseMethodProvider {

    @Override
    public void method() {
        Toast.makeText(getContext(),"这是模块B的方法！",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void asyncMethod(AsyncProviderCallBack asyncProviderCallBack) {
        asyncProviderCallBack.onSuccess();
    }

}
