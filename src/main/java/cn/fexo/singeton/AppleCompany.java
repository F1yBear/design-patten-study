package cn.fexo.singeton;

import java.util.Objects;

/**
 * 懒汉模式创建单例模式
 * <p>
 * 优点：使用时创建，节省创建资源
 * 缺点：方法上使用锁，效率不高
 * </p>
 *
 * @author F1yBear
 * @date 2018/10/14
 * @since 1.8
 */
public class AppleCompany {

    private AppleCompany() {
    }

    private static  AppleCompany  company=null;

    public static  synchronized AppleCompany getInstance(){
        if(Objects.isNull(company)){
            company = new AppleCompany();
        }
        return company;
    }



}
