package jljt.wangs.com.testpattern.State;

/**
 * Created by Administrator on 2017/11/17.
 */

public class TurnOn_State implements TvState{
    @Override
    public void vol_Up() {
        System.out.println("增加音量");
    }
    @Override
    public void vol_Down() {
        System.out.println("降低音量");
    }
    @Override
    public void next_Channel() {
        System.out.println("换下一个台");
    }
    @Override
    public void pre_Channel() {
        System.out.println("换上一个台");
    }

    @Override
    public Boolean getState() {
        return true;
    }


    public Boolean tv_State() {
        return true;
    }
}
