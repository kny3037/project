package controller.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.WritingDao;
import dto.Writing;
import dto.PageDto;

public class ListAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		WritingDao dao = WritingDao.getInstance();
		
		int pageNo;
		if(request.getParameter("page")==null) pageNo=1;
		else pageNo = Integer.parseInt(request.getParameter("page"));
		
		int pageSize=15;
		
		PageDto pdto = new PageDto(pageNo, dao.getCount(), pageSize);
		
		Map<String, Integer> map = new HashMap<>();
		map.put("pageSize", pageSize);
		map.put("startNo", pdto.getStartNo());
		List<Writing> list = dao.getList(map);
		
		request.setAttribute("pageDto", pdto);     
		request.setAttribute("list", list);
		ActionForward forward = new ActionForward();
		forward.isRedirect = false;
		forward.url = "list.jsp";
		return forward;
		
	}
}
