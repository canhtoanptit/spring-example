package com.example.demo.cache;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

public class InMemoryAccountCacheImpl implements AccountCache {

    private final int size;
    private final Map<Long, Account> accountConcurrentHashMap;


    public InMemoryAccountCacheImpl(int size) {
        this.size = size;
        this.accountConcurrentHashMap = new ConcurrentHashMap<>(size);
    }

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
