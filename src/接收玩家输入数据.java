import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class 接收玩家输入数据 extends 用户发送协议{
    private String 玩家1输入;
    private String 玩家2输入;
    private int 回合;
    public void 接收玩家输入数据(ArrayList<Socket> i) {
        判断胜负 判断 = new 判断胜负();
        存入数据MIan MIan = new 存入数据MIan();
        存入文档数据方法 保存开始 = new  存入文档数据方法();
                try {
                    Socket ia = i.get(0);
                    Socket ib = i.get(1);
                    DataInputStream 接收流1 = new DataInputStream(new BufferedInputStream(ia.getInputStream()));
                    DataInputStream 接收流2 = new DataInputStream(new BufferedInputStream(ib.getInputStream()));
                   if (玩家1输入==null || 玩家2输入==null){
                       while (玩家1输入==null||玩家2输入==null){
                        玩家1输入 = 接收流1.readUTF();
                        玩家2输入 = 接收流2.readUTF();
                       }
                   }else {
                       String 结果1 = 判断.判断(玩家1输入,玩家2输入);
                       String 结果2 = 判断.get玩家2结果();
                       回合++;
                       MIan.发送文件流(玩家1输入,玩家2输入,结果1,结果2,回合);
                       发送协议(结果2,结果1,玩家1输入,玩家2输入);
                           try {
                               DataOutputStream 发送流 = new DataOutputStream(new BufferedOutputStream(ib.getOutputStream()));
                               发送流.writeUTF(发送格式);
                               发送流.flush();
                               DataOutputStream 发送流1 = new DataOutputStream(new BufferedOutputStream(ia.getOutputStream()));
                               发送流1.writeUTF(发送格式);
                               发送流1.flush();
                               玩家1输入 = null;
                               玩家2输入 = null;
                           }catch (Exception ex){
                               ex.getMessage();
                           }
                       }
                } catch (Exception ex) {
                    ex.getMessage();
            }
    }
}
