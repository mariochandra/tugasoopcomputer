
package computeroop;


public class HDD extends Storage{
    public int kapasitas;
    
    public HDD(int kapasitas){
        super(kapasitas);
    }
    
    public String getName(){
        return "HDD";
    }
}
