package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.KkakdugiMarketDao;


public class DetailAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		int idx = Integer.parseInt(request.getParameter("idx"));
		String categoryIdx = request.getParameter("categoryIdx");
		
		KkakdugiMarketDao dao = KkakdugiMarketDao.getInstance();
		
		
		
		
		
		return null;
	}
}
