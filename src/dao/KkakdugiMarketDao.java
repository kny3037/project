package dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dto.KkakdugiMarket;
import mybatis.SqlSessionBean;

public class KkakdugiMarketDao {

	SqlSessionFactory factory = SqlSessionBean.getSessionFactory();
	private static KkakdugiMarketDao dao = new KkakdugiMarketDao();
	
	private KkakdugiMarketDao() {}
		public static KkakdugiMarketDao getInstance() {
			return dao;
		}
		
	//테이블 데이터 행의 개수 조회
		public int getCount() {
			SqlSession mapper = factory.openSession();
			int cnt = mapper.selectOne("getCount");  
			mapper.close();     
			return cnt;
		}
	//getList
	public List<KkakdugiMarket> getList(Map<String, Integer>map){
		List<KkakdugiMarket> list = null;
		SqlSession mapper = factory.openSession();
		list = mapper.selectList("getList",map);
		mapper.close();
		return list;
	}
		
		
}
