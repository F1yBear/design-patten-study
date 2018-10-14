package cn.fexo.singeton;

import java.util.Objects;

/**
 * 双重鉴定锁创建单例模式
 *
 * @author F1yBear
 * @date 2018/10/14
 * @since 1.8
 */
public class Home {
    private Home() {
    }

    private volatile static Home home = null;

    public static Home getInstance() {
        if (Objects.isNull(home)) {
            synchronized (Home.class) {
                if (Objects.isNull(home)) {
                    home = new Home();
                }
            }
        }
        return home;
    }

}
