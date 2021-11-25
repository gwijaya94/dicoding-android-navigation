package id.gwijaya94.dicodingnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.gwijaya94.dicodingnavigation.databinding.ActivityOptionAppBarBinding

class OptionAppBarActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOptionAppBarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOptionAppBarBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}