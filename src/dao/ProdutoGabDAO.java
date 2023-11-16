/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import bean.ProdutoGab;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author tiogu
 */
public class ProdutoGabDAO extends DAOAbstract{

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
        Criteria criteria = session.createCriteria(ProdutoGab.class);
        criteria.add (Restrictions.eq("idProduto_gab", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoGab.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return (ArrayList) lista;
    }
    
        public List listValor(String valor) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoGab.class);
        criteria.add(Restrictions.ilike("valorGab", "%"+valor+"%"));
        List lista = criteria.list();
        session.getTransaction().commit();

        return lista;
    }
        
            public List listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoGab.class);
        criteria.add(Restrictions.ilike("nomeGab", "%"+nome+"%"));
         List lista = criteria.list();
        session.getTransaction().commit();
        
        return lista;
    }
    
     public List listNomeValor(String valor, String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoGab.class);
        criteria.add(Restrictions.ilike("valorGab", "%"+valor+"%"));
        criteria.add(Restrictions.ilike("nomeGab", "%"+nome+"%"));
         List lista = criteria.list();
        session.getTransaction().commit();
        
        return lista;
    }
     
     
    
}
