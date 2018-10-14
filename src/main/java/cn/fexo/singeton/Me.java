package cn.fexo.singeton;

import java.io.Serializable;

/**
 * 内部静态类创建单例模式
 *
 * @author F1yBear
 * @date 2018/10/14
 * @since 1.8
 */
public class Me implements Serializable {
    private Me() {
    }

    private static class Create {
        private static final Me me = new Me();
    }

    public static Me getInstance() {
        return Create.me;
    }
}
