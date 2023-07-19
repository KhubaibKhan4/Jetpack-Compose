package com.codespacepro.lazycolumn.model

import android.media.Image
import android.provider.MediaStore.Images
import androidx.compose.ui.graphics.painter.Painter

data class Profile(
    val image: Images,
    val fistName: String,
    val lastName: String
)
