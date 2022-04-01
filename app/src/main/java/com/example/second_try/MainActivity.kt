package com.example.second_try

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.second_try.databinding.ActivityMainBinding
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Variables
        var pricePerTicket = 0
        var movieName = ""
        var totalPrice = 0
        val grow: Animation = AnimationUtils.loadAnimation(this, R.anim.grow)

        //Movie Buttons
        binding.aladdinButton.setOnClickListener {
            binding.whichMovie.text = getString(R.string.aladdin)
            movieName = getString(R.string.aladdin)
            binding.summary.text = getString(R.string.summary_aladdin)
            pricePerTicket = 10
            binding.moviePrice.text = pricePerTicket.toString()

            binding.aladdinButton.animate().apply {
                duration = 1000
                rotationYBy(360f)
            }.withEndAction {
                binding.whichMovie.startAnimation(grow)
            }
        }

        binding.avengersButton.setOnClickListener {
            binding.whichMovie.text = getString(R.string.avengers)
            movieName = getString(R.string.avengers)
            binding.summary.text = getString(R.string.summary_avengers)
            pricePerTicket = 18
            binding.moviePrice.text = pricePerTicket.toString()

            binding.avengersButton.animate().apply {
                duration = 1000
                rotationYBy(360f)
            }.withEndAction {
                binding.whichMovie.startAnimation(grow)
            }

        }
        binding.batmanButton.setOnClickListener {
            binding.whichMovie.text = getString(R.string.batman)
            movieName = getString(R.string.batman)
            binding.summary.text = getString(R.string.summary_batman)
            pricePerTicket = 16
            binding.moviePrice.text = pricePerTicket.toString()

            binding.batmanButton.animate().apply {
                duration = 1000
                rotationYBy(360f)
            }.withEndAction {
                binding.whichMovie.animate().apply {
                    binding.whichMovie.startAnimation(grow)
                }
            }
        }
        binding.frozenButton.setOnClickListener {
            binding.whichMovie.text = getString(R.string.frozen)
            movieName = getString(R.string.frozen)
            binding.summary.text = getString(R.string.summary_frozen)
            pricePerTicket = 10
            binding.moviePrice.text = pricePerTicket.toString()

            binding.frozenButton.animate().apply {
                duration = 1000
                rotationYBy(360f)
            }.withEndAction {
                binding.whichMovie.animate().apply {
                    binding.whichMovie.startAnimation(grow)
                }
            }
        }
        binding.hpButton.setOnClickListener {
            binding.whichMovie.text = getString(R.string.harry_potter)
            movieName = getString(R.string.harry_potter)
            binding.summary.text = getString(R.string.summary_hp)
            pricePerTicket = 13
            binding.moviePrice.text = pricePerTicket.toString()

            binding.hpButton.animate().apply {
                duration = 1000
                rotationYBy(360f)
            }.withEndAction {
                binding.whichMovie.animate().apply {
                    binding.whichMovie.startAnimation(grow)
                }
            }
        }
        binding.lionButton.setOnClickListener {
            binding.whichMovie.text= getString(R.string.lion_king)
            movieName = getString(R.string.lion_king)
            binding.summary.text = getString(R.string.summary_lion_king)
            pricePerTicket = 9
            binding.moviePrice.text = pricePerTicket.toString()

            binding.lionButton.animate().apply {
                duration = 1000
                rotationYBy(360f)
            }.withEndAction {
                binding.whichMovie.animate().apply {
                    binding.whichMovie.startAnimation(grow)
                }
            }
        }
        binding.lotrButton.setOnClickListener {
            binding.whichMovie.text = getString(R.string.lotr)
            movieName = getString(R.string.lotr)
            binding.summary.text = getString(R.string.summary_lotr)
            pricePerTicket = 16
            binding.moviePrice.text = pricePerTicket.toString()

            binding.lotrButton.animate().apply {
                duration = 1000
                rotationYBy(360f)
            }.withEndAction {
                binding.whichMovie.animate().apply {
                    binding.whichMovie.startAnimation(grow)
                }
            }
        }
        binding.moanaButton.setOnClickListener {
            binding.whichMovie.text= getString(R.string.moana)
            movieName = getString(R.string.moana)
            binding.summary.text = getString(R.string.summary_moana)
            pricePerTicket = 9
            binding.moviePrice.text = pricePerTicket.toString()

            binding.moanaButton.animate().apply {
                duration = 1000
                rotationYBy(360f)
            }.withEndAction {
                binding.whichMovie.animate().apply {
                    binding.whichMovie.startAnimation(grow)
                }
            }
        }
        binding.mulanButton.setOnClickListener {
            binding.whichMovie.text = getString(R.string.mulan)
            movieName = getString(R.string.mulan)
            binding.summary.text = getString(R.string.summary_mulan)
            pricePerTicket = 7
            binding.moviePrice.text = pricePerTicket.toString()

            binding.mulanButton.animate().apply {
                duration = 1000
                rotationYBy(360f)
            }.withEndAction {
                binding.whichMovie.animate().apply {
                    binding.whichMovie.startAnimation(grow)
                }
            }
        }
        binding.notebookButton.setOnClickListener {
            binding.whichMovie.text = getString(R.string.notebook)
            movieName = getString(R.string.notebook)
            binding.summary.text = getString(R.string.summary_notebook)
            pricePerTicket = 12
            binding.moviePrice.text = pricePerTicket.toString()

            binding.notebookButton.animate().apply {
                duration = 1000
                rotationYBy(360f)
            }.withEndAction {
                binding.whichMovie.animate().apply {
                    binding.whichMovie.startAnimation(grow)
                }
            }
        }
        binding.piratesButton.setOnClickListener {
            binding.whichMovie.text = getString(R.string.pirates)
            movieName = getString(R.string.pirates)
            binding.summary.text = getString(R.string.summary_pirates)
            pricePerTicket = 14
            binding.moviePrice.text = pricePerTicket.toString()

            binding.piratesButton.animate().apply {
                duration = 1000
                rotationYBy(360f)
            }.withEndAction {
                binding.whichMovie.animate().apply {
                    binding.whichMovie.startAnimation(grow)
                }
            }
        }
        binding.toysButton.setOnClickListener {
            binding.whichMovie.text = getString(R.string.toy_story)
            movieName = getString(R.string.toy_story)
            binding.summary.text = getString(R.string.summary_toy_story)
            pricePerTicket = 8
            binding.moviePrice.text = pricePerTicket.toString()

            binding.toysButton.animate().apply {
                duration = 1000
                rotationYBy(360f)
            }.withEndAction {
                binding.whichMovie.animate().apply {
                    binding.whichMovie.startAnimation(grow)
                }
            }
        }

        //Everything else
        var dateChosen = ""
        var adultChild = ""
        var amount = ""
        var numOfTickets = 0
        var clicked = 0

        binding.calendarView.setOnDateChangeListener { _, year, month, dayOfMonth ->
            val day = dayOfMonth.toString()
            val year = year.toString()
            val month = (month + 1).toString()
            binding.dateClicked.text = "$day/$month/$year"
            dateChosen = "$day/$month/$year"
        }

        binding.ageResult.setOnCheckedChangeListener { _, _ ->
            adultChild = if (binding.adult.isChecked) {
                "Adult"
            } else {
                "Minor"
            }
        }

        binding.numTickets.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {
                numOfTickets = s.toString().toInt()
                amount = numOfTickets.toString()
            }
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
        })

        binding.buy.setOnClickListener {
            if (movieName == "" || amount == "" || adultChild == "" || dateChosen == "") {
                val builder = StringBuilder("Missing info:\n")
                if (movieName.isEmpty()) {
                    builder.append("Movie, ")
                }
                if (amount.isEmpty()) {
                    builder.append("# of tickets, ")
                }
                if (adultChild.isEmpty()) {
                    builder.append("Minor, ")
                }
                if (dateChosen.isEmpty()) {
                    builder.append("Date")
                }
                Toast.makeText(this, builder.toString(), Toast.LENGTH_LONG).show()

            } else {
                //calculate total
                val cost = numOfTickets * pricePerTicket
                totalPrice = if (adultChild == "Minor") {
                    cost / 2
                } else {
                    cost
                }
                clicked = 1
                binding.movieTitle.text = movieName
                binding.number.text = getString(R.string.num_tickets) + amount
                binding.age.text = adultChild
                binding.date.text = getString(R.string.date) + dateChosen
                binding.price.text = getString(R.string.total) + totalPrice
                binding.ticket.setImageResource(R.drawable.emptytix)
            }
        }

        binding.confirm.setOnClickListener {
            if (clicked == 0) {
            } else {
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Confirmation")
                builder.setMessage("Are you sure you want to confirm purchase?")
                builder.setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, _ ->
                    dialog.cancel()

                    val build = AlertDialog.Builder(this)
                    build.setTitle("Confirmed")
                    build.setMessage("Enjoy $movieName")
                    build.setIcon(R.drawable.ic_baseline_check_circle_24)
                    build.setPositiveButton("OK", DialogInterface.OnClickListener { dialog, _ ->
                        dialog.cancel()
                    })
                    val alert = build.create()
                    alert.setTitle("Confirmed")
                    alert.show()
                })
                builder.setNegativeButton("No", DialogInterface.OnClickListener { dialog, id ->
                    dialog.cancel()
                })
                val alert = builder.create()
                alert.setTitle("Confirmation")
                alert.show()
            }
        }
    }
}
