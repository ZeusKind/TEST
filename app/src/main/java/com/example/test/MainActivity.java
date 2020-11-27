package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

 
    }
    public static final int PICK_CONTACT_REQUEST = 1;

    public void onClick(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        Intent pickContactIntent = new Intent(Intent.ACTION_PICK, Uri.parse("content://contacts"));
        pickContactIntent.setType(ContactsContract.CommonDataKinds.Phone.CONTENT_TYPE);
        startActivityForResult(pickContactIntent, PICK_CONTACT_REQUEST);
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent resultIntent){
        super.onActivityResult(requestCode, resultCode, resultIntent);
        setContentView(R.layout.secondactivity);
        if (requestCode == PICK_CONTACT_REQUEST) {
            if (requestCode == RESULT_OK) {
                Uri contactUri = resultIntent.getData();
                String[] projection = {ContactsContract.CommonDataKinds.Phone.NUMBER};

                Cursor cursor = getContentResolver().query(contactUri, projection, null,)
            }
        }


    }

}