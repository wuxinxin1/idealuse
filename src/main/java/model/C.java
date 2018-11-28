package model;

import java.util.ArrayList;
import java.util.List;

/**
 * 断点调试
 * 1.添加普通断点  ctrl+f8
 * 2.添加条件断点  ctrl+f8   ctrl+shift+f8
 * 3.跳到下一个断点f9
 * 4.进入方法f7
 * 5.动态设置运行时值f2
 * Created by wuxinxin on 2018/11/28.
 */
public class C {

    public static void main(String[] args){
        List<String>  list=new ArrayList<String>();

        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");

        String result=getResult(list);
        System.out.println(result);
    }

    /**
     * 添加条件断点   条件：“”.equals("bbbb")
     * @param list
     * @return
     */
    private static String getResult(List<String> list) {
        if(list==null || list.size()==0){
           return null;
        }

        StringBuilder sb=new StringBuilder("");
        for (String s : list) {
            sb.append(s);
        }

        return sb.toString();
    }

}
