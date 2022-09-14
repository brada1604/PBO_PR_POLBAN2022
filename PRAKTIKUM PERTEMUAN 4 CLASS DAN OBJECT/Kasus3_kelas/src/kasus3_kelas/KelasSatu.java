package kasus3_kelas;

public class KelasSatu {
	{
        System.out.println(11);
    }
    
    static {
    	// CEK STATIC DULU
        System.out.println(2);
    }
    
    public KelasSatu(int i) {
        System.out.println(3);
    }
    
    public KelasSatu() {
        System.out.println(4);
        
    }
}
