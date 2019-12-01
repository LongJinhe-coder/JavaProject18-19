class sclass
{    String classid;                                                //课程编号
    int credit;                                                    //学分
    sclass(String classid,int credit)
    {     this.classid=classid;
        this.credit=credit;
    }
};

class Student
{   String sid;                                                    //学号
    String sname;                                                  //姓名
    char sex;                                                      //性别 m-男生，f-女生
    float avgscore;                                                //学分绩
    float []score=new float[3];                                    //成绩

    Student (String id,String name,char sex,float s1,float s2,float s3)
    {    this.sid=id;
        this.sname=name;
        this.sex=sex;
        this.score[0]=s1;
        this.score[1]=s2;
        this.score[2]=s3;
    }
    Student(){};
    Student(String id,String name,char sex)
    {    this.sid=id;
        this.sname=name;
        this.sex=sex;
    }
    void print()
    {    System.out.println("id:"+this.sid+"\t\t name:"+this.sname+"\t sex"+this.sex);
        System.out.println("score1="+this.score[0]+"\t score2="+this.score[1]+"\t score3="+this.score[2]);
        System.out.println("average score:"+this.avgscore);
        System.out.print("\n");
    }
    void print2()
    {    System.out.println("student id:"+this.sid+"\t average score:"+this.avgscore);
    }
};


public class Stuscore
{    Student []st;                                               //学生数组的定义
    sclass []sc=new sclass[3];                                  //3门课程
    void initsc()                                               //课程数组的初始化
    {    sc[0]=new sclass("C001",2);
        sc[1]=new sclass("C001",3);
        sc[2]=new sclass("C001",4);
    }
    void initst()
    {    st=new Student[5];                                     //学生数组的初始化
        st[0]=new Student("S001","zhang shan",'f',78,86,96);
        st[1]=new Student("S002","li si",'m',65,77,89);
        st[2]=new Student("S003","wang wu",'m',98,77,87);
        st[3]=new Student("S004","zhou lin",'f',73,95,93);
        st[4]=new Student("S005","qian dong",'m',87,93,91);
    }

    void accuscore()                                          //计算学分绩
    {    float as=0;                                          //分数和
        int cs=0;                                            //学分绩
        for(int i=0;i<st.length;i++)
        {   for(int j=0;j<sc.length;j++)
        {   as+=sc[j].credit*st[i].score[j];
            cs+=sc[j].credit;
        }
            st[i].avgscore=(float)(as/cs);
        }
    }
    void sort()                                           //排序
    {   Student tem=new Student();                        //临时变量
        for(int i=0;i<st.length;i++)
        {   for(int j=i+1;j<st.length;j++)
            if(st[i].avgscore<st[j].avgscore)            //按学分绩排序
            {    tem=st[i];
                st[i]=st[j];
                st[j]=tem;
            }
        }
    }
    void print()                                        //输出学生的信息
    {     System.out.println("---------------------------------------------");
        System.out.println("the info of the students as follow:");
        System.out.println("---------------------------------------------");
        for(int i=0;i<st.length;i++)
        {   st[i].print();
        }
    }
    void print2()                                       //输出排名的信息
    {     System.out.println("---------------------------------------------");
        System.out.println("sorted by average score,students as follow:");
        System.out.println("---------------------------------------------");
        for(int i=0;i<st.length;i++)
        {   st[i].print2();
        }
    }
    public static void main(String[] args)
    {   Stuscore stc=new Stuscore();
        stc.initsc();
        stc.initst();
        stc.accuscore();
        stc.print();
        stc.sort();
        stc.print2();
    }
}
