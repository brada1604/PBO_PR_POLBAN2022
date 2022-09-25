package pemesanan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("test pemesanan");
		Produk menu = new Produk();
		menu.tambahMenuMakanan("Batagor", 5_000, 20);
		Produk.nextId();
		menu.tambahMenuMakanan("Roti Bakar", 12_000, 20);
		Produk.nextId();
		menu.tambahMenuMakanan("Indomie + Telor", 10_000, 10);
		Produk.nextId();
		menu.tambahMenuMakanan("Kwetiaw", 12_000, 20);
		Produk.nextId();
		menu.tambahMenuMakanan("Nasi Goreng", 12_000, 20);
		Produk.nextId();
		menu.tambahMenuMakanan("Air Mineral", 3_000, 20);
		Produk.nextId();
		menu.tambahMenuMakanan("Teh Manis", 4_000, 20);
		Produk.nextId();
		menu.tambahMenuMakanan("Jus Alpukat", 8_000, 20);
		Produk.nextId();
		menu.tambahMenuMakanan("Teh Botol", 5_000, 20);
		Produk.nextId();
		menu.tambahMenuMakanan("Kopi", 3_000, 20);
			
		Scanner input = new Scanner (System.in);
		
		while (true) {
			menu.tampilMenuMakanan();

			System.out.print("Inputkan ID Produk : ");
			int input_id = input.nextInt()-1;
			System.out.print("Inputkan Jumlah Produk : ");
			int input_qty = input.nextInt();
	        
	        // input.close();


	        // TEST
	        // System.out.println("ID Produk terinput : " + input_id);
	        // System.out.println("Jumlah Produk terinput : " + input_qty);
	        
	        // CEK PRODUK DAN STOK
	        menu.cekInfoMakanan(input_id, input_qty);
	        // menu.tampilMenuMakanan();	
	    }
	}

}
