package com.example.segoupdated.presentation.composable


import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.BottomSheetDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.segoupdated.R


import kotlinx.coroutines.launch

@Preview(showBackground = true)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ModalBottomSheetForProfile() {
    var openBottomSheet by rememberSaveable {
        mutableStateOf(false)
    }
    var skipPartiallyExpanded by remember { mutableStateOf(false) }
    val scope = rememberCoroutineScope()

    val bottomSheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = skipPartiallyExpanded
    )

    val notification = rememberSaveable {
        mutableStateOf("")
    }
    if (notification.value.isNotEmpty()) {
        Toast.makeText(LocalContext.current, notification.value, Toast.LENGTH_LONG).show()
        notification.value = ""
    }
    var editName by rememberSaveable {
        mutableStateOf("")
    }
    var editPassword by rememberSaveable {
        mutableStateOf("")
    }
    var addDescription by rememberSaveable {
        mutableStateOf("")
    }

    var updateProject by rememberSaveable {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp, start = 8.dp, end = 8.dp, bottom = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Cancel",
                modifier = Modifier.clickable {
                    notification.value = "Cancelled"
                })
            Text(
                text = "Save",
                modifier = Modifier.clickable { notification.value = "Profile updated" })
        }
        ProfileImage("Change Logo")
        Spacer(modifier = Modifier.height(6.dp))
        CustomTextFieldWithIconProfile(
            value = editName,
            onValueChanged = { newEdite -> editName = newEdite },
            label = "edit name"
        )
        Spacer(modifier = Modifier.height(6.dp))
        CustomTextFieldWithIconProfile(
            value = editPassword,
            onValueChanged = { editPassword = it },
            label = "edit password"
        )
        Spacer(modifier = Modifier.height(6.dp))
        CustomTextFieldWithIconProfile(
            value = addDescription,
            onValueChanged = { addDescription = it },
            label = "add description"
        )

        Spacer(modifier = Modifier.height(6.dp))
        CustomTextFieldWithIconProfile(
            value = updateProject,
            onValueChanged = { updateProject = it },
            label = "update project"
        )
        Spacer(modifier = Modifier.height(6.dp))
        OutlinedButton(
            onClick = { openBottomSheet = !openBottomSheet },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 6.dp, start = 20.dp, end = 20.dp, bottom = 30.dp)
                .clip(RoundedCornerShape(15.dp))
        ) {
            Text(text = "Add links")
        }
    }

    //sheet Content
    if (openBottomSheet) {
        val windowInsets = BottomSheetDefaults.windowInsets

        ModalBottomSheet(
            onDismissRequest = { openBottomSheet = false },
            sheetState = bottomSheetState,
            windowInsets = windowInsets
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(end = 2.dp),
                horizontalArrangement = Arrangement.End, verticalAlignment = Alignment.Top
            ) {
                IconButton(
                    onClick = {
                        scope.launch { bottomSheetState.hide() }.invokeOnCompletion {
                            if (!bottomSheetState.isVisible) {
                                openBottomSheet = false
                            }
                        }
                    }, modifier = Modifier
                        .clip(RoundedCornerShape(15.dp))
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_close_24),
                        contentDescription = null,
                        tint = Color(0xFF8A97B7)
                    )
                }
            }
            ContentOfBottomSheet()
        }
    }
}
