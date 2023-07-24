package p.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import p.com.Entity.StudentEntity;
import p.com.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService service;

	@RequestMapping("/")
	public String homepage() {
		return "Home";

	}

	@RequestMapping("registrationStudent")
	public String Register() {
		return "RegisterStudent";
	}

	@RequestMapping("/RegStudent")
	public String registerData(@ModelAttribute StudentEntity se, Model m) {

		boolean isAdded = service.register(se);

		if (isAdded) {
			m.addAttribute("successMsg", "Student Added Successfully...");
		} else {
			m.addAttribute("errMsg", "Unable to Add...");
		}

		return "RegisterStudent";
	}

	@RequestMapping("UpdateStudent")
	public String Updateform() {
		return "Update";
	}

	@RequestMapping("/update")
	public String Update(@ModelAttribute StudentEntity se, Model m) {

		boolean isUpdated = service.update(se);

		if (isUpdated) {
			m.addAttribute("successMsg", "Student Updated Successfully...");
		} else {
			m.addAttribute("errMsg", "Unable to Update...");
		}

		return "Update";
	}


	@RequestMapping("/deleteStudent")
	public String DeleteForm() {
		return "Delete";
	}

	@RequestMapping ("/delete")
	public String Delete(@RequestParam int id , Model m) {
		
		StudentEntity se = service.delete(id);
		return "Home";

	
	}
	@RequestMapping("/SingleStudentData")
	public String SelectSingle() {
		return "SingleStudentData";
	}

	@RequestMapping ("/SingleData")
	public String SelectSingle(@RequestParam int id , Model m) {
		
		StudentEntity se = service.SelectSingle(id);
		
		m.addAttribute("stdData", se);
		
		return "ShowSingleData";

	
	}
	@RequestMapping("/viewall")
	public String SelectAll(Model m) {

		List<StudentEntity> list = service.selectAll();
		
		m.addAttribute("std", list);
		return "AllStudentData";
	}
	
	
}

