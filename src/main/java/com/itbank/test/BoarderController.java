package com.itbank.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.service.BoardService;
import com.itbank.vo.BoardVO;


@Controller
@RequestMapping("/board")
public class BoarderController {
	
	@Autowired
	private BoardService bs;
	@GetMapping("/writer")
	public void writer() {};
	
	@PostMapping("/writer")
	public String writer(BoardVO input) {
		bs.writeboard(input);
		
		return "redirect:/";
	};
	
	@GetMapping("/delete")
	public String delete(int idx) {
		bs.deleteboard(idx);
		return "redirect:/";
	}
	@GetMapping("/update")
	public ModelAndView update(int idx) {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("row", bs.getboard(idx));
		mav.setViewName("board/update");
		return mav;
	};
	@PostMapping("/update")
	public String update(BoardVO input) {
		bs.updateboard(input);
		
		return "redirect:/";
	}
	
	
	
}
