package com.example.lenovo.project1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast1(View view) {
      Toast toast = Toast.makeText(this, getString(R.string.toast_message1), Toast.LENGTH_LONG);
              toast.show();
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, getString(R.string.toast_message), Toast.LENGTH_LONG);
        toast.show();
    }
}
