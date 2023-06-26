public class BonusMilesService {
    public int calculate(int a) {
        if (a > 0) {
            int bonusMileRub = 20;
            int bonusTicket = a / bonusMileRub;
            return bonusTicket;
        }
        else  {
            return 0;
        }
    }
}
