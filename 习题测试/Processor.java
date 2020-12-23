package CurriculumDesign;

// 进程类，在该类中定义了进程所需要的属性
public class Processor {
    private String name;//进程名字
    Sources max;//进程所需要的最大资源
    Sources allocation;//当前进程已经分配的资源数
    Sources need;//当前进程还需要多少资源(max-allocation)
    public boolean Finish = false;//判断进程是否结束

    public Processor(String name, int max_a,int max_b,int max_c,int all_a,int all_b,int all_c,int need_a,int need_b,int need_c)
    {
        this.name = name;
        max = new Sources(max_a,max_b,max_c);
        allocation = new Sources(all_a,all_b,all_c);
        need = new Sources(need_a,need_b,need_c);
    }

    public void ShowProcessor()
    {
        //打印出进程的信息
        System.out.println(name+"\t\t\t\t"+max.toString()+"\t\t\t"+allocation.toString()+"\t\t\t\t\t"+need.toString());
    }
}
