package com.example.alertdialog;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import android.widget.Button; import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
    Button btn = findViewById(R.id.button); btn.setOnClickListener(v -> {
        AlertDialog.Builder b = new AlertDialog.Builder(this); b.setTitle("Alert");
        b.setMessage("Click OK to Quit, or Cancel to continue"); b.setIcon(R.drawable.ic_baseline_crisis_alert_24);
        b.setPositiveButton("OK", new DialogInterface.OnClickListener(
        ) {
            @Override
            public void onClick(DialogInterface dialog, int which) { Toast.makeText(MainActivity.this, "Pressed OK",
                    Toast.LENGTH_LONG).show( );
                finish( );
            }
        });
        b.setNegativeButton("Cancel", new DialogInterface.OnClickListener( ) {
            @Override
            public void onClick(DialogInterface dialog, int which) { Toast.makeText(MainActivity.this, "Pressed Cancel",
                    Toast.LENGTH_LONG).show( );
            }
        });
        b.show( );

    });
}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) { MenuInflater menuInflater=getMenuInflater(); menuInflater.inflate(R.menu.mymenu,menu); return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()!=R.id.share)
            Toast.makeText(this, "Selected Item"+item.getTitle(), Toast.LENGTH_LONG).show( );
        return true;
    }
}

