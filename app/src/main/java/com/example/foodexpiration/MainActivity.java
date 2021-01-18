package com.example.foodexpiration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import android.os.Handler;

import com.google.android.material.textfield.TextInputEditText;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    Handler handler = new Handler();
    Runnable runnable;
    int delay = 10000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    ArrayList<FoodList> kind = new ArrayList<FoodList>();

    FoodList item1 = new FoodList();
    FoodList item2 = new FoodList();
    FoodList item3 = new FoodList();
    FoodList item4 = new FoodList();
    FoodList item5 = new FoodList();
    FoodList item6 = new FoodList();
    FoodList item7 = new FoodList();
    FoodList item8 = new FoodList();
    FoodList item9 = new FoodList();
    FoodList item10 = new FoodList();

    int i = 1;
    boolean containsFood = false;
    public void confirmFood(View view) {
        if (i <= 10) {
            TextInputEditText foodName = (TextInputEditText) findViewById(R.id.nameInput);
            TextInputEditText foodLocation = (TextInputEditText) findViewById(R.id.locationInput);
            TextInputEditText month = (TextInputEditText) findViewById(R.id.monthInput);
            TextInputEditText day = (TextInputEditText) findViewById(R.id.dayInput);
            TextInputEditText year = (TextInputEditText) findViewById(R.id.yearInput);

            TableLayout table = (TableLayout) findViewById(R.id.table);
            TextView t = new TextView(MainActivity.this);
            t.setTextColor(0xFF7289DA);
            t.setText("Food Name: " + foodName.getText().toString() + "\nLocated In: " + foodLocation.getText().toString() + "\nExpires: " + month.getText().toString() + "/" + day.getText().toString() + "/" + year.getText().toString() + "\n");
            t.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));
            table.addView(t);

            int monthValue = Integer.parseInt(month.getText().toString());
            int dayValue = Integer.parseInt(day.getText().toString());
            int yearValue = Integer.parseInt(year.getText().toString());


            if (i == 1) {
                containsFood = true;
                kind.add(item1);
                item1.setName(foodName.getText().toString());
                item1.setLocation(foodLocation.getText().toString());
                item1.setMonth(monthValue);
                item1.setDay(dayValue);
                item1.setYear(yearValue);
                item1.setExpiring(false);
            } else if (i == 2) {
                kind.add(item2);
                item2.setName(foodName.getText().toString());
                item2.setLocation(foodLocation.getText().toString());
                item2.setMonth(monthValue);
                item2.setDay(dayValue);
                item2.setYear(yearValue);
                item2.setExpiring(false);
            } else if (i == 3) {
                kind.add(item3);
                item3.setName(foodName.getText().toString());
                item3.setLocation(foodLocation.getText().toString());
                item3.setMonth(monthValue);
                item3.setDay(dayValue);
                item3.setYear(yearValue);
                item3.setExpiring(false);
            } else if (i == 4) {
                kind.add(item4);
                item4.setName(foodName.getText().toString());
                item4.setLocation(foodLocation.getText().toString());
                item4.setMonth(monthValue);
                item4.setDay(dayValue);
                item4.setYear(yearValue);
                item4.setExpiring(false);
            } else if (i == 5) {
                kind.add(item5);
                item5.setName(foodName.getText().toString());
                item5.setLocation(foodLocation.getText().toString());
                item5.setMonth(monthValue);
                item5.setDay(dayValue);
                item5.setYear(yearValue);
                item5.setExpiring(false);
            } else if (i == 6) {
                kind.add(item6);
                item6.setName(foodName.getText().toString());
                item6.setLocation(foodLocation.getText().toString());
                item6.setMonth(monthValue);
                item6.setDay(dayValue);
                item6.setYear(yearValue);
                item6.setExpiring(false);
            } else if (i == 7) {
                kind.add(item7);
                item7.setName(foodName.getText().toString());
                item7.setLocation(foodLocation.getText().toString());
                item7.setMonth(monthValue);
                item7.setDay(dayValue);
                item7.setYear(yearValue);
                item7.setExpiring(false);
            } else if (i == 8) {
                kind.add(item8);
                item8.setName(foodName.getText().toString());
                item8.setLocation(foodLocation.getText().toString());
                item8.setMonth(monthValue);
                item8.setDay(dayValue);
                item8.setYear(yearValue);
                item8.setExpiring(false);
            } else if (i == 9) {
                kind.add(item9);
                item9.setName(foodName.getText().toString());
                item9.setLocation(foodLocation.getText().toString());
                item9.setMonth(monthValue);
                item9.setDay(dayValue);
                item9.setYear(yearValue);
                item9.setExpiring(false);
            } else if (i == 10) {
                kind.add(item10);
                item10.setName(foodName.getText().toString());
                item10.setLocation(foodLocation.getText().toString());
                item10.setMonth(monthValue);
                item10.setDay(dayValue);
                item10.setYear(yearValue);
                item10.setExpiring(false);
            }
            i++;

            foodName.clearFocus();
            foodName.setText("");
            foodLocation.clearFocus();
            foodLocation.setText("");
            month.clearFocus();
            month.setText("");
            day.clearFocus();
            day.setText("");
            year.clearFocus();
            year.setText("");
        }
    }
    @Override
    protected void onResume() {
        handler.postDelayed(runnable = new Runnable() {
            public void run() {
                handler.postDelayed(runnable, delay);
                Calendar calendar = Calendar.getInstance();
                int yearT = calendar.get(Calendar.YEAR);
                int monthT = calendar.get(Calendar.MONTH);
                int day7T = calendar.get(Calendar.DAY_OF_YEAR) - 7;
                int dayT = calendar.get(Calendar.DAY_OF_YEAR);

                if( kind.size() > 0 ) {
                    for (int j = 0; j < kind.size(); j++) {
                        if( kind.get(j).expiring == false ) {
                            int dayF = kind.get(j).day + ( (kind.get(j).month-1) * 30 );
                            if ( kind.get(j).year == yearT )
                            {
                                if ( dayT < dayF && dayT >= (dayF-7) ) {
                                    TableLayout table = (TableLayout) findViewById(R.id.expiringTable);
                                    TextView t = new TextView(MainActivity.this);
                                    t.setTextColor(0xFFDC4545);
                                    t.setText("Food Name: " + kind.get(j).name + "\nLocated In: " + kind.get(j).location + "\nExpires: " + kind.get(j).month + "/" + kind.get(j).day + "/" + kind.get(j).year + "\n");
                                    t.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));
                                    table.addView(t);
                                    kind.get(j).expiring = true;
                                }
                            }
                        }
                    }
                }
            }
        }, delay);
        super.onResume();
    }
    @Override
    protected void onPause() {
        handler.removeCallbacks(runnable); //stop handler when activity not visible super.onPause();
    }



}