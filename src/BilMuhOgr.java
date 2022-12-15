public class BilMuhOgr extends Ogrenci{

    public BilMuhOgr(String name) {
        super(name);
    }

    @Override
    void konus() {
        super.konus();
        System.out.println(this.name + ": Ayný zamanda kodluyorum.");
    }
}
