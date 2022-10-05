package ikinciHaftaÖdev;

public class Main {

	public static void main(String[] args) {

		// methods video24

		sayiBulmaca();// direk mainden çalısır ıcınde bırsey yoksa sonuc yoktur

	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 2;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}

		String mesaj = "";

		if (varMi) {

			mesaj = "Sayı mevcuttur: " + aranacak;

		} else {
			mesajVer("Sayı mevcut değildir. " + aranacak);

		}

	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

	// video25 methods2

	public static void main(String[] args) {

		String mesaj = "Bugün Hava Çok Güzel.";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(5, 7);
		System.out.println(sayi);
		int toplam = topla2(2, 3, 4, 5, 6, 10);
		System.out.println(toplam);
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void guncelle() {
		System.out.println("Güncellendi");
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static String sehirVer() {
		return "Ankara";
	}

	// Variable Arguments video26

	public static int topla2(int... sayilar) { // üç noktaya deniyor
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}

	public static String giveCity() {
		return "Ankara";
	}

	// classes video27-28-29

	public static void main(String[] args) {
		// classlar =reference type
	}

	CustomerManeger customerManeger = new CustomerManeger();
	CustomerManeger customerManeger2 = new CustomerManeger();customerManeger=customerManeger2;customerManeger.Add();customerManeger.Remove();customerManeger.Update();

	// valuetype
	intsayi=10;
	int sayi2 = 20;sayi2=sayi1;// sayi2 nin değeri sayi1in degerıdır
	sayi1=30;System.out.println(sayi2);// sayi2 10dur
	// diziler reference type dir tipinin önemi yoktur

	int[] sayilar1 = new int[] { 1, 2, 3 };
	int[] sayilar2 = new int[] { 4, 5, 6 };sayilar2=sayilar1; // sayilar2 sayilar1dir ve
	sayilar1[0]=30; // 0.index 1di 10 oldu
	System.out.println(sayilar2[0]);// yani sayilar2nin [0] 10dur.

	// video30 reCapDemo_Classes

	    // DortIslem.java

	public int Topla(int sayi1, int sayi2) {
	 		return sayi1 + sayi2;
	 	}

	public int Cikar(int sayi1, int sayi2) {
	 		return sayi1 - sayi2;
	 	}

	public int Carp(int sayi1, int sayi2) {
	 		return sayi1 * sayi2;
	 	}

	public int Bol(int sayi1, int sayi2) {
	 		return sayi1 / sayi2;
	
	
	      //Main.java
	 		
	     DortIslem dortIslem = new DortIslem();
			int sonuc = dortIslem.Topla(3, 5);
			System.out.println(sonuc);
	
	//classesWithAttributes video31-32
			
		//Product.java
			//class özellik(atttribute) barındırır
			
	    private int _id;
	    private String _name;
	    private String _description;
	    private double _price;
	    private int _stockAmount;
	    private String _color;
	    private String _code;
		     //sadece tanımlandıgı blokta gecerlıdır demektır
	   
	    public int getId() {
			return _id;
		}
		public void setId(int id) {
			_id = id; //yada this.id de yazabiliriz
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getStockAmount() {
			return stockAmount;
		}
		public void setStockAmount(int stockAmount) {
			this.stockAmount = stockAmount;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getCode() {
			return name.substring(0,1) + id;
		}
	    
	    
		//ProductManager.java
		System.out.println("Ürün Eklendi " + product.name );
		
			
		
		
		//Main.java
		Product product = new Product();
		product.setName = "Laptop";
		product.setId = 1;
		product.setDescription="Dell Laptop";
		product.setPrice=10000;
		product.setStockAmount=3;
		product.setColor="purple";
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getcode());
		
		
		
		   //Constructor 
		
		
		
		
		    //methodOverloading  video35
		
		
		  //DortIslem.java
		
		public int topla(int sayi1, int sayi2) {
			return sayi1 + sayi2;
		}
		
		public int topla(int sayi1, int sayi2, int sayi3) {
			return sayi1 + sayi2 + sayi3;
		}
		
		
		  //Main.java
		
		DortIslem dortIslem = new DortIslem();
		System.out.println(dortIslem.topla(2, 3));
		dortIslem.topla(2,3,5);
		
		
	
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
	
}
