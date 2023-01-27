package com.coder.explicityintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.coder.explicityintent.databinding.ActivityModelsInfoBinding;

public class ModelsInfo extends AppCompatActivity {

    private ActivityModelsInfoBinding binding;

    private final int[] logos = Details.logos;
    private final String[] brand = Details.brands;
    private final String[] description = Details.descriptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityModelsInfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int id = getIntent().getIntExtra("id",0);
        setDetails(id);

    }

    public void setDetails(int id){
        binding.brandLogo.setImageResource(logos[id]);
        binding.brandName.setText(brand[id]);
        binding.brandDescription.setText(description[id]);
    }

}