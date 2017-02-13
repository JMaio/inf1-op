package week5;

public class SplitPathName {

	public static void main(String args[]) {

		// args[0] = "/home/jwow/eclipse/workspace/project.java";

		for (String path : args) {

			String[] p = splitPath(path);
			System.out.println("File: " + p[1] + " Type: " + p[3] + " [" + p[0] + "]");
		}

	}

	public static String[] splitPath(String s) {
		String[] out = new String[4];

		int trail = s.lastIndexOf('/') + 1;
		
		out[0] = s.substring(0, trail);			// /path/to/file/
		out[1] = s.substring(trail);			// filename.ext

		int ext = s.lastIndexOf('.');
		if (ext <= 0) {
			out[2] = s.substring(trail);		// filename (no .ext given)
			out[3] = "";
		} else {
			out[2] = s.substring(trail, ext);	// filename
			out[3] = s.substring(ext);			// extension
		}

		return out;

	}

}
