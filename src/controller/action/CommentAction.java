package controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CommentDao;
import dto.Comment;

public class CommentAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int writingIdx;
		CommentDao dao = CommentDao.getInstance();
		request.setCharacterEncoding("UTF-8");
		
		int pageNo = Integer.parseInt(request.getParameter("page"));
		
		if(request.getParameter("del")!=null) {
			int cmtidx = Integer.parseInt(request.getParameter("cmtidx"));
			int idx = Integer.parseInt(request.getParameter("idx"));
			dao.delete(cmtidx);
			writingIdx=idx;
		}else {
			writingIdx=Integer.parseInt(request.getParameter("writingIdx"));
			String userId = request.getParameter("userId");
			String content = request.getParameter("content");
			
			Comment dto = new Comment(0, writingIdx, userId, content);
			dao.insert(dto);
		}
		
		dao.updateCountAll(writingIdx);
		ActionForward forward = new ActionForward();
		forward.isRedirect = true;
		forward.url = "detail.do?page="+pageNo+"&idx="+writingIdx;
		
		return forward;
	}
	
}
