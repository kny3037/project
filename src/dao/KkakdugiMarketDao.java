package dao;

import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.SqlSessionBean;

public class KkakdugiMarketDao {

	SqlSessionFactory factory = SqlSessionBean.getSessionFactory();
	private static KkakdugiMarketDao dao = new KkakdugiMarketDao();
	
	private KkakdugiMarketDao() {}
		public static KkakdugiMarketDao getInstance() {
			return dao;
		}
	
}
