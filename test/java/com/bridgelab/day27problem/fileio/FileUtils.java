package com.bridgelab.day27problem.fileio;

import java.io.File;

public class FileUtils {

	public static boolean deleteFiles(File deletableFile) {

		File [] allContents = deletableFile.listFiles();
		if(allContents != null) {
			for(File file : allContents) {
				deleteFiles(file);
			}
		}
		return deletableFile.delete();
	}

}
