public class Cat extends zveri {
    private String color;
    private  boolean volosi;
    private int lapki;
    public String zvyki;
    public String hodit;


    public Cat(boolean vol, String col, int lki, String zv, String hod ) {
        super(vol, col, lki, zv,hod);
        this.color = col;
        this.volosi=vol;
        this.lapki=lki;
        this.zvyki=zv;
        this.hodit=hod;
    }

}
