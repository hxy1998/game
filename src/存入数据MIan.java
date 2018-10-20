import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class 存入数据MIan {
    存入文档数据方法 方法 =new 存入文档数据方法();
    void 发送文件流(String 玩家1,String 玩家2,String 结果1,String 结果2,int c) throws Exception{
        File file = new File("src/玩家游戏数据.txt");
        存入文档数据方法 方法 = new 存入文档数据方法();
        List<保存数据格式> list = new ArrayList<>();
        保存数据格式 cy = null;
        for (int i = 0; i < 1; i++) {
            cy = new 保存数据格式();
            cy.set玩家1出拳(玩家1);
            cy.set玩家2出拳(玩家2);
            cy.set玩家1结果(结果2);
            cy.set玩家2结果(结果1);
            cy.set回合变量(c);
            list.add(cy);
        }
        方法.导入文件流(file,list);

    }
}
