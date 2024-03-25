
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.tugasmcdonarius.MainActivity
import com.example.tugasmcdonarius.R

class register : AppCompatActivity() {
    private var button: Button? = null
    private var loginText: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        button = findViewById(R.id.btnRegister)
        loginText = findViewById(R.id.textView2)
        button!!.setOnClickListener {
            // Menggunakan Intent untuk pindah ke activity login
            val intent = Intent(this@register, MainActivity ::class.java)
            startActivity(intent)
            finish() // Optional, ini akan menutup activity register setelah pindah ke activity login
        }
        loginText!!.setOnClickListener {
            // Menggunakan Intent untuk pindah ke activity login
            val intent = Intent(this@register, MainActivity::class.java)
            startActivity(intent)
            finish() // Optional, ini akan menutup activity register setelah pindah ke activity login
        }
    }
}