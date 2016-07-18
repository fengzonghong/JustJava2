package com.example.android.justjava2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    public int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */

   public void plusOrder(View view) {
        quantity=quantity + 1;
       displayQuantity(quantity);



    }
    public void minusOrder(View view) {
        quantity=quantity-1;
        displayQuantity(quantity);

    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
    public void submitOrder(View view) {
        int price=quantity*5;
        String  priceMessage = createrOrderSummary(price);

        displayMessage(priceMessage);
        calculatePrice();

    }
    /**
     * Calculates the price of the order.
     *

     */
    private int calculatePrice() {
        return quantity * 5;
    }
    private String createrOrderSummary(int price){
        String priceMessage = "Name:Zonghong";
        priceMessage = priceMessage + "\nQuantity" + quantity;
        priceMessage = priceMessage + "\nIt's total $ " + price;
        priceMessage = priceMessage + "\nThank you!";
        displayMessage(priceMessage);
        return priceMessage;

    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

       /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}
