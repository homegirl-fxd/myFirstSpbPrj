package com.xiaodan.demo.service;

import com.xiaodan.demo.entity.Account;

import java.util.List;

/**
 * Created by fengxiaodan on 2018/9/19.
 * service层
 */
public interface IAccountService {
    int add(Account account);
    int update(Account account);
    int delete(int id);
    Account findAccountById(int id);
    List<Account> findAccountList();
}
