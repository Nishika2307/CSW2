import java.util.*; //TreeSet
public class q6 
{
  public static void main(String[] args) 
   {
	  Scanner sc=new Scanner(System.in);
	  TreeSet<Integer> ts=new TreeSet<Integer>();//can store only one datatype
	    ts.add(10);
		ts.add(10);
		ts.add(5);
		ts.add(7);
		ts.add(20);
		System.out.println(ts);
		int n;
		System.out.print("Enter the number to be searched : ");
		n=sc.nextInt();
		System.out.println(ts.contains(n));
		ts.remove(7);
		System.out.println("After Removal 7 "+ts);
		
}

}
/*OUTPUT
/*[5, 7, 10, 20]
Enter the number to be searched : 34
false
After Removal 7 [5, 10, 20]
*/