package text2;

public class 求数组前20项和 {
	public static void main(String[] args) {
		
int a=2,b=3,c=1,d=2;
int i,j,k,sum=0;
for(k=0;k<20;k++){
	i=a/c;
	System.out.println(i);
	a=b;c=d;
	b=a+b;d=c+d;
	sum+=i;
}
System.out.println("前20项和="+sum);
	}
}
