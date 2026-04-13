// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.timeline

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeveloperQualifiedSymbolTest {

    @Test
    fun create() {
        val developerQualifiedSymbol =
            DeveloperQualifiedSymbol.builder()
                .developerSymbol("developerSymbol")
                .projectName("projectName")
                .build()

        assertThat(developerQualifiedSymbol.developerSymbol()).isEqualTo("developerSymbol")
        assertThat(developerQualifiedSymbol.projectName()).isEqualTo("projectName")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val developerQualifiedSymbol =
            DeveloperQualifiedSymbol.builder()
                .developerSymbol("developerSymbol")
                .projectName("projectName")
                .build()

        val roundtrippedDeveloperQualifiedSymbol =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(developerQualifiedSymbol),
                jacksonTypeRef<DeveloperQualifiedSymbol>(),
            )

        assertThat(roundtrippedDeveloperQualifiedSymbol).isEqualTo(developerQualifiedSymbol)
    }
}
