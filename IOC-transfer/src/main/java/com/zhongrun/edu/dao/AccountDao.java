package com.zhongrun.edu.dao;

import com.zhongrun.edu.pojo.Account;

/**
 * @author Jerry
 */
public interface AccountDao {

    Account queryAccountByCardNo(String cardNo) throws Exception;

    int updateAccountByCardNo(Account account) throws Exception;
}
