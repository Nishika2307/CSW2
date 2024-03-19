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
 Elements of the Queue are = [1, 2, 3, 5, 7, 10, 4, 8, 6, 9]
[2, 5, 3, 6, 7, 10, 4, 8, 9]
[3, 5, 4, 6, 7, 10, 9, 8]
[3, 5, 4, 6, 7, 8, 9]
[3, 5, 4, 6, 7, 9]
[3, 5, 4, 6, 9]
[4, 5, 9, 6]
[5, 6, 9]
[5, 9]
[9]
[]
*/