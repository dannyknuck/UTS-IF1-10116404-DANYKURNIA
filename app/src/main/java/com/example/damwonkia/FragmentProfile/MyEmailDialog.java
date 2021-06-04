package com.example.damwonkia.FragmentProfile;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.damwonkia.R;

public class MyEmailDialog extends DialogFragment {

    View v;

    private EditText mEditTextTo;
    private EditText mEditTextSubject;
    private EditText mEditTextMessage;
    private Button button_send;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.send_email, container, false);

        mEditTextTo = (EditText) v.findViewById(R.id.edit_text_address);
        mEditTextSubject = (EditText)v.findViewById(R.id.edit_text_subject);
        mEditTextMessage = (EditText)v.findViewById(R.id.edit_text_message);

        button_send = (Button)v.findViewById(R.id.btn_send_email);

        button_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMail();
            }
        });
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        return v;
    }
    private void sendMail() {
        String recipientList = mEditTextTo.getText().toString();
        String[] recipients = recipientList.split(",");

        String subject = mEditTextSubject.getText().toString();
        String message = mEditTextMessage.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, recipients);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, message);

        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent, " Choose an email client"));

    }
}
