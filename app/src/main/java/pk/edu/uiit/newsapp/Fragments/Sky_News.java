package pk.edu.uiit.newsapp.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.fragment.app.Fragment;

import pk.edu.uiit.newsapp.R;
import pk.edu.uiit.newsapp.WebViewController;


public class Sky_News extends Fragment {
    WebView webView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root=inflater.inflate(R.layout.fragment_sky__news,container,false);
        webView=root.findViewById(R.id.webViewSky);
        webView.loadUrl("https://news.sky.com/");
        webView.setWebViewClient(new WebViewController());
        return root;
    }
}