package com.sk.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class CommonDao extends HibernateDaoSupport{

	public List getObjectListSQL(String hql){
		
		List tempList = super.getHibernateTemplate().executeFind(new HibernateCallback(){
			  @Override
				public List doInHibernate(Session session){
				 Query query = session.createQuery(hql);
				 return  query.list();
			  }
			
		});
		return tempList;
	}
	
}
