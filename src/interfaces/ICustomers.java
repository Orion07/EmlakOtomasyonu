/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import database.Customers;
import functions.Database;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;

/**
 *
 * @author Orion
 */
public interface ICustomers 
{
    public int getCid();
    public void setCid(int cid);
    public String getFirstname();
    public void setFirstname(String firstname);
    public String getLastname();
    public void setLastname(String lastname);
    public String getPhone();
    public void setPhone(String phone);
    public List<Customers> getCustomerList(JComboBox combobox,Database db,int aid);
    public void getCustomerDetails(List<Customers> list,JTable table);
}
