/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.gauthier_matthieu.DAO;

import org.hibernate.SessionFactory;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author gauthier
 */
public class HibernateUtil {
    
    private static final SessionFactory sessionFactory;

    static{
        
        try
        {
        
        Configuration conf = new Configuration();
        conf.configure("/fr/gauthier_matthieu/DAO/hibernate.cfg.xml");
        ServiceRegistry serviceReg = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        
        sessionFactory = conf.buildSessionFactory(serviceReg);
        
        }
        catch(Throwable ex)
        {
            throw  new ExceptionInInitializerError(ex);
        }
        
    }
    
    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }
    
    
    
}
