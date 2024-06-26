package otus.gpb.homework.fragments

import android.os.Bundle
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    fun onClickOpenFrA(view: View) {

        val transaction = supportFragmentManager.beginTransaction()
        transaction.setReorderingAllowed(true)
        transaction.replace(R.id.A_container, FragmentA())
        transaction.addToBackStack(null)
        transaction.commit()

        findViewById<View>(R.id.textView1).visibility = View.GONE
        findViewById<View>(R.id.ToFragmentAbtn).visibility = View.GONE

    }


}
