package me.app.memo.dao;

import java.util.List;

import me.app.memo.vo.MemoVO;

public interface MemoDAO {
	List<MemoVO> selectMemoList() throws Exception;
}
