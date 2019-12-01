import java.*;
import java.io.*;
import java.util.Vector;

class MyMedia
{
    String mediaName;
    float price;
    String press;
    String artist;
MyMedia(String name,float price,String press, String artist)
{
    this.mediaName = name;
    this.price = price;
    this.press = press;
    this.artist = artist;
}
MyMedia(){ }
void setName(String mname)
{this.mediaName=mname;
}
void setPrice(float price)
{
    this.price=price;
}
void setPress(String press)
{
    this.press=press;
}
void setArtist(String artist)
{
    this.artist=artist;
}
void print()
{
    System.out.print("Name:"+this.mediaName+"\t"+"Price"+this.price+"\n"+"Press"+this.press+"\t"+"Artist"+this.artist+"\t");
}
}
class MyCD extends MyMedia
{
    String cdISRC;
    String cdPublisher;
    MyCD(String isrc,String name,float price,String press,String artist,String publisher)
    {
        super(name,price,press,artist);
        this.cdISRC=isrc;
        this.cdPublisher=publisher;
    }
    public MyCD() {
		// TODO 自动生成的构造函数存根
	}
	void setCdISRC(String isrc)
    {
        this.cdISRC=isrc;
    }
    void setCdPublisher(String publisher)
    {
        this.cdPublisher=publisher;
    }
    void print()
    {
        System.out.print("ISRC"+this.cdISRC+"\t");
        super.print();
        System.out.print("Publisher:"+this.cdPublisher+"\n");
    }
}
class MyBook extends MyMedia
{
    String editor;
    String bookISBN;
    void setEditor(String editor)
    {
        this.editor=editor;
    }
    void setBookISBN(String bookISBN)
    {
        this.bookISBN=bookISBN;
    }
    MyBook(){ };
    MyBook(String isbn,String name, float price,String press,String artist,String editor)
    {
        super(name,price,press,artist);
        this.bookISBN=isbn;
        this.editor=editor;
    }
    void print()
    {
        System.out.print("ISBN:"+this.bookISBN+"\t");
        super.print();
        System.out.print("editor:"+this.editor+"\n");
    }
}
class MyTape extends MyMedia
{
    String tapeISRC;
    void setTapeISRC(String tapeISRC)
    {
        this.tapeISRC=tapeISRC;
    }
    MyTape(){ };
    MyTape(String isrc,String name,float price,String press,String artist)
    {
        super(name, price, press, artist);
        tapeISRC=isrc;
    }
    void print()
    {
        System.out.print("ISRC:"+this.tapeISRC+"\t");
        super.print();
        System.out.println("");
    }
}
public class MyMediaManager extends Vector
{
    MyMediaManager(){ }




int addMedia(Vector medias,MyMedia tmpmedia)
{
	medias.addElement(tmpmedia);
	return 1;
}

int  deleteMedia(Vector medias)
{
	if(medias.isEmpty()==false)
	{
		int i =medias.size();
		medias.removeElementAt(i-1);
		return 1;
	}
	else
	{
		return 0;
	}
}

MyMedia findMedia (Vector medias,String mname)
{
	MyMedia tmpmedia=new MyMedia();
	tmpmedia=null;
	int i=0;
	for(i=0;i<medias.size();i++)
	{
		MyMedia getmedia=(MyMedia)medias.elementAt(i);
		if(((getmedia.mediaName).trim()).compareTo(mname.trim())==0);
		{
			tmpmedia=(MyMedia)medias.elementAt(i);
		}
	}
	return tmpmedia;
}

public void printMedia(Vector medias)
{
	MyMedia tmpcd;
	int length=medias.size();
	if(length>0)
	{
		System.out.println("Number of vector elements is"+length+"and they are:");
		for(int i=0;i<length;i++)
		{
			tmpcd=(MyMedia)medias.elementAt(i);
			tmpcd.print();
		}
	}
	else
	{
		System.out.println("There is no one media,plese add.");
	}
}

String inputstr()
{
	String pm="";
	try
	{
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader input=new BufferedReader(reader);
		pm=input.readLine();
	}catch (IOException e)
	{
		System.out.println("IO Exception occur...");
	}
	return pm;
}

public static void main(String[] args) {
	MyMediaManager cm=new MyMediaManager();
	Vector books=new Vector(50,1);
	Vector cds=new Vector(50,1);
	Vector tapes=new Vector(50,1);
	
	int count1=1;
	int count=1;
	
	while (count1!=0)
	{
		System.out.println("------------------------------------------\n");
		System.out.println("Which of following do you want to operate:(1,2,3,0)\n");
		System.out.println("1.Book.\n");
		System.out.println("2.CD.\n");
		System.out.println("3.Tape.\n");
		System.out.println("0.exit.\n");
		try
		{
			count1=Integer.parseInt(cm.inputstr());
		}catch(NumberFormatException ne)
		{
			System.out.println("invalid data format...");
		}
		switch (count1)
		{
		case 1:
			count1=1;
			while(count!=0)
			{
				System.out.print("----------------------------------\n");
				System.out.print("Which of following do you want to do:(1,2,3,4,0)\n");
			    System.out.print("1.add book.\n");
			    System.out.print("2.find book.\n");
			    System.out.print("3.delet book.\n");
			    System.out.print("4.print all books.\n");
			    System.out.print("0.back.\n");
			    try
			    {
			    	count=Integer.parseInt(cm.inputstr());
			    }catch(NumberFormatException ne)
			    {
			    	System.out.print("invalid data format...");
			    }
			    switch(count)
			    {
			    case 1:
			    	MyBook book1=new MyBook();
			    	System.out.print("please input book I: ");
			    	book1.setBookISBN(cm.inputstr());
			    	System.out.print("plaese input book Name:  ");
			    	String mName="";
			    	boolean b=true;
			    	L1: while(b)
			    	{
			    		mName=cm.inputstr();
			    		if(mName.matches(""))
			    		{
			    			System.out.println("Name couldn't be null,retry:");
			    			continue L1;
			    		}
			    		b=false;
			    	}
			    	book1.setName(mName);
			    	System.out.print("please inpuut book Price:");
			    	float price=0;
			    	b=true;
			    	try
			    	{
			    		while(b)
			    		{
			    			price=Float.parseFloat(cm.inputstr());
			    			if(price<=0)
			    			{
			    				System.out.print("Price should be lager than 0,retry:");
			    				continue;
			    			}
			    			b=false;
			    		}
			    		book1.setPrice(price);
			        }catch(NumberFormatException ne)
			        {System.out.println("Please input valid number!");
			        }

			        System.out.print("Please input book Press: ");
			        book1.setPress(cm.inputstr());
			        System.out.print("Please input book Author: ");
			        book1.setArtist(cm.inputstr());
			        System.out.print("Please input book Editor: ");
			        book1.setEditor(cm.inputstr());

			        int i=cm.addMedia(books,book1);
			        if(i>0)
			        {
			        System.out.print("insert successful!\n");
			        }
			        else
			        {
			        System.out.print("insert failed!\n");
			        }
			        break;

			        case 2:
			        System.out.println("please input Name of book you want to find:");
			        String name=cm.inputstr();
			        MyBook fbook=(MyBook)cm.findMedia(books,name);
			        if(fbook==null)
			        {
			        System.out.println("There is no book you want. ");
			        }
			        else
			        {
			        System.out.println("info of book you want to find is : ");
			        fbook.print();
			        }
			        break;
			        case 3:
			            if(cm.deleteMedia(books)>0)
			        {
			        System.out.print("delete successful!\n");
			        }
			            else
			        {
			        System.out.print("delete failed!\n");
			        }
			            break;

			            case 4:
			                cm.printMedia(books);
			                break;
			                case 0:
			                    break;
			                    default:
			                        break;
			        }
			        }
			        break;

			case 2:
			    count=1;
			    while(count!=0)
			        {
			        System.out.print("------------------------------------------\n");
			        System.out.print("which of folloeing do you want to do:(1,2,3,4,0)\n");
			        System.out.print("1.add cd.\n") ;
			        System.out.print("2.find cd.\n") ;
			        System.out.print("3.delete cd.\n") ;
			        System.out.print("4.print all cds.\n") ;
			        System.out.print("0.back.\n") ;
			        try
			        {
			            count=Integer.parseInt(cm.inputstr());
			        }catch(NumberFormatException ne)
			        {
			        System.out.println("invaild data format...");
			        }
			        switch(count)
			        {
			            case 1:
			                MyCD cd1=new MyCD ();
			        System.out.print("please input cd ID: ");
			        cd1.setCdISRC(cm.inputstr());

			        System.out.print("please input cd Name: ");
			        String mName="";
			        boolean b=true;
			        L1:
			          while(b)
			        {
			            mName= cm.inputstr();
			            if(mName.matches(""))
			        {
			        System.out.println("Name couldn't be null,retry:");
			        continue L1;
			        }
			            b=false;
			        }
			          cd1.setName(mName);

			        System.out.print("please input cd Price: ");
			        float price=0;
			        b=true;
			        try
			        {
			            while(b)
			        {
			            price=Float.parseFloat(cm.inputstr());
			            if(price<=0)
			        {
			        System.out.print("Price should be lager than 0,retry: ");
			        continue;
			        }
			            b=false;
			        }
			            cd1.setPrice(price);
			        }catch(NumberFormatException ne)
			        {
			        System.out.println("please input vaild number!");
			        }
			        System.out.print("please input cd Press: ");
			        cd1.setPress(cm.inputstr());
			        System.out.print("please input cd Artist: ");
			        cd1.setArtist(cm.inputstr());
			        System.out.print("please input cd Publisher: ");
			        cd1.setCdPublisher(cm.inputstr());
			        int i=cm.addMedia(cds,cd1);
			        if(i>0)
			        {
			        System.out.print("insert successful!\n");
			        }
			        else {
			        System.out.print("insert failed!\n");
			        }
			          break;
			             case 2:
			                 System.out.println("please input Name of cd you want to find:");
			                 String name=cm.inputstr();
			                 MyCD fcd=(MyCD)cm.findMedia(cds,name);//find cd 
			                 if(fcd==null)
			                 {  System.out.println("There is no cd you want.");
			                 }
			                 else
			                 {  System.out.println("info of cd you want to find is:");
			                    fcd.print();
			                 }
			                 break; 
			             case 3:
			                 if(cm.deleteMedia(cds)>0)
			                 {  System.out.print("delete failed!\n");
			                 }
			                 else
			                  {  System.out.print("delete failed!\n");
			                  }    
			                 break;
			             case 4:
			                  cm.printMedia(cds);
			                  break;
			             case 0:
			                 break;
			             default:
			                 break;
			          }      
			        }
			        break;
			  case 3:
			      count=1;
			      while(count!=0)
			      {System.out.print("--------------------------------\n");
			         System.out.print("while of following do you want to do:(1,2,3,4,0)\n");
			         System.out.print("1.add tape.\n");
			         System.out.print("2.find tape.\n");
			        System.out.print("3.delete tape.\n");
			        System.out.print("4.print all tapes.\n");
			        System.out.print("0.back.\n");
			        try
			        {  count=Integer.parseInt(cm.inputstr());
			        }   catch(NumberFormatException ne)
			        {  System.out.println("invalid date format...");
			        }
			        switch(count)
			        {case 1:
			        MyTape tape1=new MyTape();
			        System.out.print("please input tape ID:");
			        tape1.setTapeISRC(cm.inputstr());

			        System.out.print("please input tape Name:");
			        String mName="";
			        boolean b=true;
			        L1:while(b)
			        {mName=cm.inputstr();
			        if(mName.matches(""))
			        {System.out.println("Name couldn't be null,retry:");
			        continue L1;
			        }
			        b=false;
			        }
			        tape1.setName(mName);

			        System.out.print("please input tape Price:");
			        float price=0;
			        b=true;
			        try
			        {while(b)
			        {price=Float.parseFloat(cm.inputstr());
			        if(price<=0)
			        {System.out.print("Price should be lager than 0,retry:");
			        continue;
			        }
			        b=false;
			        }
			        tape1.setPrice(price);
			        }catch(NumberFormatException ne)
			        {System.out.println("please input valid number!");
			        }

			        System.out.print("please input tape Press:");
			        tape1.setPress(cm.inputstr());
			        System.out.print("please input tape Artist:");
			        tape1.setArtist(cm.inputstr());

			        int i=cm.addMedia(tapes,tape1);
			        if(i>0)
			        {System.out.print("insert successful!\n");
			        }
			        else
			        {System.out.print("insert failed!\n");
			        }
			        break;
			        case 2:
			        System.out.println("please input Name of tape you want to find:");
			        String name=cm.inputstr();
			        MyTape ftape=(MyTape)cm.findMedia(tapes,name);
			        if(ftape==null)
			        {System.out.println("There is no tape you want.");
			        }
			        else
			        {System.out.println("info of tape you want to find is :");
			        ftape.print();
			        }
			        break;
			        case 3:
			        if(cm.deleteMedia(tapes)>0)
			        {System.out.print("delete successful!\n");
			        }
			        else
			        {System.out.print("delete failed!\n");
			        }
			        break;
			        case 4:
			        cm.printMedia(tapes);
			        break;
			        case 0:
			        break;
			        default:
			            break;
			        }
			       }
			      break;
			      
			   case 0:
			       System.exit(0);
			       default:
			           break;
			        }  
			        }
			        }
			        };
			
	
