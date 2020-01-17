package com.tactical.andy.memorymatchinggame

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {

    var tv_p1: TextView? = null

    var player1: ImageView? = null
    var player2: ImageView? = null
    var player3: ImageView? = null
    var player4: ImageView? = null
    var player5: ImageView? = null
    var player6: ImageView? = null
    var player7: ImageView? = null
    var player8: ImageView? = null
    var player9: ImageView? = null
    var player10: ImageView? = null
    var player11: ImageView? = null
    var player12: ImageView? = null
    var player13: ImageView? = null
    var player14: ImageView? = null
    var player15: ImageView? = null
    var player16: ImageView? = null
    var player17: ImageView? = null
    var player18: ImageView? = null
    var player19: ImageView? = null
    var player20: ImageView? = null
    var player21: ImageView? = null
    var player22: ImageView? = null


    //array for images

    var cardsArray = arrayOf(
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111,
        201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211
    )
    
    //images of liverpool players

    var images101 = 10
    var images102 = 11
    var images103 = 12
    var images104 = 13
    var images105 = 14
    var images106 = 15
    var images107 = 16
    var images108 = 17
    var images109 = 18
    var images110 = 19
    var images111 = 20
    var images201 = 21
    var images202 = 22
    var images203 = 23
    var images204 = 24
    var images205 = 25
    var images206 = 26
    var images207 = 27
    var images208 = 28
    var images209 = 29
    var images210 = 30
    var images211 = 31

    var firstCard = 40
    var secondCard = 41
    var firstClicked = 42
    var secondClicked = 43
    var cardNumber = 1
    var turn = 1
    var fpoints = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        tv_p1 = findViewById<View>(R.id.tv_p1) as TextView
        player1 = findViewById<View>(R.id.player1) as ImageView
        player2 = findViewById<View>(R.id.player2) as ImageView
        player3 = findViewById<View>(R.id.player3) as ImageView
        player4 = findViewById<View>(R.id.player4) as ImageView
        player5 = findViewById<View>(R.id.player5) as ImageView
        player6 = findViewById<View>(R.id.player6) as ImageView
        player7 = findViewById<View>(R.id.player7) as ImageView
        player8 = findViewById<View>(R.id.player8) as ImageView
        player9 = findViewById<View>(R.id.player9) as ImageView
        player10 = findViewById<View>(R.id.player10) as ImageView
        player11 = findViewById<View>(R.id.player11) as ImageView
        player12 = findViewById<View>(R.id.player12) as ImageView
        player13 = findViewById<View>(R.id.player13) as ImageView
        player14 = findViewById<View>(R.id.player14) as ImageView
        player15 = findViewById<View>(R.id.player15) as ImageView
        player16 = findViewById<View>(R.id.player16) as ImageView
        player17 = findViewById<View>(R.id.player17) as ImageView
        player18 = findViewById<View>(R.id.player18) as ImageView
        player19 = findViewById<View>(R.id.player19) as ImageView
        player20 = findViewById<View>(R.id.player20) as ImageView
        player21 = findViewById<View>(R.id.player21) as ImageView
        player22 = findViewById<View>(R.id.player22) as ImageView


        player1!!.tag = ("0")
        player2!!.tag = ("1")
        player3!!.tag = ("2")
        player4!!.tag = ("3")
        player5!!.tag = ("4")
        player6!!.tag = ("5")
        player7!!.tag = ("6")
        player8!!.tag = ("7")
        player9!!.tag = ("8")
        player10!!.tag = ("9")
        player11!!.tag = ("10")
        player12!!.tag = ("11")
        player13!!.tag = ("12")
        player14!!.tag = ("13")
        player15!!.tag = ("14")
        player16!!.tag = ("15")
        player17!!.tag = ("16")
        player18!!.tag = ("17")
        player19!!.tag = ("18")
        player20!!.tag = ("19")
        player21!!.tag = ("20")
        player22!!.tag = ("21")


        frontOfCardResources()





        player1!!.setOnClickListener { v ->
            val theCard: Int = v.tag.toString().toInt()
            doStuff(player1, theCard)
        }
        player2!!.setOnClickListener { v ->
            val theCard: Int = v.tag.toString().toInt()
            doStuff(player2, theCard)
        }
        player3!!.setOnClickListener { v ->
            val theCard: Int = v.tag.toString().toInt()
            doStuff(player3, theCard)
        }
        player4!!.setOnClickListener { v ->
            val theCard: Int = v.tag.toString().toInt()
            doStuff(player4, theCard)
        }
        player5!!.setOnClickListener { v ->
            val theCard: Int = v.tag.toString().toInt()
            doStuff(player5, theCard)
        }
        player6!!.setOnClickListener { v ->
            val theCard: Int = v.tag.toString().toInt()
            doStuff(player6, theCard)
        }
        player7!!.setOnClickListener { v ->
            val theCard: Int = v.tag.toString().toInt()
            doStuff(player7, theCard)
        }
        player8!!.setOnClickListener { v ->
            val theCard: Int = v.tag.toString().toInt()
            doStuff(player8, theCard)
        }
        player9!!.setOnClickListener { v ->
            val theCard: Int = v.tag.toString().toInt()
            doStuff(player9, theCard)
        }
        player10!!.setOnClickListener { v ->
            val theCard: Int = v.tag.toString().toInt()
            doStuff(player10, theCard)
        }
        player11!!.setOnClickListener { v ->
            val theCard: Int = v.tag.toString().toInt()
            doStuff(player11, theCard)
        }
        player12!!.setOnClickListener { v ->
            val theCard: Int = v.tag.toString().toInt()
            doStuff(player12, theCard)
        }
        player13!!.setOnClickListener { v ->
            val theCard: Int = v.tag.toString().toInt()
            doStuff(player13, theCard)
        }
        player14!!.setOnClickListener { v ->
            val theCard: Int = v.tag.toString().toInt()
            doStuff(player14, theCard)
        }
        player15!!.setOnClickListener { v ->
            val theCard: Int = v.tag.toString().toInt()
            doStuff(player15, theCard)
        }
        player16!!.setOnClickListener { v ->
            val theCard: Int = v.tag.toString().toInt()
            doStuff(player16,theCard)
        }
        player17!!.setOnClickListener { v ->
            val theCard: Int = v.tag.toString().toInt()
            doStuff(player17, theCard)
        }
        player18!!.setOnClickListener { v ->
            val theCard: Int = v.tag.toString().toInt()
            doStuff(player18, theCard)
        }
        player19!!.setOnClickListener { v ->
            val theCard: Int = v.tag.toString().toInt()
            doStuff(player19, theCard)
        }
        player20!!.setOnClickListener { v ->
            val theCard: Int = v.tag.toString().toInt()
            doStuff(player20, theCard)
        }
        player21!!.setOnClickListener { v ->
            val theCard: Int = v.tag.toString().toInt()
            doStuff(player21, theCard)
        }
        player22!!.setOnClickListener { v ->

            val theCard: Int = v.tag.toString().toInt()
            doStuff(player22, theCard)
        }
    }

    private fun doStuff(imageView: ImageView?, card: Int) {
        when (cardsArray[card]) {
            101 -> imageView!!.setImageResource(images101)
            102 -> imageView!!.setImageResource(images102)
            103 -> imageView!!.setImageResource(images103)
            104 -> imageView!!.setImageResource(images104)
            105 -> imageView!!.setImageResource(images105)
            106 -> imageView!!.setImageResource(images106)
            107 -> imageView!!.setImageResource(images107)
            108 -> imageView!!.setImageResource(images108)
            109 -> imageView!!.setImageResource(images109)
            110 -> imageView!!.setImageResource(images110)
            111 -> imageView!!.setImageResource(images111)
            201 -> imageView!!.setImageResource(images201)
            202 -> imageView!!.setImageResource(images202)
            203 -> imageView!!.setImageResource(images203)
            204 -> imageView!!.setImageResource(images204)
            205 -> imageView!!.setImageResource(images205)
            206 -> imageView!!.setImageResource(images206)
            207 -> imageView!!.setImageResource(images207)
            208 -> imageView!!.setImageResource(images208)
            209 -> imageView!!.setImageResource(images209)
            210 -> imageView!!.setImageResource(images210)
            211 -> imageView!!.setImageResource(images211)
        }
        //check which image is selected
        if (cardNumber == 1) {
            firstCard = cardsArray[card]
            if (firstCard > 200) {
                firstCard = firstCard - 100
            }
            cardNumber++
            firstClicked = card
            imageView!!.isEnabled = false
        } else if (cardNumber == 2) {
            secondCard = cardsArray[card]
            if (secondCard > 200) {
                secondCard = secondCard - 100
            }
            cardNumber = 1
            secondClicked = card
            imageView!!.isEnabled = false
            val handler = Handler()
            handler.postDelayed({ calculate() }, 1000)
        }
    }

    fun calculate() {
        if (firstCard == secondCard) {
            if (firstClicked == 0) {
                player1!!.visibility = View.INVISIBLE
            } else if (firstClicked == 1) {
                player2!!.visibility = View.INVISIBLE
            } else if (firstClicked == 2) {
                player3!!.visibility = View.INVISIBLE
            } else if (firstClicked == 3) {
                player4!!.visibility = View.INVISIBLE
            } else if (firstClicked == 4) {
                player5!!.visibility = View.INVISIBLE
            } else if (firstClicked == 5) {
                player6!!.visibility = View.INVISIBLE
            } else if (firstClicked == 6) {
                player7!!.visibility = View.INVISIBLE
            } else if (firstClicked == 7) {
                player8!!.visibility = View.INVISIBLE
            } else if (firstClicked == 8) {
                player9!!.visibility = View.INVISIBLE
            } else if (firstClicked == 9) {
                player10!!.visibility = View.INVISIBLE
            } else if (firstClicked == 10) {
                player11!!.visibility = View.INVISIBLE
            } else if (firstClicked == 11) {
                player12!!.visibility = View.INVISIBLE
            } else if (firstClicked == 12) {
                player13!!.visibility = View.INVISIBLE
            } else if (firstClicked == 13) {
                player14!!.visibility = View.INVISIBLE
            } else if (firstClicked == 14) {
                player15!!.visibility = View.INVISIBLE
            } else if (firstClicked == 15) {
                player16!!.visibility = View.INVISIBLE
            } else if (firstClicked == 16) {
                player17!!.visibility = View.INVISIBLE
            } else if (firstClicked == 17) {
                player18!!.visibility = View.INVISIBLE
            } else if (firstClicked == 18) {
                player19!!.visibility = View.INVISIBLE
            } else if (firstClicked == 19) {
                player20!!.visibility = View.INVISIBLE
            } else if (firstClicked == 20) {
                player21!!.visibility = View.INVISIBLE
            } else if (firstClicked == 21) {
                player22!!.visibility = View.INVISIBLE
            }
            if (secondClicked == 0) {
                player1!!.visibility = View.INVISIBLE
            } else if (secondClicked == 1) {
                player2!!.visibility = View.INVISIBLE
            } else if (secondClicked == 2) {
                player3!!.visibility = View.INVISIBLE
            } else if (secondClicked == 3) {
                player4!!.visibility = View.INVISIBLE
            } else if (secondClicked == 4) {
                player5!!.visibility = View.INVISIBLE
            } else if (secondClicked == 5) {
                player6!!.visibility = View.INVISIBLE
            } else if (secondClicked == 6) {
                player7!!.visibility = View.INVISIBLE
            } else if (secondClicked == 7) {
                player8!!.visibility = View.INVISIBLE
            } else if (secondClicked == 8) {
                player9!!.visibility = View.INVISIBLE
            } else if (secondClicked == 9) {
                player10!!.visibility = View.INVISIBLE
            } else if (secondClicked == 10) {
                player11!!.visibility = View.INVISIBLE
            } else if (secondClicked == 11) {
                player12!!.visibility = View.INVISIBLE
            } else if (secondClicked == 12) {
                player13!!.visibility = View.INVISIBLE
            } else if (secondClicked == 13) {
                player14!!.visibility = View.INVISIBLE
            } else if (secondClicked == 14) {
                player15!!.visibility = View.INVISIBLE
            } else if (secondClicked == 15) {
                player16!!.visibility = View.INVISIBLE
            } else if (secondClicked == 16) {
                player17!!.visibility = View.INVISIBLE
            } else if (secondClicked == 17) {
                player18!!.visibility = View.INVISIBLE
            } else if (secondClicked == 18) {
                player19!!.visibility = View.INVISIBLE
            } else if (secondClicked == 19) {
                player20!!.visibility = View.INVISIBLE
            } else if (secondClicked == 20) {
                player21!!.visibility = View.INVISIBLE
            } else if (secondClicked == 21) {
                player22!!.visibility = View.INVISIBLE
            }
            if (turn == 1) {
                fpoints++
                tv_p1!!.text = "Your Score: $fpoints"
            }
        } else {
            player1!!.setImageResource(R.drawable.liverpool)
            player2!!.setImageResource(R.drawable.liverpool)
            player3!!.setImageResource(R.drawable.liverpool)
            player4!!.setImageResource(R.drawable.liverpool)
            player5!!.setImageResource(R.drawable.liverpool)
            player6!!.setImageResource(R.drawable.liverpool)
            player7!!.setImageResource(R.drawable.liverpool)
            player8!!.setImageResource(R.drawable.liverpool)
            player9!!.setImageResource(R.drawable.liverpool)
            player10!!.setImageResource(R.drawable.liverpool)
            player11!!.setImageResource(R.drawable.liverpool)
            player12!!.setImageResource(R.drawable.liverpool)
            player13!!.setImageResource(R.drawable.liverpool)
            player14!!.setImageResource(R.drawable.liverpool)
            player15!!.setImageResource(R.drawable.liverpool)
            player16!!.setImageResource(R.drawable.liverpool)
            player17!!.setImageResource(R.drawable.liverpool)
            player18!!.setImageResource(R.drawable.liverpool)
            player19!!.setImageResource(R.drawable.liverpool)
            player20!!.setImageResource(R.drawable.liverpool)
            player21!!.setImageResource(R.drawable.liverpool)
            player22!!.setImageResource(R.drawable.liverpool)
        }
        player1!!.isEnabled = true
        player2!!.isEnabled = true
        player3!!.isEnabled = true
        player4!!.isEnabled = true
        player5!!.isEnabled = true
        player6!!.isEnabled = true
        player7!!.isEnabled = true
        player8!!.isEnabled = true
        player9!!.isEnabled = true
        player10!!.isEnabled = true
        player11!!.isEnabled = true
        player12!!.isEnabled = true
        player13!!.isEnabled = true
        player14!!.isEnabled = true
        player15!!.isEnabled = true
        player16!!.isEnabled = true
        player17!!.isEnabled = true
        player18!!.isEnabled = true
        player19!!.isEnabled = true
        player20!!.isEnabled = true
        player21!!.isEnabled = true
        player22!!.isEnabled = true
        gameOver()
    }

    private fun gameOver() {
        if (player1!!.visibility == View.INVISIBLE &&
            player2!!.visibility == View.INVISIBLE &&
            player3!!.visibility == View.INVISIBLE &&
            player4!!.visibility == View.INVISIBLE &&
            player5!!.visibility == View.INVISIBLE &&
            player6!!.visibility == View.INVISIBLE &&
            player7!!.visibility == View.INVISIBLE &&
            player8!!.visibility == View.INVISIBLE &&
            player9!!.visibility == View.INVISIBLE &&
            player10!!.visibility == View.INVISIBLE &&
            player11!!.visibility == View.INVISIBLE &&
            player12!!.visibility == View.INVISIBLE &&
            player13!!.visibility == View.INVISIBLE &&
            player14!!.visibility == View.INVISIBLE &&
            player15!!.visibility == View.INVISIBLE &&
            player16!!.visibility == View.INVISIBLE &&
            player17!!.visibility == View.INVISIBLE &&
            player18!!.visibility == View.INVISIBLE &&
            player19!!.visibility == View.INVISIBLE &&
            player20!!.visibility == View.INVISIBLE &&
            player21!!.visibility == View.INVISIBLE &&
            player22!!.visibility == View.INVISIBLE
        ) {
            val alertDialogBuilder =
                AlertDialog.Builder(this@MainActivity)
            alertDialogBuilder.setMessage("\nYou Won, Your Score: $fpoints")
                .setCancelable(false)
                .setPositiveButton(
                    "Play Again"
                ) { dialog, which ->
                    val intent =
                        Intent(applicationContext, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                }.setNegativeButton(
                    "Exit"
                ) { dialog, which -> finish() }
            val alertDialog = alertDialogBuilder.create()
            alertDialog.show()
        }
    }

    private fun frontOfCardResources() {
        images101 = R.drawable.firmino
        images102 = R.drawable.salah
        images103 = R.drawable.mane
        images104 = R.drawable.wijnaldum
        images105 = R.drawable.henderson
        images106 = R.drawable.fabinho
        images107 = R.drawable.robertson
        images108 = R.drawable.van_dijk
        images109 = R.drawable.matip
        images110 = R.drawable.alexander_arnold
        images111 = R.drawable.becker
        images201 = R.drawable.firmino1
        images202 = R.drawable.salah1
        images203 = R.drawable.mane1
        images204 = R.drawable.wijnaldum1
        images205 = R.drawable.henderson1
        images206 = R.drawable.fabinho1
        images207 = R.drawable.robertson1
        images208 = R.drawable.van_dijk1
        images209 = R.drawable.matip1
        images210 = R.drawable.alexander_arnold1
        images211 = R.drawable.becker1
    }
}