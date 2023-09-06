package com.example.itproger2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        val userLogin: EditText = findViewById(R.id.userLoginAuth)
        val userPass: EditText = findViewById(R.id.userPassAuth)
        val buttonAuth: Button = findViewById(R.id.buttonAuth)
        val linkToReg: TextView = findViewById(R.id.linkToReg)

        linkToReg.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        buttonAuth.setOnClickListener {
            val login = userLogin.text.toString().trim()
            val pass = userPass.text.toString().trim()

            if (login == "" ||  pass =="") Toast.makeText(this, "Заполните все поля!", Toast.LENGTH_SHORT).show()
            else {

                val db = DbHelper(this, null)
                val isAuth = db.getUser(login,pass)
                if(isAuth) {
                    Toast.makeText(this, "Пользователь $login вошёл!", Toast.LENGTH_LONG).show()
                    userLogin.text.clear()
                    userPass.text.clear()
                }
                else
                    Toast.makeText(this,"Пользователь $login не найден!", Toast.LENGTH_LONG).show()


            }
        }
    }
}