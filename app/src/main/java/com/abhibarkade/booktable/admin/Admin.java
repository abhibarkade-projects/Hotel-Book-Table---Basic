package com.abhibarkade.booktable.admin;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

import com.abhibarkade.booktable.R;
import com.abhibarkade.booktable.admin.helpers.AddHotel;
import com.abhibarkade.booktable.admin.helpers.Helper_Hotel;

public class Admin extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        listView = findViewById(R.id.lv_list);
    }

    public void addHotel(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View view = LayoutInflater.from(this).inflate(R.layout.add_hotel, null);
        builder.setTitle("Add Hotel");
        builder.setView(view);
        EditText name = view.findViewById(R.id.ed_name);
        TextView ot = view.findViewById(R.id.tx_ot);
        TextView ct = view.findViewById(R.id.tx_ct);

        Helper_Hotel hotel = new Helper_Hotel();

        ot.setOnClickListener(vv -> {
            TimePickerDialog dialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onTimeSet(TimePicker timePicker, int i, int i1) {
                    ot.setText(i + " : " + i1);
                    hotel.setOpening_time(ot.getText().toString());
                }
            }, 12, 0, false);
            dialog.show();
        });

        ct.setOnClickListener(vv -> {
            TimePickerDialog dialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onTimeSet(TimePicker timePicker, int i, int i1) {
                    ct.setText(i + " : " + i1);
                    hotel.setClosing_time(ct.getText().toString());
                }
            }, 12, 0, false);
            dialog.show();
        });

        builder.setPositiveButton("Add", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                hotel.setHotelName(name.getText().toString());
                new AddHotel(getApplicationContext(), hotel,dialogInterface).addHotelToDB();
            }
        });

        builder.show();
    }
}