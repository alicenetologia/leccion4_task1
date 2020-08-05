package test.olesia;

public class BonusMilesService {
    public int calculate (int cost){
        int bonusPerMile = 2000;
        int miles = cost / bonusPerMile;
        return miles;
    }

}
