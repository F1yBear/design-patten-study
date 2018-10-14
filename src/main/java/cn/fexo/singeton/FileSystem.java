package cn.fexo.singeton;

/**
 * 懒汉模式创建单例对象
 * <p>
 * 优点：线程安全
 * 缺点：加载类的时候就创建了对象，如果不使用就浪费资源
 * </p>
 *
 * @author F1yBear
 * @date 2018/10/14
 * @since 1.8
 */
public class FileSystem {

    private FileSystem(){}

    /**
     *  优点：线程安全
     *  缺点：加载类的时候就创建了对象，如果不使用就浪费资源
     */
    private static FileSystem fileSystem = new FileSystem();

    public  static FileSystem getInstance(){
        return fileSystem;
    }
}
