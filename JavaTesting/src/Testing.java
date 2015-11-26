import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Testing {

	public static void main(String[] args) {
		String string = "asd_sdfser_xvdrg";

		String new_String = getSubString(string);
	}
	
	
	
	public static String getSubString(String s) {
		Pattern pattern = Pattern.compile("(?<!a)_");
	    Matcher matcher = pattern.matcher(s);
	    int index = matcher.find() ? matcher.start() : -1;
	    System.out.println("index --> "+index);
		String new_String = s.substring(index);
		System.out.println("new string --> "+new_String);
		return new_String;
	    
	}
}
