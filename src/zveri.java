public class zveri {
        private String color;
        private boolean volosi;
        private int lapki;
        public zveri(){}

        public zveri(boolean vol, String col, int lki){
            this.color=col;
            this.volosi=vol;
            this.lapki=lki;
        }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLapki () {
        return lapki;
    }
    public void lapki (int lapki) {
        this.lapki = lapki;

    }

    public void setVolosi(boolean volosi) {
        this.volosi = volosi;
    }

    public boolean isVolosi() {
        return volosi;
    }

    //public void aVolosi (boolean volosi) {
    //    this.volosi = volosi;
   // }
    }
