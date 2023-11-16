/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import bean.CompraGab;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author tiogu
 */
public class CompraGabDAO extends DAOAbstract{

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(CompraGab.class);
        criteria.add (Restrictions.eq("idCompra_gab", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(CompraGab.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return (ArrayList) lista;
    }
    
        public List listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(CompraGab.class);
        criteria.add(Restrictions.ilike("nomeProdutoGab", nome, MatchMode.ANYWHERE));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
        public List listData(Date data) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(CompraGab.class);
        criteria.add(Restrictions.ge("dataGab", data));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
     public List listNomeData(Date data, String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(CompraGab.class);
        criteria.add(Restrictions.ge("dataGab", data));
        criteria.add(Restrictions.ilike("nomeProdutoGab", nome, MatchMode.ANYWHERE));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
}
