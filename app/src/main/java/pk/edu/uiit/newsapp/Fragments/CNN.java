package pk.edu.uiit.newsapp.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import pk.edu.uiit.newsapp.R;
import pk.edu.uiit.newsapp.WebViewController;


public class CNN extends Fragment {
    WebView webView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View root=inflater.inflate(R.layout.fragment_slideshow,container,false);
        webView=root.findViewById(R.id.webViewCNN);
        webView.loadUrl("https://edition.cnn.com/");
        webView.setWebViewClient(new WebViewController());
        return root;
    }

}