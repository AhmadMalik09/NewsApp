package pk.edu.uiit.newsapp.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.fragment.app.Fragment;

import pk.edu.uiit.newsapp.R;
import pk.edu.uiit.newsapp.WebViewController;

public class Fox_News extends Fragment {
    WebView webView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root=inflater.inflate(R.layout.fragment_fox__news,container,false);
        webView=root.findViewById(R.id.webViewFOX);
        webView.loadUrl("https://www.foxnews.com/");
        webView.setWebViewClient(new WebViewController());
        return root;
    }
}