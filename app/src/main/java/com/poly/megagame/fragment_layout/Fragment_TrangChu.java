package com.poly.megagame.fragment_layout;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.poly.megagame.R;
import com.poly.megagame.view.IntroduceALTPActivity;
import com.poly.megagame.view.PuzzleGameActivity;

public class Fragment_TrangChu extends Fragment implements View.OnClickListener{

    private View container;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle savedInstanceState) {
        container = inflater.inflate(R.layout.fragment_trangchu, viewGroup, false);

        addEvents();

        return container;
    }

    private void addEvents() {
        container.findViewById(R.id.containerAiLaTrieuPhu).setOnClickListener(this);
        container.findViewById(R.id.containerXepHinh).setOnClickListener(this);
        container.findViewById(R.id.containerDoVuiHaiNao).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.containerAiLaTrieuPhu:
                startActivity(new Intent(getActivity(), IntroduceALTPActivity.class));
                break;
            case R.id.containerXepHinh:
                startActivity(new Intent(getActivity(), PuzzleGameActivity.class));
                break;
            case R.id.containerDoVuiHaiNao:

                break;
        }
    }
}
