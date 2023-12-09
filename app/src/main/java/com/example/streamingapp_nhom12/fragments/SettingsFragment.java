package com.example.streamingapp_nhom12.fragments;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.streamingapp_nhom12.R;
import com.example.streamingapp_nhom12.activities.MainActivity;
import com.example.streamingapp_nhom12.activities.SearchResultsActivity;
import com.example.streamingapp_nhom12.adapters.RecentSearchAdapter;
import com.example.streamingapp_nhom12.database.DatabaseHelper;
import com.example.streamingapp_nhom12.database.search.RecentSearch;
import com.example.streamingapp_nhom12.database.search.SearchDatabase;

import java.util.Collections;
import java.util.List;

public class SettingsFragment extends Fragment {

    Button btn_logout;
    public SettingsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_settings, container, false);
        return view;

    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btn_logout=view.findViewById(R.id.btn_logout);

        btn_logout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });
    }
}
