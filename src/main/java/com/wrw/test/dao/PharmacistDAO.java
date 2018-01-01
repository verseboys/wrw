package com.wrw.test.dao;

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

import com.wrw.test.pojo.Pharmacist;

/**
 * A data access object (DAO) providing persistence and search support for
 * Pharmacist entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.wrw.test.pojo.Pharmacist
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class PharmacistDAO {
	private static final Logger log = LoggerFactory.getLogger(PharmacistDAO.class);
	// property constants
	public static final String SEX = "sex";
	public static final String PHOTO = "photo";
	public static final String EDU = "edu";
	public static final String MAJOR = "major";
	public static final String EMAIL = "email";
	public static final String PHONE = "phone";
	public static final String TEL = "tel";
	public static final String WORKPLACE = "workplace";
	public static final String DEPARTMENT = "department";
	public static final String POSITION = "position";
	public static final String ACHIEVEMENT = "achievement";
	public static final String CID = "cid";
	public static final String XYJF = "xyjf";
	public static final String BIRTHPLACE = "birthplace";
	public static final String EDUSCHOOL = "eduschool";
	public static final String FAITH_POINTS = "faithPoints";

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

	public void save(Pharmacist transientInstance) {
		log.debug("saving Pharmacist instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Pharmacist persistentInstance) {
		log.debug("deleting Pharmacist instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Pharmacist findById(java.lang.Integer id) {
		log.debug("getting Pharmacist instance with id: " + id);
		try {
			Pharmacist instance = (Pharmacist) getCurrentSession().get("com.wrw.test.pojo.Pharmacist", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Pharmacist instance) {
		log.debug("finding Pharmacist instance by example");
		try {
			List results = getCurrentSession().createCriteria("com.wrw.test.pojo.Pharmacist")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Pharmacist instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Pharmacist as model where model." + propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySex(Object sex) {
		return findByProperty(SEX, sex);
	}

	public List findByPhoto(Object photo) {
		return findByProperty(PHOTO, photo);
	}

	public List findByEdu(Object edu) {
		return findByProperty(EDU, edu);
	}

	public List findByMajor(Object major) {
		return findByProperty(MAJOR, major);
	}

	public List findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List findByPhone(Object phone) {
		return findByProperty(PHONE, phone);
	}

	public List findByTel(Object tel) {
		return findByProperty(TEL, tel);
	}

	public List findByWorkplace(Object workplace) {
		return findByProperty(WORKPLACE, workplace);
	}

	public List findByDepartment(Object department) {
		return findByProperty(DEPARTMENT, department);
	}

	public List findByPosition(Object position) {
		return findByProperty(POSITION, position);
	}

	public List findByAchievement(Object achievement) {
		return findByProperty(ACHIEVEMENT, achievement);
	}

	public List findByCid(Object cid) {
		return findByProperty(CID, cid);
	}

	public List findByXyjf(Object xyjf) {
		return findByProperty(XYJF, xyjf);
	}

	public List findByBirthplace(Object birthplace) {
		return findByProperty(BIRTHPLACE, birthplace);
	}

	public List findByEduschool(Object eduschool) {
		return findByProperty(EDUSCHOOL, eduschool);
	}

	public List findByFaithPoints(Object faithPoints) {
		return findByProperty(FAITH_POINTS, faithPoints);
	}

	public List findAll() {
		log.debug("finding all Pharmacist instances");
		try {
			String queryString = "from Pharmacist";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Pharmacist merge(Pharmacist detachedInstance) {
		log.debug("merging Pharmacist instance");
		try {
			Pharmacist result = (Pharmacist) getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Pharmacist instance) {
		log.debug("attaching dirty Pharmacist instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Pharmacist instance) {
		log.debug("attaching clean Pharmacist instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PharmacistDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PharmacistDAO) ctx.getBean("PharmacistDAO");
	}
}