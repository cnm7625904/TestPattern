package jljt.wangs.com.testpattern.State;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/11/17.
 */

public class TvController implements PowerController{
    TvState tvState;
    public void setTvState(TvState tvState){
        this.tvState=tvState;
    }
    @Override
    public void turnOn() {
        setTvState(new TurnOn_State());
        System.out.println("开机");
    }
    @Override
    public void turnOff() {
        setTvState(new TurnOff_State());
        System.out.println("关机");
    }

    public void nextChannel(){
        tvState.next_Channel();
    }
    public void preChannel(){
        tvState.pre_Channel();
    }
    public void volUp(){
        tvState.vol_Up();
    }
    public void vol_Down(){
        tvState.vol_Down();
    }
    public Boolean getState(){
        return  tvState.getState();
    }


}
