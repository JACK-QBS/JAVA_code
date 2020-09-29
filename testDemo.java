package test24;

public class testDemo {

    /**
     * 汉诺塔
     */
    public static void move (char pos1,char pos2) {
        System.out.print(pos1+" --> "+pos2+" ");//模仿鼠标的移动
    }
    /**
     *
     * @param n       代表盘子的数目
     * @param pos1    代表第一根柱子  A
     * @param pos2    代表第二根柱子  B
     * @param pos3    代表第三根柱子  C
     */
    public static void HanoiTower (int n,char pos1,char pos2,char pos3) {  //n代表盘子的数目
        if(n == 1) {
            move(pos1,pos3);
        } else {
            HanoiTower(n-1,pos1,pos3,pos2);   // pos1 上的东西通过 pos3 传到 pos2 上
            move(pos1,pos3);
            HanoiTower(n-1,pos2,pos1,pos3);
        }
    }
    public static void main(String[] args) {
        HanoiTower(1,'A','B','C');
        System.out.println();
        HanoiTower(2,'A','B','C');
        System.out.println();
        HanoiTower(3,'A','B','C');
        System.out.println();


    }

}
