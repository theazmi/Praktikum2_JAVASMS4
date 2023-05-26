package model;

public class Penerbit {
    private int id;
    private String penerbit;

    public Penerbit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
    
    

    public Penerbit(int id, String penerbit) {
        this.id = id;
        this.penerbit = penerbit;
    }
}
