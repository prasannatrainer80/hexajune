package com.java.hib.dao;

import java.util.List;

import javax.crypto.EncryptedPrivateKeyInfo;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;

import com.java.hib.model.Employ;
import com.java.hib.model.Login;
import com.java.hib.util.EncryptPassword;
import com.java.hib.util.SessionHelper;

public class EmployDaoImpl implements EmployDao {

	private static SessionFactory sessionFactory;
	private Session session;
	
	static {
		sessionFactory = SessionHelper.getSession();
	}
	
	@Override
	public List<Employ> showEmployDao() {
		session = sessionFactory.openSession();
		Query query = session.getNamedQuery("showEmploy");
		List<Employ> employList = query.list();
		return employList;
	}

	@Override
	public Employ searchEmployDao(int empno) {
		session = sessionFactory.openSession();
		Query query = session.getNamedQuery("searchEmploy");
		query.setParameter("empno", empno);
		Employ employ = (Employ)query.uniqueResult();
		return employ;
	}

	@Override
	public int validate(Login login) {
		String encr = EncryptPassword.getCode(login.getPassCode());
		session = sessionFactory.openSession();
		Query query = session.getNamedQuery("validate");
		query.setParameter("userName", login.getUserName());
		query.setParameter("passCode", encr);
		Login loginFound = (Login)query.uniqueResult();
		if (loginFound != null) {
			return 1;
		}
		return 0;
	}

}
