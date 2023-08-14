package com.id.springbatch.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BankTransationRepository extends JpaRepository<BankTransaction, Long> {
}
