package me.app.memo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import me.app.memo.vo.MemoVO;

public interface MemoDAO {
	List<MemoVO> selectMemoList() throws Exception;
	MemoVO selectMemo(Integer memoId) throws Exception;
	int insertMemo(@Param("item") MemoVO memo) throws Exception;
	int deleteMemo(Integer memoId) throws Exception;
}
