public class 保存数据格式{
    private String 玩家1出拳;
    private String 玩家2出拳;

    public String get玩家1结果() {
        return 玩家1结果;
    }

    public void set玩家1结果(String 玩家1结果) {
        this.玩家1结果 = 玩家1结果;
    }

    public String get玩家2结果() {
        return 玩家2结果;
    }

    public void set玩家2结果(String 玩家2结果) {
        this.玩家2结果 = 玩家2结果;
    }

    private String 玩家1结果;

    public int get回合变量() {
        return 回合变量;
    }

    public void set回合变量(int 回合变量) {
        this.回合变量 = 回合变量;
    }

    private String 玩家2结果;

    public String get玩家1出拳() {
        return 玩家1出拳;
    }

    public void set玩家1出拳(String 玩家1出拳) {
        this.玩家1出拳 = 玩家1出拳;
    }

    public String get玩家2出拳() {
        return 玩家2出拳;
    }

    public void set玩家2出拳(String 玩家2出拳) {
        this.玩家2出拳 = 玩家2出拳;
    }
    private int 回合变量;

    public String 保存格式(){
        String 输入文件流格式 = "第"+回合变量+"局---------"+"\n"+玩家名字线程.玩家游戏名1+"出拳:"+get玩家1出拳()+"    结果:"+get玩家1结果()+"       "+玩家名字线程.玩家游戏名2+"出拳:"+get玩家2出拳()+"    结果:"+get玩家2结果();
        return 输入文件流格式;
    }
}
