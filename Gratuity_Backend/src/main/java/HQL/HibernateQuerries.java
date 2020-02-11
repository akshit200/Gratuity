package HQL;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;
import com.ncr.gratuity.model.GratuityList;
@Transactional
public class HibernateQuerries
{
 
	private EntityManager em;
	
	public HibernateQuerries(EntityManager em) 
	{
		super();
		this.em = em;
	}
	public Iterable<GratuityList> getData()
	{
		//List result=em.createNativeQuery("Select * from List"); 
		List result=em.createQuery("from GratuityList").getResultList();
		//List result2=em.createNativeQuery("select * from  List ").getResultList();	
		return result;
	}/*
	public void setData(String paddress,String religion)
	{
		//List result=em.createNativeQuery("Select * from List"); 
		List result=em.createNativeQuery("insert into gratuity_fields(paddress,religion) values('Delhi','Indian');").getResultList();
		//List result2=em.createNativeQuery("select * from  List ").getResultList();	
	}*/
	
	public void updateData(String paddress,String religion, long id)
	{
		//religion="Hindu";
		//List result=em.createNativeQuery("Select * from List"); 
		
		
		
		Query query=em.createNativeQuery("update GratuityFields set paddress = :city,Religion=:rel WHERE ID=:xyz ");
		query.setParameter("city",paddress);
		query.setParameter("rel",religion);
		query.setParameter("xyz",id);
	
		query.executeUpdate();
	}
	
}
