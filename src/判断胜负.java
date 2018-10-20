public class 判断胜负 {
    private String 玩家1结果;

    public String get玩家2结果() {
        return 玩家2结果;
    }

    private String 玩家2结果;
    猜拳游戏 game = new 猜拳游戏();
    public String 判断(String i,String ii){
    game.玩家出拳1(i);
    game.玩家出拳2(ii);
    玩家1结果 = game.玩家玩家判断胜负();
    玩家2结果 = game.get玩家2结果();
    return 玩家1结果;
    }

}
