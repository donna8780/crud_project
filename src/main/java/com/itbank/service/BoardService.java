package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.BoarderDAO;
import com.itbank.vo.BoardVO;
@Service
public class BoardService {

	@Autowired
	private BoarderDAO dao;
	
	public List<BoardVO> getboards() {
		
		return dao.selectAll();
	}

	public int writeboard(BoardVO input) {
	
		return dao.write(input);
	}

	public int deleteboard(int idx) {
		
		return dao.delete(idx);
	}

	public BoardVO getboard(int idx) {
		
		return dao.selectOne(idx);
		
	}

	public int updateboard(BoardVO input) {
		return dao.update(input);
	}

}
