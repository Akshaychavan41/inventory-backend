package com.inventory.backend.db.resource;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.inventory.backend.db.repository.UserRepository;
import com.inventory.backend.db.model.Users;
@RestController
@RequestMapping(value="/rest")
public class Resource {
	
	
	@Autowired
	UserRepository userRepository;
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value="/get")
	public List<Users> getAll(){
		return userRepository.findAll();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping(value="/delete/{id}")
	public List<Users> deleteItem(@PathVariable("id") String id){
		System.out.println(id);
		Integer uid = Integer.parseInt(id);
		userRepository.deleteById(uid);
		return userRepository.findAll();
	
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(value="/load")
	public List<Users> loadData(@RequestParam("name") String name, 
			@RequestParam("price") String price, 
			@RequestParam("description") String description, 
			@RequestParam("imageFile") MultipartFile file){
		
         try {
			byte[] image = file.getBytes();
			Users users = new Users(name, description, price, image);
			userRepository.save(users);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
     
		return userRepository.findAll();
	}
}
