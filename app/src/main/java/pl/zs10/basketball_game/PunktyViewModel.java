package pl.zs10.basketball_game;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PunktyViewModel extends ViewModel {

    private MutableLiveData<Integer> punkty;

    public void setPunkty(MutableLiveData<Integer> punkty) {
        this.punkty = punkty;
    }

    public MutableLiveData<Integer> getPunkty() {
        if(punkty == null) {
            punkty = new MutableLiveData<>();
            punkty.setValue(0);
        }
        return punkty;
    }

    public void dodajPKT(int ile) {
        if(punkty!=null) {
            punkty.setValue(punkty.getValue()+ile);
        }
    }
}
