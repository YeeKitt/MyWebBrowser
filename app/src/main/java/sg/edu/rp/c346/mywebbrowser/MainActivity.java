package sg.edu.rp.c346.mywebbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnLoadURL;
    WebView wvMyPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoadURL = findViewById(R.id.buttonLoad);
        wvMyPage = findViewById(R.id.webViewMyPage);

        wvMyPage.setWebViewClient(new WebViewClient());

        // Enable JavaScript
        wvMyPage.getSettings().setJavaScriptEnabled(true);

        // Disable file access
        wvMyPage.getSettings().setAllowFileAccess(false);

        // Enable built-in zoom control
        wvMyPage.getSettings().setDisplayZoomControls(true);

        btnLoadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.google.com.sg";

                wvMyPage.loadUrl(url);
            }
        });
    }
}
