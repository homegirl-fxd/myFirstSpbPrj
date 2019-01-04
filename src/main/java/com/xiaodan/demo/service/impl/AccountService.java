package com.xiaodan.demo.service.impl;

import com.xiaodan.demo.dao.IAccountDao;
import com.xiaodan.demo.entity.Account;
import com.xiaodan.demo.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fengxiaodan on 2018/9/19.
 */

/**
 * 注解Service("userService")注解是告诉Spring，当Spring要创建UserServiceImpl的的实例时，bean的名字必须叫做"userService"，
 * 这样当Action需要使用UserServiceImpl的的实例时,就可以由Spring创建好的"userService"，然后注入给Action。
 */
@Service
public class AccountService implements IAccountService {

    @Autowired
    IAccountDao accountDao;

    @Override
    public int add(Account account) {
        return accountDao.add(account);
    }

    @Override
    public int update(Account account) {
        return accountDao.update(account);
    }

    @Override
    public int delete(int id) {
        return accountDao.delete(id);
    }

    @Override
    public Account findAccountById(int id) {
        return accountDao.findAccountById(id);
    }

    @Override
    public List<Account> findAccountList() {
        return accountDao.findAccountList();
    }
}
