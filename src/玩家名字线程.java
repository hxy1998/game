import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Stack;

public class 玩家名字线程{

    static String 玩家游戏名1;
    static String 玩家游戏名2;

    public void run(ArrayList<Socket> i) {
        for (Socket socket : i) {
            try {
                玩家名字线程 玩家名字 =new 玩家名字线程();
                Socket ia = i.get(0);
                Socket ib = i.get(1);
                DataInputStream 接收流1 = new DataInputStream(new BufferedInputStream(ia.getInputStream()));
                DataInputStream 接收流2 = new DataInputStream(new BufferedInputStream(ib.getInputStream()));
                if (玩家游戏名1==null || 玩家游戏名2==null) {
                    while (玩家游戏名1 == null || 玩家游戏名2 == null) {
                        玩家游戏名1 = 接收流1.readUTF();
                        玩家游戏名2 = 接收流2.readUTF();
                    }
                }else {

                    System.out.println(玩家游戏名1);
                    System.out.println(玩家游戏名2);
                }
            }catch (Exception ex){
                ex.getMessage();
            }
        }
    }
    public void 检查(){
        System.out.println(玩家游戏名1);
        System.out.println(玩家游戏名2);
    }
}
