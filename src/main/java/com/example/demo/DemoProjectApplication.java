package com.example.demo;
import java.io.*;
import java.io.Serializable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@SpringBootApplication
public class DemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProjectApplication.class, args);
	}

}

interface TransactionRepository extends JpaRepository< Transaction ,Long>{
	
}


@Entity 
class Transaction{
	@Id @GeneratedValue
	private Long id;
	private Long amount;
	public Transaction(Long amount) {
		super();
		// TODO Auto-generated constructor stub
		this.amount = amount;
	}
	public Transaction() {
	}
	public Long getId() {
		return id;
	}
	public Long getAmount() {
		return amount;
	}
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", amount=" + amount + "]";
	}
	
	
}