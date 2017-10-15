package com.example.android_menures;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * 菜单Menu资源包含选项菜单Option Menu和上下文菜单Context Menu。
 *
 * 选项菜单：
 * 1、在menu目录下定义菜单资源文件
 * 2、重写onCreateOptionsMenu()，并return true
 * 3、重写onOptionsItemSelected()，并return true
 */
public class MainOptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=new MenuInflater(this);//实例化一个MenuInflater对象
        inflater.inflate(R.menu.option_menu,menu);//解析menu菜单
        return true;
        //return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.setting){//判断是否选择了“参数设置”菜单项
            if (item.isChecked()){//若已被选中
                item.setChecked(false);//设置菜单项不被选中
            }else {
                item.setChecked(true);//设置菜单项被选中
            }
        }

        if (item.getItemId() == R.id.item2){
            //弹出选择的菜单项的标题
            Toast.makeText(MainOptionActivity.this,item.getTitle(),Toast.LENGTH_SHORT).show();
        }

        if (item.getItemId() == R.id.item1 || item.getItemId() == R.id.item3){
            Toast.makeText(MainOptionActivity.this,"空选项："+item.getTitle(),Toast.LENGTH_SHORT).show();
        }

        return true;
        //return super.onOptionsItemSelected(item);
    }

}
