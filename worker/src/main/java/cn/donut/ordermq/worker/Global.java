/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Global
 * Author:   LiYuAn
 * Date:     2018/5/18 17:48
 * Description: 资源配置类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.donut.ordermq.worker;

/**
 * 〈一句话功能简述〉<br>
 * 〈资源配置类〉
 *
 * @author LiYuAn
 * @create 2018/5/18
 * @since 1.0.0
 */
public class Global {

    final static String NODE_URL_PRODUCT = "https://abc.leanapp.cn/api/v1/web/yc/apply/status";

    final static String NODE_URL_TEST = "http://10.155.232.94:3000/api/v1/web/yc/apply/status";

    final static String PRODUCTID = "5960,5856,5866,5868,5869,5860,6258,7054,7563,7564";

    public static void main(String[] args) {
        int id = 5960;
        if (Global.PRODUCTID.contains(id + "")) {
            System.out.println(22);
        }else {
            System.out.println(1);
        }
    }

}
