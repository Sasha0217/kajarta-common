package com.kajarta.demo.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	@Query(value = "from Customer where name = :nn")
	List<Customer> findByCustomerName(@Param("nn") String name);
	
	@Query(value="from Customer where name = ?1")
	List<Customer> findByCustomerName2(String name);
	
	// 模糊查詢
	@Query(value="from Customer where name like %:name%")
	List<Customer> findByCustomerNameLike(@Param("name") String name);

	@Query(value="from Customer where name like %:name% and level = :vv")
	List<Customer> findByCustomerNameLikeAndLevel(@Param("name") String name, @Param("vv") Integer level);
	
	// 原生
	@Query(value="select * from Customer where name = ?1", nativeQuery=true)
	List<Customer> findByCustomerNameNativeQuery(String name);
	
	@Query(value="select name from Customer where name like %:name%")
	List<String> findByCustomerNameN(@Param("name") String name);
	
	@Transactional
	@Modifying
	@Query(value="update Customer set name = :n where id = :id")
	Integer updateNameById(@Param("id") Integer id,@Param("n") String newName);
	
    List<Customer> findByName(String name);
	
	List<Customer> findByNameContaining(String name);
	
	List<Customer> findByLevelOrderByIdDesc(Integer level);

}
