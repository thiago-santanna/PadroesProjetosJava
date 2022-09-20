package CompositeFiles;

import java.io.File;

public class Principal {
	private static String level = "";

	public static void main(String[] args) {
		showAllDirectory("/home/thiaho/www/estudos/design-patterns-js");
	}

	public static void showAllDirectory(String stringPath) {
		File dir = new File(stringPath);

		File[] dirs = dir.listFiles();

		for (int i = 0; dirs != null && i < dirs.length; i++) {
			File f = dirs[i];
			if (f.isFile()) {
				System.out.println(level + f.getName());
			} else if (f.isDirectory()) {
				System.out.println(level + f.getName());
				level += "----";
				showAllDirectory(f.getAbsolutePath());
				level = level.substring(0, level.lastIndexOf("----"));
			}
		}

	}
}
