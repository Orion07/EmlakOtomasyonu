package database;
// Generated May 13, 2016 8:31:21 PM by Hibernate Tools 4.3.1


import abstracts.AApartmentsandoffices;
import functions.Arrays;
import functions.Database;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Apartmentsandoffices extends AApartmentsandoffices  implements java.io.Serializable {

    public Apartmentsandoffices() 
    {
    }
    public Apartmentsandoffices(ApartmentBuilder builder)
    {
       this.date = builder.date;
       this.m2 = builder.m2;
       this.roomcount = builder.roomcount;
       this.buildingage = builder.buildingage;
       this.heating = builder.heating;
       this.dues = builder.dues;
       this.floor = builder.floor;
       this.totalfloor = builder.totalfloor;
       this.bathroomcount = builder.bathroomcount;
       this.furniture = builder.furniture;
       this.price = builder.price;
       this.address = builder.address;
       this.state = builder.state;
       this.type = builder.type;
       this.cid = builder.cid;
    }
    public Object[] toArray()
    {
        Vector vector = new Vector();
        Database db = new Database();
        Arrays a = new Arrays();
        Customers customer = (Customers)db.get(cid, Customers.class);
        vector.add(id);
        vector.add(customer.getFirstname() + " " + customer.getLastname());
        vector.add(a.getType(type));
	vector.add(a.getState(state));
	vector.add(a.getCities(address));
	vector.add(price);
	vector.add(date);
        vector.add(m2);
        vector.add(a.getRoom(roomcount));
        vector.add(a.getAge(buildingage));
        vector.add(a.getHeat(heating));
        vector.add(dues);
        vector.add(a.getFloor(floor));
        vector.add(a.getTotalfloor(totalfloor));
        vector.add(bathroomcount);
        if(furniture)
            vector.add("Evet");
        else
            vector.add("Hayır");
        
        return vector.toArray();
    }
    public static class ApartmentBuilder
    {
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
        public ApartmentBuilder date(Date date)
        {
            this.date = date;
            return this;
        }
        public ApartmentBuilder m2(int m2)
        {
            this.m2 = m2;
            return this;
        }
        public ApartmentBuilder roomcount(int roomcount)
        {
            this.roomcount= roomcount;
            return this;
        }
        public ApartmentBuilder buildingage(int buildingage)
        {
            this.buildingage = buildingage;
            return this;
        }
        public ApartmentBuilder heating(int heating)
        {
            this.heating = heating;
            return this;
        }
        public ApartmentBuilder dues(int dues)
        {
            this.dues = dues;
            return this;
        }
        public ApartmentBuilder floor(int floor)
        {
            this.floor = floor;
            return this;
        }
        public ApartmentBuilder totalfloor(int totalfloor)
        {
            this.totalfloor = totalfloor;
            return this;
        }
        public ApartmentBuilder bathroomcount(int bathroomcount)
        {
            this.bathroomcount = bathroomcount;
            return this;
        }
        public ApartmentBuilder furniture(boolean furniture )
        {
            this.furniture = furniture;
            return this;
        }
        public ApartmentBuilder address(int address)
        {
            this.address = address;
            return this;
        }
        public ApartmentBuilder price(int price)
        {
            this.price = price;
            return this;
        }
        public ApartmentBuilder state(int state)
        {
            this.state = state;
            return this;
        }
        public ApartmentBuilder type(int type)
        {
            this.type = type;
            return this;
        }
        public ApartmentBuilder cid(int cid)
        {
            this.cid = cid;
            return this;
        }
        public Apartmentsandoffices build()
        {
            return new Apartmentsandoffices(this);
        }
    }
    public void getApartmentAds(List<Apartmentsandoffices> list,JTable table)
    {
        if(list!=null && list.size() > 0)
        {
            Vector vector = new Vector(list);
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            Enumeration e = vector.elements();
            while(e.hasMoreElements())
            {
                Apartmentsandoffices apartment = (Apartmentsandoffices)e.nextElement();
                model.addRow(apartment.toArray());   
            }
            table.setModel(model);
            table.getTableHeader().setReorderingAllowed(false);
            table.setAutoCreateRowSorter(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Kayıtlı ilan bulunmamaktadır");
        }
    }
    
}


