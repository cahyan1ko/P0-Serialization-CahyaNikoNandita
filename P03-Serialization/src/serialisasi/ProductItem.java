package serialisasi;

import java.io.Serializable;

public class ProductItem implements Serializable{
    
    String nama;
    double harga;
    
    public ProductItem(String name, double price) {
        this.nama = name;
        this.harga = price;
    }

    public String toString() {
        return "\r\nNama=" + nama + "\r\nHarga=" + harga + "\r\n";
    }
}

