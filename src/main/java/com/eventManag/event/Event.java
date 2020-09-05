package com.eventManag.event;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

@Controller
public class Event {
	static List<DummyEvent> eveList=new ArrayList<DummyEvent>();
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView add(ModelAndView model) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("lists",getList());
		mv.setViewName("addPage");
		
		return mv;

	}
	public List<String> getList(){
		List<String> l=new ArrayList<String>();
		l.add("Cricket");
		l.add("Football");
		l.add("Badminton");
		return l;
	}
	@RequestMapping(value="/display")
	public ModelAndView display(HttpServletRequest request,HttpServletResponse resp)
	{
		ModelAndView mv=new ModelAndView();
//		String s=Request.ADD;
		int price=Integer.parseInt(request.getParameter("t2"));
		int tickets=Integer.parseInt(request.getParameter("t3"));
		String title=request.getParameter("t1");
		String city=request.getParameter("t4");
		String type=request.getParameter("t5");
		//eveList.add(d);
		DummyEvent d=new DummyEvent(title,type,city,price,tickets);
		eveList.add(d);
		mv.addObject("list",eveList);
		mv.setViewName("display");
		return mv;
	}
}
