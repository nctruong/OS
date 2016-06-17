package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import model.Customer;
import service.CustomerService;


@Controller
@RequestMapping("Customer")
public class CtrlCustomer {
	
	@Autowired
	@Qualifier("CustomerService")
	CustomerService service;

	@RequestMapping(value = { "/info" }, method = RequestMethod.GET)
	public String CustomerInfo(@RequestParam("Customer_id") int Customer_id, ModelMap model){
		
		/*Customer Customer = service.findById(Customer_id);
		model.addAttribute("Customer", Customer);
		model.addAttribute("address", Customer.getAddress());
				
		
		List<Score> scores  = Customer.getScores();
		List<Score> modelScores	= new ArrayList<Score>(); 
		for(Score score:scores){
			if (score != null){
				modelScores.add(score);
			}
		}
		model.addAttribute("scores", modelScores);
		model.addAttribute("CustomerId", Customer_id);*/
		
		return "test";
	}
	
	@RequestMapping(value = { "/logout" }, method = RequestMethod.GET)
	public String CustomerInfo(@RequestParam("userId") int userId, ModelMap model
			,HttpSession session, HttpServletRequest request){
		
		session.setAttribute("isLogin", false);
		
		return "login";
	}
}
