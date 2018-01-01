package com.wrw.test.dao;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.wrw.test.pojo.Policies;

/**
 * A data access object (DAO) providing persistence and search support for
 * Policies entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.wrw.test.pojo.Policies
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class PoliciesDAO {
	private static final Logger log = LoggerFactory.getLogger(PoliciesDAO.class);
	// property constants
	public static final String PO_TID = "poTid";
	public static final String PO_TITLE = "poTitle";
	public static final String PO_AUTHOR = "poAuthor";
	public static final String PO_PICPATH = "poPicpath";
	public static final String PO_CONTENT = "poContent";
	public static final String PO_SUMMARY = "poSummary";

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	protected void initDao() {
		// do nothing
	}

	public void save(Policies transientInstance) {
		log.debug("saving Policies instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Policies persistentInstance) {
		log.debug("deleting Policies instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Policies findById(java.lang.Integer id) {
		log.debug("getting Policies instance with id: " + id);
		try {
			Policies instance = (Policies) getCurrentSession().get("com.wrw.test.pojo.Policies", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Policies instance) {
		log.debug("finding Policies instance by example");
		try {
			List results = getCurrentSession().createCriteria("com.wrw.test.pojo.Policies")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Policies instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Policies as model where model." + propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPoTid(Object poTid) {
		return findByProperty(PO_TID, poTid);
	}

	public List findByPoTitle(Object poTitle) {
		return findByProperty(PO_TITLE, poTitle);
	}

	public List findByPoAuthor(Object poAuthor) {
		return findByProperty(PO_AUTHOR, poAuthor);
	}

	public List findByPoPicpath(Object poPicpath) {
		return findByProperty(PO_PICPATH, poPicpath);
	}

	public List findByPoContent(Object poContent) {
		return findByProperty(PO_CONTENT, poContent);
	}

	public List findByPoSummary(Object poSummary) {
		return findByProperty(PO_SUMMARY, poSummary);
	}

	public List findAll() {
		log.debug("finding all Policies instances");
		try {
			String queryString = "from Policies";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Policies merge(Policies detachedInstance) {
		log.debug("merging Policies instance");
		try {
			Policies result = (Policies) getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Policies instance) {
		log.debug("attaching dirty Policies instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Policies instance) {
		log.debug("attaching clean Policies instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PoliciesDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PoliciesDAO) ctx.getBean("PoliciesDAO");
	}
}