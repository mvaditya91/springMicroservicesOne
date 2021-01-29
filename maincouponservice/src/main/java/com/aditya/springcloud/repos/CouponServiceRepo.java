package com.aditya.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aditya.springcloud.model.Coupon;

public interface CouponServiceRepo extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String code);

}