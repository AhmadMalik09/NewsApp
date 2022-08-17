package pk.edu.uiit.newsapp.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.fragment.app.Fragment;

import pk.edu.uiit.newsapp.R;
import pk.edu.uiit.newsapp.WebViewController;

public class AlJazeera extends Fragment {

WebView webView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root=inflater.inflate(R.layout.fragment_gallery,container,false);
        webView=root.findViewById(R.id.webViewAlJazeera);
        webView.loadUrl("https://www.aljazeera.com/");
        webView.setWebViewClient(new WebViewController());
        return root;
    }
}