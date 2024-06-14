package br.com.aline.newcontactbook.components

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import br.com.aline.newcontactbook.ui.theme.Blue500
import br.com.aline.newcontactbook.ui.theme.ShapeEditText
import br.com.aline.newcontactbook.ui.theme.WaterBlue

@Composable
fun CustomTextField(
    modifier: Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    maxLines: Int,
    keyboardType: KeyboardType
) {

    OutlinedTextField(
        value = value,
        onValueChange,
        modifier,
        label = {
            Text(text = label)
        },
        maxLines = maxLines,
        colors = OutlinedTextFieldDefaults.colors(
            focusedTextColor = Color.Black,
            disabledTextColor = WaterBlue,
            focusedBorderColor = Blue500,
            focusedLabelColor = Blue500,
            cursorColor = Blue500,
            unfocusedBorderColor = WaterBlue,


            ),
        shape = ShapeEditText.small,
        keyboardOptions = KeyboardOptions(
            keyboardType = keyboardType
        )
    )
}