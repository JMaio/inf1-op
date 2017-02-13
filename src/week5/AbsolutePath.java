package week5;

public class AbsolutePath {

	public static void main(String[] args) {
		String currentDir = System.getProperty("user.dir");
		
		System.out.println(currentDir);

	}
	
	
	public static String ensureAbsolute(String path) {
		String currentDir = System.getProperty("user.dir");
		if (path.charAt(0) == '/') {
			return path;
		} else {
			return currentDir + '/' + path;
		}
	}
	
	public static String[] absoluteSplitPath(String s) {
		String[] out = SplitPathName.splitPath(s);
		out[0] = ensureAbsolute(out[0]);
		
		return out;
	}

}
