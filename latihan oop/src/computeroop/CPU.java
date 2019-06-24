
package computeroop;


class CPU {
	private String merek;
    private double clock;
    private int core;
    
    
    public CPU(String merek,  double clock, int core){
        this.merek = merek;
        this.core = core;
        this.clock = clock;
    }
    
    public int getCore(){
        return core;
    }
    
    public double getClock(){
        return clock;
    }
    
    
    public String getMerek(){
        return merek;
    }
}
