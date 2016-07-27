/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import database.Apartmentsandoffices;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Orion
 */
public interface IApartmentsandoffices 
{
    public int getId();
    public void setId(int id);
    public Date getDate();
    public void setDate(Date date);
    public int getM2();
    public void setM2(int m2);
    public int getRoomcount();
    public void setRoomcount(int roomcount);
    public int getBuildingage();
    public void setBuildingage(int buildingage);
    public int getDues();
    public void setDues(int dues);
    public int getFloor();
    public void setFloor(int floor);
    public int getTotalfloor();
    public void setTotalfloor(int totalfloor);
    public int getBathroomcount();
    public void setBathroomcount(int bathroomcount);
    public boolean getFurniture();
    public void setFurniture(boolean furniture);
    public int getPrice();
    public void setPrice(int price);
    public int getHeating();
    public void setHeating(int heating);
    public int getAddress();
    public void setAddress(int address);
    public int getState();
    public void setState(int state); 
    public int getType(); 
    public void setType(int type);
    public void setCid(int cid); 
    public int getCid(); 
    public void getApartmentAds(List<Apartmentsandoffices> list,JTable table);
}
