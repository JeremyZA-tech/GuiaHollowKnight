package com.example.guiahollowknight

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource

@Composable
fun AbilityIcon(
    @DrawableRes abilityIcon: Int,
    modifier: Modifier = Modifier
){
    Image(
        painter = painterResource(abilityIcon),
        contentDescription = null,
        modifier = modifier
            .size(dimensionResource(R.dimen.image_size))
            .padding(dimensionResource(R.dimen.padding_small))
        //.clip(shape = Shapes.medium)
    )
}

@Composable
fun AbilityNameTitle(
    @StringRes abilityName: Int,
    modifier: Modifier = Modifier
){
    Column {
        Text(
            text = stringResource(abilityName),
            modifier = Modifier.padding(top = dimensionResource(R.dimen.padding_small)),
            style = MaterialTheme.typography.displayMedium,
        )
        Text(
            text = stringResource(R.string.moreInfo),
            modifier = Modifier.padding(top = dimensionResource(R.dimen.padding_small)),
            style = MaterialTheme.typography.displaySmall,
        )
    }
}

@Composable
fun AbilityItemButton(
    expanded: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val rotationAngle by animateFloatAsState(
        targetValue = if (expanded) 180f else 0f,
        animationSpec = tween(durationMillis = 500), label = ""
    )

    val icon: ImageVector = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore

    IconButton(
        onClick = onClick,
        modifier = modifier,
    ) {
        Icon(
            imageVector = icon,
            contentDescription = "Expand/Collapse",
            tint = MaterialTheme.colorScheme.secondary,
            modifier = Modifier.rotate(rotationAngle)
        )
    }
}

@Composable
fun AbilityInfo(
    @StringRes abilityInfo: Int,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
    ) {
        Text(
            text = stringResource(abilityInfo),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}