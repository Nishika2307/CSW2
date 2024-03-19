import java.util.*;
public class q9 
{
public static  void repeating(int arr[])
{
HashSet<Integer>hs=new HashSet<Integer>();	
HashSet<Integer>hss=new HashSet<Integer>();	
		for(int num:arr)
		{
			if(!hs.add(num)) 
			{
				hss.add(num);
			}
		}
		System.out.println("Repeated elemment "+hss);
}
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[6];
	System.out.println("Enter the array elements : ");
	for(int i=0;i<6;i++) 
	{
	arr[i]=sc.nextInt();
	}
	repeating(arr);
  }
}
 /*Output
 Enter the array elements : 
3
1
3
2
7
7
Repeated elemment [3, 7]
*/