public class 猜拳游戏 implements 接口1{
    private int 玩家2;
    private int 玩家;

    public String get玩家2结果() {
        return 玩家2结果;
    }

    private String 玩家2结果;

    public int get玩家2() {
        return 玩家2;
    }

    public int get玩家() {
        return 玩家;
    }

    @Override
    public String 玩家玩家判断胜负() {
        if (get玩家2()==get玩家()){
            this.玩家2结果="平局";
            return "平局";
        }else if (get玩家2()==1&&get玩家()==2||get玩家2()==2&&get玩家()==3||get玩家2()==3&&get玩家()==1){//1.石头 2.剪刀 3.布
            this.玩家2结果="输";
            return "赢";
        }else {
            this.玩家2结果="赢";
            return "输";
        }
    }


    @Override
    public void 玩家出拳1(String i) {
        if (i.equals("石头")) {
            this.玩家 = 1;
        } else if (i.equals("剪刀")) {
            this.玩家 = 2;
        } else if (i.equals("布")) {
            this.玩家 = 3;
        }
    }

    @Override
    public void 玩家出拳2(String i) {
        if (i.equals("石头")) {
            this.玩家2 = 1;
        } else if (i.equals("剪刀")) {
            this.玩家2 = 2;
        } else if (i.equals("布")) {
            this.玩家2 = 3;
        }
    }
}
interface 接口1 {
    public void 玩家出拳1(String i);

    public String 玩家玩家判断胜负();

    public void 玩家出拳2(String i);
}