public class SortRute extends Rute {

    public SortRute(Labyrint labyrint, int x, int y) {
        super(labyrint, x, y);
    }

    public char tilTegn() {
        return '#';
    }

    @Override
    public void finnUtvei() {}

    @Override
    public void gaa(int[] komFra, String utvei) {}
}
