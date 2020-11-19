package edu.pmdm.simplewebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Actividad principal para el WebView
 */
public class MainActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView = findViewById(R.id.webview);
        this.webView = (WebView) findViewById(R.id.webview);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        WebClient webViewClient = new WebClient(this);
        webView.setWebViewClient(webViewClient);


        webView.loadUrl("http://educacionadistancia.juntadeandalucia.es/centros/cordoba/login/index.php");
    }

    /**
     * Se implementa la navegación hacia la página anterior visitada en el botón atrás
     * @param keyCode Código de la tecla tocada
     * @param event Información del evento
     * @return true Si se incluye lógica en el evento
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && this.webView.canGoBack()) {
            this.webView.goBack();
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }
}