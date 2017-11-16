package jljt.wangs.com.testpattern.Builder;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import jljt.wangs.com.testpattern.R;

/**
 * Created by Administrator on 2017/11/16.
 */

public class Show_Pattern extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_builder);
        intView();

    }

    private void intView() {
        findViewById(R.id.btn_ok).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int viewId=view.getId();
        switch (viewId){
            case R.id.btn_ok:
                EditText text=(EditText) findViewById(R.id.et_builder);
                String name=text.getText().toString().trim();
                if(TextUtils.isEmpty(name)){
                    Toast.makeText(this,"请输入内容",Toast.LENGTH_SHORT).show();
                    return;
                }
                Builder_Pattern builderPattern=new Builder_Pattern.userBuilder(name)
                        .age(12)
                        .address("四川")
                        .build();
                Toast.makeText(this,"我的名字是:"+name,Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }
    }
}
