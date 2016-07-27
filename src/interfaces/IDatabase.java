/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;

/**
 *
 * @author Orion
 */
public interface IDatabase 
{
    public <T> T add(Object object);
    public <E> List getList(Class<E> cls);
    public <E> Object get(Serializable id,Class<E> cls);
    public boolean update(Object obj);
    public <E> boolean delete(Serializable id,Class<E> cls);
    public <E> Criteria getCriteria(Class<E> cls);
}
