package HQL;
import java.util.List;
import javax.persistence.EntityManager;

import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import com.ncr.gratuity.model.FormModel;
@Transactional
public class HibernateQuerries
{
 
	private EntityManager em;
	
	public HibernateQuerries(EntityManager em) 
	{
		super();
		this.em = em;
	}
	public Iterable<FormModel> getData()
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
	
	public void updateData(String n_name,String n_address,String n_dob,String n_relation,String n_amount, long id)
	{
		//religion="Hindu";
		//List result=em.createNativeQuery("Select * from List"); 
		
		
		
		Query query=em.createNativeQuery("update GratuityFields set n_name = :city,n_address = :rel, n_dob = :dob, n_relation = :re , n_amount = :am WHERE ID=:xyz ");
		query.setParameter("city",n_name);
		query.setParameter("rel",n_address);
//		query.setParameter("eps",eps_no);
		query.setParameter("dob",n_dob);
		query.setParameter("re",n_relation);
		query.setParameter("am",n_amount);
		query.setParameter("xyz",id);
	
		query.executeUpdate();
	}
											/*Nomination */
	
	

}
