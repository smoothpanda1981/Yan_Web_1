package com.yan.wang.dao.impl;

import com.yan.wang.dao.FinDataDAO;
import com.yan.wang.model.BuySellBtcUsd;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;


@Repository
public class FinDataDAOImpl implements FinDataDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<BuySellBtcUsd> getListBuySellBtcUsd() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<BuySellBtcUsd> cq = cb.createQuery(BuySellBtcUsd.class);
        Root<BuySellBtcUsd> variableRoot = cq.from(BuySellBtcUsd.class);
        cq.select(variableRoot);
        return session.createQuery(cq).getResultList();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
