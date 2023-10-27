package pl.zs10.basketball_game;

import androidx.lifecycle.ViewModel;

public class PunktyViewModel extends ViewModel {

    private int punkty = 0;

    public void setPunkty(int punkty) {
        this.punkty = punkty;
    }

    public int getPunkty() {
        return punkty;
    }

    public void dodajPKT(int ile) {
        punkty += ile;
    }
}
