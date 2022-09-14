package kasus2_upinipin;

public class Item {
	private String name;
    private Item(){
        name = "Ipin";
    }
    public Item(String name) {
        this(); // ini berfungsi untuk memanggil Private Item dengan syarat memanggil first statment
        System.out.println(this.name);
    }
}
