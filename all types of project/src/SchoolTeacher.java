import java.lang.*;
class Date                  //定义日期类
{
    int day;
    int month;
    int year;
    Date(int day,int month,int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }
    Date()
    {
        this.day=8;
        this.month=11;
        this.year=2012;
    }
    public int getYear()               //返回年
    {
        return year;
    }
    public int getMonth()               //返回月
    {
        return month;
    }
    public int getDay()               //返回日
    {
        return day;
    }
    public void setDate(Date SpeDate)           //设置日期
    {
        year=SpeDate.getYear();
        month=SpeDate.getMonth();
        day=SpeDate.getDay();
    }
}
public class SchoolTeacher {                             //定义教师类，这是基类
    private String name;                 //教师名字
    private boolean sex;                 //性别，true表示男性；false表示女性
    private Date birth;                     //教师出生日期
    private String salaryID;                 //教师工资号
    private String depart;               //教师所属性
    private String posit;                    //教师职称

    String getName()                     //返回教师名字
    {
        return name;
    }

    void setName(String name)               //记录教师名字
    {
        this.name = name;
    }

    boolean getSex()                    //返回教师性别
    {
        return sex;
    }

    void setSex(boolean sex)                //记录教师性别
    {
        this.sex = sex;
    }

    Date getBirth()                    //返回教师出生日期
    {
        return birth;
    }

    void setBirth(Date birth)                 //记录教师出生日期
    {
        this.birth = birth;
    }

    String getSalaryID()                 //返回教师工资号
    {
        return salaryID;
    }

    void setSalaryID(String salaryID)              //记录教师工资号
    {
        this.salaryID = salaryID;
    }

    String getDepart()                      //返回教师所属系所名
    {
        return depart;
    }

    void setDepart(String depart)            //记录教师所属系所名
    {
        this.depart = depart;
    }

    String getPosit()                        //返回教师职称
    {
        return posit;
    }

    void setPosit(String posit)               //记录教师职称
    {
        this.posit = posit;
    }

    public SchoolTeacher(String name)            //只含一个属性参数的构造方法
    {
        this.name = name;
    }

    public SchoolTeacher(String name, boolean sex, Date birth) {
        this(name);             //调用只含一个参数的构造方法
        this.sex = sex;                //对其余两个属性赋值
        this.birth = birth;
    }

    //含有全部6个属性参数的构造方法
    public SchoolTeacher(String name, boolean sex, Date birth, String salaryID, String depart, String posit) {
        this(name, sex, birth);            //调用含3个参数的构造方法
        this.salaryID = salaryID;           //对其余的3个属性赋值
        this.depart = depart;
        this.posit = posit;
    }

    public void print()             //输出教师的基本信息
    {
        System.out.print("The SchoolTeacher name: ");
        System.out.println(this.getName());
        System.out.print("The SchoolTeacher sex: ");
        if (this.getSex() == false) {
            System.out.println("女");
        } else {
            System.out.println("男");
        }
        System.out.print("The SchoolTeacher birth: ");
        System.out.println(this.getBirth().year + "-" + this.getBirth().month + "-" + this.getBirth().day);
        System.out.print("The SchoolTeacher salaryID: ");
        System.out.println(this.getSalaryID());
        System.out.print("The SchoolTeacher posit: ");
        System.out.println(this.getPosit());
        System.out.print("The SchoolTeacher depart: ");
        System.out.println(this.getDepart());
    }

    public static void main(String[] args) {
        Date dt1 = new Date(12, 2, 1985);
        Date dt2 = new Date(2, 6, 1975);
        Date dt3 = new Date(11, 8, 1964);
        Date dt4 = new Date(10, 4, 1975);
        Date dt5 = new Date(8, 9, 1969);


        //创建两个教师实例，一个为父类的实例，另一个为子类的实例
        SchoolTeacher t1 = new SchoolTeacher("zhangsan", false, dt1, "123", "CS", "Professor");
        ResearchSchoolTeacher rt = new ResearchSchoolTeacher("lisi", true, dt2, "421", "software engineering", "associate professor",
                "Software");
        //分别调用各自的输出方法，输出相应信息
        System.out.println("--------------------------------------------------");
        t1.print();                  //输出普通教师的信息
        System.out.println("-----------------------------------------------------");
        rt.print();                        //输出研究系列教师的信息
        System.out.println("--------------------------------------------------");
    }
}


    class ResearchSchoolTeacher extends SchoolTeacher              //研究系列教师类的定义
    {
        private String resField;                     //增加的研究领域属性

        String getResField()                 //返回研究领域属性
        {
            return resField;
        }

        void setResField(String resField)                   //记录研究领域属性
        {
            this.resField = resField;
        }

        public ResearchSchoolTeacher(String name, boolean sex, Date birth, String salaryTD, String depart, String posit, String resField) {
            //使用父类的构造方法，对共有的6个属性进行赋值
            super(name, sex, birth, salaryTD, depart, posit);
            this.resField = resField;                  //特殊属性的赋值

        }

        public void print() {
            System.out.println("One of Research SchoolTeacher'info is");
            super.print();                                   //使用父类的输出方法
            System.out.println("The SchoolTeacher research field is: ");// }
            System.out.println(this.getResField());              //特殊属性的输出
        }
    }