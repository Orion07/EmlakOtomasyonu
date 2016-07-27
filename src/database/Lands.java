package database;
// Generated May 13, 2016 8:31:21 PM by Hibernate Tools 4.3.1


import abstracts.ALands;
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

/**
 * Lands generated by hbm2java
 */
public class Lands extends ALands implements java.io.Serializable {


    public Lands() 
    {
        
    }
    public Lands(Date date, int m2, int reconstruction, int block, int plot, int layout, int clearance, int deedstate,int address,int price,int state,int type,int cid) 
    {
       this.date = date;
       this.m2 = m2;
       this.reconstruction = reconstruction;
       this.block = block;
       this.plot = plot;
       this.layout = layout;
       this.clearance = clearance;
       this.deedstate = deedstate;
       this.address = address;
       this.price = price;
       this.state = state;
       this.type = type;
       this.cid = cid;
    }
   
    public Lands(LandBuilder builder)
    {
       this.date = builder.date;
       this.m2 = builder.m2;
       this.reconstruction = builder.reconstruction;
       this.block = builder.block;
       this.plot = builder.plot;
       this.layout = builder.layout;
       this.clearance = builder.clearance;
       this.deedstate = builder.deedstate;
       this.address = builder.address;
       this.price = builder.price;
       this.kaks = builder.kaks;
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
        vector.add(a.getReconstruction(reconstruction));
        vector.add(a.getDeed(deedstate));
        vector.add(block);
        vector.add(plot);
        vector.add(layout);
        vector.add(a.getGabari(clearance));
        vector.add(a.getKaks(kaks));
        
        return vector.toArray();
    }
    public static class LandBuilder
    {
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
        public LandBuilder date(Date date)
        {
            this.date = date;
            return this;
        }
        public LandBuilder m2(int m2)
        {
            this.m2 = m2;
            return this;
        }
        public LandBuilder reconstruction(int reconstruction)
        {
            this.reconstruction = reconstruction;
            return this;
        }
        public LandBuilder block(int block)
        {
            this.block = block;
            return this;
        }
        public LandBuilder plot(int plot)
        {
            this.plot = plot;
            return this;
        }
        public LandBuilder layout(int layout)
        {
            this.layout = layout;
            return this;
        }
        public LandBuilder clearance(int clearance)
        {
            this.clearance = clearance;
            return this;
        }
        public LandBuilder deedstate(int deedstate)
        {
            this.deedstate = deedstate;
            return this;
        }
        public LandBuilder address(int address)
        {
            this.address= address;
            return this;
        }
        public LandBuilder price(int price)
        {
            this.price = price;
            return this;
        }
        public LandBuilder kaks(int kaks)
        {
            this.kaks = kaks;
            return this;
        }
        public LandBuilder state(int state)
        {
            this.state = state;
            return this;
        }
        public LandBuilder type(int type)
        {
            this.type = type;
            return this;
        }
        public LandBuilder cid(int cid)      
        {
            this.cid = cid;
            return this;
        }
        public Lands build()
        {
            return new Lands(this);
        }
    }
    public void getLandAds(List<Lands> list,JTable table)
    {
        if(list!=null && list.size() > 0)
        {
            Vector vector = new Vector(list);
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            Enumeration e = vector.elements();
            while(e.hasMoreElements())
            {
                Lands land = (Lands)e.nextElement();
                model.addRow(land.toArray());
            }
            table.setModel(model);  
            table.getTableHeader().setReorderingAllowed(false);
            table.setAutoCreateRowSorter(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Kayıtlı ilan bulunmamaktadır");
        }
    }

}


