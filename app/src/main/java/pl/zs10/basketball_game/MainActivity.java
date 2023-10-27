package pl.zs10.basketball_game;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;

import android.os.Bundle;
import android.view.View;

import pl.zs10.basketball_game.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private int punkty = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* dlaczego lepiej korzystać z tego widoku: -> https://developer.android.com/develop/ui/views/layout/constraint-layout */

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.textView.setText(String.valueOf(punkty));
        binding.button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty++;
                        binding.textView.setText(String.valueOf(punkty));
                    }
                }
        );

        binding.button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty+=2;
                        binding.textView.setText(String.valueOf(punkty));
                    }
                }
        );

        binding.button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty+=3;
                        binding.textView.setText(String.valueOf(punkty));
                    }
                }
        );

    }
}