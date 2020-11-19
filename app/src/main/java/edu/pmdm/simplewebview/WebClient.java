package edu.pmdm.simplewebview;

import android.app.Activity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * WebClient para mostrar los contenidos web enlazados desde la página inicial cargada
 * en la actividad principal
 */
public class WebClient extends WebViewClient {
    private Activity activity = null;

    public WebClient(Activity activity) {
        this.activity = activity;
    }
    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String url) {
        //Cuando shouldOverrideUrlLoading() devuelve false,
        // la URL pasada como parámetro se carga dentro del WebView en vez de en el navegador.
        return false;
    }
}
