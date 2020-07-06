package com.projct.car.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.projct.car.Customerdao.CustomerDao;
import com.projct.car.model.Car;
import com.projct.car.model.Customer;
import com.projct.car.resources.CarRepository;
import com.projct.car.resources.CustomerRepository;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerDao customerDao;

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private CarRepository carRepository;

	@GetMapping
	public String welcomeCustomer() {
		return "welcome2";
	}

	@RequestMapping(value = "/sign-up", method = RequestMethod.GET)
	public String showSignUp(ModelMap model) {
		model.addAttribute("register", new Customer());
		return "customer-signup";
	}

	@RequestMapping(value = "/sign-up", method = RequestMethod.POST)
	public String signup(@Valid @ModelAttribute("register") Customer customer, BindingResult result,
			@RequestParam("userName") String userName, ModelMap model) {
		// Customer cust=new
		// Customer(customer.getId(),customer.getUserName(),customer.getPassword(),customer.getEmail());
		if (result.hasErrors()) {
			return "customer-signup";
		} else {
			System.out.println(customer);
			if (customerDao.signup(customer)) {
				model.put("customerName", userName);
				return "customer-welcome";
			} else {
				String x = "Customer Already Exist";
				model.addAttribute("msg", x);
				return "customer-signup";
			}
		}
	}

	@GetMapping("/login")
	public String showLogin(ModelMap model) {
		model.addAttribute("login", new Customer());
		return "customer-login";
	}

	@PostMapping("/login")
	public String login(@RequestParam("user") String user, @RequestParam("password") String password, ModelMap model) {
		System.out.println(user + "password:" + password);
		List<Customer> custList = customerRepository.findAll();
		for (Customer customer : custList) {
			if (((customer.getUserName().equals(user)) || (customer.getEmail().equals(user)))
					&& ((customer.getPassword().equals(password)))) {
				model.put("customerName", user);
				return "customer-signin";
			}
		}
		model.addAttribute("msg", "UserName Or Password Is Invalid");
		return "customer-login";

	}

	@GetMapping("/showall")
	public ModelAndView getAllpage() {
		List<Car> list = carRepository.findAll();
		System.out.println(list);
		ModelAndView mv = new ModelAndView("show-car");
		mv.addObject("list", list);
		return mv;
	}

	@GetMapping("/release")
	public String releaseCar() {
		return "release";
	}

	@PostMapping("/releaseCar")
	public String release(@RequestParam("id") String id, ModelMap model) {
		Car car = carRepository.getOne(Integer.parseInt(id));
		List<Car> cars = carRepository.findAll();
		for (Car car2 : cars) {
			if (car2.getId() == car.getId()) {
				if (car.getAvailability().equals("NO")) {
					car.setAvailability("YES");
					carRepository.save(car);
					String x = "SUCCESSFULLY RELEASED";
					model.put("msg", x);
				} else {
					String x = "ALREADY AVAILABLE";
					model.put("msg", x);
				}
				return "release";
			}
		}
		return "car-not-found";

	}

	@GetMapping("/bookcar")
	public String bookCar() {
		return "car";
	}

	@PostMapping("/bookCar")
	public String carBook(@RequestParam("id") String id, ModelMap model) {
		List<Car> carlist=carRepository.findAll();
		for (Car caravail : carlist) {
		    if(caravail.getId()==Integer.parseInt(id)) {	
		
		Car car = carRepository.getOne(Integer.parseInt(id));
		model.addAttribute("Car", car);
		return "car";
		    }
		}
		return "car-not-found";
	}

	@GetMapping("/booking")
	public String booking(@RequestParam("CarId") String id) {
		Car car = carRepository.getOne((Integer.parseInt(id)));
		if (car.getAvailability().equalsIgnoreCase("YES")) {
			car.setAvailability("NO");
			carRepository.save(car);
			return "confirm";
		}
		return "not-available";
	}

	@GetMapping("/logout")
	public String logout(ModelMap model) {
		return "logoutCustomer";
	}

}
