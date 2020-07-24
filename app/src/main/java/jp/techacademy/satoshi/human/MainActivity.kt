package jp.techacademy.satoshi.human

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("サトシ", 28, hobby="エビ")      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        human.say()
        human.think()

        val ebi = Human("エビ",3, hobby = "コケ")

        ebi.say()
        ebi.think()

    }
}