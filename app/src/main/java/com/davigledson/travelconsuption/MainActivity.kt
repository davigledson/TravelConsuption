package com.davigledson.travelconsuption

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.view.View.OnClickListener
import android.widget.Toast
import com.davigledson.travelconsuption.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),View.OnClickListener {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //View -> elemento do app
    // Binding -> ligacao com o  nosso codigo
        binding.buttonCalculate.setOnClickListener(this)



    }
    private fun calculate(){
        //Toast notification
        val distance = binding.editDistance.text.toString().toFloat()
        val price = binding.editPrice.text.toString().toFloat()
        val autonomty = binding.editAutonomy.text.toString().toFloat()

        val totalValue = (price * distance) / autonomty
        val totalValueStr = "R$ ${"%.2f".format(totalValue)}"
        binding.labelResul.text = totalValueStr
       // Toast.makeText(this,totalValue.toString(),Toast.LENGTH_SHORT).show()

    }

    fun teste(view: View) {}
    override fun onClick(view: View) {

            if(view.id == R.id.buttonCalculate){
                calculate()
            }

    }

}