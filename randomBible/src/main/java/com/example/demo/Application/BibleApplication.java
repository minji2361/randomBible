package com.example.demo.Application;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BibleApplication {
	
	@Autowired
	BibleService service;

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("message", "좋은 아침");
		return "index";
	}
	
	@ResponseBody
	@RequestMapping("/verse")
	public Map<String, Object> myba() {
		ModelAndView mv = new ModelAndView();
		Map<String, Object> resultMap = new HashMap<>();
		try {
			BibleModel model = service.bibleVerse();
			
			if(model != null) {
				resultMap.put("content", model.getContent());
				resultMap.put("book", model.getBookName());
				resultMap.put("chapter", model.getChapter());
				resultMap.put("verse", model.getVerse());
				resultMap.put("code", "1");
			} else {
				resultMap.put("content", "오류");
				resultMap.put("code", "0");
			}
			
			mv.setViewName("index.jsp");
			mv.addObject("resultMap", resultMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		return resultMap;
	}
}
