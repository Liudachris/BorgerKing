package com.example.borgerking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;
import com.example.borgerking.R;

public class FoodDetailActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView nameTextView;
    private TextView priceTextView;
    private TextView detailTextView;
    private Button btnCart;
    private ElegantNumberButton countButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_detail);

        Intent intent = getIntent();

        int foodID = intent.getIntExtra("FoodID", 0);

        Food food = FakeDatabase.getFoodById(foodID);

        imageView = findViewById(R.id.foodDetailPhoto);
        nameTextView = findViewById(R.id.foodDetailName);
        priceTextView = findViewById(R.id.foodDetailPrice);
        detailTextView = findViewById(R.id.foodDetailDescription);

        nameTextView.setText(food.getFoodName());
        priceTextView.setText("$" + food.getFoodPrice());
        detailTextView.setText(food.getFoodDescription());
        imageView.setImageResource(food.getImageDrawableId());

        countButton = (ElegantNumberButton) findViewById(R.id.txtAmount);
        btnCart = (Button)findViewById(R.id.cartButton);

        //Add to order list and display "saved" items using a recycler view.
        //onClick of "btnCart" will add the order to a new arraylist, using intents for ordering of cart items
        //Total cost of items should be calculate through the parsing of int values in the "Elegant Number Button"
        //I was unable to do this part, ended up deleting the code because it broke everything else.



//        btnCart.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
                //new Order(getBaseContext()).addToCart(new Order(
                //foodId,
                //currentFood.getName(),
                //numberButton.getNumber(),
                //currentFood.getPrice())
//        }});
//
//        Toast.makeText(FoodDetailActivity.this, "Added to Cart", Toast.LENGTH_SHORT).show();
    }
}
