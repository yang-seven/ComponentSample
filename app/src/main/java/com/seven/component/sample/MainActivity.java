package com.seven.component.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.launcher.ARouter;
import com.seven.component.basemodule.BaseMethodProvider;
import com.seven.component.basemodule.RouterConstant;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jump2ModuleA(View view) {
        ARouter.getInstance().build(RouterConstant.ModuleAConstant.MODULEA_ACTIVITY_JUMP).navigation();
    }
}
