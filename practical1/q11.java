package com.example.practical1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CallLog;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ListIterator;

public class q11 extends AppCompatActivity {

    Button email,sms,logs,map,url,contacts,condetails,dailer,call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q11);

        email = findViewById(R.id.btnemail);
        sms = findViewById(R.id.btnsms);
        logs = findViewById(R.id.btnlog);
        map = findViewById(R.id.btnmap);
        url = findViewById(R.id.btnurl);
        contacts = findViewById(R.id.btncontacts);
        condetails = findViewById(R.id.btncondetails);
        dailer = findViewById(R.id.btndailer);
        call = findViewById(R.id.btncall);

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Send Email
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("message/rfc822");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"recipient@example.com"});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Body");
                startActivity(Intent.createChooser(emailIntent, "Choose an email client"));
            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Send SMS
                Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
                smsIntent.setData(Uri.parse("smsto:" + Uri.encode("1234567890")));
                smsIntent.putExtra("sms_body", "Hello, World!");
                startActivity(smsIntent);

            }
        });

        dailer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Open Dialer
                Intent dialerIntent = new Intent(Intent.ACTION_DIAL);
                startActivity(dialerIntent);
            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Make a Call
                Intent callIntent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:9687860059"));

                startActivity(callIntent);
            }
        });


        url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open Web URL
                Intent webIntent = new Intent(Intent.ACTION_VIEW);
                webIntent.setData(Uri.parse("https://www.example.com"));
                startActivity(webIntent);
            }
        });


        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open Map
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=1600+Amphitheatre+Parkway%2C+CA"));
                startActivity(mapIntent);
            }
        });


        contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show Contacts
                Intent contactsIntent = new Intent(Intent.ACTION_VIEW, ContactsContract.Contacts.CONTENT_URI);
                startActivity(contactsIntent);

            }
        });

        condetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show Contact Details
                Intent contactDetailsIntent = new Intent(Intent.ACTION_VIEW);
                Uri contactUri = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, String.valueOf("contact_id"));
                contactDetailsIntent.setData(contactUri);
                startActivity(contactDetailsIntent);
                call.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
            }
        });

        logs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show Call Logs
                Intent callLogsIntent = new Intent(Intent.ACTION_VIEW, CallLog.Calls.CONTENT_URI);
                startActivity(callLogsIntent);
            }
        });


    }

}