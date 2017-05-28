package com.example.work.calorietracker.presentation.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.work.calorietracker.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Karol Zdebel on 5/28/2017.
 */

public class ShowTotalFragment extends Fragment{

    @BindView(R.id.text_total_cal)
    TextView totalCal;
    @BindView(R.id.text_total_carb)
    TextView totalCarb;
    @BindView(R.id.text_total_fat)
    TextView totalFat;
    @BindView(R.id.text_total_protein)
    TextView totalProtein;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_show_total,container,false);
        ButterKnife.bind(this,view);
        return view;
    }
}
