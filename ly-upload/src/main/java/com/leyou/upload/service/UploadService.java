package com.leyou.upload.service;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.imageio.ImageIO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.leyou.upload.controller.UploadController;

@Service
public class UploadService {

	private static final Logger logger = LoggerFactory.getLogger(UploadController.class);

	private static final List<String> suffixes = Arrays.asList("image/png", "image/jpeg");

	public String upload(MultipartFile file) {
		try {
			String type = file.getContentType();
			if (!suffixes.contains(type)) {
				logger.info("上传失败，文件类型不匹配：{}", type);
				return null;
			}
			BufferedImage image = ImageIO.read(file.getInputStream());
			if (image == null) {
				logger.info("上传失败，文件内容不符合要求");
			}
			File dir = new File("D:\\heima\\upload");
			if (!dir.exists()) {
				dir.mkdirs();
			}
			file.transferTo(new File(dir, file.getOriginalFilename()));
			String url = "http://image.leyou.com/upload/" + file.getOriginalFilename();
			return url;
		} catch (Exception e) {
			return null;
		}
	}
}
