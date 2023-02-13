package `in`.rajatroy.cablocka.ui.shared

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun BottomModalSheet(onAction: (Boolean) -> Unit) {
    var text by remember { mutableStateOf(TextFieldValue("")) }

    val bottomSheetScaffoldState = rememberBottomSheetScaffoldState(
        bottomSheetState = BottomSheetState(BottomSheetValue.Collapsed)
    )

    val coroutineScope = rememberCoroutineScope()

    Column(
        modifier = Modifier.padding(32.dp)
    ) {
        OutlinedTextField(
            value = text,
            label = { Text(text = "Phone number") },
            placeholder = { Text(text = "Enter phone number") },
            onValueChange = {
                text = it
            }
        )
        Spacer(modifier = Modifier.height(32.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth().padding(8.dp)
        ) {
            Button(onClick = { onAction(false) }) {
                Text(
                    text = "CANCEL",
                    style = TextStyle(fontSize = 15.sp)
                )
            }
            Button(onClick = { onAction(true) }) {
                Text(
                    text = "OK",
                    style = TextStyle(fontSize = 15.sp)
                )
            }
        }
    }
}