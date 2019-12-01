package text2;

public class 输出数组元素 {
	public static void main(String[] args) {
		int a[]=new int[]{1,2,6,4,5},k,max;
		for(k=0;k<a.length;k++){
			System.out.println(a[k]);
			
		}
		max=a[0];
		for(k=1;k<a.length;k++){
			if(max<a[k])
				max=a[k];
		}
		System.out.println("max="+max);
	}

}
