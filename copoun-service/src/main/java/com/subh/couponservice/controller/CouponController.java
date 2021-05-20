package com.subh.couponservice.controller;

import com.subh.couponservice.model.Coupon;
import com.subh.couponservice.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coupon/api")
public class CouponController {

    @Autowired
    private CouponRepository couponRepository;

    @RequestMapping(value = "/coupons", method = RequestMethod.POST)
    public Coupon create(@RequestBody Coupon coupon){
        return couponRepository.save(coupon);
    }


    @RequestMapping(value = "/coupons/{code}")
    public Coupon getCoupon(@PathVariable("code") String code){
        return couponRepository.findByCode(code);
    }


}
