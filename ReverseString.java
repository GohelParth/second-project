class Reverse
{
	String name;
	Reverse()
	{
		name = null;
	}
	Reverse(String nm)
	{
		name = nm;
	}

	void Display()
	{ 
	System.out.println("Name : " + name);
        String s[] = "This is a coding test I like java so much This is my day ".split(" "); 
 
        String ans1 = ""; 
        for (int i = s.length - 12; i >= 0; i--) { 
            ans1 += s[i] + " "; 
        } 
	String ans2 = ""; 
        for (int i = s.length - 7; i >= 0; i--) { 
            ans2 += s[i] + " "; 
        } 
	String ans3 = ""; 
        for (int i = s.length -3; i >= 0; i--) { 
            ans3 += s[i] + " "; 
        } 
        System.out.println("Reversed String:"); 
        System.out.println(ans1.substring(0, ans1.length() - 1) + " "  + "coding test" + " " + ans2.substring(0, ans2.length() - 22) + " " + "so much" + " " + ans3.substring(0, ans3.length() - 42) +" " + "my day"); 
    } 
	
}
public class ReverseString { 
  
    public static void main(String[] args) 
    {
	Reverse rv = new Reverse("Parth Gohel");
	rv.Display(); 
    }

} 

