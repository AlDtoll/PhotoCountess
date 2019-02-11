package com.example.pusika.photocountess;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class PageFragment extends Fragment {

    private int pageNumber;

    public static PageFragment newInstance(int page) {
        PageFragment fragment = new PageFragment();
        Bundle args = new Bundle();
        args.putInt("num", page);
        fragment.setArguments(args);
        return fragment;
    }

    public PageFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageNumber = getArguments() != null ? getArguments().getInt("num") : 1;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View result = inflater.inflate(R.layout.fragment_page, container, false);
        TextView textView = result.findViewById(R.id.displayText);
        ImageView imageView = result.findViewById(R.id.image);
        String text;
        switch (pageNumber) {
            case 0:
                imageView.setImageResource(R.drawable.slaid1);
                text = "Разместите фотографию в соцсети";
                textView.setText(text);
                textView.setGravity(Gravity.CENTER);
                break;
            case 1:
                imageView.setImageResource(R.drawable.slaid2);
                text = "оставьте под фотографией #ФотоБабушке";
                textView.setText(text);
                textView.setGravity(Gravity.CENTER);
                break;
            case 2:
                imageView.setImageResource(R.drawable.slaid3);
                text = "воспользуйтесь приложением, чтобы доставить фото";
                textView.setText(text);
                textView.setGravity(Gravity.CENTER);
                break;
            default:
                Intent intent = new Intent(getContext(), SecondActivity.class);
                startActivity(intent);
        }
        return result;
    }
}
