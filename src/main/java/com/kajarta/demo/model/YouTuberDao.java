package com.kajarta.demo.model;


import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
@Transactional(readOnly = true)
public class YouTuberDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(YouTuber tyr) {
		em.persist(tyr);
	}
	
	public YouTuber findById(Integer id) {
		return em.find(YouTuber.class, id);
	}
	@Transactional
	public String deleteById(Integer id) {
		YouTuber result = em.find(YouTuber.class, id);
		
		if(result != null) {
			em.remove(result);
			return "有東西，已刪除";
		}
		
		return "沒有這筆資料";
	}
	@Transactional
	public YouTuber updateSubCount(Integer id) {
		YouTuber result = em.find(YouTuber.class, id);
		
		if(result != null) {
			result.setSubscribeCount(result.getSubscribeCount() + 1);
			return result;
		}
		
		return null;
	}
	public List<YouTuber> findByYoutuberName(){
		Query query = em.createQuery("from YouTuber where channelName like :name");
		query.setParameter("name", "%" + "do"+ "%");
		
		List<YouTuber> resultList = query.getResultList();
		return resultList;
	}
}
