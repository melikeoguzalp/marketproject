package stok_odev;
public class stok {
	
     String uruntipi;
     public	int urunadedi;
	 public int gelisFiyati;
	 public int satisFiyati;
	 public int satilan_urunadedi;
	
	public void kar_hesapla()
	{
		int  kar= (satisFiyati-gelisFiyati)*100/gelisFiyati;
		System.out.println("kar oranı yuzdesi %"+kar);
	}
	
	public void Toplam_alisFiyati()
	{
		int  alis= urunadedi*gelisFiyati;
		System.out.println("toplam alis= "+ alis);
	}
	
	public void  totalgelen_para()
	{
		int  toplam=satilan_urunadedi*satisFiyati;
		System.out.println("totalde gelen para= "+toplam);
		
	}
	public void yazdir()
	{
		System.out.println("urun ismi= "+uruntipi);
		System.out.println("urun adedi= "+urunadedi);
		System.out.println("urunun satis fiyati= "+satisFiyati);
		System.out.println("urunun alis fiyati= "+gelisFiyati);
		System.out.println("satilan urun adedi= "+satilan_urunadedi);
		kar_hesapla();
		Toplam_alisFiyati();
		totalgelen_para();
		System.out.println("***********************");	
		
	
	}
	
}
