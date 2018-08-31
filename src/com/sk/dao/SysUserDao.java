package com.sk.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sk.model.Employee;

public class SysUserDao extends CommonDao{
	
	private SessionFactory sessionFactory;

	public boolean addUser(Employee e)
	{
		try {
			super.getHibernateTemplate().save(e);
			return true;
		} catch (DataAccessException e1) {
			e1.printStackTrace();
			return false;
		}
	
	}
	
	public void findMyEmployee(){
		String hql = "select e from Employee e";
		List empList = super.getObjectListSQL(hql);
		Iterator iterator = empList.iterator();
		while(iterator.hasNext()){
			Employee ee = (Employee)iterator.next();
			System.out.println(ee.getEname());
		}
	}
	
}
