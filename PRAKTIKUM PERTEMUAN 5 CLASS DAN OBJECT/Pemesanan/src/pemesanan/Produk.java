package pemesanan;

public class Produk {
	public String[] nama_makanan;
	public double[] harga_makanan;
	public double harga_total;
	public int[] stok;
	public static byte id = 0;

	public Produk(){
		nama_makanan = new String[10];
		harga_makanan = new double[10];
		stok = new int[10];
	}

	public void tambahMenuMakanan(String nama, double harga, int stok){
		nama_makanan[id] = nama;
		harga_makanan[id] = harga;
		this.stok[id] = stok;
	}

	public void tampilMenuMakanan(){
		System.out.println("                Daftar Menu                ");
		System.out.println("===========================================");
		for (int i=0; i<=id; i++) {
			if (!isOutOfStock(i)) {
				System.out.println(i+1 + ". \t" + nama_makanan[i] + "\t[" + stok[i] + "]" + "\tRp. " + harga_makanan[i]);
			}
		}
		System.out.println("===========================================");
		System.out.println("");
	}

	public void cekInfoMakanan(int input_id, int input_qty){
		System.out.println("");
		System.out.println("             Menu Produk Terpilih          ");
		System.out.println("===========================================");

		// CEK PRODUK
		if (input_id >= nama_makanan.length || input_id < 0) {
			System.out.println("        Produk Tidak Ada Dalam List        ");
		}
		else{
			// CEK STOK
			harga_total = input_qty*harga_makanan[input_id];
			if (stok[input_id] >= input_qty) {
				System.out.println(nama_makanan[input_id] + "\tRp. " + harga_makanan[input_id] + "*" + input_qty + " " + harga_total);

				// PROSES MENGURANGI STOK
				stok[input_id] = stok[input_id] - input_qty;
			}
			else{
				System.out.println("             Stok Produk Kurang            ");
			}
		}

		System.out.println("===========================================");
		System.out.println("");
	}

	public boolean isOutOfStock(int id){
		if (stok[id] == 0) {
			return true;
		}
		else{
			return false;
		}
	}

	public static void nextId(){
		id++;
	}
}
