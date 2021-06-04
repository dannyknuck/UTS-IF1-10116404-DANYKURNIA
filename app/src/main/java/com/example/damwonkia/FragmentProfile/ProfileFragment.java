package com.example.damwonkia.FragmentProfile;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.damwonkia.R;

public class ProfileFragment extends Fragment {

    View v;

    private Button about;
    private Button facebook;
    private Button gmail;
    private Button whatsapp;
    private Button findme;

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_profile, container, false);

        about = (Button) v.findViewById(R.id.btn_about);
        facebook = (Button) v.findViewById(R.id.facebook_login);
        gmail = (Button) v.findViewById(R.id.gmail_login);
        whatsapp = (Button) v.findViewById(R.id.whatsapp_login);
        findme = (Button) v.findViewById(R.id.findme);

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MyCustomDialog dialog = new MyCustomDialog();
                dialog.show(getFragmentManager(), "this");


            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent facebookIntent = openFacebook(getContext());
                startActivity(facebookIntent);

            }
        });


        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MyEmailDialog emailDialog = new MyEmailDialog();
                emailDialog.show(getFragmentManager(),"this");


            }

        });


        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:085314183656"));
                startActivity(intent);

            }
        });

        findme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Uri uri = Uri.parse("geo:-6.887586,107.616040?q=--6.887586,107.616040(Jl. Tubagus Ismail Bawah No.57, Lebakgede, Kecamatan Coblong, Kota Bandung, Jawa Barat 40132)");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        intent.setPackage("com.google.android.apps.maps");

                        startActivity(intent);
                    }
                }, 100);
            }
        });

        //((MainActivity)getActivity()).getSupportActionBar().setTitle("Profil");

        return v;
    }

    public static Intent openFacebook(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://facewebmodal/f?href=https://www.facebook.com/dany.knuck/"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/dany.knuck/"));
        }
    }
}
