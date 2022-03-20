package com.example.second_try

import android.content.DialogInterface
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import java.lang.StringBuilder


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //movie buttons
        val alBtn = findViewById<ImageButton>(R.id.aladdinButton)
        val avengersBtn = findViewById<ImageButton>(R.id.avengersButton)
        val batBtn = findViewById<ImageButton>(R.id.batmanButton)
        val frozenBtn = findViewById<ImageButton>(R.id.frozenButton)
        val hpBtn = findViewById<ImageButton>(R.id.hpButton)
        val lkBtn = findViewById<ImageButton>(R.id.lionButton)
        val lotrBtn = findViewById<ImageButton>(R.id.lotrButton)
        val moanaBtn = findViewById<ImageButton>(R.id.moanaButton)
        val mulanBtn = findViewById<ImageButton>(R.id.mulanButton)
        val nbBtn = findViewById<ImageButton>(R.id.notebookButton)
        val piratesBtn = findViewById<ImageButton>(R.id.piratesButton)
        val tsBtn = findViewById<ImageButton>(R.id.toysButton)

        val whichMovie = findViewById<TextView>(R.id.whichMovie)
        val moviePrice = findViewById<TextView>(R.id.moviePrice)
        val movieSummary = findViewById<TextView>(R.id.summary)

        var pricePerTicket = 0
        var movieName = ""
        var totalPrice = 0

        val grow: Animation = AnimationUtils.loadAnimation(this, R.anim.grow)

        alBtn.setOnClickListener {
            whichMovie.text = "Aladdin"
            movieName = "Aladdin"
            movieSummary.text =
                "The film follows the titular Aladdin, an Arabian street urchin, who finds a magic lamp containing a genie. He disguises himself as a wealthy prince and tries to impress the Sultan and his daughter, Princess Jasmine."
            pricePerTicket = 10
            moviePrice.text = pricePerTicket.toString()

            alBtn.animate().apply {
                duration = 1000
                rotationYBy(360f)
            }.withEndAction {
                whichMovie.startAnimation(grow)
            }
        }

        avengersBtn.setOnClickListener {
            whichMovie.text = "Avangers"
            movieName = "Avengers"
            movieSummary.text =
                "Captain America, the Stark Enterprises created super soldier. Thor, the god of thunder, protector of Earth and his home planet of Asgard, and Loki's brother. Master assassins Hawkeye and Natasha Romanoff. Together they will become a team to take on an attack that will call them to become the greatest of all time."
            pricePerTicket = 18
            moviePrice.text = pricePerTicket.toString()

            avengersBtn.animate().apply {
                duration = 1000
                rotationYBy(360f)
            }.withEndAction {
                whichMovie.startAnimation(grow)
            }

        }
        batBtn.setOnClickListener {
            whichMovie.text = "Batman"
            movieName = "Batman: Dark Knight"
            movieSummary.text =
                "A gang of criminals rob a Gotham City mob bank; the Joker manipulates them into murdering each other for a higher share until only he remains and escapes with the money. Batman, District Attorney Harvey Dent and Lieutenant Jim Gordon form an alliance to rid Gotham of organized crime."
            pricePerTicket = 16
            moviePrice.text = pricePerTicket.toString()

            batBtn.animate().apply {
                duration = 1000
                rotationYBy(360f)
            }.withEndAction {
                whichMovie.animate().apply {
                    whichMovie.startAnimation(grow)
                }
            }
        }
        frozenBtn.setOnClickListener {
            whichMovie.text = "Frozen"
            movieName = "Frozen"
            movieSummary.text =
                "When the newly crowned Queen Elsa accidentally uses her power to turn things into ice to curse her home in infinite winter, her sister Anna teams up with a mountain man, his playful reindeer, and a snowman to change the weather condition."
            pricePerTicket = 10
            moviePrice.text = pricePerTicket.toString()

            frozenBtn.animate().apply {
                duration = 1000
                rotationYBy(360f)
            }.withEndAction {
                whichMovie.animate().apply {
                    whichMovie.startAnimation(grow)
                }
            }
        }
        hpBtn.setOnClickListener {
            whichMovie.text = "Harry Potter"
            movieName = "Harry Potter and the Sorcerer's stone"
            movieSummary.text =
                "On his 11th birthday, Harry receives a letter inviting him to study magic at the Hogwarts School of Witchcraft and Wizardry. Harry discovers that not only is he a wizard, but he is a famous one. He meets two best friends, Ron Weasley and Hermione Granger, and makes his first enemy, Draco Malfoy."
            pricePerTicket = 13
            moviePrice.text = pricePerTicket.toString()

            hpBtn.animate().apply {
                duration = 1000
                rotationYBy(360f)
            }.withEndAction {
                whichMovie.animate().apply {
                    whichMovie.startAnimation(grow)
                }
            }
        }
        lkBtn.setOnClickListener {
            whichMovie.text="The Lion King"
            movieName = "The Lion King"
            movieSummary.text =
                "The Lion King tells the story of Simba (Swahili for lion), a young lion who is to succeed his father, Mufasa, as King of the Pride Lands; however, after Simba's paternal uncle Scar murders Mufasa to seize the throne, Simba is manipulated into thinking he was responsible and flees into exile."
            pricePerTicket = 9
            moviePrice.text = pricePerTicket.toString()

            lkBtn.animate().apply {
                duration = 1000
                rotationYBy(360f)
            }.withEndAction {
                whichMovie.animate().apply {
                    whichMovie.startAnimation(grow)
                }
            }
        }
        lotrBtn.setOnClickListener {
            whichMovie.text = "The Lord of the Rings"
            movieName = "The Lord of the Rings: \nFellowship of the Ring"
            movieSummary.text =
                "A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron. An ancient Ring thought lost for centuries has been found, and through a strange twist of fate has been given to a small Hobbit named Frodo."
            pricePerTicket = 16
            moviePrice.text = pricePerTicket.toString()

            lotrBtn.animate().apply {
                duration = 1000
                rotationYBy(360f)
            }.withEndAction {
                whichMovie.animate().apply {
                    whichMovie.startAnimation(grow)
                }
            }
        }
        moanaBtn.setOnClickListener {
            whichMovie.text= "Moana"
            movieName = "Moana"
            movieSummary.text =
                "An adventurous teenager sails out on a daring mission to save her people. During her journey, Moana meets the once-mighty demigod Maui, who guides her in her quest to become a master wayfinder. Together, they sail across the open ocean on an action-packed voyage, encountering enormous monsters and impossible odds."
            pricePerTicket = 9
            moviePrice.text = pricePerTicket.toString()

            moanaBtn.animate().apply {
                duration = 1000
                rotationYBy(360f)
            }.withEndAction {
                whichMovie.animate().apply {
                    whichMovie.startAnimation(grow)
                }
            }
        }
        mulanBtn.setOnClickListener {
            whichMovie.text = "Mulan"
            movieName = "Mulan"
            movieSummary.text =
                "Mulan is a girl, the only child of her honored family. When the Huns invade China, one man from every family is called to arms. Mulan's father, who has an old wound and cannot walk properly, decides to fight for his country and the honor of his family though it is clear that he will not survive an enemy encounter."
            pricePerTicket = 7
            moviePrice.text = pricePerTicket.toString()

            mulanBtn.animate().apply {
                duration = 1000
                rotationYBy(360f)
            }.withEndAction {
                whichMovie.animate().apply {
                    whichMovie.startAnimation(grow)
                }
            }
        }
        nbBtn.setOnClickListener {
            whichMovie.text = "The Notebook"
            movieName = "The Notebook"
            movieSummary.text =
                "The Notebook is an achingly tender story about the enduring power of love, a story of miracles that will stay with you forever. Set amid the austere beauty of coastal North Carolina in 1946, The Notebook begins with the story of Noah Calhoun, a rural Southerner returned home from World War II."
            pricePerTicket = 12
            moviePrice.text = pricePerTicket.toString()

            nbBtn.animate().apply {
                duration = 1000
                rotationYBy(360f)
            }.withEndAction {
                whichMovie.animate().apply {
                    whichMovie.startAnimation(grow)
                }
            }
        }
        piratesBtn.setOnClickListener {
            whichMovie.text = "Pirates of the Caribbean"
            movieName = "Pirates of the Caribbean: \nDead Man's Chest"
            movieSummary.text =
                "William Turner, a resourceful young blacksmith, teams up with the eccentric pirate \"Captain\" Jack Sparrow to save his love, the Governor's daughter, Elizabeth Swann, who has been mistakenly captured by the clever and treacherous Barbossa, a former ally of Jack, to make a blood sacrifice so as to end the curse that has been casted upon him and his crew. Will and Jack steal a ship from the Royal Navy and arrive at Tortuga, a pirate port. There Jack meets his friend Joshamee Gibbs and with a buccaneer and \"able bodied\" crew, set sail to save Elizabeth and take back the Black Pearl. Meanwhile, Barbossa discovers that not Elizabeth's but someone else's blood was required for the sacrifice. Whose blood is it?"
            pricePerTicket = 14
            moviePrice.text = pricePerTicket.toString()

            piratesBtn.animate().apply {
                duration = 1000
                rotationYBy(360f)
            }.withEndAction {
                whichMovie.animate().apply {
                    whichMovie.startAnimation(grow)
                }
            }
        }
        tsBtn.setOnClickListener {
            whichMovie.text = "Toy Story"
            movieName = "Toy Story"
            movieSummary.text =
                "A cowboy doll is profoundly threatened and jealous when a new spaceman figure supplants him as top toy in a boy's room. A little boy named Andy loves to be in his room, playing with his toys, especially his doll named \"Woody\". But, what do the toys do when Andy is not with them, they come to life."
            pricePerTicket = 8
            moviePrice.text = pricePerTicket.toString()

            tsBtn.animate().apply {
                duration = 1000
                rotationYBy(360f)
            }.withEndAction {
                whichMovie.animate().apply {
                    whichMovie.startAnimation(grow)
                }
            }
        }

        //Everything else

        val calendar = findViewById<CalendarView>(R.id.calendarView)
        val dateClicked = findViewById<TextView>(R.id.dateClicked)
        var dateChosen = ""
        calendar.setOnDateChangeListener { _, year, month, dayOfMonth ->
            val day = dayOfMonth.toString()
            val year = year.toString()
            val month = (month + 1).toString()
            dateClicked.text = "$day/$month/$year"
            dateChosen = "$day/$month/$year"
        }

        val ageResult = findViewById<RadioGroup>(R.id.ageResult)
        val rAdult = findViewById<RadioButton>(R.id.adult)
        var adultChild = ""

        ageResult.setOnCheckedChangeListener { _, _ ->
            adultChild = if (rAdult.isChecked) {
                "Adult"
            } else {
                "Minor"
            }
        }

        val numTickets = findViewById<EditText>(R.id.numTickets)
        var amount = ""
        var numOfTickets = 0

        numTickets.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {
                numOfTickets = s.toString().toInt()
                amount = numOfTickets.toString()
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
        })

        val getTix = findViewById<Button>(R.id.buy)
        val title = findViewById<TextView>(R.id.movieTitle)
        val number = findViewById<TextView>(R.id.number)
        val age = findViewById<TextView>(R.id.age)
        val date = findViewById<TextView>(R.id.date)
        val price = findViewById<TextView>(R.id.price)
        val pic = findViewById<ImageView>(R.id.ticket)
        var clicked = 0

        getTix.setOnClickListener {
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
                title.text = movieName
                number.text = "Number of tickets: $amount"
                age.text = adultChild
                date.text = "date: $dateChosen"
                price.text = "Total: $$totalPrice"
                pic.setImageResource(R.drawable.emptytix)
            }
        }

        val confirm = findViewById<Button>(R.id.confirm)

        confirm.setOnClickListener {
            if (clicked == 0) {
            } else {
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Confirmation")
                builder.setMessage("Are you sure you want to confirm purchase?")
                builder.setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, id ->
                    dialog.cancel()

                    val build = AlertDialog.Builder(this)
                    build.setTitle("Confirmed")
                    build.setMessage("Enjoy $movieName")
                    build.setIcon(R.drawable.ic_baseline_check_circle_24)
                    build.setPositiveButton("OK", DialogInterface.OnClickListener { dialog, id ->
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
