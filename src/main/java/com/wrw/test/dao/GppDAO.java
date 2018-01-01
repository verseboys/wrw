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

import com.wrw.test.pojo.Gpp;

/**
 * A data access object (DAO) providing persistence and search support for Gpp
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.wrw.test.pojo.Gpp
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class GppDAO {
	private static final Logger log = LoggerFactory.getLogger(GppDAO.class);
	// property constants
	public static final String GP_TID = "gpTId";
	public static final String GP_TITLE = "gpTitle";
	public static final String GP_AUTHOR = "gpAuthor";
	public static final String GP_PICPATH = "gpPicpath";
	public static final String GP_CONTENT = "gpContent";
	public static final String GP_SUMMARY = "gpSummary";

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

	public void save(Gpp transientInstance) {
		log.debug("saving Gpp instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Gpp persistentInstance) {
		log.debug("deleting Gpp instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Gpp findById(java.lang.Integer id) {
		log.debug("getting Gpp instance with id: " + id);
		try {
			Gpp instance = (Gpp) getCurrentSession().get("com.wrw.test.pojo.Gpp", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Gpp instance) {
		log.debug("finding Gpp instance by example");
		try {
			List results = getCurrentSession().createCriteria("com.wrw.test.pojo.Gpp").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Gpp instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Gpp as model where model." + propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByGpTId(Object gpTId) {
		return findByProperty(GP_TID, gpTId);
	}

	public List findByGpTitle(Object gpTitle) {
		return findByProperty(GP_TITLE, gpTitle);
	}

	public List findByGpAuthor(Object gpAuthor) {
		return findByProperty(GP_AUTHOR, gpAuthor);
	}

	public List findByGpPicpath(Object gpPicpath) {
		return findByProperty(GP_PICPATH, gpPicpath);
	}

	public List findByGpContent(Object gpContent) {
		return findByProperty(GP_CONTENT, gpContent);
	}

	public List findByGpSummary(Object gpSummary) {
		return findByProperty(GP_SUMMARY, gpSummary);
	}

	public List findAll() {
		log.debug("finding all Gpp instances");
		try {
			String queryString = "from Gpp";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Gpp merge(Gpp detachedInstance) {
		log.debug("merging Gpp instance");
		try {
			Gpp result = (Gpp) getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Gpp instance) {
		log.debug("attaching dirty Gpp instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Gpp instance) {
		log.debug("attaching clean Gpp instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GppDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GppDAO) ctx.getBean("GppDAO");
	}
}