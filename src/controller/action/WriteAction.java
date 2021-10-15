package controller.action;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dao.GalleryDao;
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
		
		GalleryDao gdao = GalleryDao.getInstance();
		String path="c:\\upload";
		
		int size=5*1024*1024;
		
		try {
			MultipartRequest muti = new MultipartRequest
					(request, path, size, "UTF-8", new DefaultFileRenamePolicy());
			
			String title = muti.getParameter("title");
			String filename = muti.getFilesystemName("pic");
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		KkakdugiMarketDao dao = KkakdugiMarketDao.getInstance();
		dao.insert(dto);
		boolean isRedirect = true;
		ActionForward forward = new ActionForward();
		forward.isRedirect = true;
		forward.url="list.do";
		return forward;
	}
		
}