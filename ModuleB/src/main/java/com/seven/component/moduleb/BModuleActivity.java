package com.seven.component.moduleb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.seven.component.basemodule.AsyncProviderCallBack;
import com.seven.component.basemodule.BaseMethodProvider;
import com.seven.component.basemodule.RouterConstant;

@Route(path = RouterConstant.ModuleBConstant.MODULEB_ACTIVITY_JUMP)
public class BModuleActivity extends AppCompatActivity {

    @Autowired(name=RouterConstant.ModuleAConstant.MODULEA_METHOD_CALL)
    BaseMethodProvider baseMethodProvider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moduleb);
        ARouter.getInstance().inject(this);
    }
    public void jump2ModuleA(View view) {
        ARouter.getInstance().build(RouterConstant.ModuleAConstant.MODULEA_ACTIVITY_JUMP).navigation();



    }

    public void callModuleAMethod(View view) {
        baseMethodProvider.method();
    }

    public void callModuleAMethodAsync(View view) {
        baseMethodProvider.asyncMethod(new AsyncProviderCallBack() {
            @Override
            public void onStart() {

            }

            @Override
            public void onSuccess() {
                Toast.makeText(BModuleActivity.this,"成功调用B的异步方法！",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailed() {

            }

            @Override
            public void onFinish() {

            }
        });
    }
}
