/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

/**
 *
 * @author Orion
 */
public class Arrays 
{
   private final String[] cities = { "  -", "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın", "Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum", "Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun", "Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri", "Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray", "Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce" };
   private final String[] room = { "  -", "Stüdyo (1+0)", "1+1", "2+1", "2+2", "3+1", "3+2", "4+1", "4+2", "4+3", "4+4", "5+1", "5+2", "5+3", "5+4", "6+1", "6+2", "6+3", "7+1", "7+2", "7+3", "8+1", "8+2", "8+3", "8+4", "9+1", "9+2", "9+3", "9+4", "9+5", "9+6", "10+1", "10+2", "10+" };
   private final String[] age = { "  -", "0", "1", "2", "3", "4", "5-10 arası", "11-15 arası", "16-20 arası", "21-25 arası", "26-30 arası", "31 ve üzeri" };
   private final String[] heat = { "  -", "Soba", "Doğalgaz Sobası", "Kat Kaloriferi", "Merkezi Sistem", "Merkezi Sistem(Isı Pay Ölçer)", "Doğalgaz(Kombi)", "Yerden Isıtma", "Klima", "Güneş Enerjisi", "VRV", "Isı pompası" };
   private final String[] floor = { "  -", "Kot 4", "Kot 3", "Kot 2", "Kot 1", "Bodrum Kat", "Zemin Kat", "Bahçe Katı", "Giriş Katı", "Yüksek Giriş", "Müstakil", "Villa tipi", "Çatı Katı", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30 ve üzeri" };
   private final String[] totalfloor = { "  -", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30 ve üzeri" };
   private final String[] state = { "  -", "Satılık", "Kiralık","Günlük Kiralık"};
   private final String[] reconstruction = { "  -", "Ada", "A-Lejantlı", "Bağ & Bahçe", "Depo & Antrepo", "Eğitim", "Enerji Depolama", "Konut", "Muhtelif", "Özel Kullanım", "Sağlık", "Sanayi", "Sera", "Sit Alanı", "Spor Alanı", "Tarla", "Ticari", "Ticari Konut", "Toplu Konut", "Turizm", "Villa", "Zeytinlik" };
   private final String[] deed = { "  -", "Hisseli Tapu", "Müstakil Parsel", "Tahsis", "Zilliyet" };
   private final String[] gabari = { "  -", "6.50", "9.50", "11.50", "12.50", "15.50", "18.50", "21.50", "24.50", "27.50", "30.50", "Serbest", "Belirtilmemiş" };
   private final String[] kaks = { "  -", "% 0.30", "% 0.35 / 1.05", "% 3", "% 5", "% 5 / 10", "% 7.5 / 15", "% 10 / 20", "% 10 / 30", "% 15", "% 15 / 30", "% 15 / 35", "% 20", "% 20 / 60", "% 20 / 40", "% 20 / 80", "% 25 / 50", "% 25 / 75", "% 25 / 100", "% 25 / 125", "% 27 / 80", "% 30 / 60", "% 30 / 90", "% 35 / 80", "% 40", "% 40 / 120", "% 40 / 50", "% 40 / 80", "% 45", "% 50", "% 70", "0.60", "0.90", "0.95", "1.0", "1.1", "1.20", "1.25", "1.35", "1.40", "1.50", "1.55", "1.60", "1.75", "1.80", "1.30", "1.90", "2.07", "2.1", "3.0", "Belirtilmemiş" };
   private final String[] type = {"  -"," Ev" , "İşyeri" , "Arazi"};
    public String getCities(int i) 
    {
        return cities[i];
    }

    public String getRoom(int i) 
    {
        return room[i];
    }

    public String getAge(int i) 
    {
        return age[i];
    }

    public String getHeat(int i) 
    {
        return heat[i];
    }

    public String getFloor(int i) 
    {
        return floor[i];
    }

    public String getTotalfloor(int i) 
    {
        return totalfloor[i];
    }

    public String getState(int i) 
    {
        return state[i];
    }

    public String getReconstruction(int i) 
    {
        return reconstruction[i];
    }

    public String getDeed(int i) 
    {
        return deed[i];
    }

    public String getGabari(int i) 
    {
        return gabari[i];
    }

    public String getKaks(int i) 
    {
        return kaks[i];
    }
    public String getType(int i)
    {
        return type[i];
    }
   
}
