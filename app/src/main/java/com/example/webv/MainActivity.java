package com.example.webv;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView wb;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wb= findViewById(R.id.wb1);
        wb.setWebViewClient(new WebViewClient());
        wb.loadUrl("http://www.google.com");
        WebSettings ws = wb.getSettings();
        ws.setJavaScriptEnabled(true);
    }
    @Override
    public void onBackPressed(){
        if(wb.canGoBack()){
            wb.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}