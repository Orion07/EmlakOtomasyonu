/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracts;

import interfaces.IApartmentsandoffices;
import java.util.Date;

/**
 *
 * @author Orion
 */
public abstract class AApartmentsandoffices implements IApartmentsandoffices 
{
    public int id;
    public int price;
    public Date date;
    public int m2;
    public int roomcount;
    public int buildingage;
    public int heating;
    public int dues;
    public int floor;
    public int totalfloor;
    public int bathroomcount;
    public boolean furniture;  
    public int address;
    public int state;
    public int type;
    public int cid;

    public int getHeating() {
        return heating;
    }

    public void setHeating(int heating) {
        this.heating = heating;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

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
    public int getRoomcount() 
    {
        return this.roomcount;
    }
    
    public void setRoomcount(int roomcount) 
    {
        this.roomcount = roomcount;
    }
    public int getBuildingage() 
    {
        return this.buildingage;
    }
    
    public void setBuildingage(int buildingage) 
    {
        this.buildingage = buildingage;
    }
    
    public int getDues() 
    {
        return this.dues;
    }
    
    public void setDues(int dues) 
    {
        this.dues = dues;
    }
    public int getFloor() 
    {
        return this.floor;
    }
    
    public void setFloor(int floor) 
    {
        this.floor = floor;
    }
    public int getTotalfloor() 
    {
        return this.totalfloor;
    }
    
    public void setTotalfloor(int totalfloor) 
    {
        this.totalfloor = totalfloor;
    }
    public int getBathroomcount() 
    {
        return this.bathroomcount;
    }
    
    public void setBathroomcount(int bathroomcount) 
    {
        this.bathroomcount = bathroomcount;
    }
    public boolean getFurniture() 
    {
        return this.furniture;
    }
    
    public void setFurniture(boolean furniture) 
    {
        this.furniture = furniture;
    }
    public int getPrice() 
    {
        return this.price;
    }
    
    public void setPrice(int price) 
    {
        this.price = price;
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
