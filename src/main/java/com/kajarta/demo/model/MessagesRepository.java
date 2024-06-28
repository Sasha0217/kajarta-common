package com.kajarta.demo.model;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MessagesRepository extends JpaRepository<Messages, Integer> {
	// SQL原生寫法，不建議使用，資料庫若有改變須進行修改
	@Query(value="select top(1) * from messages order by added desc", nativeQuery = true)
	Messages findLatest();
	
	//建議寫法，從page的第一筆資料查找
	@Query(value="from Messages")
    List<Messages> findLatest2(Pageable pgb);
	
	Messages findFirstByOrderByAddedDesc();
}
