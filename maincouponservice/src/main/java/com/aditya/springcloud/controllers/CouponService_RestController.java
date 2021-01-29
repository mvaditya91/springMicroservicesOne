package com.aditya.springcloud.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aditya.springcloud.model.Coupon;
import com.aditya.springcloud.repos.CouponServiceRepo;

@RestController
@RequestMapping("/couponservice")
public class CouponService_RestController {
	
	@Autowired
	private CouponServiceRepo repo;
	
	@RequestMapping(value="/coupons",method=RequestMethod.POST)
	public Coupon createCoupon(@RequestBody Coupon coupon) {
		return repo.save(coupon);
	}
	
	@RequestMapping(value="/coupons/{code}",method=RequestMethod.GET)
	public Coupon getCoupon(@PathVariable("code") String code) {
		return repo.findByCode(code);
	}

}