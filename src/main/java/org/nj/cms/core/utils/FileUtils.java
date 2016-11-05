package org.nj.cms.core.utils;

import java.io.File;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.multipart.MultipartFile;
 

public class FileUtils {

	// 创建文件夹
	public static void createDir(String dir) {
		File fileDir = new File(dir);
		if (!fileDir.exists()) {
			fileDir.mkdirs();
		}
	}

	// 上传文件
	public static Map<String, String> uploadFiles(String dir, MultipartFile... files) { 
		return null;
	}

	// 删除多文件
	public static void delFile(String dir, String imgNewNames) {
	 if (StringUtils.isNotEmpty(imgNewNames)) {
			String[] pics = imgNewNames.split(",");
			for (String pic : pics) {
				File f = new File(dir, pic);
				if (f.exists()) {
					f.delete();
				}
			}
		} 
	}
}
