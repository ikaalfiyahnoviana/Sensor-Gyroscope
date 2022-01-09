package android.example.sensorgyroscope;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class FirstPageUI extends AppCompatActivity {
    private CardView cardView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_page_ui);


        cardView = (CardView) findViewById(R.id.card_gyroscope);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityGyro();
            }
        });

        cardView = (CardView) findViewById(R.id.card_database);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityDatabase();
            }
        });
    }

    public void openActivityGyro(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openActivityDatabase(){
        Intent intent = new Intent(this, ListViewActivity.class);
        startActivity(intent);
    }
}

