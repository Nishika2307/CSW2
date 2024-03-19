import java.util.*;
public class q12 
{
public static void main(String[] args) 
	{
	int arr[]= {1,2,10,8,7,3,4,6,5,9};
	PriorityQueue<Integer>pq=new  PriorityQueue<>();
	for(int i=0;i<arr.length;i++)
	{
		pq.add(arr[i]);
	}
	System.out.println("Elements of the Queue are = "+pq);
	for(int i=0;i<arr.length;i++)
	{
		pq.remove(arr[i]);
		System.out.println(pq);
	}
	}

}
/*Output
 





 */