package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.KkakdugiMarketDao;
import dto.KkakdugiMarket;

public class WriteAction implements Action  {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String subject = request.getParameter("subject");
		String categoryIdx = request.getParameter("categoryIdx");
		String userId = request.getParameter("userId");
		String content = request.getParameter("content");
		
		KkakdugiMarket dto = new KkakdugiMarket();
		dto.setSubject(subject);
		dto.setCategoryIdx(categoryIdx);
		dto.setUserId(userId);
		dto.setContent(content);
		KkakdugiMarketDao dao = KkakdugiMarketDao.getInstance();
		
		ActionForward forward = new ActionForward();
		forward.isRedirect = false;
		forward.url="write.jsp";
		return forward;
	};
	
	
	
}