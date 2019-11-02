package com.seven.component.modulea;

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
@Route(path = RouterConstant.ModuleAConstant.MODULEA_METHOD_CALL)
public class ModuleAProvider extends BaseMethodProvider {


    @Override
    public void method() {
        Toast.makeText(getContext(), "这是模块A的方法！", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void asyncMethod(AsyncProviderCallBack asyncProviderCallBack) {
        //do sth
        asyncProviderCallBack.onSuccess();

    }




}
