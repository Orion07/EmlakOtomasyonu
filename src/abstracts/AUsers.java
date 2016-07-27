/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracts;

import interfaces.IUsers;

/**
 *
 * @author Orion
 */
public abstract class AUsers implements IUsers
{
    public int uid;
    public String id;
    public String password;
    public int getUid() 
    {
        return this.uid;
    }
    
    public void setUid(int uid) 
    {
        this.uid = uid;
    }
    public String getId() 
    {
        return this.id;
    }
    
    public void setId(String id) 
    {
        this.id = id;
    }
    public String getPassword() 
    {
        return this.password;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
 
}
