package com.baway.yu.yushuaiguang1505b20170807;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

/**
 * 自定义view类
 * Created by YU on 2017/8/7.
 */

public class TitleView extends View{
    private TextView Back, Title, More;
    private Context context;
    public TitleView(Context context) {
        super(context);
    }

    public TitleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        //加载布局
        LayoutInflater.from(context).inflate(R.layout.title_view, null);
        //获取控件
        Back=(TextView)findViewById(R.id.back);
        Title=(TextView)findViewById(R.id.title);
        More=(TextView)findViewById(R.id.more);

    }

    public TitleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public TitleView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
    // 为左侧返回按钮添加自定义点击事件
    public void setLeftButtonListener(OnClickListener listener) {
               Back.setOnClickListener(listener);
          }
    // 为右侧返回按钮添加自定义点击事件
    public void setReghtButtonListener(OnClickListener listener) {
        Back.setOnClickListener(listener);
    }
    // 设置标题的方法
    public void setTitleText(String title) {
        Title.setText(title);
           }
}
