package com.example.wachirawit.hearthty.weight;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.wachirawit.hearthty.R;

import java.util.ArrayList;

public class WeightFragment extends Fragment {
    ArrayList<Weight> weights = new ArrayList<>();

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        weights.add(new Weight("01 Jan 2018", 63, "UP"));
        weights.add(new Weight("02 Jan 2018", 64, "DOWN"));
        weights.add(new Weight("03 Jan 2018", 63, "UP"));

        ListView _weightList = (ListView) getView().findViewById(R.id.weight_list);
        WeightAdapter _weightAdapter = new WeightAdapter(
                getActivity(),
                R.layout.fragment_weight_item,
                weights
        );
        _weightList.setAdapter(_weightAdapter);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_weight, container, false);
    }
}
