package br.com.aline.newcontactbook.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.aline.newcontactbook.ui.theme.Blue500
import br.com.aline.newcontactbook.ui.theme.ShapeEditText

@Composable
fun CustomButton(onClick: () -> Unit, text: String) {
    Button(
        onClick,
        colors = ButtonDefaults.buttonColors(containerColor = Blue500),
        shape = ShapeEditText.medium,
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .padding(start = 50.dp, end = 50.dp, top = 10.dp)

    ) {
        Text(text = text, color = Color.White, fontSize = 16.sp
        )
    }

}