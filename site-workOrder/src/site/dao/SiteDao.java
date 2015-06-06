package site.dao;

import java.util.List;




import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.Criteria;



import site.entity.Site;

public class SiteDao {
	
	
	public List<Site> getSites() {
		List<Site> list ;
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from Site");
		Long resultsCount = (Long) session.createCriteria(Site.class).setProjection(Projections.rowCount()).uniqueResult();
		list = query.list();
		tx.commit();
		session.close();		
		return list;
     }
	
	
	public void addSite(String site) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		//session.save(site);
		
		
		Query query = session.createQuery(site);
        int result = query.executeUpdate();
        System.out.println("Rows affected: " + result);
        
		tx.commit();
		session.close();

		

        //Session session = HibernateUtil.getSessionFactory().openSession();
	    //session.getTransaction().begin();
			        
			       
	   //session.getTransaction().commit();
			    

		
	}
	
	
	
	
	
  }