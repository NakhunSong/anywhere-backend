package me.app.memo.serviceImpl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
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

	@Override
	public MemoVO selectMemo(Integer memoId) throws Exception {
		return memoDAO.selectMemo(memoId);
	}

	@Override
	public int insertMemo(MemoVO memo) throws Exception {
		return memoDAO.insertMemo(memo);
	}

	@Override
	public int deleteMemo(Integer memoId) throws Exception {
		return memoDAO.deleteMemo(memoId);
	}
	
}
