/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import bean.CompraGab;
import bean.PagamentoGab;
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
public class PagamentoGabDAO extends DAOAbstract {

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
        Criteria criteria = session.createCriteria(PagamentoGab.class);
        criteria.add (Restrictions.eq("idPagamento_gab", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(PagamentoGab.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return (ArrayList) lista;
    }
    
    public List listValor(String valor) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(PagamentoGab.class);
        criteria.add(Restrictions.ilike("valorGab", "%"+valor+"%"));
        List lista = criteria.list();
        session.getTransaction().commit();

        return lista;
    }

        public List listData(Date data) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(PagamentoGab.class);
        criteria.add(Restrictions.ge("dataPagamentoGab", data));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
     public List listValorData(Date data, String valor) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(PagamentoGab.class);
        criteria.add(Restrictions.ge("dataPagamentoGab", data));
        criteria.add(Restrictions.ilike("valorGab", "%"+valor+"%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
}
