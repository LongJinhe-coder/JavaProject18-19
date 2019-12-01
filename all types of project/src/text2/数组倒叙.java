package text2;

public class Êý×éµ¹Ðð {
	public static void main(String[] args) {
		int a=2345678,k,i,x,sum=0,index;
		for(k=0;k<7;k++){
			x=a%10;
			index=x;
			for(i=k;i<6;i++){
				x*=10;
				
			}
			sum+=x;
			a=(a-index)/10;
			
		}
		System.out.println(sum);
			
	}

}
