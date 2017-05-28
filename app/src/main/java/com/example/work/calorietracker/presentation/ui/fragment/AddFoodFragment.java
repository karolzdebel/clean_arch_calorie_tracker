package com.example.work.calorietracker.presentation.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.work.calorietracker.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Karol Zdebel on 5/28/2017.
 */

public class AddFoodFragment extends Fragment{

    @BindView(R.id.bt_add)
    Button addButton;
    @BindView(R.id.input_name)
    EditText inputNameField;
    @BindView(R.id.input_carb)
    EditText inputCarbField;
    @BindView(R.id.input_fat)
    EditText inputFatField;
    @BindView(R.id.input_protein)
    EditText inputProteinField;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_food, container);
        ButterKnife.bind(this,view);
        return view;
    }
}
