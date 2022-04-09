package com.abhibarkade.booktable.admin.helpers;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddHotel {
    Context context;
    Helper_Hotel hotel;
    DialogInterface dialogInterface;

    public AddHotel(Context context, Helper_Hotel hotel, DialogInterface dialogInterface) {
        this.context = context;
        this.hotel = hotel;
        this.dialogInterface = dialogInterface;
    }

    public Helper_Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Helper_Hotel hotel) {
        this.hotel = hotel;
    }

    public void addHotelToDB() {
        DatabaseReference db = FirebaseDatabase.getInstance().getReference();

        db.child("Hotels")
                .child(hotel.getHotelName())
                .setValue(hotel)
                .addOnSuccessListener(unused -> {
                    Toast.makeText(context, "Hotel Added", Toast.LENGTH_SHORT).show();
                    dialogInterface.dismiss();
                })
                .addOnFailureListener(msg -> {
                    Toast.makeText(context, msg.getMessage(), Toast.LENGTH_SHORT).show();
                    dialogInterface.dismiss();
                });
    }
}
