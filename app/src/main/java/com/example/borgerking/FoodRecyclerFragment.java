package com.example.borgerking;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.borgerking.R;

public class FoodRecyclerFragment extends Fragment {
    private RecyclerView recyclerView;
    public FoodRecyclerFragment(){
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.fragment_food_recycler,container, false);

        recyclerView = view.findViewById(R.id.rv_main);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);

        FoodAdapter foodAdapter = new FoodAdapter();

        foodAdapter.setData(FakeDatabase.getAllFoods());
        recyclerView.setAdapter(foodAdapter);

        return view;

    }
}
