package io.heterogeneousmicroservices.pinwheelgalaxyservice.model

data class GalaxyInfo(
        val name: String,
        val constellation: String,
        val distance: Double,
        // todo image
        val availableGalaxies: List<GalaxyInfo>?
)