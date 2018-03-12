package com.irving.autocare.medicamentos;


import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.irving.autocare.R;
import com.irving.autocare.data.MedicamentosContract.MedicamentoEntry;

public class MedicamentosCursorAdapter extends CursorAdapter {
    public MedicamentosCursorAdapter(Context context, Cursor cursor){
        super(context, cursor, 0);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(context);
        return inflater.inflate(R.layout.list_item_medicamentos, viewGroup, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        TextView nameText = (TextView) view.findViewById(R.id.tv_name);
        String name = cursor.getString(cursor.getColumnIndex(MedicamentoEntry.NOMBRE));
        nameText.setText(name);
    }
}