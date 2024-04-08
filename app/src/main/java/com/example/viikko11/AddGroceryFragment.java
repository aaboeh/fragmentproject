package com.example.viikko11;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class AddGroceryFragment extends Fragment {
    private EditText editGroceryName;
    private EditText editGroceryNote;
    private CheckBox checkImportant;

    private Button buttonAddGrocery;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_grocery, container, false);

        editGroceryName = view.findViewById(R.id.editGroceryName);
        editGroceryNote = view.findViewById(R.id.editGroceryNote);
        checkImportant = view.findViewById(R.id.checkImportant);
        buttonAddGrocery = view.findViewById(R.id.buttonAddGrocery);



        return view;
    }

    private void addGrocery() {
        String groceryName = editGroceryName.getText().toString();
        String groceryNote = editGroceryNote.getText().toString();
        boolean important = checkImportant.isChecked();

        Grocery grocery = new Grocery(groceryName, groceryNote);
        ListGrocery.getInstance().addGrocery(grocery);
    }
}