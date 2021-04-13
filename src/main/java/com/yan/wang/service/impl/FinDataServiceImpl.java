package com.yan.wang.service.impl;

import com.yan.wang.dao.FinDataDAO;
import com.yan.wang.model.BuySellBtcUsd;
import com.yan.wang.service.FinDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FinDataServiceImpl implements FinDataService {

    @Autowired
    private FinDataDAO finDataDAO;

    @Override
    @Transactional
    public List<BuySellBtcUsd> getListBuySellBtcUsd() {
        return finDataDAO.getListBuySellBtcUsd();
    }

    public FinDataDAO getFinDataDAO() {
        return finDataDAO;
    }

    public void setFinDataDAO(FinDataDAO finDataDAO) {
        this.finDataDAO = finDataDAO;
    }
}
