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

import com.wrw.test.pojo.Evaluateuser;
import com.wrw.test.pojo.EvaluateuserId;

/**
 * A data access object (DAO) providing persistence and search support for
 * Evaluateuser entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.wrw.test.pojo.Evaluateuser
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class EvaluateuserDAO {
	private static final Logger log = LoggerFactory.getLogger(EvaluateuserDAO.class);
	// property constants
	public static final String EVALU_CONTENT = "evaluContent";

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

	public void save(Evaluateuser transientInstance) {
		log.debug("saving Evaluateuser instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Evaluateuser persistentInstance) {
		log.debug("deleting Evaluateuser instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Evaluateuser findById(com.wrw.test.pojo.EvaluateuserId id) {
		log.debug("getting Evaluateuser instance with id: " + id);
		try {
			Evaluateuser instance = (Evaluateuser) getCurrentSession().get("com.wrw.test.pojo.Evaluateuser", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Evaluateuser instance) {
		log.debug("finding Evaluateuser instance by example");
		try {
			List results = getCurrentSession().createCriteria("com.wrw.test.pojo.Evaluateuser")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Evaluateuser instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Evaluateuser as model where model." + propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByEvaluContent(Object evaluContent) {
		return findByProperty(EVALU_CONTENT, evaluContent);
	}

	public List findAll() {
		log.debug("finding all Evaluateuser instances");
		try {
			String queryString = "from Evaluateuser";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Evaluateuser merge(Evaluateuser detachedInstance) {
		log.debug("merging Evaluateuser instance");
		try {
			Evaluateuser result = (Evaluateuser) getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Evaluateuser instance) {
		log.debug("attaching dirty Evaluateuser instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Evaluateuser instance) {
		log.debug("attaching clean Evaluateuser instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EvaluateuserDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EvaluateuserDAO) ctx.getBean("EvaluateuserDAO");
	}
}