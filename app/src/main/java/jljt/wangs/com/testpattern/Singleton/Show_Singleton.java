package jljt.wangs.com.testpattern.Singleton;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDialog;
import android.view.View;
import android.widget.Toast;

import jljt.wangs.com.testpattern.R;

/**
 * Created by Administrator on 2017/11/16.
 */

public class Show_Singleton extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_singleton);
        Singleton_Pattern test1=Singleton_Pattern.getInstance();
        test1.setName("大牛");
        Singleton_Pattern test2=Singleton_Pattern.getInstance();
        test1.setName("二狗");
        test1.printInfo();
        test2.printInfo();
        if(test1==test2){
            System.out.println("同一个实例");
        }else {
            System.out.println("不是同一个实例");
        }
        findViewById(R.id.btn_show).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setDialog();
            }
        });

        Toast.makeText(this,"请在源码和log信息里查看",Toast.LENGTH_SHORT).show();
    }
    private void setDialog(){
        AlertDialog.Builder dialog= new AlertDialog.Builder(Show_Singleton.this);
        dialog.setTitle("Builder")
                .setMessage("系统对话框也是Builder模式")
                .setPositiveButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setNegativeButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                }).create()
                .show();
    }
}
