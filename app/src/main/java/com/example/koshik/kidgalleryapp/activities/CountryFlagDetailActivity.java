package com.example.koshik.kidgalleryapp.activities;


import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.koshik.kidgalleryapp.R;
import com.example.koshik.kidgalleryapp.databinding.CountryFlagDetailActivityBinding;
import com.example.koshik.kidgalleryapp.models.CountryIModelPojo;
import com.squareup.picasso.Picasso;

public class CountryFlagDetailActivity extends AppCompatActivity {
    public static final String EXTRA_COUNTRY_FLAG = "extra_flag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CountryFlagDetailActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.country_flag_detail_activity);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CountryIModelPojo modelPojo = getIntent().getParcelableExtra(EXTRA_COUNTRY_FLAG);

        CountryIModelPojo pojo = new CountryIModelPojo(
                modelPojo.getCountryName(),
                modelPojo.getFullName(),
                modelPojo.getcapitalName(),
                modelPojo.getPhoneCode(),
                modelPojo.getLanguage(),
                modelPojo.getCurrency(),
                modelPojo.getRegion(),
                modelPojo.getDescription(),
                modelPojo.getThumbnail(),
                modelPojo.getImage());

        binding.setCountryIModelPojo(pojo);


       /* TextView myCountryName = (TextView) findViewById(R.id.tvCountryName);
        TextView myCountryFullName = (TextView) findViewById(R.id.tvCountryFullName);
        TextView myCapitalName = (TextView) findViewById(R.id.tvCountryCapitalName);
        TextView myCountryPhoneCode = (TextView) findViewById(R.id.tvCountryPhoneCode);
        TextView myCountryLanguage = (TextView) findViewById(R.id.tvCountryLanguage);
        TextView myCountryCurrency = (TextView) findViewById(R.id.tvCountryCurrency);
        TextView myCountryRegion = (TextView) findViewById(R.id.tvCountryRegionCode);
        TextView myCountryDescriptions = (TextView) findViewById(R.id.tvCountryDescription);
        ImageView myImage = (ImageView) findViewById(R.id.ivCountryFlagLargeImage);

        myCountryName.setText(modelPojo.getCountryName());
        myCountryFullName.setText(modelPojo.getFullName());
        myCapitalName.setText(modelPojo.getcapitalName());
        myCountryPhoneCode.setText(modelPojo.getPhoneCode());
        myCountryLanguage.setText(modelPojo.getLanguage());
        myCountryCurrency.setText(modelPojo.getCurrency());
        myCountryRegion.setText(modelPojo.getRegion());
        myCountryDescriptions.setText(modelPojo.getDescription());
        Picasso.with(this).load(modelPojo.getImage()).into(myImage);*/

    }
}