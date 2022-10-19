package com.example.learn_navigation

import androidx.annotation.StringRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.learn_navigation.ui.theme.white10

@Composable
fun DesktopScreen(navController: NavHostController){
    Box(modifier = Modifier
        .background(color = white10)
        .fillMaxSize()
    )
    {
        Column {
            TopBar()
            Text(
                modifier = Modifier
                    .padding(10.dp),
                text = "Best3",
                color = MaterialTheme.colors.primary,
                fontSize = MaterialTheme.typography.h5.fontSize,
                fontWeight = FontWeight.Bold
            )
            LazyColumn(modifier = Modifier.background(MaterialTheme.colors.background)) {
                items(desktops) {
                    DeskItem(desk = it)
                }
            }

        }
    }
}


@Composable
fun DeskItem(desk:Desktopn, modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }
    Card(
        elevation = 4.dp,
        modifier = modifier.padding(8.dp)
    ) {
        Column(
            modifier = Modifier
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioMediumBouncy,
                        stiffness = Spring.StiffnessLow
                    )
                )
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                DeskInformation(desk.name)
                Spacer(Modifier.weight(1f))
                LapItemButton(
                    expanded = expanded,
                    onClick = { expanded = !expanded },
                )
            }
            if (expanded) {
                Desk(desk.Desc)
            }
        }
    }
}










@Composable
fun DeskInformation(@StringRes lapName: Int, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = stringResource(lapName),
            style = MaterialTheme.typography.h6,
            modifier = modifier.padding(top = 8.dp),
            fontWeight = FontWeight.Bold
        )

    }
}

@Composable
fun Desk(@StringRes lapdesc: Int, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(
            start = 16.dp,
            top = 8.dp,
            bottom = 16.dp,
            end = 16.dp
        )
    ) {

        Text(
            text = stringResource(lapdesc),
            style = MaterialTheme.typography.h6,
            fontWeight = FontWeight.Bold
        )
    }
}
