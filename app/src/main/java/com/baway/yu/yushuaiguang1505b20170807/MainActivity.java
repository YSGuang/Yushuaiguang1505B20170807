package com.baway.yu.yushuaiguang1505b20170807;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * MainActivity类
 * Created by YU on 2017/8/7.
 */
public class MainActivity extends AppCompatActivity {
    private TextView Back, Title, More;
//    private TitleView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        textView = (TitleView)findViewById(R.id.textview);
        //查找控件
        Back=(TextView)findViewById(R.id.back);
        Title=(TextView)findViewById(R.id.title);
        More=(TextView)findViewById(R.id.more);
        //监听事件
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"点击了返回",Toast.LENGTH_SHORT).show();
            }
        });
        //监听事件
        More.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"点击了更多",Toast.LENGTH_SHORT).show();
            }
        });
    }

}
