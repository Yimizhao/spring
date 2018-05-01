package com.zym.spring.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("bookShopDao")
public class BookShopDaoImpl implements BookShopDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int findBookPriceByIsbn(String isbn) {
		String sql = "SELECT price FROM book WHERE isbn = ?";
		return jdbcTemplate.queryForObject(sql, Integer.class, isbn);
	}

	@Override
	public void updateBookStock(String isbn) {
		//¼ì²éÊéµÄ¿â´æÊÇ·ñ×ã¹», Èô²»¹», ÔòÅ×³öÒì³£
		String sql2 = "SELECT stock FROM book_stock WHERE isbn = ?";
		int stock = jdbcTemplate.queryForObject(sql2, Integer.class, isbn);
		if(stock == 0){
			throw new BookStockException("¿â´æ²»×ã!");
		}
		
		String sql = "UPDATE book_stock SET stock = stock -1 WHERE isbn = ?";
		jdbcTemplate.update(sql, isbn);
	}

	@Override
	public void updateUserAccount(String username, int price) {
		//ÑéÖ¤Óà¶îÊÇ·ñ×ã¹», Èô²»×ã, ÔòÅ×³öÒì³£
		String sql2 = "SELECT balance FROM account WHERE username = ?";
		int balance = jdbcTemplate.queryForObject(sql2, Integer.class, username);
		if(balance < price){
			throw new UserAccountException("Óà¶î²»×ã!");
		}
		
		String sql = "UPDATE account SET balance = balance - ? WHERE username = ?";
		jdbcTemplate.update(sql, price, username);
	}

}

