package com.projct.car.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.projct.car.Admindao.AdminDao;
import com.projct.car.model.Admin;
import com.projct.car.model.Car;
import com.projct.car.resources.CarRepository;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminDao adminDao;

	@Autowired
	private CarRepository carRepository;

	@RequestMapping(method = RequestMethod.GET)
	public String showLogin(ModelMap model) {
		model.addAttribute("register", new Admin());
		return "login";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String showWelcome(@Valid @ModelAttribute("register") Admin admin, BindingResult result,
			@RequestParam("adminName") String adminName, ModelMap model) {

		model.put("adminName", adminName);
		if (result.hasErrors()) {

			return "login";
		} else {
			System.out.println(admin);
			if (adminDao.check(admin))
				return "welcome";
			else {
				String x = "Invalid Admin!";
				model.addAttribute("msg", x);
				return "login";
			}

		}
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(ModelMap model) {
		model.addAttribute("register", new Car());
		return "edit";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateCar(@Valid @ModelAttribute("register") Car car, BindingResult result, ModelMap model) {

		if (result.hasErrors())
			return "edit";
		else {
			String msg = adminDao.edit(car);
			model.addAttribute("res", msg);
			return "edit";
		}
	}
	@GetMapping("/showCarAdmin") 
	public String showAll(ModelMap model){
		List<Car> car=carRepository.findAll();
		model.addAttribute("Car",car);
		return "showCar";
	}
	
	@GetMapping("/logout")
	public String logout(ModelMap model) {
		return "logoutAdmin";
	}

	@ModelAttribute("availability")
	public Map<String, String> getAvailability() {
		Map<String, String> av = new HashMap<String, String>();
		av.put("YES", "YES");
		av.put("NO", "NO");
		return av;
	}

}
