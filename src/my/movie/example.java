package my.movie;

public class example {
public static void main(String[] args)
{
	String line="some more silly stuff on strings!";
	int x=line.indexOf("m");
	System.out.println(x);
	String str=line.substring(10,15)+line.substring(25,25+x);
	System.out.println(str);
}
}
