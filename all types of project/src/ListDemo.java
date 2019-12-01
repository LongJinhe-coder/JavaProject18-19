import java.util.ArrayList;
import java.util.List;
public class ListDemo {
   public static void main(String [] args){
       int numLength=10;
       int deleteNum=5;
       List<Integer>list=new ArrayList<Integer>();
       init(numLength,list);
       delete(deleteNum,list);
       print(list);
   }
   private static void print(List<Integer>list){
       for(int i=0;i<list.size();i++){
           System.out.print(list.get(i)+"\t");
       }
   }
   private static void delete(int deleteNum,List<Integer>list){
       for(int i=0;i<list.size();i++){
           if((int)list.get(i)==deleteNum){
               list.remove(i);
           }
       }
   }
   private static void init(int numLength,List<Integer>list){
       for(int i=1;i<=numLength;i++){
           list.add(i);
       }
   }
}