package invader.nomi.locationdistancecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import invader.nomi.locationdistcalculator.DistanceCalculator;
import invader.nomi.locationdistcalculator.PlaceCoordinates;

public class MainActivity extends AppCompatActivity {

    TextView distanceText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        distanceText = (TextView) findViewById(R.id.distance_text);

        PlaceCoordinates starting  = new PlaceCoordinates((float) -34.6037389, (float) -58.3815704);
        PlaceCoordinates destaination = new PlaceCoordinates((float) 40.6892494, (float) -74.0445004);


        distanceText.setText(String.valueOf(DistanceCalculator.calculateDist(starting,destaination)));
    }
}
