package Assignment2.Part2;

package Assignment2;
import java.util.*; //TreeMap
public class q7 
{
private int plotno;
private String at;
private String post;
q7(int plotno,String at,String post )
{
	this.plotno=plotno;
	this.at=at;
	this.post=post;
}

	
public String toString() {
	return "q7 [plotno=" + plotno + ", at=" + at + ", post=" + post + "]";
}

	public static void main(String[] args) 
	{
		q7 a=new q7(31, "bbsr","as");
		TreeMap<String,Object>tmap=new TreeMap<>();
		tmap.put("Nishika", a);
		Set s=tmap.entrySet();
		System.out.println(s);
		Iterator t1 = s.iterator();

		while (t1.hasNext()) {
		Map.Entry e = (Map.Entry) t1.next();
		System.out.print("key is: " + e.getKey() + " and Value is: ");
		System.out.println(e.getValue());

	}

}
}

/*OUTPUT
 [Nishika=q7 [plotno=31, at=bbsr, post=as]]
key is: Nishika and Value is: q7 [plotno=31, at=bbsr, post=as]
 */
