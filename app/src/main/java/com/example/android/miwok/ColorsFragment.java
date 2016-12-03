package com.example.android.miwok;

import java.util.ArrayList;

import words.Word;

public class ColorsFragment extends AbstractFragment {

    public ColorsFragment() {
        super();
        setBackgroundColor(R.color.colors);
    }

    @Override
    ArrayList<Word> initList() {
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.color_red, R.string.miwok_color_red, R.drawable.color_red, R.raw.color_red));
        words.add(new Word(R.string.color_mustard_yellow, R.string.miwok_color_mustard_yellow, R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));
        words.add(new Word(R.string.color_dusty_yellow, R.string.miwok_color_dusty_yellow, R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        words.add(new Word(R.string.color_green, R.string.miwok_color_green, R.drawable.color_green, R.raw.color_green));
        words.add(new Word(R.string.color_brown, R.string.miwok_color_brown, R.drawable.color_brown, R.raw.color_brown));
        words.add(new Word(R.string.color_gray, R.string.miwok_color_gray, R.drawable.color_gray, R.raw.color_gray));
        words.add(new Word(R.string.color_black, R.string.miwok_color_black, R.drawable.color_black, R.raw.color_black));
        words.add(new Word(R.string.color_white, R.string.miwok_color_white, R.drawable.color_white, R.raw.color_white));
        return words;
    }

}
