/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import database.Lands;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Orion
 */
public interface ILands 
{
    public int getId();
    public void setId(int id);
    public Date getDate();
    public void setDate(Date date);
    public int getM2();
    public void setM2(int m2);
    public int getReconstruction();
    public void setReconstruction(int reconstruction);
    public int getBlock();
    public void setBlock(int block);
    public int getPlot();
    public void setPlot(int plot);
    public int getLayout();
    public void setLayout(int layout);
    public int getClearance();
    public void setClearance(int clearance);
    public int getDeedstate();
    public void setDeedstate(int deedstate); 
    public int getAddress();
    public void setAddress(int address);
    public int getPrice();
    public void setPrice(int price); 
    public int getKaks(); 
    public void setKaks(int kaks);
    public int getState();
    public void setState(int state); 
    public int getType();
    public void setType(int type) ;
    public void setCid(int cid); 
    public int getCid(); 
    public void getLandAds(List<Lands> list,JTable table);
}
