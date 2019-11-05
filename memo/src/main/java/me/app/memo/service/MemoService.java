package me.app.memo.service;

import java.util.List;

import me.app.memo.vo.MemoVO;

public interface MemoService {
	List<MemoVO> selectMemoList() throws Exception;
}
