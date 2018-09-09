package com.example.wachirawit.hearthty;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class BMIFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_bmi, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    void initCalcBtn(){
        Button _btn = (Button) getView().findViewById(R.id.bmi_cal_btn);
        _btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView _result = (TextView) getView().findViewById(R.id.bmi_result);
                _result.setText("23");
            }
        });
    }
}
