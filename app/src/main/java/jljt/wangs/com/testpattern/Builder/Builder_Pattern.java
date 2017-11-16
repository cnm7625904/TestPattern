package jljt.wangs.com.testpattern.Builder;

/**
 * Created by Administrator on 2017/11/16.
 */

public class Builder_Pattern {
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    private final String name;//必填
    private  final int age;
    private  final String address;

    private Builder_Pattern(userBuilder userBuilder){
        this.name=userBuilder.name;
        this.age=userBuilder.age;
        this.address=userBuilder.address;
    }
    public static class userBuilder{
        private final String name;
        private int age;
        private String address;
        public userBuilder(String name){
            this.name=name;
        }
        public userBuilder age(int age){
            this.age=age;
            return this;
        }
        public userBuilder address(String address){
            this.address=address;
            return this;
        }
        public Builder_Pattern build(){
            return  new Builder_Pattern(this);
        }
    }
}
