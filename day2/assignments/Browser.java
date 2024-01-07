package class1.day2.assignments;

public class Browser {
	
	public String browserLaunch(String browserName)
	{
		return browserName;
		
	}
	
	public String loadURL(String url)
	{
		return url;
	}
	
	public static void main(String[] args) {
		
		Browser browse = new Browser();
		System.out.println(browse.browserLaunch("Chrome"));
		System.out.println(browse.loadURL("TestLeaf Application url loaded successfully"));
	}

}
