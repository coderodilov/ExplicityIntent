package com.coder.explicityintent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import com.coder.explicityintent.databinding.ActivityMainBinding;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.coder.explicityintent.databinding.ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.linux.setOnClickListener(v -> onClick(0));
        binding.android.setOnClickListener(v -> onClick(1));
        binding.windows.setOnClickListener(v -> onClick(2));
        binding.apple.setOnClickListener(v -> onClick(3));
        binding.ubuntu.setOnClickListener(v -> onClick(4));
        binding.xiaomi.setOnClickListener(v -> onClick(5));
    }

    public void onClick(int id){
        Intent intent = new Intent(this, ModelsInfo.class);
        intent.putExtra("id", id);
        startActivity(intent);
    }

}