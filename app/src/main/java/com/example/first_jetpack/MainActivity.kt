package com.example.first_jetpack

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.first_jetpack.ui.theme.FirstjetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text(text = "hello cheexy code")
        }
    }
}


@Preview(showBackground = true, showSystemUi = true )
@Composable
private fun PreviewFunction() {
   Button(
       onClick = {  }, colors = ButtonDefaults.buttonColors(
           containerColor = Color.Cyan,


       ),
   ) {
       Text(text = "hello")
       Image(
           painter = painterResource(id = R.drawable.baseline_heart_broken_24),
           contentDescription = "Dummy")
   }


}