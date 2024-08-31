package com.example.alertdialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class MyDialogSimpleList extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.titulo)
                .setItems(R.array.infos, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String[] infos = getActivity().getResources()
                                .getStringArray(R.array.infos);

                        String info = infos[i];
                        Toast.makeText(getActivity(), getActivity().getResources().getString(R.string.resInfo) + " " + info, Toast.LENGTH_SHORT).show();
                    }
                });
        return builder.create();
    }
}
