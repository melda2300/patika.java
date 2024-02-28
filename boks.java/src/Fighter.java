public class Fighter {
    private String name;
    private int damage;
    private int healtyh;
    private int wight;
    private double dodge;

    public Fighter( String name, int damage, int healtyh, int wight, double dodge ) {
        this.name=name;
        this.damage=damage;
        this.healtyh= healtyh;
        this.wight=wight;
        this.dodge=dodge;
    }

    public int hit( Fighter dusman ) {
        System.out.println("---------");
        System.out.println(this.getName() + "=>" + dusman.getName() + " " + this.getDamage() + "hasar vurdu");
        if (dusman.dodge()) {
            System.out.println(dusman.getName() +"gelen hasar savruldu. ");
            return dusman.getHealtyh();
        }
        if (dusman.getHealtyh()-this.damage<0)
            return 0;
        return dusman.healtyh-this.damage;
    }

    public boolean dodge(){
        double rondomValue=Math.random()*100;
        return  rondomValue<=this.dodge;
    }
    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage( int damage ) {
        this.damage = damage;
    }

    public int getHealtyh() {
        return healtyh;
    }

    public void setHealtyh( int healtyh ) {
        this.healtyh = healtyh;
    }

    public int getWight() {
        return wight;
    }

    public void setWight( int wight ) {
        this.wight = wight;
    }

    public double getDodge() {
        return dodge;
    }

    public void setDodge( double dodge ) {
        this.dodge = dodge;
    }
}
