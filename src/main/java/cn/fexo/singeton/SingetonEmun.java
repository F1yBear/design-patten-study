package cn.fexo.singeton;


/**
 * 使用枚举来做单例模式，属于懒汉模式，线程安全，但是不可以被破解。
 * @author F1yBear
 * @date 2018/10/14
 * @since 1.8
 */
public enum SingetonEmun {

    instance;

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
