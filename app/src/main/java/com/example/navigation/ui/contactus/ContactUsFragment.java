package com.example.navigation.ui.contactus;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.navigation.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

public class ContactUsFragment extends Fragment {
    private ContactUsViewModel ContactUsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ContactUsViewModel = ViewModelProviders.of(this).get(ContactUsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_contactus, container, false);
        final TextView textView = root.findViewById(R.id.text_contactus);
        ContactUsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
