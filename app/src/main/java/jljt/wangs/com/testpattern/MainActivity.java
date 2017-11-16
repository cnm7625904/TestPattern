package jljt.wangs.com.testpattern;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Toast;

import jljt.wangs.com.testpattern.Builder.Show_Pattern;
import jljt.wangs.com.testpattern.Singleton.Show_Singleton;
import jljt.wangs.com.testpattern.Singleton.Singleton_Pattern;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView() {
        findViewById(R.id.btn_singleton).setOnClickListener(this);
        findViewById(R.id.btn_builder).setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        int viewId=view.getId();
        switch (viewId){
            //单例模式
            case R.id.btn_singleton:
                startActivity(new Intent(MainActivity.this,Show_Singleton.class));
                break;
            //构建者模式
            case R.id.btn_builder:
                startActivity(new Intent(MainActivity.this,Show_Pattern.class));
                break;
            default:
                break;
        }
    }
}
