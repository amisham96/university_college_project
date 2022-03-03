package com.myapp.universitycollege.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.myapp.universitycollege.entity.University;
import com.myapp.universitycollege.exception.UniversityCollegeApplicationException;
import com.myapp.universitycollege.service.UniversityService;

@Controller
public class UniversityController {

	@Autowired
	UniversityService universityService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String indexPage() {

		return "index";
	}

	@RequestMapping(value = "/university", method = RequestMethod.GET)
	public String addNewUniversityPage(Model model) {
		University university = new University();
		model.addAttribute("university", university);
		return "add_university";
	}

	@RequestMapping(value = "/addNewUniversity", method = RequestMethod.POST)
	public String addNewUniversity(@ModelAttribute("university") University university)
			throws UniversityCollegeApplicationException {

		universityService.addNewUniversity(university);
		return "redirect:/universitiesList";
	}

	@RequestMapping(value = "/universitiesList", method = RequestMethod.GET)
	public ModelAndView listAllUniversity(ModelAndView mav) throws UniversityCollegeApplicationException {
		List<University> listuniversity = universityService.getAllUniversity();
		mav.addObject("listuniversity", listuniversity);
		mav.setViewName("list_university");
		return mav;
	}

	@RequestMapping(value = "/editExistingUniversity/{universityId}", method = RequestMethod.GET)
	public ModelAndView editExistingUniversity(@PathVariable(name = "universityId") int universityId,
			ModelAndView mav) {

		University university = universityService.getUniversityById(universityId);
		mav.addObject("university", university);
		mav.setViewName("edit_university");
		return mav;
	}

	@RequestMapping(value = "/updateExistingUniversity/{universityId}", method = RequestMethod.POST)
	public String updateExistingUniversity(@ModelAttribute(value = "university") University university,
			@PathVariable(name = "universityId") int universityId) {

		universityService.updateExistingUniversity(university, universityId);
		return "redirect:/universitiesList";
	}
	
	@RequestMapping(value = "/deletePerticularUniversity/{universityId}", method = RequestMethod.GET)
	public String deletePerticularUniversity(@PathVariable(name = "universityId") int universityId) {
		
		universityService.deleteUniversityById(universityId);
		return "redirect:/universitiesList";
	}
	
	@RequestMapping(value = "/viewUniversity/{universityId}", method = RequestMethod.GET)
	public ModelAndView viewExistingUniversity(@PathVariable(name = "universityId") int universityId,
			ModelAndView mav) {

		University university = universityService.getUniversityById(universityId);
		mav.addObject("university", university);
		mav.setViewName("view_university");
		return mav;
	}

}
