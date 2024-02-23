package com.example.demo.cache;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

public class InMemoryAccountCacheImpl implements AccountCache {


    @Override
    public Account getAccountById(long id) {
        return accountConcurrentHashMap.get(id);
    }

    @Override
    public void subscribeForAccountUpdates(Consumer<Account> listener) {

    }

    @Override
    public List<Account> getTop3AccountsByBalance() {
        return null;
    }

    @Override
    public int getAccountByIdHitCount() {
        return 0;
    }

    @Override
    public void putAccount(Account account) {
        accountConcurrentHashMap.put(account.getId(), account);
    }
}
