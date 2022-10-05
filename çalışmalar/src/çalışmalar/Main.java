package çalışmalar;

public class Main {

	public static void main(String[] args) {
		
			
	   //video5
			System.out.println("Hello World");
			
			
			
			//video 6
			
			int ogrenciSayisi = 12;
			String mesaj = "Öğrenci sayısı : ";

			System.out.println(mesaj + ogrenciSayisi);
			
			System.out.println("Öğrenci sayım : "+ ogrenciSayisi);
			
			
			
			
			//video7
			
			double sayi = 12.5;
		
			sayi = -129;
			
			char karakter = 'A';
			
			boolean dogruMu = false;
			
			
			
			//video8

	      int sayi = 24;
			
			 if(sayi<20){
				System.out.println("Sayı 20'den küçüktür");
			}else if(sayi==20){
				System.out.println("Sayı 20'ye eşittir");			
			} else(sayi>24){
				System.out.println("Sayi 20'den küçük değildir");
			}
			 
			
			 // reCapDemo_1
			 
			 int sayi1 = 24;
				int sayi2 = 25;
				int sayi3 = 2;
				int enBuyuk = sayi1;
				
				if(enBuyuk<sayi2) {
					enBuyuk = sayi2;
					
				}
				
				if(enBuyuk<sayi3) {
					enBuyuk = sayi3;
				}
				
				System.out.println("En Büyük = "+enBuyuk);
				
				
				//switchDemo
				
				char grade = 'A';

				switch (grade) {
				
				case 'A':
					
				   System.out.println("Mükemmel : Geçtiniz");
				   break;
					
				case 'B':
				
				   System.out.println("Çok Güzel : Geçtiniz");
				   break;
				   
				   
				case 'C':
				
					System.out.println("İyi : Geçtiniz");
					break;
					
				case 'D':
				
					System.out.println("Fena Değil : Geçtiniz");
					break;
					
				case 'F':
				
					System.out.println("Maalesef Kaldınız");
					break;
					
				default:
					System.out.println("Geçersiz not girdiniz");
					
					//loopDemo
					
					for(int i=1;i<10;i++) {
						System.out.println(i);
					}
					System.out.println("For Döngüsü Bitti");
					
					//while
					
					int i=1;
					
					while(i<10) {
						System.out.println(i);
						i+=2;
					}
					 System.out.println("While Döngüsü Bitti");
					 
					 //Do-while
					 int j=1;
					 do {
						 System.out.println(j);
							j+=2;
					 }while(j<10);
					 System.out.println("Do-While Döngüsü Bitti");
					 
					 //arraysDemo
					 

						String ogrenci1 = "Engin";
						String ogrenci2 = "Derin";
						String ogrenci3 = "Salih";
						String ogrenci4 = "Ahmet";

						System.out.println(ogrenci1);
						System.out.println(ogrenci2);
						System.out.println(ogrenci3);
						System.out.println(ogrenci4);
						
						System.out.println("------------------------");

						String[] ogrenciler = new String[3];
						ogrenciler[0] = "Engin";
						ogrenciler[1] = "Derin";
						ogrenciler[2] = "Salih";
						ogrenciler[3] = "ahmet";
                     // ogrenciler[4] = "Ali"; // ArrayIndexOutOfBoundsException

						for (int i = 0; i < ogrenciler.length; i++) {
							System.out.println(ogrenciler[i]);
						}
						System.out.println("------------------------");

						for (String ogrenci:ogrenciler) {
							System.out.println(ogrenci);
						}
					
					//reCapDemo2
						
						double[] myList = {1.2,1.3,4.3,5.6 }
						double total=0;
						double max = myList[0];
						for(double number:myList) {
							if(max<number) {
								max = number;
							}
						
							total = total + number;
							System.out.println(number);
						}
							System.out.println("Toplam = " + total);
							System.out.println("En Büyük = " + max);
							
							
							//
							
							String[][] sehirler = new String[3][3];

							sehirler[0][0] = "İstanbul ";
							sehirler[0][1] = "Bursa ";
							sehirler[0][2] = "Bilecik ";
							sehirler[1][0] = "Ankara";
							sehirler[1][1] = "Konya";
							sehirler[1][2] = "Kayseri";
							sehirler[2][0] = "Diyarbakır";
							sehirler[2][1] = "Şanlıurfa";
							sehirler[2][2] = "Gaziantep";

							for (int i = 0; i<=2;i++) {
								System.out.println("------------------");
								
								
								for (int j=0;j<=2;j++) {
									System.out.println(sehirler[i][j]);
								}
							}	
								
							
							//StringDemo
							
							String mesaj = "Bugün hava çok güzel."; 
							System.out.println(mesaj);


							System.out.println("Eleman sayısı : " + mesaj.length());
							System.out.println("5. eleman : " + mesaj.charAt(4));

							System.out.println(mesaj.concat(" Yaşasın!"));
                            System.out.println(mesaj.startsWith("B")); 
							System.out.println(mesaj.startsWith("."));

							char[] karakterler = new char[5];
							mesaj.getChars(0,5,karakterler, 0); 
							System.out.println(karakterler);

							System.out.println(mesaj.indexOf("av"));
							System.out.println(mesaj.lastIndexOf("a"));
							

							
							
							String yeniMesaj = mesaj.replace(' ', '-');
							System.out.println(yeniMesaj);

							System.out.println(mesaj.substring(2, 4)); 

							for (String kelime : mesaj.split(" ")) {
								System.out.println(kelime);

							}

							System.out.println(mesaj.toLowerCase());
							System.out.println(mesaj.toUpperCase());
							System.out.println(mesaj.trim()); 
		 					
							////MiniProje1SayiAsalMi
							
							
							int number = -2;
							int remainder = number % 2;
							boolean isPrime = true;

							if (number == 1) {

								System.out.println(number + " sayı asal sayıdır");
                                 return;
							}
							
							 else if (number == 1) {
								System.out.println(number + " sayisi asal sayi deðildir.");

							} else if (number < 1) {

								System.out.println("Asal sayi olabilmesi için 1 den büyük sayýlar girilmelidir.");
							} else {

								for (int i = 2; i <= number / 2; i++) {

									remainder = number % i;
									if (remainder == 0) {
										System.out.println(number + " sayisi asal sayi deðildir.");
										break;

									}
								}

								if (remainder != 0) {
									System.out.println(number + " sayisi asal sayidir");
								}
	    
	}

}
