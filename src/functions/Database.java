/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;



import interfaces.IDatabase;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Orion
 */
public class Database implements IDatabase
{
    Session session = null;
    public Database()
    {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        if(factory != null)
        {
            try {
                session = factory.openSession();
                if(session == null)
                    throw new EmlakException("Session cannot open");
            } catch (EmlakException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                throw new EmlakException("SessionFactory cannot build");
            } catch (EmlakException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public Session getSession()
    {
        return session;
    }
    public <T> T add(Object object)
    {
        Transaction tx = null;
        T newRecordId = null;
            try
            {
                tx = session.beginTransaction();
                newRecordId = (T) session.save(object); 
                tx.commit();
            }
            catch (HibernateException e) 
            {
                if (tx!=null) 
                    tx.rollback();
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,e.getCause());
            }
          return newRecordId;
    }
    public <E> List getList(Class<E> cls)
    {
        List list = null;
        Transaction tx = null;
        try
        {
            tx = session.beginTransaction();
            list = session.createCriteria(cls).list();
            tx.commit();
        }
        catch (HibernateException e) 
        {
            if (tx!=null) 
                tx.rollback();
            JOptionPane.showMessageDialog(null,e.getCause());
        }
        return list;
    }
    public <E> Object get(Serializable id,Class<E> cls)
    {
        Object obj = null;
        Transaction tx = null;
        try
        {
            tx = session.beginTransaction();
            obj = session.get(cls, id);
            tx.commit();
        }
        catch (HibernateException e) 
        {
            if (tx!=null) 
                tx.rollback();
            JOptionPane.showMessageDialog(null,e.getCause());
        }
        return obj;
    }
    public boolean update(Object obj)
    {
        Transaction tx = null;
        try
        {
            tx = session.beginTransaction();
            session.update(obj);
            tx.commit();
        }
        catch (HibernateException e) 
        {
            if (tx!=null) 
                tx.rollback();
            JOptionPane.showMessageDialog(null,e.getCause());
            return false;
        }
        return true;
    }
    public <E> boolean delete(Serializable id,Class<E> cls)
    {
        Transaction tx = null;
            try
            {
                tx = session.beginTransaction();
                Object obj = session.get(cls, id);
                session.delete(obj);
                tx.commit();
            }
            catch (HibernateException e) 
            {
                if (tx!=null) tx.rollback();
                e.printStackTrace(); 
                return false;
            } 
            return true;
    }
    public <E> Criteria getCriteria(Class<E> cls)
    {
        return session.createCriteria(cls);  
    }
}
