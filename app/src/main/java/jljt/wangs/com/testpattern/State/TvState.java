package jljt.wangs.com.testpattern.State;

/**
 * Created by Administrator on 2017/11/17.
 */

public interface TvState {
    public void vol_Up();
    public void vol_Down();
    public void next_Channel();
    public void pre_Channel();
    public Boolean getState();
}
