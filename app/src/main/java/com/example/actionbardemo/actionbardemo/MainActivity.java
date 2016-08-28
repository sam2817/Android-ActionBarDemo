package com.example.actionbardemo.actionbardemo;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // getActionBar().hide(); // this hides the action bar
    }

    // boolean demonstrates if the menu is active or not
    // inflate displays the menu with items created from XML
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        // checking which item is selected in the menu
        switch(item.getItemId()) {
            case R.id.item_one:
                showAlertDialog("Item1", "You selected item 1");
                return true;
            case R.id.item_two:
                showAlertDialog("Item2", "You selected item 2");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void showAlertDialog(String title, String message) {
        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle(title);
        alertDialog.setMessage(message);
        alertDialog.show();
    }
}
