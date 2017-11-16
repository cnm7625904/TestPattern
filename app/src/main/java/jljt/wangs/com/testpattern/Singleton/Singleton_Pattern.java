package jljt.wangs.com.testpattern.Singleton;

/**
 * Created by Administrator on 2017/11/16.
 */

public  class Singleton_Pattern {
    private String name=null;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private static class singleton{
        private static final Singleton_Pattern INSTANCE=new Singleton_Pattern();
    }
    public Singleton_Pattern(){}
    public static final Singleton_Pattern getInstance(){
        return singleton.INSTANCE;
    }
    public void printInfo(){
        System.out.println(name);
    }
}
