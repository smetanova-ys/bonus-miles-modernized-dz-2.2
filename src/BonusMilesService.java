public class BonusMilesService {
    public int calculate(int price) {
        int amountPerMile = 20;
        int amountBonusMiles = price / amountPerMile;
        return amountBonusMiles;
    }
}
