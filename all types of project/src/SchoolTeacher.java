import java.lang.*;
class Date                  //����������
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
    public int getYear()               //������
    {
        return year;
    }
    public int getMonth()               //������
    {
        return month;
    }
    public int getDay()               //������
    {
        return day;
    }
    public void setDate(Date SpeDate)           //��������
    {
        year=SpeDate.getYear();
        month=SpeDate.getMonth();
        day=SpeDate.getDay();
    }
}
public class SchoolTeacher {                             //�����ʦ�࣬���ǻ���
    private String name;                 //��ʦ����
    private boolean sex;                 //�Ա�true��ʾ���ԣ�false��ʾŮ��
    private Date birth;                     //��ʦ��������
    private String salaryID;                 //��ʦ���ʺ�
    private String depart;               //��ʦ������
    private String posit;                    //��ʦְ��

    String getName()                     //���ؽ�ʦ����
    {
        return name;
    }

    void setName(String name)               //��¼��ʦ����
    {
        this.name = name;
    }

    boolean getSex()                    //���ؽ�ʦ�Ա�
    {
        return sex;
    }

    void setSex(boolean sex)                //��¼��ʦ�Ա�
    {
        this.sex = sex;
    }

    Date getBirth()                    //���ؽ�ʦ��������
    {
        return birth;
    }

    void setBirth(Date birth)                 //��¼��ʦ��������
    {
        this.birth = birth;
    }

    String getSalaryID()                 //���ؽ�ʦ���ʺ�
    {
        return salaryID;
    }

    void setSalaryID(String salaryID)              //��¼��ʦ���ʺ�
    {
        this.salaryID = salaryID;
    }

    String getDepart()                      //���ؽ�ʦ����ϵ����
    {
        return depart;
    }

    void setDepart(String depart)            //��¼��ʦ����ϵ����
    {
        this.depart = depart;
    }

    String getPosit()                        //���ؽ�ʦְ��
    {
        return posit;
    }

    void setPosit(String posit)               //��¼��ʦְ��
    {
        this.posit = posit;
    }

    public SchoolTeacher(String name)            //ֻ��һ�����Բ����Ĺ��췽��
    {
        this.name = name;
    }

    public SchoolTeacher(String name, boolean sex, Date birth) {
        this(name);             //����ֻ��һ�������Ĺ��췽��
        this.sex = sex;                //�������������Ը�ֵ
        this.birth = birth;
    }

    //����ȫ��6�����Բ����Ĺ��췽��
    public SchoolTeacher(String name, boolean sex, Date birth, String salaryID, String depart, String posit) {
        this(name, sex, birth);            //���ú�3�������Ĺ��췽��
        this.salaryID = salaryID;           //�������3�����Ը�ֵ
        this.depart = depart;
        this.posit = posit;
    }

    public void print()             //�����ʦ�Ļ�����Ϣ
    {
        System.out.print("The SchoolTeacher name: ");
        System.out.println(this.getName());
        System.out.print("The SchoolTeacher sex: ");
        if (this.getSex() == false) {
            System.out.println("Ů");
        } else {
            System.out.println("��");
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


        //����������ʦʵ����һ��Ϊ�����ʵ������һ��Ϊ�����ʵ��
        SchoolTeacher t1 = new SchoolTeacher("zhangsan", false, dt1, "123", "CS", "Professor");
        ResearchSchoolTeacher rt = new ResearchSchoolTeacher("lisi", true, dt2, "421", "software engineering", "associate professor",
                "Software");
        //�ֱ���ø��Ե���������������Ӧ��Ϣ
        System.out.println("--------------------------------------------------");
        t1.print();                  //�����ͨ��ʦ����Ϣ
        System.out.println("-----------------------------------------------------");
        rt.print();                        //����о�ϵ�н�ʦ����Ϣ
        System.out.println("--------------------------------------------------");
    }
}


    class ResearchSchoolTeacher extends SchoolTeacher              //�о�ϵ�н�ʦ��Ķ���
    {
        private String resField;                     //���ӵ��о���������

        String getResField()                 //�����о���������
        {
            return resField;
        }

        void setResField(String resField)                   //��¼�о���������
        {
            this.resField = resField;
        }

        public ResearchSchoolTeacher(String name, boolean sex, Date birth, String salaryTD, String depart, String posit, String resField) {
            //ʹ�ø���Ĺ��췽�����Թ��е�6�����Խ��и�ֵ
            super(name, sex, birth, salaryTD, depart, posit);
            this.resField = resField;                  //�������Եĸ�ֵ

        }

        public void print() {
            System.out.println("One of Research SchoolTeacher'info is");
            super.print();                                   //ʹ�ø�����������
            System.out.println("The SchoolTeacher research field is: ");// }
            System.out.println(this.getResField());              //�������Ե����
        }
    }