package com.calculator.controller;

	import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.calculator.clac.Calculator;



	public class Controller {
		@GetMapping("/calculator/add")
		  
	public  String calculate(@RequestParam(value = "num1",required =true,defaultValue= "1") int num1,
					  @RequestParam(value = "num2",required =true,defaultValue = "2" )int num2
			           )   
			{
			return "<h1>The sum is "+ Calculator.addNo(num1, num2)+"</h1>";
					  }
		@GetMapping("/calculator/sub")
		public String calculate1(@RequestParam(value = "n1",required = true,defaultValue = "1") int n1,
				@RequestParam(value = "n2",required = true,defaultValue = "2" )int n2
				)
		{
		return "<h1>The substraction is "+ Calculator.subNo(n1, n2)+"</h1>";
		}
		
		@GetMapping("/calculator/multi")
		public String calculate2(@RequestParam(value = "n1",required = true,defaultValue = "1") int n1,
				@RequestParam(value = "n2",required = true,defaultValue = "2" )int n2
				)
		{
		return "<h1>The multiplication is "+ Calculator.multiNo(n1, n2)+"</h1>";
		
		}
		
		@GetMapping("/calculator/div")
		public String calculate3(@RequestParam(value = "n1",required = true,defaultValue = "1") int n1,
				@RequestParam(value = "n2",required = true,defaultValue = "2" )int n2
				)
		{
		return "<h1>The division is "+ Calculator.divNo(n1, n2)+"</h1>";
		}
	}
		  
	


