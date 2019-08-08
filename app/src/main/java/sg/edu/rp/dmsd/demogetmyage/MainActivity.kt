package sg.edu.rp.dmsd.demogetmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGetAge.setOnClickListener {
            val userDOB = etDOB.text.toString()
            if(userDOB.isNotEmpty()){
                val year = Calendar.getInstance().get(Calendar.YEAR);
                val age = year - userDOB.toInt()
//                if(age < 18){
//                    tvShowCategory.text = "Underage"
//                }else if(age in 18..66){
//                    tvShowCategory.text = "Young people "
//                }else if(age in 66..79){
//                    tvShowCategory.text = "Middle-aged"
//                }else if(age in 80..99){
//                    tvShowCategory.text = "Elderly"
//                }else{
//                    tvShowCategory.text = "Long-lived elderly"
//                }

                when(age){
                    in 0..17 -> tvShowCategory.text = "Underage"
                    in 18..65 -> tvShowCategory.text = "Young people"
                    in 66..79 -> tvShowCategory.text = "Middle-aged"
                    in 80..99 -> tvShowCategory.text = "Elderly"
                    else ->{
                        tvShowCategory.text = "Long-lived elderly"
                    }
                }

                tvShowAge.text = " Your age is $age"
            }else{
                Toast.makeText(this,"Please enter your birth year",Toast.LENGTH_SHORT).show();
            }

        }
    }
}
