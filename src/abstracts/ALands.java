/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracts;

import interfaces.ILands;
import java.util.Date;

/**
 *
 * @author Orion
 */
public abstract class ALands implements ILands
{
     public int id;
     public Date date;
     public int m2;
     public int reconstruction;
     public int block;
     public int plot;
     public int layout;
     public int clearance;
     public int deedstate;
     public int address;
     public int price;
     public int kaks;
     public int state;
     public int type;
     public int cid;

    public int getId() 
    {
        return this.id;
    }
    
    public void setId(int id) 
    {
        this.id = id;
    }
    public Date getDate() 
    {
        return this.date;
    }
    
    public void setDate(Date date) 
    {
        this.date = date;
    }
    public int getM2() 
    {
        return this.m2;
    }
    
    public void setM2(int m2) 
    {
        this.m2 = m2;
    }
    public int getReconstruction() 
    {
        return this.reconstruction;
    }
    
    public void setReconstruction(int reconstruction) 
    {
        this.reconstruction = reconstruction;
    }
    public int getBlock() 
    {
        return this.block;
    }
    
    public void setBlock(int block) 
    {
        this.block = block;
    }
    public int getPlot() 
    {
        return this.plot;
    }
    
    public void setPlot(int plot) 
    {
        this.plot = plot;
    }
    public int getLayout() 
    {
        return this.layout;
    }
    
    public void setLayout(int layout) 
    {
        this.layout = layout;
    }
    public int getClearance() 
    {
        return this.clearance;
    }
    
    public void setClearance(int clearance) 
    {
        this.clearance = clearance;
    }
    public int getDeedstate() 
    {
        return this.deedstate;
    }
    
    public void setDeedstate(int deedstate) 
    {
        this.deedstate = deedstate;
    }
    
    public int getAddress() 
    {
        return address;
    }

    public void setAddress(int address) 
    {
        this.address = address;
    }

    public int getPrice() 
    {
        return price;
    }

    public void setPrice(int price) 
    {
        this.price = price;
    }

    public int getKaks() 
    {
        return kaks;
    }
    public void setKaks(int kaks) 
    {
        this.kaks = kaks;
    }
    public int getState() 
    {
        return state;
    }

    public void setState(int state) 
    {
        this.state = state;
    }
    
    public int getType() 
    {
        return type;
    }
    public void setType(int type) 
    {
        this.type = type;
    }


    public int getCid() 
    {
        return cid;
    }

    public void setCid(int cid) 
    {
        this.cid = cid;
    }

}
