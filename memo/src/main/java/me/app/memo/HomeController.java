package me.app.memo;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import me.app.memo.service.MemoService;
import me.app.memo.vo.MemoVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private MemoService memoService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value="/memos", method = RequestMethod.GET)
	public @ResponseBody List<MemoVO> selectMemoList(HttpServletRequest request) throws Exception {			
		return memoService.selectMemoList();
	}
	
	@RequestMapping(value="/memo/{memoId}", method = RequestMethod.GET)
	public @ResponseBody MemoVO selectMemo(@PathVariable Integer memoId) throws Exception {
		return memoService.selectMemo(memoId);
	}
	
	@RequestMapping(value="/memo", method=RequestMethod.POST)
	public  @ResponseBody int insertMemo(@RequestBody MemoVO memoVO) throws Exception {
		MemoVO memo = new MemoVO();
		memo.setMemoId(memoVO.getMemoId());
		memo.setTitle(memoVO.getTitle());
		memo.setContent(memoVO.getContent());
		return memoService.insertMemo(memo);
	}
	
	@RequestMapping(value="/memo/{memoId}", method=RequestMethod.DELETE)
	public @ResponseBody int deleteMemo(@PathVariable Integer memoId) throws Exception {
		return memoService.deleteMemo(memoId);
	}
}
