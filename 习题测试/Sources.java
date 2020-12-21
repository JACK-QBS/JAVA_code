package CurriculumDesign;

// 资源类，在该类中定义了三种资源
public class Sources {
    /** 三个字段分别表示A.B.C这三类资源 */
    public int A;
    public int B;
    public int C;

    public Sources() {
    }

    public Sources(int A,int B,int C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public String toString()
    {
        //打印出资源信息
        return A+" "+B+" "+C;
    }
}
