package com.example.android.justspell.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.android.justspell.R;
import com.example.android.justspell.data.model.Spell;
import com.example.android.justspell.data.remote.APIService;
import com.example.android.justspell.data.remote.ApiUtils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private APIService mService;
    TextView nameTextView;
    TextView levelTextView;
    TextView schoolTextView;
    TextView castingtimeTextView;
    TextView rangeTextView;
    TextView componentsTextView;
    TextView durationTextView;
    TextView descriptionTextView;
    TextView classesTextView;
    TextView pageTextView;
    TextView concentrationTextView;
    TextView ritualTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mService = ApiUtils.getAPIService();

        TextView nameTextView = (TextView) findViewById(R.id.spell_item_name);
        TextView levelTextView = (TextView) findViewById(R.id.spell_item_level);
        TextView schoolTextView = (TextView) findViewById(R.id.spell_item_school);
        TextView castingtimeTextView = (TextView) findViewById(R.id.spell_item_castingtime);
        TextView rangeTextView = (TextView) findViewById(R.id.spell_item_range);
        TextView componentsTextView = (TextView) findViewById(R.id.spell_item_components);
        TextView durationTextView = (TextView) findViewById(R.id.spell_item_duration);
        TextView descriptionTextView = (TextView) findViewById(R.id.spell_item_description);
        TextView classesTextView = (TextView) findViewById(R.id.spell_item_classes);
        TextView pageTextView = (TextView) findViewById(R.id.spell_item_page);
        TextView concentrationTextView = (TextView) findViewById(R.id.spell_item_concentration);
        TextView ritualTextView = (TextView) findViewById(R.id.spell_item_ritual);

        loadData();
    }

    public void loadData(){
        mService.getData().enqueue(new Callback<Spell>() {
            @Override
            public void onResponse(Call<Spell> call, Response<Spell> response) {

                try {
                    nameTextView.setText(response.body().getName());
                    levelTextView.setText(""+response.body().getLevel());
                    schoolTextView.setText(response.body().getSchool().getName());
                    castingtimeTextView.setText(response.body().getCastingTime());
                    rangeTextView.setText(response.body().getRange());
                    componentsTextView.setText(response.body().getComponents().toString());
                    durationTextView.setText(response.body().getDuration());
                    descriptionTextView.setText(response.body().getDesc().toString());
                    classesTextView.setText(response.body().getClass().getName());
                    pageTextView.setText(response.body().getPage());
                    concentrationTextView.setText(response.body().getConcentration());
                    ritualTextView.setText(response.body().getRitual());

                } catch (Exception e) {
                    Log.d("onResponse", "There is an error");
                    e.printStackTrace();
                }

//                if(response.isSuccessful()) {
//                    Log.v("Success", "response.isSuccessful() Triggered");
//                }else {
//                    Log.v("Error", "esle of response.isSuccessful() Triggered");
//                    int statusCode  = response.code();
//                    // handle request errors depending on status code
//                }
            }

            @Override
            public void onFailure(Call<Spell> call, Throwable t) {
                Log.v("Error", t.toString());
            }
        });
    }
}
