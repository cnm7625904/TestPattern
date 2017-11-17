package jljt.wangs.com.testpattern.State;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import jljt.wangs.com.testpattern.R;

/**
 * Created by Administrator on 2017/11/17.
 */

public class Show_State extends AppCompatActivity implements View.OnClickListener{
    private TvController tvController;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_state);
        tvController=new TvController();
        initView();
    }
    private void initView() {
        findViewById(R.id.turn_0n).setOnClickListener(this);
        findViewById(R.id.turn_off).setOnClickListener(this);
        findViewById(R.id.vol_up).setOnClickListener(this);
        findViewById(R.id.vol_down).setOnClickListener(this);
        findViewById(R.id.next_channel).setOnClickListener(this);
        findViewById(R.id.pre_channel).setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        int viewId=view.getId();
        switch (viewId){
            //打开电视
            case R.id.turn_0n:
                tvController.turnOn();
                findViewById(R.id.vol_up).setVisibility(View.VISIBLE);
                findViewById(R.id.vol_down).setVisibility(View.VISIBLE);
                findViewById(R.id.next_channel).setVisibility(View.VISIBLE);
                findViewById(R.id.pre_channel).setVisibility(View.VISIBLE);
                findViewById(R.id.state_img).setVisibility(View.VISIBLE);
                Toast.makeText(Show_State.this,"打开电视",Toast.LENGTH_SHORT).show();
                break;
            //关闭电视
            case R.id.turn_off:
                tvController.turnOff();
                findViewById(R.id.vol_up).setVisibility(View.VISIBLE);
                findViewById(R.id.vol_down).setVisibility(View.VISIBLE);
                findViewById(R.id.next_channel).setVisibility(View.VISIBLE);
                findViewById(R.id.pre_channel).setVisibility(View.VISIBLE);
                findViewById(R.id.state_img).setVisibility(View.GONE);
                Toast.makeText(Show_State.this,"关闭电视",Toast.LENGTH_SHORT).show();
                break;
            //增加音量
            case R.id.vol_up:
                tvController.volUp();
                if(tvController.getState()){
                    Toast.makeText(Show_State.this,"增加音量",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(Show_State.this,"电视关闭，无法增加音量",Toast.LENGTH_SHORT).show();
                }
                break;
            //降低音量
            case R.id.vol_down:
                tvController.vol_Down();
                if(tvController.getState()){
                    Toast.makeText(Show_State.this,"降低音量",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(Show_State.this,"电视关闭，无法降低音量",Toast.LENGTH_SHORT).show();
                }
                break;
            //下一个台
            case R.id.next_channel:
                tvController.nextChannel();
                if(tvController.getState()){
                    Toast.makeText(Show_State.this,"下一个频道",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(Show_State.this,"电视关闭，无法切换到下一个频道",Toast.LENGTH_SHORT).show();
                }
                break;
            //上一个台
            case R.id.pre_channel:
                tvController.preChannel();
                if(tvController.getState()){
                    Toast.makeText(Show_State.this,"上一个频道",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(Show_State.this,"电视关闭，无法切换到上一个频道",Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                break;
        }
    }
}
