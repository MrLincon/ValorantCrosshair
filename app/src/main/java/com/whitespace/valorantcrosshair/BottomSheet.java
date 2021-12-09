package com.whitespace.valorantcrosshair;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomSheet extends BottomSheetDialogFragment {

    private ImageView imageView;
    private TextView color, outlines, centerDot, innerLines, outerLines;

    public BottomSheet() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_sheet, container, false);

        imageView = view.findViewById(R.id.imageView);
        color = view.findViewById(R.id.colorText);
        outlines = view.findViewById(R.id.outlinesText);
        centerDot = view.findViewById(R.id.centerDotText);
        innerLines = view.findViewById(R.id.innerLinesText);
        outerLines = view.findViewById(R.id.outerLinesText);

        MainActivity activity = (MainActivity) getActivity();
        int position = activity.getPosition() + 1;

        if (position == 1) {
            imageView.setImageResource(R.drawable.one);
            color.setText("White");
            outlines.setText("0.7/1");
            centerDot.setText("Off");
            innerLines.setText("1/2/1/2");
            outerLines.setText("0/0/0/0");
        } else if (position == 2) {
            imageView.setImageResource(R.drawable.two);
            color.setText("White");
            outlines.setText("0.7/1");
            centerDot.setText("1/2");
            innerLines.setText("0/0/0/0");
            outerLines.setText("0/0/0/0");
        } else if (position == 3) {
            imageView.setImageResource(R.drawable.three);
            color.setText("Cyan");
            outlines.setText("Off");
            centerDot.setText("Off");
            innerLines.setText("1/4/2/2");
            outerLines.setText("0/0/0/0");
        } else if (position == 4) {
            imageView.setImageResource(R.drawable.four);
            color.setText("Green");
            outlines.setText("1/1");
            centerDot.setText("1/1");
            innerLines.setText("1/2/1/0");
            outerLines.setText("1/0/4/2");
        } else if (position == 5) {
            imageView.setImageResource(R.drawable.five);
            color.setText("White");
            outlines.setText("Off");
            centerDot.setText("Off");
            innerLines.setText("1/1/4/4");
            outerLines.setText("0/0/0/0");
        } else if (position == 6) {
            imageView.setImageResource(R.drawable.six);
            color.setText("White");
            outlines.setText("Off");
            centerDot.setText("Off");
            innerLines.setText("1/1/1/2");
            outerLines.setText("0/0/0/0");
        } else if (position == 7) {
            imageView.setImageResource(R.drawable.seven);
            color.setText("White");
            outlines.setText("Off");
            centerDot.setText("Off");
            innerLines.setText("1/1/3/1");
            outerLines.setText("0/0/0/0");
        } else if (position == 8) {
            imageView.setImageResource(R.drawable.eight);
            color.setText("White");
            outlines.setText("Off");
            centerDot.setText("Off");
            innerLines.setText("1/1/6/3");
            outerLines.setText("0/0/0/0");
        } else if (position == 9) {
            imageView.setImageResource(R.drawable.nine);
            color.setText("White");
            outlines.setText("Off");
            centerDot.setText("Off");
            innerLines.setText("1/1/7/3");
            outerLines.setText("1/1/3/1");
        } else if (position == 10) {
            imageView.setImageResource(R.drawable.ten);
            color.setText("White");
            outlines.setText("Off");
            centerDot.setText("Off");
            innerLines.setText("1/3/2/4");
            outerLines.setText("1/2/4/4");
        } else if (position == 11) {
            imageView.setImageResource(R.drawable.eleven);
            color.setText("White");
            outlines.setText("Off");
            centerDot.setText("Off");
            innerLines.setText("1/2/2/3");
            outerLines.setText("1/2/4/5");
        } else if (position == 12) {
            imageView.setImageResource(R.drawable.twelve);
            color.setText("White");
            outlines.setText("Off");
            centerDot.setText("Off");
            innerLines.setText("1/2/2/3");
            outerLines.setText("1/2/8/3");
        } else if (position == 13) {
            imageView.setImageResource(R.drawable.thirteen);
            color.setText("White");
            outlines.setText("Off");
            centerDot.setText("Off");
            innerLines.setText("1/3/4/1");
            outerLines.setText("1/3/6/0");
        } else if (position == 14) {
            imageView.setImageResource(R.drawable.fourteen);
            color.setText("White");
            outlines.setText("Off");
            centerDot.setText("Off");
            innerLines.setText("1/4/2/2");
            outerLines.setText("1/1/8/1");
        } else if (position == 15) {
            imageView.setImageResource(R.drawable.fifteen);
            color.setText("White");
            outlines.setText("Off");
            centerDot.setText("Off");
            innerLines.setText("1/2/2/2");
            outerLines.setText("1/1/10/1");
        } else if (position == 16) {
            imageView.setImageResource(R.drawable.sixteen);
            color.setText("White");
            outlines.setText("Off");
            centerDot.setText("Off");
            innerLines.setText("1/2/2/2");
            outerLines.setText("1/1/6/1");
        } else if (position == 17) {
            imageView.setImageResource(R.drawable.seventeen);
            color.setText("White");
            outlines.setText("Off");
            centerDot.setText("Off");
            innerLines.setText("1/6/2/0");
            outerLines.setText("1/2/4/2");
        } else if (position == 18) {
            imageView.setImageResource(R.drawable.eighteen);
            color.setText("White");
            outlines.setText("Off");
            centerDot.setText("Off");
            innerLines.setText("1/5/2/3");
            outerLines.setText("1/1/4/4");
        } else if (position == 19) {
            imageView.setImageResource(R.drawable.nineteen);
            color.setText("White");
            outlines.setText("Off");
            centerDot.setText("Off");
            innerLines.setText("1/1/2/4");
            outerLines.setText("0/0/0/0");
        } else if (position == 20) {
            imageView.setImageResource(R.drawable.twenty);
            color.setText("White");
            outlines.setText("Off");
            centerDot.setText("Off");
            innerLines.setText("1/2/3/2");
            outerLines.setText("1/5/1/0");
        } else if (position == 21) {
            imageView.setImageResource(R.drawable.twenty_one);
            color.setText("White");
            outlines.setText("Off");
            centerDot.setText("Off");
            innerLines.setText("1/2/3/2");
            outerLines.setText("0/0/0/0");
        } else if (position == 22) {
            imageView.setImageResource(R.drawable.twenty_two);
            color.setText("White");
            outlines.setText("Off");
            centerDot.setText("Off");
            innerLines.setText("1/3/1/1");
            outerLines.setText("1/1/3/2");
        } else if (position == 23) {
            imageView.setImageResource(R.drawable.twenty_three);
            color.setText("White");
            outlines.setText("Off");
            centerDot.setText("Off");
            innerLines.setText("1/3/1/2");
            outerLines.setText("1/1/7/0");
        } else if (position == 24) {
            imageView.setImageResource(R.drawable.twenty_four);
            color.setText("White");
            outlines.setText("Off");
            centerDot.setText("Off");
            innerLines.setText("1/3/1/3");
            outerLines.setText("1/1/3/3");
        } else if (position == 25) {
            imageView.setImageResource(R.drawable.twenty_five);
            color.setText("White");
            outlines.setText("Off");
            centerDot.setText("Off");
            innerLines.setText("1/4/1/1");
            outerLines.setText("1/2/3/2");
        }

        return view;
    }
}
