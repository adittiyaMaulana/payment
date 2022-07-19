package com.pulsa.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pulsa.payment.entity.Provider;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, Long>{

}
