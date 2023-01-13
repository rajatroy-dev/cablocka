package `in`.rajatroy.cablocka.ui.screens.home

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun Home() {
    val itemsList = (0..5).toList()
    val itemsIndexedList = listOf("A", "B", "C")

    LazyColumn {
        items(itemsList) {
            Text("Item is $it")
        }

        item {
            Text("Single item")
        }

        itemsIndexed(itemsIndexedList) { index, item ->
            Text("Item at index $index is $item")
        }
    }
}