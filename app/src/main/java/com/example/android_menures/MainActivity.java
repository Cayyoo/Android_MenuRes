package com.example.android_menures;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

/**
 * 菜单Menu资源包含选项菜单Option Menu和上下文菜单Context Menu。
 *
 * 上下文菜单：
 * 1、在menu目录下定义菜单资源文件
 * 2、为组件注册上下文菜单
 * 3、重写onCreateContextMenu()
 * 4、重写onContextItemSelected()，并return true
 *
 * 运行程序，在TextView上长按不放，将弹出上下文菜单，选择菜单项即可改变颜色
 */
public class MainActivity extends AppCompatActivity {
    private TextView mTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTv=(TextView)findViewById(R.id.tv_text);

        registerForContextMenu(mTv);//为文本框注册上下文菜单
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater=new MenuInflater(this);//实例化一个MenuInflater对象
        inflater.inflate(R.menu.context_menu,menu);//解析菜单文件
        menu.setHeaderIcon(R.mipmap.ic_launcher_round);//为菜单头设置图标
        menu.setHeaderTitle("请选择文字颜色：");//为菜单头设置标题
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.color1://选择红色
                mTv.setTextColor(Color.rgb(255,0,0));
                break;
            case R.id.color2://选择绿色
                mTv.setTextColor(Color.rgb(0,255,0));
                break;
            case R.id.color3://选择蓝色
                mTv.setTextColor(Color.rgb(0,0,255));
                break;
            case R.id.color4://橙色
                mTv.setTextColor(Color.rgb(255,180,0));
                break;
            default://默认
                mTv.setTextColor(Color.rgb(0,0,0));
                break;
        }
        return true;
        //return super.onContextItemSelected(item);
    }

}
