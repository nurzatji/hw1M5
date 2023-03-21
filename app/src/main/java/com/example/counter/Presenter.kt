package com.example.counter

class Presenter {
    val model = CounterModel()
    lateinit var view: CounterView
    fun incrementCount() {
        model.increment()
        view.updateText(model.count.toString())
        if (model.count == 10) {
            view.toast()
        }
        if (model.count == 15) {
            view.color()

        }
    }
        fun decrementCount() {
            model.decrement()
            view.updateText(model.count.toString())
        }

        fun attachView(view: CounterView) {
            this.view = view
        }
    }


