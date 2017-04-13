package com.example.asus.a0412_shuxingdonghua;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private ImageView imageview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        imageview= (ImageView) findViewById(R.id.image);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                //做透明动画 第一个参数是图片的控件  第二个是动画的名称  第三个是控件修改的参数
                ObjectAnimator alpha=ObjectAnimator.ofFloat(imageview,"alpha",new float[]{0.0f,0.2f,0.4f,0.6f,0.8f,1.0f});
                //动画时间
                alpha.setDuration(3000);
                //动画执行模式
                alpha.setRepeatMode(ObjectAnimator.RESTART);
                //动画执行次数
                alpha.setRepeatCount(1);
                //开启动画
                alpha.start();
                break;
            case R.id.button2:
                //坐旋转动画
                ObjectAnimator rotation=ObjectAnimator.ofFloat(imageview,"rotationY",new float[]{90f,180f,270f,360f});
                //动画时间
                rotation.setDuration(2000);
                rotation.setRepeatMode(ObjectAnimator.RESTART);
                rotation.setRepeatCount(1);
                rotation.start();
                break;
            case R.id.button3:
                //缩放
                ObjectAnimator scalx=ObjectAnimator.ofFloat(imageview,"scaleY",new float[]{1f,2f,3f,4f,5f,6f,1f});
                scalx.setDuration(2000);
                scalx.setRepeatMode(ObjectAnimator.RESTART);
                scalx.setRepeatCount(1);
                scalx.start();
                break;
            case R.id.button4:
                //平移
                ObjectAnimator tran=ObjectAnimator.ofFloat(imageview,"translationY",new float[]{10f,20f,30f,40f,60f,80f});
                tran.setDuration(2000);
                tran.setRepeatMode(ObjectAnimator.RESTART);
                tran.setRepeatCount(1);
                tran.start();
                break;
        }
    }
}
