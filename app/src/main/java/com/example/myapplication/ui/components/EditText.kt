package com.example.myapplication.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun OutlinedEditText(
    onClick: () -> Unit,
    value: String
) {
    var text by remember { mutableStateOf(value) }
    val isFormValid by derivedStateOf { text.length == 6 }
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth(0.9f)
            .height(50.dp),
        maxLines = 1,
        value = text, onValueChange = {
            if (it.length <= 6) text = it

        },

        label = {
            Text(
                text = "Код из смс",
                color = Color.Blue,
                textAlign = TextAlign.Left,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold)
        },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            unfocusedBorderColor = Color.Blue,
            textColor = Color.Blue,
            focusedBorderColor = Color.Blue,
            focusedLabelColor = Color.Blue,
            cursorColor = Color.Blue

        ),

        keyboardOptions = KeyboardOptions(
            keyboardType =
            KeyboardType.Number,
            imeAction = ImeAction.Done
        ),
        keyboardActions = KeyboardActions(
            onDone = { if (isFormValid) onClick()}
        ),
        singleLine = true,
        shape = RoundedCornerShape(20.dp),
        textStyle = TextStyle(
            letterSpacing = 1.3.sp,
            textAlign = TextAlign.Center,
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold
        )
    )
}