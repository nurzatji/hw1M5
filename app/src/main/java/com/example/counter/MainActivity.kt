package com.example.counter

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.counter.databinding.ActivityMainBinding
import com.example.counter.util.showToast

class MainActivity : AppCompatActivity(),CounterView {
    private lateinit var binding: ActivityMainBinding
    var count = 0
    var presenter = Presenter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClickers()
        toast()

    }





    private fun initClickers() {
        with(binding) {
            increment.setOnClickListener {
                presenter.incrementCount()
            }

            decrement.setOnClickListener {
                presenter.decrementCount()
            }
        }

    }


    override fun updateText(count: String) {
        binding.result.text = count
    }

    override fun toast() {
      this.showToast("Поздравляю")
    }

    override fun color() {
      binding.result.setTextColor(Color.GREEN)
    }

}