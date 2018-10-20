import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class 启动服务器 extends 玩家名字线程{
    private int 返回的连接数量;
    private ServerSocket 服务器;
    private int 端口号;
    private Socket 客户端网络;
    ArrayList<Socket> 存储已连接客户端数组;

    public 启动服务器(int i) {
        端口号 = i;
        客户端网络 = new Socket();
        存储已连接客户端数组 = new ArrayList<>();
    }

    public void 启动() {
            try {
                //创建端口号
                服务器 = new ServerSocket(端口号);
                限制客户端链接数量 限制对象 = new 限制客户端链接数量(存储已连接客户端数组);
                接收玩家输入数据 接收数据 = new 接收玩家输入数据();
                while (true) {
                    //限制连接数量为2
                    if (返回的连接数量 != 2) {
                        //等待客户端连接
                        客户端网络 = 服务器.accept();
                        System.out.println("客户端已连接");
                        //每次客户端连接成功后 添加到数组
                        存储已连接客户端数组.add(客户端网络);
                        //调用限制客户端连接方法返回已连接的数量
                        限制对象.限制(存储已连接客户端数组);
                        run(存储已连接客户端数组);
                        返回的连接数量 = 限制对象.get数量();
                    }if (返回的连接数量 == 2){
                        接收数据.接收玩家输入数据(存储已连接客户端数组);
                    }
                }
            } catch (Exception ex) {
                ex.getMessage();
            }
        }
    }
