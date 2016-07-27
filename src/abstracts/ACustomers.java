/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracts;

import interfaces.ICustomers;

/**
 *
 * @author Orion
 */
public abstract class ACustomers implements ICustomers
{
    public int cid;
    public String firstname;
    public String lastname;
    public String phone;   
     
    public int getCid() 
    {
        return this.cid;
    }
    
    public void setCid(int cid) 
    {
        this.cid = cid;
    }
    public String getFirstname() 
    {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) 
    {
        this.firstname = firstname;
    }
    public String getLastname() 
    {
        return this.lastname;
    }
    
    public void setLastname(String lastname) 
    {
        this.lastname = lastname;
    }
    public String getPhone() 
    {
        return this.phone;
    }
    
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }
}
