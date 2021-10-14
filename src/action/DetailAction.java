package action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CommentDao;
import dao.KkakdugiMarketDao;
import dto.Comment;
import dto.KkakdugiMarket;


public class DetailAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		//글 상세
		int idx = Integer.parseInt(request.getParameter("idx"));
		String categoryIdx = request.getParameter("categoryIdx");
		
		KkakdugiMarketDao dao = KkakdugiMarketDao.getInstance();
		if(session.getAttribute("Idx")!=null) {
			StringBuilder Idx = (StringBuilder)session.getAttribute("Idx");
			boolean status = Idx.toString().contains("/"+idx+"/");
			if(!status) {
				dao.readCount(idx);
				Idx.append(idx + "/");
			}
			}else {
				StringBuilder Idx = new StringBuilder("/");
				session.setAttribute("Idx", Idx);
			}
		KkakdugiMarket bean = dao.getOne(idx);
		
		CommentDao cdao = CommentDao.getInstance();
		cdao.updateCountAll(idx);
		List<Comment> cmts = cdao.getList(idx);
		request.setAttribute("cmtlist", cmts);
		
		
//		pageContext.forward("detailView.jsp");
		ActionForward forward = new ActionForward();
		forward.isRedirect = false;
		forward.url="community/detail.jsp";
		return forward;
		
	}
}
