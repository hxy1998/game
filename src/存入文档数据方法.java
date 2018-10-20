

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class 存入文档数据方法 {
    void 导入文件流(File file,List<保存数据格式> list)throws Exception {
        if (file.exists()) {
            //文件导入流
            FileWriter witer = new FileWriter(file,true);
            //for循环出链表里面的对象
            for (int i = 0; i < list.size(); i++) {
                //把循环出来的对象赋给声明的对象
                保存数据格式 数据格式 = list.get(i);
                //.对象里面的发送协议并装入文件流中发送
                witer.append(数据格式.保存格式()+"\r\n");
            }
            witer.close();
        }else{
            System.out.println();
            file.createNewFile();
        }
    }
}
