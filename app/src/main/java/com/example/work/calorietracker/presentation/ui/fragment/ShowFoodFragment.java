package com.example.work.calorietracker.presentation.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.work.calorietracker.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Karol Zdebel on 5/28/2017.
 */

public class ShowFoodFragment extends Fragment{
    @BindView(R.id.food_list_view)
    ListView foodListView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_show_food,container);
        ButterKnife.bind(this,view);
        return view;
    }
}
