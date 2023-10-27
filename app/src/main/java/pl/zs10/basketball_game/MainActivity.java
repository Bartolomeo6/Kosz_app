package pl.zs10.basketball_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* dlaczego lepiej korzystać z tego widoku: -> https://developer.android.com/develop/ui/views/layout/constraint-layout */
    }
}