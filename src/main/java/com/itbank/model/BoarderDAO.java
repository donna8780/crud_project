package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.itbank.vo.BoardVO;

public interface BoarderDAO {

	@Select("select * from board")
	List<BoardVO> selectAll();

	@Insert("insert into board(title, nick, userid, contents) values(#{title}, #{nick}, #{userid}, #{contents} )")
	int write(BoardVO input);

	@Delete("delete from board where idx = #{idx}")
	int delete(int idx);

	@Select("select * from board where idx = #{idx}")
	BoardVO selectOne(int idx);

	@Update("update board set "
			+"title = #{title}, nick = #{nick}, userid=#{userid},contents = #{contents} "
			+"where idx = #{idx}")
	
	int update(BoardVO input);
	
	

}
