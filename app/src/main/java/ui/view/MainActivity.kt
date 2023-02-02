package ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.examplemvvm.databinding.ActivityMainBinding
import ui.viewModel.QuoteViewModel

class MainActivity : AppCompatActivity() {


    private var binding: ActivityMainBinding? = null

    private val quoteViewModel : QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        quoteViewModel.onCreate()

        quoteViewModel.quoteModel.observe(this, Observer {
            binding?.tvAuthor?.text = it.author
            binding?.tvQuote?.text = it.quote
        })


        binding?.viewContainer?.setOnClickListener {
            quoteViewModel.randomQuote()
        }
    }
}