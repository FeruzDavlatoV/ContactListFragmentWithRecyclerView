package pdp.unicorn.uz.fragment;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import pdp.unicorn.uz.R;

public class DetailFrag extends Fragment {

    ImageView imageView;

    public DetailFrag() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_detail, container, false);
        initViews(view);
        return view;
    }

    private void initViews(View view) {
        final TextView tvTel = view.findViewById(R.id.tvTel);
        ImageView img_sms = view.findViewById(R.id.imageView2);
        imageView = view.findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + tvTel.getText()));
                startActivity(intent);
            }
        });
        img_sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", String.valueOf(tvTel), null)));
            }
        });

    }


}
