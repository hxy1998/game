import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class 限制客户端链接数量 {
    private int 数量;
    private ArrayList<Socket> 数组;

    public int get数量() {
        return 数量;
    }
public 限制客户端链接数量(ArrayList<Socket> i){

}
    public int 限制(ArrayList<Socket> i){
        数量++;
        for (Socket cg : i) {
            try {
                DataOutputStream 发送流 = new DataOutputStream(new BufferedOutputStream(cg.getOutputStream()));
                发送流.writeInt(数量);
                发送流.flush();
            }catch (Exception ex){
                ex.getMessage();
            }
        }
        return 数量;
    }
}
