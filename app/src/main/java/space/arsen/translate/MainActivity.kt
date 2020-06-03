package space.arsen.translate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun trans(view: View){
        var countString = sum.text.toString()
        var sum : Int = Integer.parseInt(countString)
        sum /= 74
        ans.text = sum.toString() + " долларов без малого"
    }
}