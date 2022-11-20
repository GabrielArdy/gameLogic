public class Weapon {
    public boolean Sword;
    public boolean Bow;
    public boolean Axe;
    public boolean Bat;
    public boolean none;

    public Weapon() {
        this.Sword = false;
        this.Bow = false;
        this.Axe = false;
        this.Bat = false;
        this.none = true;
    }

    public void setSword() {
        this.Sword = true;
        this.Bow = false;
        this.Axe = false;
        this.Bat = false;
        this.none = false;
    }

    public void setBow() {
        this.Sword = false;
        this.Bow = true;
        this.Axe = false;
        this.Bat = false;
        this.none = false;
    }

    public void setAxe() {
        this.Sword = false;
        this.Bow = false;
        this.Axe = true;
        this.Bat = false;
        this.none = false;
    }

    public void setBat() {
        this.Sword = false;
        this.Bow = false;
        this.Axe = false;
        this.Bat = true;
        this.none = false;
    }

    public void setNone() {
        this.Sword = false;
        this.Bow = false;
        this.Axe = false;
        this.Bat = false;
        this.none = true;
    }

}
