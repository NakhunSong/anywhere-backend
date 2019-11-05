package me.app.memo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.app.memo.dao.MemoDAO;
import me.app.memo.service.MemoService;
import me.app.memo.vo.MemoVO;

@Service
public class MemoServiceImpl implements MemoService {

	@Autowired
	private MemoDAO memoDAO;
	
	@Override
	public List<MemoVO> selectMemoList() throws Exception {
		return memoDAO.selectMemoList();
	}
	
}
