package com.zhongrun.edu.service;

/**
 * @author Jerry
 */
public interface TransferService {

    void transfer(String fromCardNo,String toCardNo,int money) throws Exception;
}
