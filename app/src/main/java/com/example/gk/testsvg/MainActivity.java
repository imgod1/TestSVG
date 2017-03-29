package com.example.gk.testsvg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Activity如果继承自AppCompatActivity 在布局文件中虽然写的是ImageView 但是在编译的过程中
 * 会自动转换成AppCompatImageView
 * 而如果Fragment直接用ImageView来承载SVG的话 会直接崩溃.因为Fragment并没有为我们做一层处理
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_0:
                FragmentActivity.actionStart(this);
                break;
            case R.id.btn_1:
                AnimSvgActivity.actionStart(this);
                break;
            default:
                break;
        }

    }
}
