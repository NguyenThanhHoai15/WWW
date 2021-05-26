/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.project.util;


import org.hibernate.HibernateException;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author Tuan Khang
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory = null;
    private static Configuration cfg= null;

    static {
        try {
            cfg = new Configuration();
            cfg.configure("/test/project/util/hibernate.cfg.xml");
            sessionFactory = cfg.buildSessionFactory();
        } catch (HibernateException ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
