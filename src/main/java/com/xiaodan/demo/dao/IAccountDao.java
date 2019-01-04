package com.xiaodan.demo.dao;

import com.xiaodan.demo.entity.Account;

import java.util.List;

/**
 * Created by fengxiaodan on 2018/6/20.
 */
public interface IAccountDao {
    int add (Account account);
    int update (Account account);
    int delete (int id);
    Account findAccountById (int id);
    List<Account> findAccountList();
}
