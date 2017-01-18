package com.velue.dialog;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ooooo1();
            }
        });
        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ooooo2();
            }
        });
        findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ooooo3();
            }
        });
    }

    private void ooooo3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.dialog);
        final AlertDialog dialog = builder.create();
        Window window = dialog.getWindow();

        WindowManager.LayoutParams lp = window.getAttributes();
        View dialogView = View.inflate(this, R.layout.three_dialog, null);
//        dialog.setView(new EditText(context));
        dialog.show();
        window.setContentView(dialogView);
    }

    private void ooooo2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.dialog);
        final AlertDialog dialog = builder.create();
        Window window = dialog.getWindow();

        WindowManager.LayoutParams lp = window.getAttributes();
        View dialogView = View.inflate(this, R.layout.two_dialog, null);
//        dialog.setView(new EditText(context));
        dialog.show();
        window.setContentView(dialogView);
    }

    private void ooooo1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.dialog);
        final AlertDialog dialog = builder.create();
        Window window = dialog.getWindow();

        WindowManager.LayoutParams lp = window.getAttributes();
        View dialogView = View.inflate(this, R.layout.my_dialog, null);
//        dialog.setView(new EditText(context));
        dialog.show();
        window.setContentView(dialogView);
    }
}
