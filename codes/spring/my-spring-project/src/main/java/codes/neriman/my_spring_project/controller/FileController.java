package codes.neriman.my_spring_project.controller;


import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping(path = "/files")
@CrossOrigin(origins = "*")
public class FileController {

	@PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public void upload(@RequestParam(name = "file") MultipartFile file) throws Throwable {
		
		InputStream stream = file.getInputStream();
		
		String originalFilename = file.getOriginalFilename();
		
		UUID uuid = UUID.randomUUID();
		String randomName = uuid.toString(); 
		
		String originalFileNameWithoutExtension = originalFilename.substring(0, originalFilename.lastIndexOf("."));
		
		String randomFileName = originalFilename.replace(originalFileNameWithoutExtension, randomName);
		
		File folder = new File("C:/java2Sentyabr");
		if (!folder.exists()) {
			folder.mkdir();
		}
		
		//Save to disk random file name
		Files.copy(stream, Paths.get("C:/java2Sentyabr" + "/" + randomFileName), StandardCopyOption.REPLACE_EXISTING);
		
		
	}
}