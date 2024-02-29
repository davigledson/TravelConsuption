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
        if(isValid()){
            //Toast notification
            val distance = binding.editDistance.text.toString().toFloat()
            val price = binding.editPrice.text.toString().toFloat()
            val autonomy = binding.editAutonomy.text.toString().toFloat()
            if(autonomy ==0f){
                Toast.makeText(this,R.string.validation_division_by_0,Toast.LENGTH_SHORT).show()
                binding.labelResul.text = "R$ 0"
            } else{
                val totalValue = (price * distance) / autonomy
                val totalValueStr = "R$ ${"%.2f".format(totalValue)}"
                binding.labelResul.text = totalValueStr
            }


        } else {
             Toast.makeText(this,R.string.validation_all_filters,Toast.LENGTH_SHORT).show()
        }


    }

    fun teste(view: View) {}
    private fun isValid():Boolean{
        return (
                binding.editDistance.text.toString() != ""
                        && binding.editPrice.text.toString() != ""
                        && binding.editAutonomy.text.toString() != ""
                        //&& binding.editAutonomy.text.toString().toFloat() != 0f
                )
    }

    override fun onClick(view: View) {

            if(view.id == R.id.buttonCalculate){
                calculate()
            }

    }

}