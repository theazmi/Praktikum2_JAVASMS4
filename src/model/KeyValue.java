package model;
public class KeyValue {
    int key;
    String value;
    
    @Override
    public String toString(){
        return value;
    }
    
    public KeyValue(int key, String value ){
        this.key = key;
        this.value = value;
    }
    
    public KeyValue(String value){
        this.key = key;
        this.value = value;
    }
    
    public KeyValue(){
        this.key = 0;
        this.value = "";
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    
    
}
