package com.gdg.composestudy23_5week

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.LibraryMusic
import androidx.compose.material.icons.rounded.PlayCircle
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.Sensors
import androidx.compose.material.icons.rounded.Widgets
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(
    val title: String,
    val icon: ImageVector,
    val route: String
) {
    object ListenNow : BottomNavItem("ListenNow", Icons.Rounded.PlayCircle, LISTENNOW)
    object Browse : BottomNavItem("Browse", Icons.Rounded.Widgets, BROWSE)
    object Radio : BottomNavItem("Radio", Icons.Rounded.Sensors, RADIO)
    object Library : BottomNavItem("Library", Icons.Rounded.LibraryMusic, LIBRARY)
    object Search : BottomNavItem("Search", Icons.Rounded.Search, SEARCH)
}
