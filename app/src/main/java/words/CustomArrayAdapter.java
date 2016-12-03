package words;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.miwok.R;

import java.util.List;

public class CustomArrayAdapter extends ArrayAdapter<Word> {

    private int colorId;

    public CustomArrayAdapter(Context context, List<Word> objects, int colorId) {
        super(context, 0, objects);
        this.colorId = colorId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        ViewHolder mHolder;

        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            view.setBackgroundColor(ContextCompat.getColor(getContext(), colorId));
            mHolder = new ViewHolder();
            mHolder.miwokWord = (TextView) view.findViewById(R.id.miwok_text_view);
            mHolder.englishWord = (TextView) view.findViewById(R.id.english_text_view);
            mHolder.imageView = (ImageView) view.findViewById(R.id.image_view);
            view.setTag(mHolder);
        } else {
            mHolder = (ViewHolder) view.getTag();
        }
        Word word = getItem(position);

        mHolder.miwokWord.setText(word.getMiwokId());
        mHolder.englishWord.setText(word.getEnglishId());

        if (word.hasImage()) {
            mHolder.imageView.setImageResource(word.getImageId());
            mHolder.imageView.setVisibility(View.VISIBLE);
        } else {
            mHolder.imageView.setVisibility(View.GONE);
        }

        return view;
    }

    private class ViewHolder {
        TextView miwokWord;
        TextView englishWord;
        ImageView imageView;
    }
}
