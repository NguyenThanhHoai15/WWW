/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.project.dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import test.project.entity.Sinhvien;
import test.project.util.HibernateUtil;

/**
 *
 * @author Thanh Hoai
 */
@Repository
public class testDAOImpl implements testDao{

    @Override
    public List<Sinhvien> getALL() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Query query = session.createQuery("FROM SinhVien");
            List<Sinhvien> list = query.list();
            transaction.commit();
            return list;
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return null;
    }
    
}
