package com.example.applemusic.widget.radio

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.applemusic.R

@Composable
fun ButtonContent() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.music_text),
            style = MaterialTheme.typography.h6,
            color = MaterialTheme.colors.primary
        )
        Text(
            text = stringResource(id = R.string.start_text),
            style = MaterialTheme.typography.subtitle1,
            color = MaterialTheme.colors.primary
        )
    }
}



