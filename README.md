# SimpleWebView

Es un ejemplo de WebView sencillo. Se utiliza un RelativeLayout como contenedor y se implementan las siguientes funciones:

- Carga de contenidos enlazados desde la página principal dentro del WebView

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

- Botón atrás para volver a la página anterior.

@Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && this.webView.canGoBack()) {
            this.webView.goBack();
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }
    

![Captura del diseño de la interfaz](https://raw.githubusercontent.com/pmdmdam2/SimpleWebView/master/app/src/main/assets/webview1.png)
